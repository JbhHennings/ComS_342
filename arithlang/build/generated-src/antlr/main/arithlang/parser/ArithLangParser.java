// Generated from arithlang/parser/ArithLang.g4 by ANTLR 4.13.2
package arithlang.parser; import static arithlang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ArithLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Dot=8, Number=9, 
		Identifier=10, Letter=11, LetterOrDigit=12, AT=13, ELLIPSIS=14, WS=15, 
		Comment=16, Line_Comment=17;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_powerexp = 2, RULE_numexp = 3, RULE_addexp = 4, 
		RULE_subexp = 5, RULE_multexp = 6, RULE_divexp = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "powerexp", "numexp", "addexp", "subexp", "multexp", 
			"divexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'Power'", "')'", "'-'", "'+'", "'*'", "'/'", "'.'", null, 
			null, null, null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "Dot", "Number", "Identifier", 
			"Letter", "LetterOrDigit", "AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
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

	@Override
	public String getGrammarFileName() { return "ArithLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((ProgramContext)_localctx).e = exp();
			 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).e.ast); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public NumexpContext n;
		public AddexpContext a;
		public SubexpContext s;
		public MultexpContext m;
		public DivexpContext d;
		public PowerexpContext p;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public SubexpContext subexp() {
			return getRuleContext(SubexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
		}
		public DivexpContext divexp() {
			return getRuleContext(DivexpContext.class,0);
		}
		public PowerexpContext powerexp() {
			return getRuleContext(PowerexpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_exp);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				((ExpContext)_localctx).a = addexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).a.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				((ExpContext)_localctx).s = subexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				((ExpContext)_localctx).m = multexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).m.ast; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				((ExpContext)_localctx).d = divexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).d.ast; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				((ExpContext)_localctx).p = powerexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).p.ast; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerexpContext extends ParserRuleContext {
		public PowerExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PowerexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerexp; }
	}

	public final PowerexpContext powerexp() throws RecognitionException {
		PowerexpContext _localctx = new PowerexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_powerexp);
		 ((PowerexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(T__1);
			setState(41);
			((PowerexpContext)_localctx).e = exp();
			 _localctx.list.add(((PowerexpContext)_localctx).e.ast); 
			setState(43);
			((PowerexpContext)_localctx).e = exp();
			 _localctx.list.add(((PowerexpContext)_localctx).e.ast); 
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 530L) != 0)) {
				{
				{
				setState(45);
				((PowerexpContext)_localctx).e = exp();
				 _localctx.list.add(((PowerexpContext)_localctx).e.ast); 
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__2);
			 ((PowerexpContext)_localctx).ast =  new PowerExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumexpContext extends ParserRuleContext {
		public NumExp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(ArithLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(ArithLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(ArithLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numexp);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp( Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(T__3);
				setState(59);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(-Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(62);
				match(Dot);
				setState(63);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble(      (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(T__3);
				setState(66);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(67);
				match(Dot);
				setState(68);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble("-" + (((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddexpContext extends ParserRuleContext {
		public AddExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AddexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexp; }
	}

	public final AddexpContext addexp() throws RecognitionException {
		AddexpContext _localctx = new AddexpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addexp);
		 ((AddexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			match(T__4);
			setState(74);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				((AddexpContext)_localctx).e = exp();
				 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 530L) != 0) );
			setState(83);
			match(T__2);
			 ((AddexpContext)_localctx).ast =  new AddExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubexpContext extends ParserRuleContext {
		public SubExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SubexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexp; }
	}

	public final SubexpContext subexp() throws RecognitionException {
		SubexpContext _localctx = new SubexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subexp);
		 ((SubexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__0);
			setState(87);
			match(T__3);
			setState(88);
			((SubexpContext)_localctx).e = exp();
			 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				((SubexpContext)_localctx).e = exp();
				 _localctx.list.add(((SubexpContext)_localctx).e.ast); 
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 530L) != 0) );
			setState(97);
			match(T__2);
			 ((SubexpContext)_localctx).ast =  new SubExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultexpContext extends ParserRuleContext {
		public MultExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public MultexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexp; }
	}

	public final MultexpContext multexp() throws RecognitionException {
		MultexpContext _localctx = new MultexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multexp);
		 ((MultexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__0);
			setState(101);
			match(T__5);
			setState(102);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				((MultexpContext)_localctx).e = exp();
				 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 530L) != 0) );
			setState(111);
			match(T__2);
			 ((MultexpContext)_localctx).ast =  new MultExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivexpContext extends ParserRuleContext {
		public DivExp ast;
		public ArrayList<Exp> list;
		public ExpContext e;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public DivexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexp; }
	}

	public final DivexpContext divexp() throws RecognitionException {
		DivexpContext _localctx = new DivexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_divexp);
		 ((DivexpContext)_localctx).list =  new ArrayList<Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
			setState(115);
			match(T__6);
			setState(116);
			((DivexpContext)_localctx).e = exp();
			 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				((DivexpContext)_localctx).e = exp();
				 _localctx.list.add(((DivexpContext)_localctx).e.ast); 
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 530L) != 0) );
			setState(125);
			match(T__2);
			 ((DivexpContext)_localctx).ast =  new DivExp(_localctx.list); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0011\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u00021\b\u0002\n\u0002\f\u00024\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"G\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004P\b\u0004\u000b\u0004\f\u0004Q\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005^\b\u0005\u000b"+
		"\u0005\f\u0005_\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006l\b\u0006\u000b\u0006\f\u0006m\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007z\b\u0007\u000b\u0007\f\u0007{\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0000\u0000\u0085\u0000\u0010\u0001\u0000\u0000\u0000\u0002"+
		"%\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006F\u0001"+
		"\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000"+
		"\fd\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0003\u0002\u0001\u0000\u0011\u0012\u0006\u0000\uffff\uffff\u0000\u0012"+
		"\u0001\u0001\u0000\u0000\u0000\u0013\u0014\u0003\u0006\u0003\u0000\u0014"+
		"\u0015\u0006\u0001\uffff\uffff\u0000\u0015&\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0003\b\u0004\u0000\u0017\u0018\u0006\u0001\uffff\uffff\u0000\u0018"+
		"&\u0001\u0000\u0000\u0000\u0019\u001a\u0003\n\u0005\u0000\u001a\u001b"+
		"\u0006\u0001\uffff\uffff\u0000\u001b&\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0003\f\u0006\u0000\u001d\u001e\u0006\u0001\uffff\uffff\u0000\u001e&"+
		"\u0001\u0000\u0000\u0000\u001f \u0003\u000e\u0007\u0000 !\u0006\u0001"+
		"\uffff\uffff\u0000!&\u0001\u0000\u0000\u0000\"#\u0003\u0004\u0002\u0000"+
		"#$\u0006\u0001\uffff\uffff\u0000$&\u0001\u0000\u0000\u0000%\u0013\u0001"+
		"\u0000\u0000\u0000%\u0016\u0001\u0000\u0000\u0000%\u0019\u0001\u0000\u0000"+
		"\u0000%\u001c\u0001\u0000\u0000\u0000%\u001f\u0001\u0000\u0000\u0000%"+
		"\"\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u0005\u0001"+
		"\u0000\u0000()\u0005\u0002\u0000\u0000)*\u0003\u0002\u0001\u0000*+\u0006"+
		"\u0002\uffff\uffff\u0000+,\u0003\u0002\u0001\u0000,2\u0006\u0002\uffff"+
		"\uffff\u0000-.\u0003\u0002\u0001\u0000./\u0006\u0002\uffff\uffff\u0000"+
		"/1\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u000014\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0005\u0003\u0000\u000067\u0006"+
		"\u0002\uffff\uffff\u00007\u0005\u0001\u0000\u0000\u000089\u0005\t\u0000"+
		"\u00009G\u0006\u0003\uffff\uffff\u0000:;\u0005\u0004\u0000\u0000;<\u0005"+
		"\t\u0000\u0000<G\u0006\u0003\uffff\uffff\u0000=>\u0005\t\u0000\u0000>"+
		"?\u0005\b\u0000\u0000?@\u0005\t\u0000\u0000@G\u0006\u0003\uffff\uffff"+
		"\u0000AB\u0005\u0004\u0000\u0000BC\u0005\t\u0000\u0000CD\u0005\b\u0000"+
		"\u0000DE\u0005\t\u0000\u0000EG\u0006\u0003\uffff\uffff\u0000F8\u0001\u0000"+
		"\u0000\u0000F:\u0001\u0000\u0000\u0000F=\u0001\u0000\u0000\u0000FA\u0001"+
		"\u0000\u0000\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0005\u0001\u0000"+
		"\u0000IJ\u0005\u0005\u0000\u0000JK\u0003\u0002\u0001\u0000KO\u0006\u0004"+
		"\uffff\uffff\u0000LM\u0003\u0002\u0001\u0000MN\u0006\u0004\uffff\uffff"+
		"\u0000NP\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000ST\u0005\u0003\u0000\u0000TU\u0006\u0004\uffff\uffff"+
		"\u0000U\t\u0001\u0000\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0005\u0004"+
		"\u0000\u0000XY\u0003\u0002\u0001\u0000Y]\u0006\u0005\uffff\uffff\u0000"+
		"Z[\u0003\u0002\u0001\u0000[\\\u0006\u0005\uffff\uffff\u0000\\^\u0001\u0000"+
		"\u0000\u0000]Z\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0005\u0003\u0000\u0000bc\u0006\u0005\uffff\uffff\u0000c\u000b\u0001"+
		"\u0000\u0000\u0000de\u0005\u0001\u0000\u0000ef\u0005\u0006\u0000\u0000"+
		"fg\u0003\u0002\u0001\u0000gk\u0006\u0006\uffff\uffff\u0000hi\u0003\u0002"+
		"\u0001\u0000ij\u0006\u0006\uffff\uffff\u0000jl\u0001\u0000\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005\u0003"+
		"\u0000\u0000pq\u0006\u0006\uffff\uffff\u0000q\r\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0001\u0000\u0000st\u0005\u0007\u0000\u0000tu\u0003\u0002\u0001"+
		"\u0000uy\u0006\u0007\uffff\uffff\u0000vw\u0003\u0002\u0001\u0000wx\u0006"+
		"\u0007\uffff\uffff\u0000xz\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0003\u0000\u0000~\u007f"+
		"\u0006\u0007\uffff\uffff\u0000\u007f\u000f\u0001\u0000\u0000\u0000\u0007"+
		"%2FQ_m{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}