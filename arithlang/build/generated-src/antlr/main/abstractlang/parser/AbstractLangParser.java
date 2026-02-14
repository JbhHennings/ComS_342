// Generated from abstractlang/parser/AbstractLang.g4 by ANTLR 4.13.2
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
public class AbstractLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, WS=9;
	public static final int
		RULE_program = 0, RULE_exp = 1, RULE_atomexp = 2, RULE_addexp = 3, RULE_multexp = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "exp", "atomexp", "addexp", "multexp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'p'", "'n'", "'z'", "'u'", "'('", "'+'", "')'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "WS"
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
	public String getGrammarFileName() { return "AbstractLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbstractLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public abstractlang.AST.Program ast;
		public ExpContext e;
		public TerminalNode EOF() { return getToken(AbstractLangParser.EOF, 0); }
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
			setState(10);
			((ProgramContext)_localctx).e = exp();
			setState(11);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new abstractlang.AST.Program(((ProgramContext)_localctx).e.ast); 
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
		public abstractlang.AST.Exp ast;
		public AtomexpContext ae;
		public AddexpContext ad;
		public MultexpContext me;
		public AtomexpContext atomexp() {
			return getRuleContext(AtomexpContext.class,0);
		}
		public AddexpContext addexp() {
			return getRuleContext(AddexpContext.class,0);
		}
		public MultexpContext multexp() {
			return getRuleContext(MultexpContext.class,0);
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
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((ExpContext)_localctx).ae = atomexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).ae.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((ExpContext)_localctx).ad = addexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).ad.ast; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				((ExpContext)_localctx).me = multexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).me.ast; 
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
	public static class AtomexpContext extends ParserRuleContext {
		public abstractlang.AST.Exp ast;
		public AtomexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomexp; }
	}

	public final AtomexpContext atomexp() throws RecognitionException {
		AtomexpContext _localctx = new AtomexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atomexp);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(T__0);
				 ((AtomexpContext)_localctx).ast =  new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.P); 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__1);
				 ((AtomexpContext)_localctx).ast =  new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.N); 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				match(T__2);
				 ((AtomexpContext)_localctx).ast =  new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.Z); 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(T__3);
				 ((AtomexpContext)_localctx).ast =  new abstractlang.AST.AtomExp(abstractlang.AST.AbsVal.U); 
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public abstractlang.AST.Exp ast;
		public java.util.ArrayList<abstractlang.AST.Exp> list;
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
		enterRule(_localctx, 6, RULE_addexp);
		 ((AddexpContext)_localctx).list =  new java.util.ArrayList<abstractlang.AST.Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__4);
			setState(36);
			match(T__5);
			setState(37);
			((AddexpContext)_localctx).e = exp();
			 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				((AddexpContext)_localctx).e = exp();
				 _localctx.list.add(((AddexpContext)_localctx).e.ast); 
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0) );
			setState(46);
			match(T__6);
			 ((AddexpContext)_localctx).ast =  new abstractlang.AST.AddExp(_localctx.list); 
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
		public abstractlang.AST.Exp ast;
		public java.util.ArrayList<abstractlang.AST.Exp> list;
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
		enterRule(_localctx, 8, RULE_multexp);
		 ((MultexpContext)_localctx).list =  new java.util.ArrayList<abstractlang.AST.Exp>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__4);
			setState(50);
			match(T__7);
			setState(51);
			((MultexpContext)_localctx).e = exp();
			 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				((MultexpContext)_localctx).e = exp();
				 _localctx.list.add(((MultexpContext)_localctx).e.ast); 
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0) );
			setState(60);
			match(T__6);
			 ((MultexpContext)_localctx).ast =  new abstractlang.AST.MultExp(_localctx.list); 
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
		"\u0004\u0001\t@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\"\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0004\u0003+\b\u0003\u000b\u0003\f\u0003,\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u00049\b\u0004\u000b\u0004"+
		"\f\u0004:\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000A\u0000\n\u0001\u0000\u0000"+
		"\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000"+
		"\u0006#\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n\u000b\u0003"+
		"\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\r\u0006\u0000\uffff"+
		"\uffff\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0004\u0002"+
		"\u0000\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010\u0018\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0003\u0006\u0003\u0000\u0012\u0013\u0006\u0001"+
		"\uffff\uffff\u0000\u0013\u0018\u0001\u0000\u0000\u0000\u0014\u0015\u0003"+
		"\b\u0004\u0000\u0015\u0016\u0006\u0001\uffff\uffff\u0000\u0016\u0018\u0001"+
		"\u0000\u0000\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u0011\u0001"+
		"\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0018\u0003\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\"\u0006\u0002"+
		"\uffff\uffff\u0000\u001b\u001c\u0005\u0002\u0000\u0000\u001c\"\u0006\u0002"+
		"\uffff\uffff\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\"\u0006\u0002"+
		"\uffff\uffff\u0000\u001f \u0005\u0004\u0000\u0000 \"\u0006\u0002\uffff"+
		"\uffff\u0000!\u0019\u0001\u0000\u0000\u0000!\u001b\u0001\u0000\u0000\u0000"+
		"!\u001d\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"\u0005"+
		"\u0001\u0000\u0000\u0000#$\u0005\u0005\u0000\u0000$%\u0005\u0006\u0000"+
		"\u0000%&\u0003\u0002\u0001\u0000&*\u0006\u0003\uffff\uffff\u0000\'(\u0003"+
		"\u0002\u0001\u0000()\u0006\u0003\uffff\uffff\u0000)+\u0001\u0000\u0000"+
		"\u0000*\'\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0005"+
		"\u0007\u0000\u0000/0\u0006\u0003\uffff\uffff\u00000\u0007\u0001\u0000"+
		"\u0000\u000012\u0005\u0005\u0000\u000023\u0005\b\u0000\u000034\u0003\u0002"+
		"\u0001\u000048\u0006\u0004\uffff\uffff\u000056\u0003\u0002\u0001\u0000"+
		"67\u0006\u0004\uffff\uffff\u000079\u0001\u0000\u0000\u000085\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0005\u0007\u0000\u0000"+
		"=>\u0006\u0004\uffff\uffff\u0000>\t\u0001\u0000\u0000\u0000\u0004\u0017"+
		"!,:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}