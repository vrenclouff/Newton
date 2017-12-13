// Generated from /Users/macbook/Developer/fjp/Newton/src/Newton.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NewtonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EndBlock=1, MainFnc=2, DefConstant=3, DefVariable=4, Add=5, Sub=6, Mul=7, 
		Div=8, Const=9, IntType=10, Boolean=11, VoidType=12, Int=13, BoolType=14, 
		BeginFunction=15, ReturnFunctin=16, BeginIf=17, EndIf=18, Then=19, Do=20, 
		Of=21, Else=22, BeginWhile=23, EndWhile=24, BeginSwitch=25, EndSwitch=26, 
		DefaultSwitch=27, BeginFor=28, EndFor=29, Repeat=30, Until=31, RoundBracketLeft=32, 
		RoundBracketRight=33, CurlyBracketLeft=34, CurlyBracketRight=35, Assign=36, 
		Comma=37, Colon=38, Semi=39, Ques=40, RelationOp=41, LogicalOp=42, Identifier=43, 
		WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EndBlock", "MainFnc", "DefConstant", "DefVariable", "Add", "Sub", "Mul", 
		"Div", "Const", "IntType", "Boolean", "VoidType", "Int", "BoolType", "BeginFunction", 
		"ReturnFunctin", "BeginIf", "EndIf", "Then", "Do", "Of", "Else", "BeginWhile", 
		"EndWhile", "BeginSwitch", "EndSwitch", "DefaultSwitch", "BeginFor", "EndFor", 
		"Repeat", "Until", "RoundBracketLeft", "RoundBracketRight", "CurlyBracketLeft", 
		"CurlyBracketRight", "Assign", "Comma", "Colon", "Semi", "Ques", "RelationOp", 
		"LogicalOp", "Identifier", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "'main'", "'constant:'", "'variable:'", "'+'", "'-'", "'*'", 
		"'/'", "'const'", "'int'", null, "'void'", null, "'bool'", "'fnc'", "'return'", 
		"'if'", "'endif'", "'then'", "'do'", "'of'", "'else'", "'while'", "'endwhile'", 
		"'switch'", "'endswitch'", "'default'", "'for'", "'endfor'", "'repeat'", 
		"'until'", "'('", "')'", "'{'", "'}'", "'='", "','", "':'", "';'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EndBlock", "MainFnc", "DefConstant", "DefVariable", "Add", "Sub", 
		"Mul", "Div", "Const", "IntType", "Boolean", "VoidType", "Int", "BoolType", 
		"BeginFunction", "ReturnFunctin", "BeginIf", "EndIf", "Then", "Do", "Of", 
		"Else", "BeginWhile", "EndWhile", "BeginSwitch", "EndSwitch", "DefaultSwitch", 
		"BeginFor", "EndFor", "Repeat", "Until", "RoundBracketLeft", "RoundBracketRight", 
		"CurlyBracketLeft", "CurlyBracketRight", "Assign", "Comma", "Colon", "Semi", 
		"Ques", "RelationOp", "LogicalOp", "Identifier", "WS"
	};
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


	public NewtonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Newton.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u013e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\16\5"+
		"\16\u009c\n\16\3\16\6\16\u009f\n\16\r\16\16\16\u00a0\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\5*\u0125\n*\3+\3+\3+\3+\5+\u012b\n+\3,\6,\u012e\n,\r"+
		",\16,\u012f\3,\7,\u0133\n,\f,\16,\u0136\13,\3-\6-\u0139\n-\r-\16-\u013a"+
		"\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\b\4\2--//\3\2\62;\4\2"+
		">>@@\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0147\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\3[\3\2\2\2\5_\3\2\2\2\7d\3\2\2\2\tn\3\2\2\2\13x\3\2\2"+
		"\2\rz\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0080\3\2\2\2\25\u0086\3\2\2"+
		"\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u009b\3\2\2\2\35\u00a2\3\2\2\2"+
		"\37\u00a7\3\2\2\2!\u00ab\3\2\2\2#\u00b2\3\2\2\2%\u00b5\3\2\2\2\'\u00bb"+
		"\3\2\2\2)\u00c0\3\2\2\2+\u00c3\3\2\2\2-\u00c6\3\2\2\2/\u00cb\3\2\2\2\61"+
		"\u00d1\3\2\2\2\63\u00da\3\2\2\2\65\u00e1\3\2\2\2\67\u00eb\3\2\2\29\u00f3"+
		"\3\2\2\2;\u00f7\3\2\2\2=\u00fe\3\2\2\2?\u0105\3\2\2\2A\u010b\3\2\2\2C"+
		"\u010d\3\2\2\2E\u010f\3\2\2\2G\u0111\3\2\2\2I\u0113\3\2\2\2K\u0115\3\2"+
		"\2\2M\u0117\3\2\2\2O\u0119\3\2\2\2Q\u011b\3\2\2\2S\u0124\3\2\2\2U\u012a"+
		"\3\2\2\2W\u012d\3\2\2\2Y\u0138\3\2\2\2[\\\7g\2\2\\]\7p\2\2]^\7f\2\2^\4"+
		"\3\2\2\2_`\7o\2\2`a\7c\2\2ab\7k\2\2bc\7p\2\2c\6\3\2\2\2de\7e\2\2ef\7q"+
		"\2\2fg\7p\2\2gh\7u\2\2hi\7v\2\2ij\7c\2\2jk\7p\2\2kl\7v\2\2lm\7<\2\2m\b"+
		"\3\2\2\2no\7x\2\2op\7c\2\2pq\7t\2\2qr\7k\2\2rs\7c\2\2st\7d\2\2tu\7n\2"+
		"\2uv\7g\2\2vw\7<\2\2w\n\3\2\2\2xy\7-\2\2y\f\3\2\2\2z{\7/\2\2{\16\3\2\2"+
		"\2|}\7,\2\2}\20\3\2\2\2~\177\7\61\2\2\177\22\3\2\2\2\u0080\u0081\7e\2"+
		"\2\u0081\u0082\7q\2\2\u0082\u0083\7p\2\2\u0083\u0084\7u\2\2\u0084\u0085"+
		"\7v\2\2\u0085\24\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089"+
		"\7v\2\2\u0089\26\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d"+
		"\7w\2\2\u008d\u0094\7g\2\2\u008e\u008f\7h\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0094\7g\2\2\u0093\u008a\3\2\2"+
		"\2\u0093\u008e\3\2\2\2\u0094\30\3\2\2\2\u0095\u0096\7x\2\2\u0096\u0097"+
		"\7q\2\2\u0097\u0098\7k\2\2\u0098\u0099\7f\2\2\u0099\32\3\2\2\2\u009a\u009c"+
		"\t\2\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009f\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4"+
		"\7q\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7n\2\2\u00a6\36\3\2\2\2\u00a7\u00a8"+
		"\7h\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7e\2\2\u00aa \3\2\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7w\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7p\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7h\2\2\u00b4$\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2\u00b7"+
		"\u00b8\7f\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba&\3\2\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2"+
		"\u00bf(\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7q\2\2\u00c2*\3\2\2\2\u00c3"+
		"\u00c4\7q\2\2\u00c4\u00c5\7h\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca.\3\2\2\2\u00cb"+
		"\u00cc\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7n\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0\60\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7"+
		"p\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7y\2\2\u00d5\u00d6\7j\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9\62\3\2\2\2\u00da\u00db"+
		"\7u\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7j\2\2\u00e0\64\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7p\2\2\u00e3\u00e4\7f\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7y\2\2"+
		"\u00e6\u00e7\7k\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea"+
		"\7j\2\2\u00ea\66\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee"+
		"\7h\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7n\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f28\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7q\2\2\u00f5"+
		"\u00f6\7t\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7f\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7t\2\2"+
		"\u00fd<\3\2\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7r\2"+
		"\2\u0101\u0102\7g\2\2\u0102\u0103\7c\2\2\u0103\u0104\7v\2\2\u0104>\3\2"+
		"\2\2\u0105\u0106\7w\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108\u0109"+
		"\7k\2\2\u0109\u010a\7n\2\2\u010a@\3\2\2\2\u010b\u010c\7*\2\2\u010cB\3"+
		"\2\2\2\u010d\u010e\7+\2\2\u010eD\3\2\2\2\u010f\u0110\7}\2\2\u0110F\3\2"+
		"\2\2\u0111\u0112\7\177\2\2\u0112H\3\2\2\2\u0113\u0114\7?\2\2\u0114J\3"+
		"\2\2\2\u0115\u0116\7.\2\2\u0116L\3\2\2\2\u0117\u0118\7<\2\2\u0118N\3\2"+
		"\2\2\u0119\u011a\7=\2\2\u011aP\3\2\2\2\u011b\u011c\7A\2\2\u011cR\3\2\2"+
		"\2\u011d\u0125\t\4\2\2\u011e\u011f\7>\2\2\u011f\u0125\7?\2\2\u0120\u0121"+
		"\7@\2\2\u0121\u0125\7?\2\2\u0122\u0123\7?\2\2\u0123\u0125\7?\2\2\u0124"+
		"\u011d\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0125T\3\2\2\2\u0126\u0127\7(\2\2\u0127\u012b\7(\2\2\u0128\u0129"+
		"\7~\2\2\u0129\u012b\7~\2\2\u012a\u0126\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"V\3\2\2\2\u012c\u012e\t\5\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\3\2\2\2\u0131\u0133"+
		"\t\6\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135X\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\t\7\2\2"+
		"\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b-\2\2\u013dZ\3\2\2\2\13\2\u0093"+
		"\u009b\u00a0\u0124\u012a\u012f\u0134\u013a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}