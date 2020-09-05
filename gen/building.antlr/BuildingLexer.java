// Generated from /home/mathias/gitrepos/jbuild/src/main/antlr4/Building.g4 by ANTLR 4.8

    package building.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BuildingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, AXIS=23, LINE_COMMENT=24, 
		BLOCK_COMMENT=25, LPAREN=26, RPAREN=27, LBRACE=28, TILDE=29, RBRACE=30, 
		PERCENTAGE=31, COMMA=32, NUMBER=33, FACE=34, ASTERIX=35, COLON=36, DOT=37, 
		SEMICOLON=38, NAME=39, VARIABLE=40, WS=41, STRING=42, PLUS=43, MINUS=44, 
		DIVIDE=45, EQUALS=46, NOT_EQUALS=47, ASSIGN=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "AXIS", "LINE_COMMENT", 
			"BLOCK_COMMENT", "LPAREN", "RPAREN", "LBRACE", "TILDE", "RBRACE", "PERCENTAGE", 
			"COMMA", "NUMBER", "FACE", "ASTERIX", "COLON", "DOT", "SEMICOLON", "NAME", 
			"VARIABLE", "WS", "STRING", "PLUS", "MINUS", "DIVIDE", "EQUALS", "NOT_EQUALS", 
			"ASSIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'as'", "'plot'", "'->'", "'color'", "'translate'", 
			"'translateG'", "'rotateX'", "'rotateY'", "'rotateZ'", "'rotatePX'", 
			"'rotatePY'", "'rotatePZ'", "'scale'", "'polygon'", "'oshape'", "'lshape'", 
			"'extrude'", "'split'", "'if'", "'true'", "'false'", null, null, null, 
			"'('", "')'", "'{'", "'~'", "'}'", "'%'", "','", null, null, "'*'", "':'", 
			"'.'", "';'", null, null, null, null, "'+'", "'-'", "'/'", "'=='", "'!='", 
			"':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "AXIS", 
			"LINE_COMMENT", "BLOCK_COMMENT", "LPAREN", "RPAREN", "LBRACE", "TILDE", 
			"RBRACE", "PERCENTAGE", "COMMA", "NUMBER", "FACE", "ASTERIX", "COLON", 
			"DOT", "SEMICOLON", "NAME", "VARIABLE", "WS", "STRING", "PLUS", "MINUS", 
			"DIVIDE", "EQUALS", "NOT_EQUALS", "ASSIGN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BuildingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Building.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0182\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0102"+
		"\n\31\f\31\16\31\u0105\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u010d"+
		"\n\32\f\32\16\32\u0110\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\5\"\u0126\n\"\3\"\3"+
		"\"\3\"\7\"\u012b\n\"\f\"\16\"\u012e\13\"\3\"\6\"\u0131\n\"\r\"\16\"\u0132"+
		"\3\"\3\"\6\"\u0137\n\"\r\"\16\"\u0138\5\"\u013b\n\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u014a\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\7(\u0156"+
		"\n(\f(\16(\u0159\13(\3)\3)\7)\u015d\n)\f)\16)\u0160\13)\3*\6*\u0163\n"+
		"*\r*\16*\u0164\3*\3*\3+\3+\3+\3+\7+\u016d\n+\f+\16+\u0170\13+\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\u010e\2\62\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\f\4\2Z\\z|\4\2\f\f\17"+
		"\17\3\2\63;\3\2\62;\3\2C\\\6\2\62;C\\aac|\4\2aac|\4\2\13\f\"\"\4\2$$^"+
		"^\6\2\f\f\17\17$$^^\2\u0190\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5j\3\2\2\2\7m\3\2\2\2\tr"+
		"\3\2\2\2\13u\3\2\2\2\r{\3\2\2\2\17\u0085\3\2\2\2\21\u0090\3\2\2\2\23\u0098"+
		"\3\2\2\2\25\u00a0\3\2\2\2\27\u00a8\3\2\2\2\31\u00b1\3\2\2\2\33\u00ba\3"+
		"\2\2\2\35\u00c3\3\2\2\2\37\u00c9\3\2\2\2!\u00d1\3\2\2\2#\u00d8\3\2\2\2"+
		"%\u00df\3\2\2\2\'\u00e7\3\2\2\2)\u00ed\3\2\2\2+\u00f0\3\2\2\2-\u00f5\3"+
		"\2\2\2/\u00fb\3\2\2\2\61\u00fd\3\2\2\2\63\u0108\3\2\2\2\65\u0116\3\2\2"+
		"\2\67\u0118\3\2\2\29\u011a\3\2\2\2;\u011c\3\2\2\2=\u011e\3\2\2\2?\u0120"+
		"\3\2\2\2A\u0122\3\2\2\2C\u0125\3\2\2\2E\u0149\3\2\2\2G\u014b\3\2\2\2I"+
		"\u014d\3\2\2\2K\u014f\3\2\2\2M\u0151\3\2\2\2O\u0153\3\2\2\2Q\u015a\3\2"+
		"\2\2S\u0162\3\2\2\2U\u0168\3\2\2\2W\u0173\3\2\2\2Y\u0175\3\2\2\2[\u0177"+
		"\3\2\2\2]\u0179\3\2\2\2_\u017c\3\2\2\2a\u017f\3\2\2\2cd\7k\2\2de\7o\2"+
		"\2ef\7r\2\2fg\7q\2\2gh\7t\2\2hi\7v\2\2i\4\3\2\2\2jk\7c\2\2kl\7u\2\2l\6"+
		"\3\2\2\2mn\7r\2\2no\7n\2\2op\7q\2\2pq\7v\2\2q\b\3\2\2\2rs\7/\2\2st\7@"+
		"\2\2t\n\3\2\2\2uv\7e\2\2vw\7q\2\2wx\7n\2\2xy\7q\2\2yz\7t\2\2z\f\3\2\2"+
		"\2{|\7v\2\2|}\7t\2\2}~\7c\2\2~\177\7p\2\2\177\u0080\7u\2\2\u0080\u0081"+
		"\7n\2\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083\u0084\7g\2\2\u0084"+
		"\16\3\2\2\2\u0085\u0086\7v\2\2\u0086\u0087\7t\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7p\2\2\u0089\u008a\7u\2\2\u008a\u008b\7n\2\2\u008b\u008c\7c\2\2"+
		"\u008c\u008d\7v\2\2\u008d\u008e\7g\2\2\u008e\u008f\7I\2\2\u008f\20\3\2"+
		"\2\2\u0090\u0091\7t\2\2\u0091\u0092\7q\2\2\u0092\u0093\7v\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\u0097\7Z\2\2\u0097"+
		"\22\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7q\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7[\2\2"+
		"\u009f\24\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7"+
		"v\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7"+
		"\7\\\2\2\u00a7\26\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7q\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\u00af\7R\2\2\u00af\u00b0\7Z\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7"+
		"t\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7R\2\2\u00b8\u00b9\7[\2\2\u00b9"+
		"\32\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"\u00be\7c\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7R\2\2"+
		"\u00c1\u00c2\7\\\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7"+
		"e\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8\36"+
		"\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7{\2\2\u00cd\u00ce\7i\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2"+
		"\u00d0 \3\2\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7j\2"+
		"\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7r\2\2\u00d6\u00d7\7g\2\2\u00d7\"\3"+
		"\2\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7j\2\2\u00db"+
		"\u00dc\7c\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7g\2\2\u00de$\3\2\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7z\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7t\2\2"+
		"\u00e3\u00e4\7w\2\2\u00e4\u00e5\7f\2\2\u00e5\u00e6\7g\2\2\u00e6&\3\2\2"+
		"\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7r\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb"+
		"\7k\2\2\u00eb\u00ec\7v\2\2\u00ec(\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef"+
		"\7h\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7w\2\2\u00f3\u00f4\7g\2\2\u00f4,\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7"+
		"\7c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		".\3\2\2\2\u00fb\u00fc\t\2\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7\61\2\2\u00fe"+
		"\u00ff\7\61\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\n\3\2\2\u0101\u0100\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\b\31\2\2\u0107\62\3\2\2"+
		"\2\u0108\u0109\7\61\2\2\u0109\u010a\7,\2\2\u010a\u010e\3\2\2\2\u010b\u010d"+
		"\13\2\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112"+
		"\7,\2\2\u0112\u0113\7\61\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b\32\2\2"+
		"\u0115\64\3\2\2\2\u0116\u0117\7*\2\2\u0117\66\3\2\2\2\u0118\u0119\7+\2"+
		"\2\u01198\3\2\2\2\u011a\u011b\7}\2\2\u011b:\3\2\2\2\u011c\u011d\7\u0080"+
		"\2\2\u011d<\3\2\2\2\u011e\u011f\7\177\2\2\u011f>\3\2\2\2\u0120\u0121\7"+
		"\'\2\2\u0121@\3\2\2\2\u0122\u0123\7.\2\2\u0123B\3\2\2\2\u0124\u0126\7"+
		"/\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u013a\3\2\2\2\u0127"+
		"\u013b\7\62\2\2\u0128\u012c\t\4\2\2\u0129\u012b\t\5\2\2\u012a\u0129\3"+
		"\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u013b\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\t\5\2\2\u0130\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0136\5K&\2\u0135\u0137\t\5\2\2\u0136\u0135\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b"+
		"\3\2\2\2\u013a\u0127\3\2\2\2\u013a\u0128\3\2\2\2\u013a\u0130\3\2\2\2\u013b"+
		"D\3\2\2\2\u013c\u013d\7V\2\2\u013d\u013e\7Q\2\2\u013e\u014a\7R\2\2\u013f"+
		"\u0140\7D\2\2\u0140\u0141\7Q\2\2\u0141\u0142\7V\2\2\u0142\u0143\7V\2\2"+
		"\u0143\u0144\7Q\2\2\u0144\u014a\7O\2\2\u0145\u0146\7U\2\2\u0146\u0147"+
		"\7K\2\2\u0147\u0148\7F\2\2\u0148\u014a\7G\2\2\u0149\u013c\3\2\2\2\u0149"+
		"\u013f\3\2\2\2\u0149\u0145\3\2\2\2\u014aF\3\2\2\2\u014b\u014c\7,\2\2\u014c"+
		"H\3\2\2\2\u014d\u014e\7<\2\2\u014eJ\3\2\2\2\u014f\u0150\7\60\2\2\u0150"+
		"L\3\2\2\2\u0151\u0152\7=\2\2\u0152N\3\2\2\2\u0153\u0157\t\6\2\2\u0154"+
		"\u0156\t\7\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158P\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015e"+
		"\t\b\2\2\u015b\u015d\t\7\2\2\u015c\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015fR\3\2\2\2\u0160\u015e\3\2\2\2"+
		"\u0161\u0163\t\t\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b*\3\2\u0167"+
		"T\3\2\2\2\u0168\u016e\7$\2\2\u0169\u016a\7^\2\2\u016a\u016d\t\n\2\2\u016b"+
		"\u016d\n\13\2\2\u016c\u0169\3\2\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3"+
		"\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0172\7$\2\2\u0172V\3\2\2\2\u0173\u0174\7-\2\2\u0174"+
		"X\3\2\2\2\u0175\u0176\7/\2\2\u0176Z\3\2\2\2\u0177\u0178\7\61\2\2\u0178"+
		"\\\3\2\2\2\u0179\u017a\7?\2\2\u017a\u017b\7?\2\2\u017b^\3\2\2\2\u017c"+
		"\u017d\7#\2\2\u017d\u017e\7?\2\2\u017e`\3\2\2\2\u017f\u0180\7<\2\2\u0180"+
		"\u0181\7?\2\2\u0181b\3\2\2\2\20\2\u0103\u010e\u0125\u012c\u0132\u0138"+
		"\u013a\u0149\u0157\u015e\u0164\u016c\u016e\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}