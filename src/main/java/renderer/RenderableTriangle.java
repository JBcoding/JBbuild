package renderer;

import com.jogamp.opengl.GL2;
import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.linear.RealMatrix;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;


public class RenderableTriangle {
    Vector3D p1;
    Vector3D p2;
    Vector3D p3;

    Color color;

    public RenderableTriangle(Vector3D p1, Vector3D p2, Vector3D p3, Color color) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        this.color = color;
    }

    public boolean hasAlpha() {
        return color.getAlpha() != 255;
    }

    public boolean isOpaque() {
        return !hasAlpha();
    }

    public void translate(Vector3D vector) {
        p1 = p1.add(vector);
        p2 = p2.add(vector);
        p3 = p3.add(vector);
    }

    public void multiplyEachPointWithMatrix(RealMatrix matrix) {
        p1 = Util.preMultiplyVector3dMatrix(p1, matrix);
        p2 = Util.preMultiplyVector3dMatrix(p2, matrix);
        p3 = Util.preMultiplyVector3dMatrix(p3, matrix);
    }

    public Vector3D getP1() {
        return p1;
    }

    public Vector3D getP2() {
        return p2;
    }

    public Vector3D getP3() {
        return p3;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "TransparentTriangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", color=" + color +
                '}';
    }

    private Vector3D centerOfMass() {
        return p1.add(p2).add(p3).scalarMultiply(1 / 3d);
    }

    public int compareDistance(RenderableTriangle other, Vector3D cameraPosition) {
        double distance1 = this.centerOfMass().distance(cameraPosition);
        double distance2 = other.centerOfMass().distance(cameraPosition);
        return Double.compare(distance1, distance2);
    }

    public void render(GL2 gl, boolean debug, Vector3D cameraPosition) {
        Vector3D lightNormal = getLightNormalVector(cameraPosition);
        gl.glColor4d(color.getRed() / 255.0f, color.getGreen() / 255.0f, color.getBlue() / 255.0f, color.getAlpha() / 255.0f);

        gl.glBegin(GL2.GL_TRIANGLES);

        gl.glNormal3d(lightNormal.getX(), lightNormal.getY(), lightNormal.getZ());
        gl.glVertex3d(p1.getX(), p1.getY(), p1.getZ());

        gl.glNormal3d(lightNormal.getX(), lightNormal.getY(), lightNormal.getZ());
        gl.glVertex3d(p2.getX(), p2.getY(), p2.getZ());

        gl.glNormal3d(lightNormal.getX(), lightNormal.getY(), lightNormal.getZ());
        gl.glVertex3d(p3.getX(), p3.getY(), p3.getZ());

        gl.glEnd();

        if (debug) {
            renderer.Util.drawLine(gl, p1, p2);
            renderer.Util.drawLine(gl, p2, p3);
            renderer.Util.drawLine(gl, p3, p1);
        }
    }

    protected Vector3D getNormalVector() {
        Vector3D deltaP1P2 = p1.subtract(p2);
        Vector3D deltaP1P3 = p1.subtract(p3);
        Vector3D normalVector = deltaP1P2.crossProduct(deltaP1P3);
        return normalVector.normalize().negate();
    }

    private Vector3D getLightNormalVector(Vector3D cameraPosition) {
        Vector3D point = p1;
        Vector3D normalVector = getNormalVector();

        Vector3D ppn = point.add(normalVector);
        Vector3D pnn = point.subtract(normalVector);

        if (ppn.distance(cameraPosition) < pnn.distance(cameraPosition)) {
            return normalVector;
        } else {
            return normalVector.scalarMultiply(-1);
        }
    }

    public static List<RenderableTriangle> divideIntoSmallTriangles(List<RenderableTriangle> triangles, Vector3D cameraPosition) {
        List<RenderableTriangle> resultingList = new ArrayList<>();
        for (RenderableTriangle triangle : triangles) {
            double maxTriangleSize = Math.max(.05, Util.smallestDistanceBetweenPointAndTriangle(triangle.p1, triangle.p2, triangle.p3, cameraPosition) / 10d);
            divideIntoSmallTrianglesRecursive(triangle, maxTriangleSize, resultingList);
        }
        return resultingList;
    }

    private double getArea() {
        // https://math.stackexchange.com/a/128995
        Vector3D p1p2 = p1.subtract(p2);
        Vector3D p1p3 = p1.subtract(p3);

        double p1p2Length = p1p2.distance(Vector3D.ZERO);
        double p1p3Length = p1p3.distance(Vector3D.ZERO);

        double p1Angle = Math.acos(p1p2.dotProduct(p1p3) / (p1p2Length * p1p3Length));

        return 0.5 * p1p2Length * p1p3Length * Math.sin(p1Angle);
    }

    private static void divideIntoSmallTrianglesRecursive(RenderableTriangle triangle, double maxTriangleSize, List<RenderableTriangle> triangles) {
        if (triangle.getArea() < maxTriangleSize) {
            triangles.add(triangle);
            return;
        }

        Vector3D a, b, c, d;
        double dp1p2 = triangle.p1.distance(triangle.p2);
        double dp1p3 = triangle.p1.distance(triangle.p3);
        double dp2p3 = triangle.p2.distance(triangle.p3);
        if (dp1p2 >= dp1p3 && dp1p2 >= dp2p3) {
            a = triangle.p1; b = triangle.p2; c = triangle.p3;
        } else if (dp1p3 >= dp1p2 && dp1p3 >= dp2p3) {
            a = triangle.p3; b = triangle.p1; c = triangle.p2;
        } else {
            a = triangle.p2; b = triangle.p3; c = triangle.p1;
        }

        d = a.add(b).scalarMultiply(.5);
        divideIntoSmallTrianglesRecursive(new RenderableTriangle(a, d, c, triangle.color), maxTriangleSize, triangles);
        divideIntoSmallTrianglesRecursive(new RenderableTriangle(b, c, d, triangle.color), maxTriangleSize, triangles);
    }

}
