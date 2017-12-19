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
		Comma=37, Colon=38, Semi=39, Ques=40, RelationOp=41, Lt=42, Gt=43, Lte=44, 
		Gte=45, Eq=46, And=47, Or=48, Identifier=49, WS=50;
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
		"Lt", "Gt", "Lte", "Gte", "Eq", "And", "Or", "Identifier", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "'main'", "'constant:'", "'variable:'", "'+'", "'-'", "'*'", 
		"'/'", "'const'", "'int'", null, "'void'", null, "'bool'", "'fnc'", "'return'", 
		"'if'", "'endif'", "'then'", "'do'", "'of'", "'else'", "'while'", "'endwhile'", 
		"'switch'", "'endswitch'", "'default'", "'for'", "'endfor'", "'repeat'", 
		"'until'", "'('", "')'", "'{'", "'}'", "'='", "','", "':'", "';'", "'?'", 
		null, "'<'", "'>'", "'<='", "'>='", "'=='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EndBlock", "MainFnc", "DefConstant", "DefVariable", "Add", "Sub", 
		"Mul", "Div", "Const", "IntType", "Boolean", "VoidType", "Int", "BoolType", 
		"BeginFunction", "ReturnFunctin", "BeginIf", "EndIf", "Then", "Do", "Of", 
		"Else", "BeginWhile", "EndWhile", "BeginSwitch", "EndSwitch", "DefaultSwitch", 
		"BeginFor", "EndFor", "Repeat", "Until", "RoundBracketLeft", "RoundBracketRight", 
		"CurlyBracketLeft", "CurlyBracketRight", "Assign", "Comma", "Colon", "Semi", 
		"Ques", "RelationOp", "Lt", "Gt", "Lte", "Gte", "Eq", "And", "Or", "Identifier", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0157\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00a0\n\f\3\r\3\r\3\r\3\r\3\r\3\16\5\16\u00a8\n\16"+
		"\3\16\6\16\u00ab\n\16\r\16\16\16\u00ac\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\5*\u0131\n*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\62\6\62\u0147\n\62\r\62\16\62\u0148\3\62\7\62\u014c\n"+
		"\62\f\62\16\62\u014f\13\62\3\63\6\63\u0152\n\63\r\63\16\63\u0153\3\63"+
		"\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3"+
		"\2\b\4\2--//\3\2\62;\4\2>>@@\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\""+
		"\2\u015f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5k\3\2\2\2\7p\3\2\2\2"+
		"\tz\3\2\2\2\13\u0084\3\2\2\2\r\u0086\3\2\2\2\17\u0088\3\2\2\2\21\u008a"+
		"\3\2\2\2\23\u008c\3\2\2\2\25\u0092\3\2\2\2\27\u009f\3\2\2\2\31\u00a1\3"+
		"\2\2\2\33\u00a7\3\2\2\2\35\u00ae\3\2\2\2\37\u00b3\3\2\2\2!\u00b7\3\2\2"+
		"\2#\u00be\3\2\2\2%\u00c1\3\2\2\2\'\u00c7\3\2\2\2)\u00cc\3\2\2\2+\u00cf"+
		"\3\2\2\2-\u00d2\3\2\2\2/\u00d7\3\2\2\2\61\u00dd\3\2\2\2\63\u00e6\3\2\2"+
		"\2\65\u00ed\3\2\2\2\67\u00f7\3\2\2\29\u00ff\3\2\2\2;\u0103\3\2\2\2=\u010a"+
		"\3\2\2\2?\u0111\3\2\2\2A\u0117\3\2\2\2C\u0119\3\2\2\2E\u011b\3\2\2\2G"+
		"\u011d\3\2\2\2I\u011f\3\2\2\2K\u0121\3\2\2\2M\u0123\3\2\2\2O\u0125\3\2"+
		"\2\2Q\u0127\3\2\2\2S\u0130\3\2\2\2U\u0132\3\2\2\2W\u0134\3\2\2\2Y\u0136"+
		"\3\2\2\2[\u0139\3\2\2\2]\u013c\3\2\2\2_\u013f\3\2\2\2a\u0142\3\2\2\2c"+
		"\u0146\3\2\2\2e\u0151\3\2\2\2gh\7g\2\2hi\7p\2\2ij\7f\2\2j\4\3\2\2\2kl"+
		"\7o\2\2lm\7c\2\2mn\7k\2\2no\7p\2\2o\6\3\2\2\2pq\7e\2\2qr\7q\2\2rs\7p\2"+
		"\2st\7u\2\2tu\7v\2\2uv\7c\2\2vw\7p\2\2wx\7v\2\2xy\7<\2\2y\b\3\2\2\2z{"+
		"\7x\2\2{|\7c\2\2|}\7t\2\2}~\7k\2\2~\177\7c\2\2\177\u0080\7d\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\u0083\7<\2\2\u0083\n\3\2\2\2\u0084"+
		"\u0085\7-\2\2\u0085\f\3\2\2\2\u0086\u0087\7/\2\2\u0087\16\3\2\2\2\u0088"+
		"\u0089\7,\2\2\u0089\20\3\2\2\2\u008a\u008b\7\61\2\2\u008b\22\3\2\2\2\u008c"+
		"\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e\u008f\7p\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7v\2\2\u0091\24\3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7"+
		"p\2\2\u0094\u0095\7v\2\2\u0095\26\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098"+
		"\7t\2\2\u0098\u0099\7w\2\2\u0099\u00a0\7g\2\2\u009a\u009b\7h\2\2\u009b"+
		"\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u00a0\7g\2\2"+
		"\u009f\u0096\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\30\3\2\2\2\u00a1\u00a2"+
		"\7x\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7f\2\2\u00a5"+
		"\32\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2"+
		"\2\u00a8\u00aa\3\2\2\2\u00a9\u00ab\t\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\34\3\2\2\2\u00ae"+
		"\u00af\7d\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7n\2\2"+
		"\u00b2\36\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7"+
		"e\2\2\u00b6 \3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\"\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0$\3\2\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7k\2\2"+
		"\u00c5\u00c6\7h\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7j\2"+
		"\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7"+
		"f\2\2\u00cd\u00ce\7q\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1"+
		"\7h\2\2\u00d1,\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\u00d6\7g\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7y\2\2\u00d8\u00d9"+
		"\7j\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\60\3\2\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7f\2\2\u00e0"+
		"\u00e1\7y\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7n\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7"+
		"y\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec"+
		"\7j\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7f\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7y\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7v\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7j\2\2\u00f6\66\3\2\2\2\u00f7"+
		"\u00f8\7f\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7c\2\2"+
		"\u00fb\u00fc\7w\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7v\2\2\u00fe8\3\2\2"+
		"\2\u00ff\u0100\7h\2\2\u0100\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102:\3\2"+
		"\2\2\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105\u0106\7f\2\2\u0106\u0107"+
		"\7h\2\2\u0107\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109<\3\2\2\2\u010a\u010b"+
		"\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d\7r\2\2\u010d\u010e\7g\2\2\u010e"+
		"\u010f\7c\2\2\u010f\u0110\7v\2\2\u0110>\3\2\2\2\u0111\u0112\7w\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7v\2\2\u0114\u0115\7k\2\2\u0115\u0116\7n\2\2"+
		"\u0116@\3\2\2\2\u0117\u0118\7*\2\2\u0118B\3\2\2\2\u0119\u011a\7+\2\2\u011a"+
		"D\3\2\2\2\u011b\u011c\7}\2\2\u011cF\3\2\2\2\u011d\u011e\7\177\2\2\u011e"+
		"H\3\2\2\2\u011f\u0120\7?\2\2\u0120J\3\2\2\2\u0121\u0122\7.\2\2\u0122L"+
		"\3\2\2\2\u0123\u0124\7<\2\2\u0124N\3\2\2\2\u0125\u0126\7=\2\2\u0126P\3"+
		"\2\2\2\u0127\u0128\7A\2\2\u0128R\3\2\2\2\u0129\u0131\t\4\2\2\u012a\u012b"+
		"\7>\2\2\u012b\u0131\7?\2\2\u012c\u012d\7@\2\2\u012d\u0131\7?\2\2\u012e"+
		"\u012f\7?\2\2\u012f\u0131\7?\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2"+
		"\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131T\3\2\2\2\u0132\u0133"+
		"\7>\2\2\u0133V\3\2\2\2\u0134\u0135\7@\2\2\u0135X\3\2\2\2\u0136\u0137\7"+
		">\2\2\u0137\u0138\7?\2\2\u0138Z\3\2\2\2\u0139\u013a\7@\2\2\u013a\u013b"+
		"\7?\2\2\u013b\\\3\2\2\2\u013c\u013d\7?\2\2\u013d\u013e\7?\2\2\u013e^\3"+
		"\2\2\2\u013f\u0140\7(\2\2\u0140\u0141\7(\2\2\u0141`\3\2\2\2\u0142\u0143"+
		"\7~\2\2\u0143\u0144\7~\2\2\u0144b\3\2\2\2\u0145\u0147\t\5\2\2\u0146\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014d\3\2\2\2\u014a\u014c\t\6\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014ed\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u0150\u0152\t\7\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b\63"+
		"\2\2\u0156f\3\2\2\2\n\2\u009f\u00a7\u00ac\u0130\u0148\u014d\u0153\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}