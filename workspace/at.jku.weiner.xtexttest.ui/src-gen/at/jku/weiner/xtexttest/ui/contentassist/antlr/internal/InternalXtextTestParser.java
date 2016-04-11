package at.jku.weiner.xtexttest.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.jku.weiner.xtexttest.services.XtextTestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXtextTestParser extends AbstractInternalContentAssistParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AFTER_KW", "RULE_ANY_OTHER", 
		"RULE_ASSIGNASBOOL", "RULE_ASSIGNASDATALIST", "RULE_ASSIGNASLIST", "RULE_ASSIGNASSINGLE", 
		"RULE_ASSIGNASSTRING", "RULE_BEFORE_KW", "RULE_CLASS_KW", "RULE_COMMA", 
		"RULE_DEFAULT", "RULE_EXCEPTIONS", "RULE_EXPECTED", "RULE_FALSE", "RULE_FILE", 
		"RULE_ID", "RULE_IDENTIFIER", "RULE_IMPORTER", "RULE_IMPORTS", "RULE_INT", 
		"RULE_ISEMPTY", "RULE_ISNOTNULL", "RULE_ISNULL", "RULE_ISSAMEASINPUTFILE", 
		"RULE_KW_AS", "RULE_KW_EMFTEST", "RULE_LANGUAGE", "RULE_LEFTPAREN", "RULE_LEXER", 
		"RULE_METHOD_KW", "RULE_ML_COMMENT", "RULE_OPTIONS", "RULE_OUTPUT", "RULE_PACKAGE", 
		"RULE_PATTERNS", "RULE_POINT", "RULE_RIGHTPAREN", "RULE_SL_COMMENT", "RULE_SOURCE", 
		"RULE_SPLITLEXER", "RULE_SRCTEXT", "RULE_STRING", "RULE_TIMEOUT", "RULE_TRUE", 
		"RULE_WS"
	};
	public static final int EOF=-1;
	public static final int RULE_AFTER_KW=4;
	public static final int RULE_ANY_OTHER=5;
	public static final int RULE_ASSIGNASBOOL=6;
	public static final int RULE_ASSIGNASDATALIST=7;
	public static final int RULE_ASSIGNASLIST=8;
	public static final int RULE_ASSIGNASSINGLE=9;
	public static final int RULE_ASSIGNASSTRING=10;
	public static final int RULE_BEFORE_KW=11;
	public static final int RULE_CLASS_KW=12;
	public static final int RULE_COMMA=13;
	public static final int RULE_DEFAULT=14;
	public static final int RULE_EXCEPTIONS=15;
	public static final int RULE_EXPECTED=16;
	public static final int RULE_FALSE=17;
	public static final int RULE_FILE=18;
	public static final int RULE_ID=19;
	public static final int RULE_IDENTIFIER=20;
	public static final int RULE_IMPORTER=21;
	public static final int RULE_IMPORTS=22;
	public static final int RULE_INT=23;
	public static final int RULE_ISEMPTY=24;
	public static final int RULE_ISNOTNULL=25;
	public static final int RULE_ISNULL=26;
	public static final int RULE_ISSAMEASINPUTFILE=27;
	public static final int RULE_KW_AS=28;
	public static final int RULE_KW_EMFTEST=29;
	public static final int RULE_LANGUAGE=30;
	public static final int RULE_LEFTPAREN=31;
	public static final int RULE_LEXER=32;
	public static final int RULE_METHOD_KW=33;
	public static final int RULE_ML_COMMENT=34;
	public static final int RULE_OPTIONS=35;
	public static final int RULE_OUTPUT=36;
	public static final int RULE_PACKAGE=37;
	public static final int RULE_PATTERNS=38;
	public static final int RULE_POINT=39;
	public static final int RULE_RIGHTPAREN=40;
	public static final int RULE_SL_COMMENT=41;
	public static final int RULE_SOURCE=42;
	public static final int RULE_SPLITLEXER=43;
	public static final int RULE_SRCTEXT=44;
	public static final int RULE_STRING=45;
	public static final int RULE_TIMEOUT=46;
	public static final int RULE_TRUE=47;
	public static final int RULE_WS=48;

	// delegates
	public AbstractInternalContentAssistParser[] getDelegates() {
		return new AbstractInternalContentAssistParser[] {};
	}

	// delegators


	public InternalXtextTestParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public InternalXtextTestParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return InternalXtextTestParser.tokenNames; }
	@Override public String getGrammarFileName() { return "InternalXtextTest.g"; }


	 
	 	private XtextTestGrammarAccess grammarAccess;
	 	
	    public void setGrammarAccess(XtextTestGrammarAccess grammarAccess) {
	    	this.grammarAccess = grammarAccess;
	    }
	    
	    @Override
	    protected Grammar getGrammar() {
	    	return grammarAccess.getGrammar();
	    }
	    
	    @Override
	    protected String getValueForTokenName(String tokenName) {
	    	return tokenName;
	    }




	// $ANTLR start "entryRuleModel"
	// InternalXtextTest.g:62:1: entryRuleModel : ruleModel EOF ;
	public final void entryRuleModel() throws RecognitionException {
		try {
			// InternalXtextTest.g:63:1: ( ruleModel EOF )
			// InternalXtextTest.g:64:1: ruleModel EOF
			{
			 before(grammarAccess.getModelRule()); 
			pushFollow(FOLLOW_1);
			ruleModel();
			state._fsp--;

			 after(grammarAccess.getModelRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleModel"



	// $ANTLR start "ruleModel"
	// InternalXtextTest.g:71:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
	public final void ruleModel() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:78:7: ( ( ( rule__Model__Group__0 ) ) )
			// InternalXtextTest.g:80:1: ( ( rule__Model__Group__0 ) )
			{
			// InternalXtextTest.g:80:1: ( ( rule__Model__Group__0 ) )
			// InternalXtextTest.g:81:1: ( rule__Model__Group__0 )
			{
			 before(grammarAccess.getModelAccess().getGroup()); 
			// InternalXtextTest.g:82:2: ( rule__Model__Group__0 )
			// InternalXtextTest.g:82:2: rule__Model__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Model__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getModelAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleModel"



	// $ANTLR start "entryRuleXtextTest"
	// InternalXtextTest.g:97:1: entryRuleXtextTest : ruleXtextTest EOF ;
	public final void entryRuleXtextTest() throws RecognitionException {
		try {
			// InternalXtextTest.g:98:1: ( ruleXtextTest EOF )
			// InternalXtextTest.g:99:1: ruleXtextTest EOF
			{
			 before(grammarAccess.getXtextTestRule()); 
			pushFollow(FOLLOW_1);
			ruleXtextTest();
			state._fsp--;

			 after(grammarAccess.getXtextTestRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleXtextTest"



	// $ANTLR start "ruleXtextTest"
	// InternalXtextTest.g:106:1: ruleXtextTest : ( ( rule__XtextTest__Group__0 ) ) ;
	public final void ruleXtextTest() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:113:7: ( ( ( rule__XtextTest__Group__0 ) ) )
			// InternalXtextTest.g:115:1: ( ( rule__XtextTest__Group__0 ) )
			{
			// InternalXtextTest.g:115:1: ( ( rule__XtextTest__Group__0 ) )
			// InternalXtextTest.g:116:1: ( rule__XtextTest__Group__0 )
			{
			 before(grammarAccess.getXtextTestAccess().getGroup()); 
			// InternalXtextTest.g:117:2: ( rule__XtextTest__Group__0 )
			// InternalXtextTest.g:117:2: rule__XtextTest__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleXtextTest"



	// $ANTLR start "entryRuleEmfTest"
	// InternalXtextTest.g:132:1: entryRuleEmfTest : ruleEmfTest EOF ;
	public final void entryRuleEmfTest() throws RecognitionException {
		try {
			// InternalXtextTest.g:133:1: ( ruleEmfTest EOF )
			// InternalXtextTest.g:134:1: ruleEmfTest EOF
			{
			 before(grammarAccess.getEmfTestRule()); 
			pushFollow(FOLLOW_1);
			ruleEmfTest();
			state._fsp--;

			 after(grammarAccess.getEmfTestRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleEmfTest"



	// $ANTLR start "ruleEmfTest"
	// InternalXtextTest.g:141:1: ruleEmfTest : ( ( rule__EmfTest__Group__0 ) ) ;
	public final void ruleEmfTest() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:148:7: ( ( ( rule__EmfTest__Group__0 ) ) )
			// InternalXtextTest.g:150:1: ( ( rule__EmfTest__Group__0 ) )
			{
			// InternalXtextTest.g:150:1: ( ( rule__EmfTest__Group__0 ) )
			// InternalXtextTest.g:151:1: ( rule__EmfTest__Group__0 )
			{
			 before(grammarAccess.getEmfTestAccess().getGroup()); 
			// InternalXtextTest.g:152:2: ( rule__EmfTest__Group__0 )
			// InternalXtextTest.g:152:2: rule__EmfTest__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleEmfTest"



	// $ANTLR start "entryRuleImport"
	// InternalXtextTest.g:167:1: entryRuleImport : ruleImport EOF ;
	public final void entryRuleImport() throws RecognitionException {
		try {
			// InternalXtextTest.g:168:1: ( ruleImport EOF )
			// InternalXtextTest.g:169:1: ruleImport EOF
			{
			 before(grammarAccess.getImportRule()); 
			pushFollow(FOLLOW_1);
			ruleImport();
			state._fsp--;

			 after(grammarAccess.getImportRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleImport"



	// $ANTLR start "ruleImport"
	// InternalXtextTest.g:176:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
	public final void ruleImport() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:183:7: ( ( ( rule__Import__Group__0 ) ) )
			// InternalXtextTest.g:185:1: ( ( rule__Import__Group__0 ) )
			{
			// InternalXtextTest.g:185:1: ( ( rule__Import__Group__0 ) )
			// InternalXtextTest.g:186:1: ( rule__Import__Group__0 )
			{
			 before(grammarAccess.getImportAccess().getGroup()); 
			// InternalXtextTest.g:187:2: ( rule__Import__Group__0 )
			// InternalXtextTest.g:187:2: rule__Import__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Import__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getImportAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleImport"



	// $ANTLR start "entryRuleBoolean"
	// InternalXtextTest.g:202:1: entryRuleBoolean : ruleBoolean EOF ;
	public final void entryRuleBoolean() throws RecognitionException {
		try {
			// InternalXtextTest.g:203:1: ( ruleBoolean EOF )
			// InternalXtextTest.g:204:1: ruleBoolean EOF
			{
			 before(grammarAccess.getBooleanRule()); 
			pushFollow(FOLLOW_1);
			ruleBoolean();
			state._fsp--;

			 after(grammarAccess.getBooleanRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleBoolean"



	// $ANTLR start "ruleBoolean"
	// InternalXtextTest.g:211:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
	public final void ruleBoolean() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:218:7: ( ( ( rule__Boolean__Alternatives ) ) )
			// InternalXtextTest.g:220:1: ( ( rule__Boolean__Alternatives ) )
			{
			// InternalXtextTest.g:220:1: ( ( rule__Boolean__Alternatives ) )
			// InternalXtextTest.g:221:1: ( rule__Boolean__Alternatives )
			{
			 before(grammarAccess.getBooleanAccess().getAlternatives()); 
			// InternalXtextTest.g:222:2: ( rule__Boolean__Alternatives )
			// InternalXtextTest.g:222:2: rule__Boolean__Alternatives
			{
			pushFollow(FOLLOW_2);
			rule__Boolean__Alternatives();
			state._fsp--;

			}

			 after(grammarAccess.getBooleanAccess().getAlternatives()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleBoolean"



	// $ANTLR start "entryRulePackageID"
	// InternalXtextTest.g:237:1: entryRulePackageID : rulePackageID EOF ;
	public final void entryRulePackageID() throws RecognitionException {
		try {
			// InternalXtextTest.g:238:1: ( rulePackageID EOF )
			// InternalXtextTest.g:239:1: rulePackageID EOF
			{
			 before(grammarAccess.getPackageIDRule()); 
			pushFollow(FOLLOW_1);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getPackageIDRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRulePackageID"



	// $ANTLR start "rulePackageID"
	// InternalXtextTest.g:246:1: rulePackageID : ( ( rule__PackageID__Group__0 ) ) ;
	public final void rulePackageID() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:253:7: ( ( ( rule__PackageID__Group__0 ) ) )
			// InternalXtextTest.g:255:1: ( ( rule__PackageID__Group__0 ) )
			{
			// InternalXtextTest.g:255:1: ( ( rule__PackageID__Group__0 ) )
			// InternalXtextTest.g:256:1: ( rule__PackageID__Group__0 )
			{
			 before(grammarAccess.getPackageIDAccess().getGroup()); 
			// InternalXtextTest.g:257:2: ( rule__PackageID__Group__0 )
			// InternalXtextTest.g:257:2: rule__PackageID__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__PackageID__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getPackageIDAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rulePackageID"



	// $ANTLR start "entryRuleLangID"
	// InternalXtextTest.g:272:1: entryRuleLangID : ruleLangID EOF ;
	public final void entryRuleLangID() throws RecognitionException {
		try {
			// InternalXtextTest.g:273:1: ( ruleLangID EOF )
			// InternalXtextTest.g:274:1: ruleLangID EOF
			{
			 before(grammarAccess.getLangIDRule()); 
			pushFollow(FOLLOW_1);
			ruleLangID();
			state._fsp--;

			 after(grammarAccess.getLangIDRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleLangID"



	// $ANTLR start "ruleLangID"
	// InternalXtextTest.g:281:1: ruleLangID : ( RULE_IDENTIFIER ) ;
	public final void ruleLangID() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:288:7: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:290:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:290:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:291:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getLangIDAccess().getIDENTIFIERTerminalRuleCall()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getLangIDAccess().getIDENTIFIERTerminalRuleCall()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleLangID"



	// $ANTLR start "entryRuleImportID"
	// InternalXtextTest.g:307:1: entryRuleImportID : ruleImportID EOF ;
	public final void entryRuleImportID() throws RecognitionException {
		try {
			// InternalXtextTest.g:308:1: ( ruleImportID EOF )
			// InternalXtextTest.g:309:1: ruleImportID EOF
			{
			 before(grammarAccess.getImportIDRule()); 
			pushFollow(FOLLOW_1);
			ruleImportID();
			state._fsp--;

			 after(grammarAccess.getImportIDRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleImportID"



	// $ANTLR start "ruleImportID"
	// InternalXtextTest.g:316:1: ruleImportID : ( ( rule__ImportID__Group__0 ) ) ;
	public final void ruleImportID() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:323:7: ( ( ( rule__ImportID__Group__0 ) ) )
			// InternalXtextTest.g:325:1: ( ( rule__ImportID__Group__0 ) )
			{
			// InternalXtextTest.g:325:1: ( ( rule__ImportID__Group__0 ) )
			// InternalXtextTest.g:326:1: ( rule__ImportID__Group__0 )
			{
			 before(grammarAccess.getImportIDAccess().getGroup()); 
			// InternalXtextTest.g:327:2: ( rule__ImportID__Group__0 )
			// InternalXtextTest.g:327:2: rule__ImportID__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__ImportID__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getImportIDAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleImportID"



	// $ANTLR start "entryRuleInput"
	// InternalXtextTest.g:342:1: entryRuleInput : ruleInput EOF ;
	public final void entryRuleInput() throws RecognitionException {
		try {
			// InternalXtextTest.g:343:1: ( ruleInput EOF )
			// InternalXtextTest.g:344:1: ruleInput EOF
			{
			 before(grammarAccess.getInputRule()); 
			pushFollow(FOLLOW_1);
			ruleInput();
			state._fsp--;

			 after(grammarAccess.getInputRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleInput"



	// $ANTLR start "ruleInput"
	// InternalXtextTest.g:351:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
	public final void ruleInput() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:358:7: ( ( ( rule__Input__Group__0 ) ) )
			// InternalXtextTest.g:360:1: ( ( rule__Input__Group__0 ) )
			{
			// InternalXtextTest.g:360:1: ( ( rule__Input__Group__0 ) )
			// InternalXtextTest.g:361:1: ( rule__Input__Group__0 )
			{
			 before(grammarAccess.getInputAccess().getGroup()); 
			// InternalXtextTest.g:362:2: ( rule__Input__Group__0 )
			// InternalXtextTest.g:362:2: rule__Input__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Input__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getInputAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleInput"



	// $ANTLR start "entryRuleTokens"
	// InternalXtextTest.g:377:1: entryRuleTokens : ruleTokens EOF ;
	public final void entryRuleTokens() throws RecognitionException {
		try {
			// InternalXtextTest.g:378:1: ( ruleTokens EOF )
			// InternalXtextTest.g:379:1: ruleTokens EOF
			{
			 before(grammarAccess.getTokensRule()); 
			pushFollow(FOLLOW_1);
			ruleTokens();
			state._fsp--;

			 after(grammarAccess.getTokensRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleTokens"



	// $ANTLR start "ruleTokens"
	// InternalXtextTest.g:386:1: ruleTokens : ( ( rule__Tokens__Group__0 ) ) ;
	public final void ruleTokens() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:393:7: ( ( ( rule__Tokens__Group__0 ) ) )
			// InternalXtextTest.g:395:1: ( ( rule__Tokens__Group__0 ) )
			{
			// InternalXtextTest.g:395:1: ( ( rule__Tokens__Group__0 ) )
			// InternalXtextTest.g:396:1: ( rule__Tokens__Group__0 )
			{
			 before(grammarAccess.getTokensAccess().getGroup()); 
			// InternalXtextTest.g:397:2: ( rule__Tokens__Group__0 )
			// InternalXtextTest.g:397:2: rule__Tokens__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Tokens__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getTokensAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleTokens"



	// $ANTLR start "entryRuleMyTokens"
	// InternalXtextTest.g:412:1: entryRuleMyTokens : ruleMyTokens EOF ;
	public final void entryRuleMyTokens() throws RecognitionException {
		try {
			// InternalXtextTest.g:413:1: ( ruleMyTokens EOF )
			// InternalXtextTest.g:414:1: ruleMyTokens EOF
			{
			 before(grammarAccess.getMyTokensRule()); 
			pushFollow(FOLLOW_1);
			ruleMyTokens();
			state._fsp--;

			 after(grammarAccess.getMyTokensRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleMyTokens"



	// $ANTLR start "ruleMyTokens"
	// InternalXtextTest.g:421:1: ruleMyTokens : ( ( rule__MyTokens__Group__0 ) ) ;
	public final void ruleMyTokens() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:428:7: ( ( ( rule__MyTokens__Group__0 ) ) )
			// InternalXtextTest.g:430:1: ( ( rule__MyTokens__Group__0 ) )
			{
			// InternalXtextTest.g:430:1: ( ( rule__MyTokens__Group__0 ) )
			// InternalXtextTest.g:431:1: ( rule__MyTokens__Group__0 )
			{
			 before(grammarAccess.getMyTokensAccess().getGroup()); 
			// InternalXtextTest.g:432:2: ( rule__MyTokens__Group__0 )
			// InternalXtextTest.g:432:2: rule__MyTokens__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__MyTokens__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getMyTokensAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleMyTokens"



	// $ANTLR start "entryRuleElement"
	// InternalXtextTest.g:447:1: entryRuleElement : ruleElement EOF ;
	public final void entryRuleElement() throws RecognitionException {
		try {
			// InternalXtextTest.g:448:1: ( ruleElement EOF )
			// InternalXtextTest.g:449:1: ruleElement EOF
			{
			 before(grammarAccess.getElementRule()); 
			pushFollow(FOLLOW_1);
			ruleElement();
			state._fsp--;

			 after(grammarAccess.getElementRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleElement"



	// $ANTLR start "ruleElement"
	// InternalXtextTest.g:456:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
	public final void ruleElement() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:463:7: ( ( ( rule__Element__Group__0 ) ) )
			// InternalXtextTest.g:465:1: ( ( rule__Element__Group__0 ) )
			{
			// InternalXtextTest.g:465:1: ( ( rule__Element__Group__0 ) )
			// InternalXtextTest.g:466:1: ( rule__Element__Group__0 )
			{
			 before(grammarAccess.getElementAccess().getGroup()); 
			// InternalXtextTest.g:467:2: ( rule__Element__Group__0 )
			// InternalXtextTest.g:467:2: rule__Element__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Element__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getElementAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleElement"



	// $ANTLR start "entryRuleInner"
	// InternalXtextTest.g:482:1: entryRuleInner : ruleInner EOF ;
	public final void entryRuleInner() throws RecognitionException {
		try {
			// InternalXtextTest.g:483:1: ( ruleInner EOF )
			// InternalXtextTest.g:484:1: ruleInner EOF
			{
			 before(grammarAccess.getInnerRule()); 
			pushFollow(FOLLOW_1);
			ruleInner();
			state._fsp--;

			 after(grammarAccess.getInnerRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleInner"



	// $ANTLR start "ruleInner"
	// InternalXtextTest.g:491:1: ruleInner : ( ( rule__Inner__Group__0 ) ) ;
	public final void ruleInner() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:498:7: ( ( ( rule__Inner__Group__0 ) ) )
			// InternalXtextTest.g:500:1: ( ( rule__Inner__Group__0 ) )
			{
			// InternalXtextTest.g:500:1: ( ( rule__Inner__Group__0 ) )
			// InternalXtextTest.g:501:1: ( rule__Inner__Group__0 )
			{
			 before(grammarAccess.getInnerAccess().getGroup()); 
			// InternalXtextTest.g:502:2: ( rule__Inner__Group__0 )
			// InternalXtextTest.g:502:2: rule__Inner__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleInner"



	// $ANTLR start "entryRuleGenerator"
	// InternalXtextTest.g:517:1: entryRuleGenerator : ruleGenerator EOF ;
	public final void entryRuleGenerator() throws RecognitionException {
		try {
			// InternalXtextTest.g:518:1: ( ruleGenerator EOF )
			// InternalXtextTest.g:519:1: ruleGenerator EOF
			{
			 before(grammarAccess.getGeneratorRule()); 
			pushFollow(FOLLOW_1);
			ruleGenerator();
			state._fsp--;

			 after(grammarAccess.getGeneratorRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleGenerator"



	// $ANTLR start "ruleGenerator"
	// InternalXtextTest.g:526:1: ruleGenerator : ( ( rule__Generator__Group__0 ) ) ;
	public final void ruleGenerator() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:533:7: ( ( ( rule__Generator__Group__0 ) ) )
			// InternalXtextTest.g:535:1: ( ( rule__Generator__Group__0 ) )
			{
			// InternalXtextTest.g:535:1: ( ( rule__Generator__Group__0 ) )
			// InternalXtextTest.g:536:1: ( rule__Generator__Group__0 )
			{
			 before(grammarAccess.getGeneratorAccess().getGroup()); 
			// InternalXtextTest.g:537:2: ( rule__Generator__Group__0 )
			// InternalXtextTest.g:537:2: rule__Generator__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleGenerator"



	// $ANTLR start "entryRuleReplacePatterns"
	// InternalXtextTest.g:552:1: entryRuleReplacePatterns : ruleReplacePatterns EOF ;
	public final void entryRuleReplacePatterns() throws RecognitionException {
		try {
			// InternalXtextTest.g:553:1: ( ruleReplacePatterns EOF )
			// InternalXtextTest.g:554:1: ruleReplacePatterns EOF
			{
			 before(grammarAccess.getReplacePatternsRule()); 
			pushFollow(FOLLOW_1);
			ruleReplacePatterns();
			state._fsp--;

			 after(grammarAccess.getReplacePatternsRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleReplacePatterns"



	// $ANTLR start "ruleReplacePatterns"
	// InternalXtextTest.g:561:1: ruleReplacePatterns : ( ( rule__ReplacePatterns__Group__0 ) ) ;
	public final void ruleReplacePatterns() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:568:7: ( ( ( rule__ReplacePatterns__Group__0 ) ) )
			// InternalXtextTest.g:570:1: ( ( rule__ReplacePatterns__Group__0 ) )
			{
			// InternalXtextTest.g:570:1: ( ( rule__ReplacePatterns__Group__0 ) )
			// InternalXtextTest.g:571:1: ( rule__ReplacePatterns__Group__0 )
			{
			 before(grammarAccess.getReplacePatternsAccess().getGroup()); 
			// InternalXtextTest.g:572:2: ( rule__ReplacePatterns__Group__0 )
			// InternalXtextTest.g:572:2: rule__ReplacePatterns__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__ReplacePatterns__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getReplacePatternsAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleReplacePatterns"



	// $ANTLR start "entryRuleBefore"
	// InternalXtextTest.g:587:1: entryRuleBefore : ruleBefore EOF ;
	public final void entryRuleBefore() throws RecognitionException {
		try {
			// InternalXtextTest.g:588:1: ( ruleBefore EOF )
			// InternalXtextTest.g:589:1: ruleBefore EOF
			{
			 before(grammarAccess.getBeforeRule()); 
			pushFollow(FOLLOW_1);
			ruleBefore();
			state._fsp--;

			 after(grammarAccess.getBeforeRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleBefore"



	// $ANTLR start "ruleBefore"
	// InternalXtextTest.g:596:1: ruleBefore : ( ( rule__Before__Group__0 ) ) ;
	public final void ruleBefore() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:603:7: ( ( ( rule__Before__Group__0 ) ) )
			// InternalXtextTest.g:605:1: ( ( rule__Before__Group__0 ) )
			{
			// InternalXtextTest.g:605:1: ( ( rule__Before__Group__0 ) )
			// InternalXtextTest.g:606:1: ( rule__Before__Group__0 )
			{
			 before(grammarAccess.getBeforeAccess().getGroup()); 
			// InternalXtextTest.g:607:2: ( rule__Before__Group__0 )
			// InternalXtextTest.g:607:2: rule__Before__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__Before__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getBeforeAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleBefore"



	// $ANTLR start "entryRuleAfter"
	// InternalXtextTest.g:622:1: entryRuleAfter : ruleAfter EOF ;
	public final void entryRuleAfter() throws RecognitionException {
		try {
			// InternalXtextTest.g:623:1: ( ruleAfter EOF )
			// InternalXtextTest.g:624:1: ruleAfter EOF
			{
			 before(grammarAccess.getAfterRule()); 
			pushFollow(FOLLOW_1);
			ruleAfter();
			state._fsp--;

			 after(grammarAccess.getAfterRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleAfter"



	// $ANTLR start "ruleAfter"
	// InternalXtextTest.g:631:1: ruleAfter : ( ( rule__After__Group__0 ) ) ;
	public final void ruleAfter() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:638:7: ( ( ( rule__After__Group__0 ) ) )
			// InternalXtextTest.g:640:1: ( ( rule__After__Group__0 ) )
			{
			// InternalXtextTest.g:640:1: ( ( rule__After__Group__0 ) )
			// InternalXtextTest.g:641:1: ( rule__After__Group__0 )
			{
			 before(grammarAccess.getAfterAccess().getGroup()); 
			// InternalXtextTest.g:642:2: ( rule__After__Group__0 )
			// InternalXtextTest.g:642:2: rule__After__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__After__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getAfterAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleAfter"



	// $ANTLR start "entryRuleCodeCall"
	// InternalXtextTest.g:657:1: entryRuleCodeCall : ruleCodeCall EOF ;
	public final void entryRuleCodeCall() throws RecognitionException {
		try {
			// InternalXtextTest.g:658:1: ( ruleCodeCall EOF )
			// InternalXtextTest.g:659:1: ruleCodeCall EOF
			{
			 before(grammarAccess.getCodeCallRule()); 
			pushFollow(FOLLOW_1);
			ruleCodeCall();
			state._fsp--;

			 after(grammarAccess.getCodeCallRule()); 
			match(input,EOF,FOLLOW_2); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "entryRuleCodeCall"



	// $ANTLR start "ruleCodeCall"
	// InternalXtextTest.g:666:1: ruleCodeCall : ( ( rule__CodeCall__Group__0 ) ) ;
	public final void ruleCodeCall() throws RecognitionException {

				int stackSize = keepStackSize();
				/*no init found*/
		    
		try {
			// InternalXtextTest.g:673:7: ( ( ( rule__CodeCall__Group__0 ) ) )
			// InternalXtextTest.g:675:1: ( ( rule__CodeCall__Group__0 ) )
			{
			// InternalXtextTest.g:675:1: ( ( rule__CodeCall__Group__0 ) )
			// InternalXtextTest.g:676:1: ( rule__CodeCall__Group__0 )
			{
			 before(grammarAccess.getCodeCallAccess().getGroup()); 
			// InternalXtextTest.g:677:2: ( rule__CodeCall__Group__0 )
			// InternalXtextTest.g:677:2: rule__CodeCall__Group__0
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__0();
			state._fsp--;

			}

			 after(grammarAccess.getCodeCallAccess().getGroup()); 
			}

			}


			    		/*no after found*/
			     
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "ruleCodeCall"



	// $ANTLR start "rule__Model__Alternatives_1"
	// InternalXtextTest.g:691:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__XtextTestAssignment_1_0 ) ) | ( ( rule__Model__EmfTestAssignment_1_1 ) ) );
	public final void rule__Model__Alternatives_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:695:1: ( ( ( rule__Model__XtextTestAssignment_1_0 ) ) | ( ( rule__Model__EmfTestAssignment_1_1 ) ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==RULE_PACKAGE) ) {
				alt1=1;
			}
			else if ( (LA1_0==RULE_KW_EMFTEST) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// InternalXtextTest.g:697:1: ( ( rule__Model__XtextTestAssignment_1_0 ) )
					{
					// InternalXtextTest.g:697:1: ( ( rule__Model__XtextTestAssignment_1_0 ) )
					// InternalXtextTest.g:698:1: ( rule__Model__XtextTestAssignment_1_0 )
					{
					 before(grammarAccess.getModelAccess().getXtextTestAssignment_1_0()); 
					// InternalXtextTest.g:699:2: ( rule__Model__XtextTestAssignment_1_0 )
					// InternalXtextTest.g:699:2: rule__Model__XtextTestAssignment_1_0
					{
					pushFollow(FOLLOW_2);
					rule__Model__XtextTestAssignment_1_0();
					state._fsp--;

					}

					 after(grammarAccess.getModelAccess().getXtextTestAssignment_1_0()); 
					}

					}
					break;
				case 2 :
					// InternalXtextTest.g:706:1: ( ( rule__Model__EmfTestAssignment_1_1 ) )
					{
					// InternalXtextTest.g:706:1: ( ( rule__Model__EmfTestAssignment_1_1 ) )
					// InternalXtextTest.g:707:1: ( rule__Model__EmfTestAssignment_1_1 )
					{
					 before(grammarAccess.getModelAccess().getEmfTestAssignment_1_1()); 
					// InternalXtextTest.g:708:2: ( rule__Model__EmfTestAssignment_1_1 )
					// InternalXtextTest.g:708:2: rule__Model__EmfTestAssignment_1_1
					{
					pushFollow(FOLLOW_2);
					rule__Model__EmfTestAssignment_1_1();
					state._fsp--;

					}

					 after(grammarAccess.getModelAccess().getEmfTestAssignment_1_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Model__Alternatives_1"



	// $ANTLR start "rule__Boolean__Alternatives"
	// InternalXtextTest.g:719:1: rule__Boolean__Alternatives : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
	public final void rule__Boolean__Alternatives() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:723:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==RULE_TRUE) ) {
				alt2=1;
			}
			else if ( (LA2_0==RULE_FALSE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// InternalXtextTest.g:725:1: ( RULE_TRUE )
					{
					// InternalXtextTest.g:725:1: ( RULE_TRUE )
					// InternalXtextTest.g:726:1: RULE_TRUE
					{
					 before(grammarAccess.getBooleanAccess().getTRUETerminalRuleCall_0()); 
					match(input,RULE_TRUE,FOLLOW_2); 
					 after(grammarAccess.getBooleanAccess().getTRUETerminalRuleCall_0()); 
					}

					}
					break;
				case 2 :
					// InternalXtextTest.g:734:1: ( RULE_FALSE )
					{
					// InternalXtextTest.g:734:1: ( RULE_FALSE )
					// InternalXtextTest.g:735:1: RULE_FALSE
					{
					 before(grammarAccess.getBooleanAccess().getFALSETerminalRuleCall_1()); 
					match(input,RULE_FALSE,FOLLOW_2); 
					 after(grammarAccess.getBooleanAccess().getFALSETerminalRuleCall_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Boolean__Alternatives"



	// $ANTLR start "rule__Input__Alternatives_2"
	// InternalXtextTest.g:747:1: rule__Input__Alternatives_2 : ( ( ( rule__Input__Group_2_0__0 ) ) | ( ( rule__Input__Group_2_1__0 ) ) );
	public final void rule__Input__Alternatives_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:751:1: ( ( ( rule__Input__Group_2_0__0 ) ) | ( ( rule__Input__Group_2_1__0 ) ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==RULE_SRCTEXT) ) {
				alt3=1;
			}
			else if ( (LA3_0==RULE_FILE) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// InternalXtextTest.g:753:1: ( ( rule__Input__Group_2_0__0 ) )
					{
					// InternalXtextTest.g:753:1: ( ( rule__Input__Group_2_0__0 ) )
					// InternalXtextTest.g:754:1: ( rule__Input__Group_2_0__0 )
					{
					 before(grammarAccess.getInputAccess().getGroup_2_0()); 
					// InternalXtextTest.g:755:2: ( rule__Input__Group_2_0__0 )
					// InternalXtextTest.g:755:2: rule__Input__Group_2_0__0
					{
					pushFollow(FOLLOW_2);
					rule__Input__Group_2_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getInputAccess().getGroup_2_0()); 
					}

					}
					break;
				case 2 :
					// InternalXtextTest.g:762:1: ( ( rule__Input__Group_2_1__0 ) )
					{
					// InternalXtextTest.g:762:1: ( ( rule__Input__Group_2_1__0 ) )
					// InternalXtextTest.g:763:1: ( rule__Input__Group_2_1__0 )
					{
					 before(grammarAccess.getInputAccess().getGroup_2_1()); 
					// InternalXtextTest.g:764:2: ( rule__Input__Group_2_1__0 )
					// InternalXtextTest.g:764:2: rule__Input__Group_2_1__0
					{
					pushFollow(FOLLOW_2);
					rule__Input__Group_2_1__0();
					state._fsp--;

					}

					 after(grammarAccess.getInputAccess().getGroup_2_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Alternatives_2"



	// $ANTLR start "rule__MyTokens__Alternatives_0"
	// InternalXtextTest.g:775:1: rule__MyTokens__Alternatives_0 : ( ( ( rule__MyTokens__TokenAssignment_0_0 ) ) | ( ( rule__MyTokens__StringAssignment_0_1 ) ) );
	public final void rule__MyTokens__Alternatives_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:779:1: ( ( ( rule__MyTokens__TokenAssignment_0_0 ) ) | ( ( rule__MyTokens__StringAssignment_0_1 ) ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==RULE_IDENTIFIER) ) {
				alt4=1;
			}
			else if ( (LA4_0==RULE_STRING) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// InternalXtextTest.g:781:1: ( ( rule__MyTokens__TokenAssignment_0_0 ) )
					{
					// InternalXtextTest.g:781:1: ( ( rule__MyTokens__TokenAssignment_0_0 ) )
					// InternalXtextTest.g:782:1: ( rule__MyTokens__TokenAssignment_0_0 )
					{
					 before(grammarAccess.getMyTokensAccess().getTokenAssignment_0_0()); 
					// InternalXtextTest.g:783:2: ( rule__MyTokens__TokenAssignment_0_0 )
					// InternalXtextTest.g:783:2: rule__MyTokens__TokenAssignment_0_0
					{
					pushFollow(FOLLOW_2);
					rule__MyTokens__TokenAssignment_0_0();
					state._fsp--;

					}

					 after(grammarAccess.getMyTokensAccess().getTokenAssignment_0_0()); 
					}

					}
					break;
				case 2 :
					// InternalXtextTest.g:790:1: ( ( rule__MyTokens__StringAssignment_0_1 ) )
					{
					// InternalXtextTest.g:790:1: ( ( rule__MyTokens__StringAssignment_0_1 ) )
					// InternalXtextTest.g:791:1: ( rule__MyTokens__StringAssignment_0_1 )
					{
					 before(grammarAccess.getMyTokensAccess().getStringAssignment_0_1()); 
					// InternalXtextTest.g:792:2: ( rule__MyTokens__StringAssignment_0_1 )
					// InternalXtextTest.g:792:2: rule__MyTokens__StringAssignment_0_1
					{
					pushFollow(FOLLOW_2);
					rule__MyTokens__StringAssignment_0_1();
					state._fsp--;

					}

					 after(grammarAccess.getMyTokensAccess().getStringAssignment_0_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Alternatives_0"



	// $ANTLR start "rule__Inner__Alternatives_2"
	// InternalXtextTest.g:803:1: rule__Inner__Alternatives_2 : ( ( ( rule__Inner__Group_2_0__0 ) ) | ( ( rule__Inner__Group_2_1__0 ) ) | ( ( rule__Inner__Group_2_2__0 ) ) | ( ( rule__Inner__Group_2_3__0 ) ) | ( ( rule__Inner__Group_2_4__0 ) ) | ( ( rule__Inner__IsNullAssignment_2_5 ) ) | ( ( rule__Inner__IsNotNullAssignment_2_6 ) ) | ( ( rule__Inner__IsEmptyAssignment_2_7 ) ) );
	public final void rule__Inner__Alternatives_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:807:1: ( ( ( rule__Inner__Group_2_0__0 ) ) | ( ( rule__Inner__Group_2_1__0 ) ) | ( ( rule__Inner__Group_2_2__0 ) ) | ( ( rule__Inner__Group_2_3__0 ) ) | ( ( rule__Inner__Group_2_4__0 ) ) | ( ( rule__Inner__IsNullAssignment_2_5 ) ) | ( ( rule__Inner__IsNotNullAssignment_2_6 ) ) | ( ( rule__Inner__IsEmptyAssignment_2_7 ) ) )
			int alt5=8;
			switch ( input.LA(1) ) {
			case RULE_ASSIGNASSINGLE:
				{
				alt5=1;
				}
				break;
			case RULE_ASSIGNASLIST:
				{
				alt5=2;
				}
				break;
			case RULE_ASSIGNASSTRING:
				{
				alt5=3;
				}
				break;
			case RULE_ASSIGNASDATALIST:
				{
				alt5=4;
				}
				break;
			case RULE_ASSIGNASBOOL:
				{
				alt5=5;
				}
				break;
			case RULE_ISNULL:
				{
				alt5=6;
				}
				break;
			case RULE_ISNOTNULL:
				{
				alt5=7;
				}
				break;
			case RULE_ISEMPTY:
				{
				alt5=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// InternalXtextTest.g:809:1: ( ( rule__Inner__Group_2_0__0 ) )
					{
					// InternalXtextTest.g:809:1: ( ( rule__Inner__Group_2_0__0 ) )
					// InternalXtextTest.g:810:1: ( rule__Inner__Group_2_0__0 )
					{
					 before(grammarAccess.getInnerAccess().getGroup_2_0()); 
					// InternalXtextTest.g:811:2: ( rule__Inner__Group_2_0__0 )
					// InternalXtextTest.g:811:2: rule__Inner__Group_2_0__0
					{
					pushFollow(FOLLOW_2);
					rule__Inner__Group_2_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getGroup_2_0()); 
					}

					}
					break;
				case 2 :
					// InternalXtextTest.g:818:1: ( ( rule__Inner__Group_2_1__0 ) )
					{
					// InternalXtextTest.g:818:1: ( ( rule__Inner__Group_2_1__0 ) )
					// InternalXtextTest.g:819:1: ( rule__Inner__Group_2_1__0 )
					{
					 before(grammarAccess.getInnerAccess().getGroup_2_1()); 
					// InternalXtextTest.g:820:2: ( rule__Inner__Group_2_1__0 )
					// InternalXtextTest.g:820:2: rule__Inner__Group_2_1__0
					{
					pushFollow(FOLLOW_2);
					rule__Inner__Group_2_1__0();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getGroup_2_1()); 
					}

					}
					break;
				case 3 :
					// InternalXtextTest.g:827:1: ( ( rule__Inner__Group_2_2__0 ) )
					{
					// InternalXtextTest.g:827:1: ( ( rule__Inner__Group_2_2__0 ) )
					// InternalXtextTest.g:828:1: ( rule__Inner__Group_2_2__0 )
					{
					 before(grammarAccess.getInnerAccess().getGroup_2_2()); 
					// InternalXtextTest.g:829:2: ( rule__Inner__Group_2_2__0 )
					// InternalXtextTest.g:829:2: rule__Inner__Group_2_2__0
					{
					pushFollow(FOLLOW_2);
					rule__Inner__Group_2_2__0();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getGroup_2_2()); 
					}

					}
					break;
				case 4 :
					// InternalXtextTest.g:836:1: ( ( rule__Inner__Group_2_3__0 ) )
					{
					// InternalXtextTest.g:836:1: ( ( rule__Inner__Group_2_3__0 ) )
					// InternalXtextTest.g:837:1: ( rule__Inner__Group_2_3__0 )
					{
					 before(grammarAccess.getInnerAccess().getGroup_2_3()); 
					// InternalXtextTest.g:838:2: ( rule__Inner__Group_2_3__0 )
					// InternalXtextTest.g:838:2: rule__Inner__Group_2_3__0
					{
					pushFollow(FOLLOW_2);
					rule__Inner__Group_2_3__0();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getGroup_2_3()); 
					}

					}
					break;
				case 5 :
					// InternalXtextTest.g:845:1: ( ( rule__Inner__Group_2_4__0 ) )
					{
					// InternalXtextTest.g:845:1: ( ( rule__Inner__Group_2_4__0 ) )
					// InternalXtextTest.g:846:1: ( rule__Inner__Group_2_4__0 )
					{
					 before(grammarAccess.getInnerAccess().getGroup_2_4()); 
					// InternalXtextTest.g:847:2: ( rule__Inner__Group_2_4__0 )
					// InternalXtextTest.g:847:2: rule__Inner__Group_2_4__0
					{
					pushFollow(FOLLOW_2);
					rule__Inner__Group_2_4__0();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getGroup_2_4()); 
					}

					}
					break;
				case 6 :
					// InternalXtextTest.g:854:1: ( ( rule__Inner__IsNullAssignment_2_5 ) )
					{
					// InternalXtextTest.g:854:1: ( ( rule__Inner__IsNullAssignment_2_5 ) )
					// InternalXtextTest.g:855:1: ( rule__Inner__IsNullAssignment_2_5 )
					{
					 before(grammarAccess.getInnerAccess().getIsNullAssignment_2_5()); 
					// InternalXtextTest.g:856:2: ( rule__Inner__IsNullAssignment_2_5 )
					// InternalXtextTest.g:856:2: rule__Inner__IsNullAssignment_2_5
					{
					pushFollow(FOLLOW_2);
					rule__Inner__IsNullAssignment_2_5();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getIsNullAssignment_2_5()); 
					}

					}
					break;
				case 7 :
					// InternalXtextTest.g:863:1: ( ( rule__Inner__IsNotNullAssignment_2_6 ) )
					{
					// InternalXtextTest.g:863:1: ( ( rule__Inner__IsNotNullAssignment_2_6 ) )
					// InternalXtextTest.g:864:1: ( rule__Inner__IsNotNullAssignment_2_6 )
					{
					 before(grammarAccess.getInnerAccess().getIsNotNullAssignment_2_6()); 
					// InternalXtextTest.g:865:2: ( rule__Inner__IsNotNullAssignment_2_6 )
					// InternalXtextTest.g:865:2: rule__Inner__IsNotNullAssignment_2_6
					{
					pushFollow(FOLLOW_2);
					rule__Inner__IsNotNullAssignment_2_6();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getIsNotNullAssignment_2_6()); 
					}

					}
					break;
				case 8 :
					// InternalXtextTest.g:872:1: ( ( rule__Inner__IsEmptyAssignment_2_7 ) )
					{
					// InternalXtextTest.g:872:1: ( ( rule__Inner__IsEmptyAssignment_2_7 ) )
					// InternalXtextTest.g:873:1: ( rule__Inner__IsEmptyAssignment_2_7 )
					{
					 before(grammarAccess.getInnerAccess().getIsEmptyAssignment_2_7()); 
					// InternalXtextTest.g:874:2: ( rule__Inner__IsEmptyAssignment_2_7 )
					// InternalXtextTest.g:874:2: rule__Inner__IsEmptyAssignment_2_7
					{
					pushFollow(FOLLOW_2);
					rule__Inner__IsEmptyAssignment_2_7();
					state._fsp--;

					}

					 after(grammarAccess.getInnerAccess().getIsEmptyAssignment_2_7()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Alternatives_2"



	// $ANTLR start "rule__Inner__AssignAsBoolAlternatives_2_4_1_0"
	// InternalXtextTest.g:885:1: rule__Inner__AssignAsBoolAlternatives_2_4_1_0 : ( ( RULE_TRUE ) | ( RULE_FALSE ) );
	public final void rule__Inner__AssignAsBoolAlternatives_2_4_1_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:889:1: ( ( RULE_TRUE ) | ( RULE_FALSE ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==RULE_TRUE) ) {
				alt6=1;
			}
			else if ( (LA6_0==RULE_FALSE) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// InternalXtextTest.g:891:1: ( RULE_TRUE )
					{
					// InternalXtextTest.g:891:1: ( RULE_TRUE )
					// InternalXtextTest.g:892:1: RULE_TRUE
					{
					 before(grammarAccess.getInnerAccess().getAssignAsBoolTRUETerminalRuleCall_2_4_1_0_0()); 
					match(input,RULE_TRUE,FOLLOW_2); 
					 after(grammarAccess.getInnerAccess().getAssignAsBoolTRUETerminalRuleCall_2_4_1_0_0()); 
					}

					}
					break;
				case 2 :
					// InternalXtextTest.g:900:1: ( RULE_FALSE )
					{
					// InternalXtextTest.g:900:1: ( RULE_FALSE )
					// InternalXtextTest.g:901:1: RULE_FALSE
					{
					 before(grammarAccess.getInnerAccess().getAssignAsBoolFALSETerminalRuleCall_2_4_1_0_1()); 
					match(input,RULE_FALSE,FOLLOW_2); 
					 after(grammarAccess.getInnerAccess().getAssignAsBoolFALSETerminalRuleCall_2_4_1_0_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__AssignAsBoolAlternatives_2_4_1_0"



	// $ANTLR start "rule__Generator__Alternatives_2_2"
	// InternalXtextTest.g:913:1: rule__Generator__Alternatives_2_2 : ( ( ( rule__Generator__Group_2_2_0__0 ) ) | ( ( rule__Generator__IsSameAsInputFileAssignment_2_2_1 ) ) );
	public final void rule__Generator__Alternatives_2_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:917:1: ( ( ( rule__Generator__Group_2_2_0__0 ) ) | ( ( rule__Generator__IsSameAsInputFileAssignment_2_2_1 ) ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==RULE_ASSIGNASSINGLE) ) {
				alt7=1;
			}
			else if ( (LA7_0==RULE_ISSAMEASINPUTFILE) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// InternalXtextTest.g:919:1: ( ( rule__Generator__Group_2_2_0__0 ) )
					{
					// InternalXtextTest.g:919:1: ( ( rule__Generator__Group_2_2_0__0 ) )
					// InternalXtextTest.g:920:1: ( rule__Generator__Group_2_2_0__0 )
					{
					 before(grammarAccess.getGeneratorAccess().getGroup_2_2_0()); 
					// InternalXtextTest.g:921:2: ( rule__Generator__Group_2_2_0__0 )
					// InternalXtextTest.g:921:2: rule__Generator__Group_2_2_0__0
					{
					pushFollow(FOLLOW_2);
					rule__Generator__Group_2_2_0__0();
					state._fsp--;

					}

					 after(grammarAccess.getGeneratorAccess().getGroup_2_2_0()); 
					}

					}
					break;
				case 2 :
					// InternalXtextTest.g:928:1: ( ( rule__Generator__IsSameAsInputFileAssignment_2_2_1 ) )
					{
					// InternalXtextTest.g:928:1: ( ( rule__Generator__IsSameAsInputFileAssignment_2_2_1 ) )
					// InternalXtextTest.g:929:1: ( rule__Generator__IsSameAsInputFileAssignment_2_2_1 )
					{
					 before(grammarAccess.getGeneratorAccess().getIsSameAsInputFileAssignment_2_2_1()); 
					// InternalXtextTest.g:930:2: ( rule__Generator__IsSameAsInputFileAssignment_2_2_1 )
					// InternalXtextTest.g:930:2: rule__Generator__IsSameAsInputFileAssignment_2_2_1
					{
					pushFollow(FOLLOW_2);
					rule__Generator__IsSameAsInputFileAssignment_2_2_1();
					state._fsp--;

					}

					 after(grammarAccess.getGeneratorAccess().getIsSameAsInputFileAssignment_2_2_1()); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Alternatives_2_2"



	// $ANTLR start "rule__Model__Group__0"
	// InternalXtextTest.g:943:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
	public final void rule__Model__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:947:2: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
			// InternalXtextTest.g:948:2: rule__Model__Group__0__Impl rule__Model__Group__1
			{
			pushFollow(FOLLOW_3);
			rule__Model__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Model__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Model__Group__0"



	// $ANTLR start "rule__Model__Group__0__Impl"
	// InternalXtextTest.g:955:1: rule__Model__Group__0__Impl : ( () ) ;
	public final void rule__Model__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:959:1: ( ( () ) )
			// InternalXtextTest.g:961:1: ( () )
			{
			// InternalXtextTest.g:961:1: ( () )
			// InternalXtextTest.g:962:1: ()
			{
			 before(grammarAccess.getModelAccess().getModelAction_0()); 
			// InternalXtextTest.g:963:1: ()
			// InternalXtextTest.g:965:1: 
			{
			}

			 after(grammarAccess.getModelAccess().getModelAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Model__Group__0__Impl"



	// $ANTLR start "rule__Model__Group__1"
	// InternalXtextTest.g:977:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
	public final void rule__Model__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:981:2: ( rule__Model__Group__1__Impl )
			// InternalXtextTest.g:982:2: rule__Model__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Model__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Model__Group__1"



	// $ANTLR start "rule__Model__Group__1__Impl"
	// InternalXtextTest.g:988:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 ) ) ;
	public final void rule__Model__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:992:1: ( ( ( rule__Model__Alternatives_1 ) ) )
			// InternalXtextTest.g:994:1: ( ( rule__Model__Alternatives_1 ) )
			{
			// InternalXtextTest.g:994:1: ( ( rule__Model__Alternatives_1 ) )
			// InternalXtextTest.g:995:1: ( rule__Model__Alternatives_1 )
			{
			 before(grammarAccess.getModelAccess().getAlternatives_1()); 
			// InternalXtextTest.g:996:2: ( rule__Model__Alternatives_1 )
			// InternalXtextTest.g:996:2: rule__Model__Alternatives_1
			{
			pushFollow(FOLLOW_2);
			rule__Model__Alternatives_1();
			state._fsp--;

			}

			 after(grammarAccess.getModelAccess().getAlternatives_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Model__Group__1__Impl"



	// $ANTLR start "rule__XtextTest__Group__0"
	// InternalXtextTest.g:1012:1: rule__XtextTest__Group__0 : rule__XtextTest__Group__0__Impl rule__XtextTest__Group__1 ;
	public final void rule__XtextTest__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1016:2: ( rule__XtextTest__Group__0__Impl rule__XtextTest__Group__1 )
			// InternalXtextTest.g:1017:2: rule__XtextTest__Group__0__Impl rule__XtextTest__Group__1
			{
			pushFollow(FOLLOW_4);
			rule__XtextTest__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__0"



	// $ANTLR start "rule__XtextTest__Group__0__Impl"
	// InternalXtextTest.g:1024:1: rule__XtextTest__Group__0__Impl : ( () ) ;
	public final void rule__XtextTest__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1028:1: ( ( () ) )
			// InternalXtextTest.g:1030:1: ( () )
			{
			// InternalXtextTest.g:1030:1: ( () )
			// InternalXtextTest.g:1031:1: ()
			{
			 before(grammarAccess.getXtextTestAccess().getXtextTestAction_0()); 
			// InternalXtextTest.g:1032:1: ()
			// InternalXtextTest.g:1034:1: 
			{
			}

			 after(grammarAccess.getXtextTestAccess().getXtextTestAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__0__Impl"



	// $ANTLR start "rule__XtextTest__Group__1"
	// InternalXtextTest.g:1046:1: rule__XtextTest__Group__1 : rule__XtextTest__Group__1__Impl rule__XtextTest__Group__2 ;
	public final void rule__XtextTest__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1050:2: ( rule__XtextTest__Group__1__Impl rule__XtextTest__Group__2 )
			// InternalXtextTest.g:1051:2: rule__XtextTest__Group__1__Impl rule__XtextTest__Group__2
			{
			pushFollow(FOLLOW_5);
			rule__XtextTest__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__1"



	// $ANTLR start "rule__XtextTest__Group__1__Impl"
	// InternalXtextTest.g:1058:1: rule__XtextTest__Group__1__Impl : ( RULE_PACKAGE ) ;
	public final void rule__XtextTest__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1062:1: ( ( RULE_PACKAGE ) )
			// InternalXtextTest.g:1064:1: ( RULE_PACKAGE )
			{
			// InternalXtextTest.g:1064:1: ( RULE_PACKAGE )
			// InternalXtextTest.g:1065:1: RULE_PACKAGE
			{
			 before(grammarAccess.getXtextTestAccess().getPACKAGETerminalRuleCall_1()); 
			match(input,RULE_PACKAGE,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getPACKAGETerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__1__Impl"



	// $ANTLR start "rule__XtextTest__Group__2"
	// InternalXtextTest.g:1078:1: rule__XtextTest__Group__2 : rule__XtextTest__Group__2__Impl rule__XtextTest__Group__3 ;
	public final void rule__XtextTest__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1082:2: ( rule__XtextTest__Group__2__Impl rule__XtextTest__Group__3 )
			// InternalXtextTest.g:1083:2: rule__XtextTest__Group__2__Impl rule__XtextTest__Group__3
			{
			pushFollow(FOLLOW_6);
			rule__XtextTest__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__2"



	// $ANTLR start "rule__XtextTest__Group__2__Impl"
	// InternalXtextTest.g:1090:1: rule__XtextTest__Group__2__Impl : ( ( rule__XtextTest__PackageAssignment_2 ) ) ;
	public final void rule__XtextTest__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1094:1: ( ( ( rule__XtextTest__PackageAssignment_2 ) ) )
			// InternalXtextTest.g:1096:1: ( ( rule__XtextTest__PackageAssignment_2 ) )
			{
			// InternalXtextTest.g:1096:1: ( ( rule__XtextTest__PackageAssignment_2 ) )
			// InternalXtextTest.g:1097:1: ( rule__XtextTest__PackageAssignment_2 )
			{
			 before(grammarAccess.getXtextTestAccess().getPackageAssignment_2()); 
			// InternalXtextTest.g:1098:2: ( rule__XtextTest__PackageAssignment_2 )
			// InternalXtextTest.g:1098:2: rule__XtextTest__PackageAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__PackageAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getPackageAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__2__Impl"



	// $ANTLR start "rule__XtextTest__Group__3"
	// InternalXtextTest.g:1110:1: rule__XtextTest__Group__3 : rule__XtextTest__Group__3__Impl rule__XtextTest__Group__4 ;
	public final void rule__XtextTest__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1114:2: ( rule__XtextTest__Group__3__Impl rule__XtextTest__Group__4 )
			// InternalXtextTest.g:1115:2: rule__XtextTest__Group__3__Impl rule__XtextTest__Group__4
			{
			pushFollow(FOLLOW_5);
			rule__XtextTest__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__3"



	// $ANTLR start "rule__XtextTest__Group__3__Impl"
	// InternalXtextTest.g:1122:1: rule__XtextTest__Group__3__Impl : ( RULE_LANGUAGE ) ;
	public final void rule__XtextTest__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1126:1: ( ( RULE_LANGUAGE ) )
			// InternalXtextTest.g:1128:1: ( RULE_LANGUAGE )
			{
			// InternalXtextTest.g:1128:1: ( RULE_LANGUAGE )
			// InternalXtextTest.g:1129:1: RULE_LANGUAGE
			{
			 before(grammarAccess.getXtextTestAccess().getLANGUAGETerminalRuleCall_3()); 
			match(input,RULE_LANGUAGE,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getLANGUAGETerminalRuleCall_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__3__Impl"



	// $ANTLR start "rule__XtextTest__Group__4"
	// InternalXtextTest.g:1142:1: rule__XtextTest__Group__4 : rule__XtextTest__Group__4__Impl rule__XtextTest__Group__5 ;
	public final void rule__XtextTest__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1146:2: ( rule__XtextTest__Group__4__Impl rule__XtextTest__Group__5 )
			// InternalXtextTest.g:1147:2: rule__XtextTest__Group__4__Impl rule__XtextTest__Group__5
			{
			pushFollow(FOLLOW_7);
			rule__XtextTest__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__4"



	// $ANTLR start "rule__XtextTest__Group__4__Impl"
	// InternalXtextTest.g:1154:1: rule__XtextTest__Group__4__Impl : ( ( rule__XtextTest__LangAssignment_4 ) ) ;
	public final void rule__XtextTest__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1158:1: ( ( ( rule__XtextTest__LangAssignment_4 ) ) )
			// InternalXtextTest.g:1160:1: ( ( rule__XtextTest__LangAssignment_4 ) )
			{
			// InternalXtextTest.g:1160:1: ( ( rule__XtextTest__LangAssignment_4 ) )
			// InternalXtextTest.g:1161:1: ( rule__XtextTest__LangAssignment_4 )
			{
			 before(grammarAccess.getXtextTestAccess().getLangAssignment_4()); 
			// InternalXtextTest.g:1162:2: ( rule__XtextTest__LangAssignment_4 )
			// InternalXtextTest.g:1162:2: rule__XtextTest__LangAssignment_4
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__LangAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getLangAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__4__Impl"



	// $ANTLR start "rule__XtextTest__Group__5"
	// InternalXtextTest.g:1174:1: rule__XtextTest__Group__5 : rule__XtextTest__Group__5__Impl rule__XtextTest__Group__6 ;
	public final void rule__XtextTest__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1178:2: ( rule__XtextTest__Group__5__Impl rule__XtextTest__Group__6 )
			// InternalXtextTest.g:1179:2: rule__XtextTest__Group__5__Impl rule__XtextTest__Group__6
			{
			pushFollow(FOLLOW_8);
			rule__XtextTest__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__5"



	// $ANTLR start "rule__XtextTest__Group__5__Impl"
	// InternalXtextTest.g:1186:1: rule__XtextTest__Group__5__Impl : ( ( rule__XtextTest__Group_5__0 )? ) ;
	public final void rule__XtextTest__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1190:1: ( ( ( rule__XtextTest__Group_5__0 )? ) )
			// InternalXtextTest.g:1192:1: ( ( rule__XtextTest__Group_5__0 )? )
			{
			// InternalXtextTest.g:1192:1: ( ( rule__XtextTest__Group_5__0 )? )
			// InternalXtextTest.g:1193:1: ( rule__XtextTest__Group_5__0 )?
			{
			 before(grammarAccess.getXtextTestAccess().getGroup_5()); 
			// InternalXtextTest.g:1194:2: ( rule__XtextTest__Group_5__0 )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==RULE_IMPORTS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// InternalXtextTest.g:1194:2: rule__XtextTest__Group_5__0
					{
					pushFollow(FOLLOW_2);
					rule__XtextTest__Group_5__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getXtextTestAccess().getGroup_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__5__Impl"



	// $ANTLR start "rule__XtextTest__Group__6"
	// InternalXtextTest.g:1206:1: rule__XtextTest__Group__6 : rule__XtextTest__Group__6__Impl rule__XtextTest__Group__7 ;
	public final void rule__XtextTest__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1210:2: ( rule__XtextTest__Group__6__Impl rule__XtextTest__Group__7 )
			// InternalXtextTest.g:1211:2: rule__XtextTest__Group__6__Impl rule__XtextTest__Group__7
			{
			pushFollow(FOLLOW_9);
			rule__XtextTest__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__6"



	// $ANTLR start "rule__XtextTest__Group__6__Impl"
	// InternalXtextTest.g:1218:1: rule__XtextTest__Group__6__Impl : ( ( rule__XtextTest__Group_6__0 )? ) ;
	public final void rule__XtextTest__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1222:1: ( ( ( rule__XtextTest__Group_6__0 )? ) )
			// InternalXtextTest.g:1224:1: ( ( rule__XtextTest__Group_6__0 )? )
			{
			// InternalXtextTest.g:1224:1: ( ( rule__XtextTest__Group_6__0 )? )
			// InternalXtextTest.g:1225:1: ( rule__XtextTest__Group_6__0 )?
			{
			 before(grammarAccess.getXtextTestAccess().getGroup_6()); 
			// InternalXtextTest.g:1226:2: ( rule__XtextTest__Group_6__0 )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==RULE_SPLITLEXER) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// InternalXtextTest.g:1226:2: rule__XtextTest__Group_6__0
					{
					pushFollow(FOLLOW_2);
					rule__XtextTest__Group_6__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getXtextTestAccess().getGroup_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__6__Impl"



	// $ANTLR start "rule__XtextTest__Group__7"
	// InternalXtextTest.g:1238:1: rule__XtextTest__Group__7 : rule__XtextTest__Group__7__Impl rule__XtextTest__Group__8 ;
	public final void rule__XtextTest__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1242:2: ( rule__XtextTest__Group__7__Impl rule__XtextTest__Group__8 )
			// InternalXtextTest.g:1243:2: rule__XtextTest__Group__7__Impl rule__XtextTest__Group__8
			{
			pushFollow(FOLLOW_10);
			rule__XtextTest__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__7"



	// $ANTLR start "rule__XtextTest__Group__7__Impl"
	// InternalXtextTest.g:1250:1: rule__XtextTest__Group__7__Impl : ( ( rule__XtextTest__InputAssignment_7 ) ) ;
	public final void rule__XtextTest__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1254:1: ( ( ( rule__XtextTest__InputAssignment_7 ) ) )
			// InternalXtextTest.g:1256:1: ( ( rule__XtextTest__InputAssignment_7 ) )
			{
			// InternalXtextTest.g:1256:1: ( ( rule__XtextTest__InputAssignment_7 ) )
			// InternalXtextTest.g:1257:1: ( rule__XtextTest__InputAssignment_7 )
			{
			 before(grammarAccess.getXtextTestAccess().getInputAssignment_7()); 
			// InternalXtextTest.g:1258:2: ( rule__XtextTest__InputAssignment_7 )
			// InternalXtextTest.g:1258:2: rule__XtextTest__InputAssignment_7
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__InputAssignment_7();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getInputAssignment_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__7__Impl"



	// $ANTLR start "rule__XtextTest__Group__8"
	// InternalXtextTest.g:1270:1: rule__XtextTest__Group__8 : rule__XtextTest__Group__8__Impl rule__XtextTest__Group__9 ;
	public final void rule__XtextTest__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1274:2: ( rule__XtextTest__Group__8__Impl rule__XtextTest__Group__9 )
			// InternalXtextTest.g:1275:2: rule__XtextTest__Group__8__Impl rule__XtextTest__Group__9
			{
			pushFollow(FOLLOW_11);
			rule__XtextTest__Group__8__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__9();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__8"



	// $ANTLR start "rule__XtextTest__Group__8__Impl"
	// InternalXtextTest.g:1282:1: rule__XtextTest__Group__8__Impl : ( ( rule__XtextTest__Group_8__0 )? ) ;
	public final void rule__XtextTest__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1286:1: ( ( ( rule__XtextTest__Group_8__0 )? ) )
			// InternalXtextTest.g:1288:1: ( ( rule__XtextTest__Group_8__0 )? )
			{
			// InternalXtextTest.g:1288:1: ( ( rule__XtextTest__Group_8__0 )? )
			// InternalXtextTest.g:1289:1: ( rule__XtextTest__Group_8__0 )?
			{
			 before(grammarAccess.getXtextTestAccess().getGroup_8()); 
			// InternalXtextTest.g:1290:2: ( rule__XtextTest__Group_8__0 )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==RULE_TIMEOUT) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// InternalXtextTest.g:1290:2: rule__XtextTest__Group_8__0
					{
					pushFollow(FOLLOW_2);
					rule__XtextTest__Group_8__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getXtextTestAccess().getGroup_8()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__8__Impl"



	// $ANTLR start "rule__XtextTest__Group__9"
	// InternalXtextTest.g:1302:1: rule__XtextTest__Group__9 : rule__XtextTest__Group__9__Impl rule__XtextTest__Group__10 ;
	public final void rule__XtextTest__Group__9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1306:2: ( rule__XtextTest__Group__9__Impl rule__XtextTest__Group__10 )
			// InternalXtextTest.g:1307:2: rule__XtextTest__Group__9__Impl rule__XtextTest__Group__10
			{
			pushFollow(FOLLOW_12);
			rule__XtextTest__Group__9__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__10();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__9"



	// $ANTLR start "rule__XtextTest__Group__9__Impl"
	// InternalXtextTest.g:1314:1: rule__XtextTest__Group__9__Impl : ( ( rule__XtextTest__TokensAssignment_9 )? ) ;
	public final void rule__XtextTest__Group__9__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1318:1: ( ( ( rule__XtextTest__TokensAssignment_9 )? ) )
			// InternalXtextTest.g:1320:1: ( ( rule__XtextTest__TokensAssignment_9 )? )
			{
			// InternalXtextTest.g:1320:1: ( ( rule__XtextTest__TokensAssignment_9 )? )
			// InternalXtextTest.g:1321:1: ( rule__XtextTest__TokensAssignment_9 )?
			{
			 before(grammarAccess.getXtextTestAccess().getTokensAssignment_9()); 
			// InternalXtextTest.g:1322:2: ( rule__XtextTest__TokensAssignment_9 )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==RULE_LEXER) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// InternalXtextTest.g:1322:2: rule__XtextTest__TokensAssignment_9
					{
					pushFollow(FOLLOW_2);
					rule__XtextTest__TokensAssignment_9();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getXtextTestAccess().getTokensAssignment_9()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__9__Impl"



	// $ANTLR start "rule__XtextTest__Group__10"
	// InternalXtextTest.g:1334:1: rule__XtextTest__Group__10 : rule__XtextTest__Group__10__Impl rule__XtextTest__Group__11 ;
	public final void rule__XtextTest__Group__10() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1338:2: ( rule__XtextTest__Group__10__Impl rule__XtextTest__Group__11 )
			// InternalXtextTest.g:1339:2: rule__XtextTest__Group__10__Impl rule__XtextTest__Group__11
			{
			pushFollow(FOLLOW_13);
			rule__XtextTest__Group__10__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__11();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__10"



	// $ANTLR start "rule__XtextTest__Group__10__Impl"
	// InternalXtextTest.g:1346:1: rule__XtextTest__Group__10__Impl : ( ( rule__XtextTest__RootAssignment_10 ) ) ;
	public final void rule__XtextTest__Group__10__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1350:1: ( ( ( rule__XtextTest__RootAssignment_10 ) ) )
			// InternalXtextTest.g:1352:1: ( ( rule__XtextTest__RootAssignment_10 ) )
			{
			// InternalXtextTest.g:1352:1: ( ( rule__XtextTest__RootAssignment_10 ) )
			// InternalXtextTest.g:1353:1: ( rule__XtextTest__RootAssignment_10 )
			{
			 before(grammarAccess.getXtextTestAccess().getRootAssignment_10()); 
			// InternalXtextTest.g:1354:2: ( rule__XtextTest__RootAssignment_10 )
			// InternalXtextTest.g:1354:2: rule__XtextTest__RootAssignment_10
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__RootAssignment_10();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getRootAssignment_10()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__10__Impl"



	// $ANTLR start "rule__XtextTest__Group__11"
	// InternalXtextTest.g:1366:1: rule__XtextTest__Group__11 : rule__XtextTest__Group__11__Impl rule__XtextTest__Group__12 ;
	public final void rule__XtextTest__Group__11() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1370:2: ( rule__XtextTest__Group__11__Impl rule__XtextTest__Group__12 )
			// InternalXtextTest.g:1371:2: rule__XtextTest__Group__11__Impl rule__XtextTest__Group__12
			{
			pushFollow(FOLLOW_14);
			rule__XtextTest__Group__11__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__12();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__11"



	// $ANTLR start "rule__XtextTest__Group__11__Impl"
	// InternalXtextTest.g:1378:1: rule__XtextTest__Group__11__Impl : ( ( rule__XtextTest__OutputAssignment_11 )? ) ;
	public final void rule__XtextTest__Group__11__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1382:1: ( ( ( rule__XtextTest__OutputAssignment_11 )? ) )
			// InternalXtextTest.g:1384:1: ( ( rule__XtextTest__OutputAssignment_11 )? )
			{
			// InternalXtextTest.g:1384:1: ( ( rule__XtextTest__OutputAssignment_11 )? )
			// InternalXtextTest.g:1385:1: ( rule__XtextTest__OutputAssignment_11 )?
			{
			 before(grammarAccess.getXtextTestAccess().getOutputAssignment_11()); 
			// InternalXtextTest.g:1386:2: ( rule__XtextTest__OutputAssignment_11 )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==RULE_OUTPUT) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// InternalXtextTest.g:1386:2: rule__XtextTest__OutputAssignment_11
					{
					pushFollow(FOLLOW_2);
					rule__XtextTest__OutputAssignment_11();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getXtextTestAccess().getOutputAssignment_11()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__11__Impl"



	// $ANTLR start "rule__XtextTest__Group__12"
	// InternalXtextTest.g:1398:1: rule__XtextTest__Group__12 : rule__XtextTest__Group__12__Impl rule__XtextTest__Group__13 ;
	public final void rule__XtextTest__Group__12() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1402:2: ( rule__XtextTest__Group__12__Impl rule__XtextTest__Group__13 )
			// InternalXtextTest.g:1403:2: rule__XtextTest__Group__12__Impl rule__XtextTest__Group__13
			{
			pushFollow(FOLLOW_15);
			rule__XtextTest__Group__12__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__13();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__12"



	// $ANTLR start "rule__XtextTest__Group__12__Impl"
	// InternalXtextTest.g:1410:1: rule__XtextTest__Group__12__Impl : ( ( rule__XtextTest__BeforeAssignment_12 )? ) ;
	public final void rule__XtextTest__Group__12__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1414:1: ( ( ( rule__XtextTest__BeforeAssignment_12 )? ) )
			// InternalXtextTest.g:1416:1: ( ( rule__XtextTest__BeforeAssignment_12 )? )
			{
			// InternalXtextTest.g:1416:1: ( ( rule__XtextTest__BeforeAssignment_12 )? )
			// InternalXtextTest.g:1417:1: ( rule__XtextTest__BeforeAssignment_12 )?
			{
			 before(grammarAccess.getXtextTestAccess().getBeforeAssignment_12()); 
			// InternalXtextTest.g:1418:2: ( rule__XtextTest__BeforeAssignment_12 )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==RULE_BEFORE_KW) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// InternalXtextTest.g:1418:2: rule__XtextTest__BeforeAssignment_12
					{
					pushFollow(FOLLOW_2);
					rule__XtextTest__BeforeAssignment_12();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getXtextTestAccess().getBeforeAssignment_12()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__12__Impl"



	// $ANTLR start "rule__XtextTest__Group__13"
	// InternalXtextTest.g:1430:1: rule__XtextTest__Group__13 : rule__XtextTest__Group__13__Impl ;
	public final void rule__XtextTest__Group__13() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1434:2: ( rule__XtextTest__Group__13__Impl )
			// InternalXtextTest.g:1435:2: rule__XtextTest__Group__13__Impl
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__Group__13__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__13"



	// $ANTLR start "rule__XtextTest__Group__13__Impl"
	// InternalXtextTest.g:1441:1: rule__XtextTest__Group__13__Impl : ( ( rule__XtextTest__AfterAssignment_13 )? ) ;
	public final void rule__XtextTest__Group__13__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1445:1: ( ( ( rule__XtextTest__AfterAssignment_13 )? ) )
			// InternalXtextTest.g:1447:1: ( ( rule__XtextTest__AfterAssignment_13 )? )
			{
			// InternalXtextTest.g:1447:1: ( ( rule__XtextTest__AfterAssignment_13 )? )
			// InternalXtextTest.g:1448:1: ( rule__XtextTest__AfterAssignment_13 )?
			{
			 before(grammarAccess.getXtextTestAccess().getAfterAssignment_13()); 
			// InternalXtextTest.g:1449:2: ( rule__XtextTest__AfterAssignment_13 )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==RULE_AFTER_KW) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// InternalXtextTest.g:1449:2: rule__XtextTest__AfterAssignment_13
					{
					pushFollow(FOLLOW_2);
					rule__XtextTest__AfterAssignment_13();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getXtextTestAccess().getAfterAssignment_13()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group__13__Impl"



	// $ANTLR start "rule__XtextTest__Group_5__0"
	// InternalXtextTest.g:1489:1: rule__XtextTest__Group_5__0 : rule__XtextTest__Group_5__0__Impl rule__XtextTest__Group_5__1 ;
	public final void rule__XtextTest__Group_5__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1493:2: ( rule__XtextTest__Group_5__0__Impl rule__XtextTest__Group_5__1 )
			// InternalXtextTest.g:1494:2: rule__XtextTest__Group_5__0__Impl rule__XtextTest__Group_5__1
			{
			pushFollow(FOLLOW_5);
			rule__XtextTest__Group_5__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_5__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_5__0"



	// $ANTLR start "rule__XtextTest__Group_5__0__Impl"
	// InternalXtextTest.g:1501:1: rule__XtextTest__Group_5__0__Impl : ( RULE_IMPORTS ) ;
	public final void rule__XtextTest__Group_5__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1505:1: ( ( RULE_IMPORTS ) )
			// InternalXtextTest.g:1507:1: ( RULE_IMPORTS )
			{
			// InternalXtextTest.g:1507:1: ( RULE_IMPORTS )
			// InternalXtextTest.g:1508:1: RULE_IMPORTS
			{
			 before(grammarAccess.getXtextTestAccess().getIMPORTSTerminalRuleCall_5_0()); 
			match(input,RULE_IMPORTS,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getIMPORTSTerminalRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_5__0__Impl"



	// $ANTLR start "rule__XtextTest__Group_5__1"
	// InternalXtextTest.g:1521:1: rule__XtextTest__Group_5__1 : rule__XtextTest__Group_5__1__Impl ;
	public final void rule__XtextTest__Group_5__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1525:2: ( rule__XtextTest__Group_5__1__Impl )
			// InternalXtextTest.g:1526:2: rule__XtextTest__Group_5__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_5__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_5__1"



	// $ANTLR start "rule__XtextTest__Group_5__1__Impl"
	// InternalXtextTest.g:1532:1: rule__XtextTest__Group_5__1__Impl : ( ( rule__XtextTest__ImportsAssignment_5_1 ) ) ;
	public final void rule__XtextTest__Group_5__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1536:1: ( ( ( rule__XtextTest__ImportsAssignment_5_1 ) ) )
			// InternalXtextTest.g:1538:1: ( ( rule__XtextTest__ImportsAssignment_5_1 ) )
			{
			// InternalXtextTest.g:1538:1: ( ( rule__XtextTest__ImportsAssignment_5_1 ) )
			// InternalXtextTest.g:1539:1: ( rule__XtextTest__ImportsAssignment_5_1 )
			{
			 before(grammarAccess.getXtextTestAccess().getImportsAssignment_5_1()); 
			// InternalXtextTest.g:1540:2: ( rule__XtextTest__ImportsAssignment_5_1 )
			// InternalXtextTest.g:1540:2: rule__XtextTest__ImportsAssignment_5_1
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__ImportsAssignment_5_1();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getImportsAssignment_5_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_5__1__Impl"



	// $ANTLR start "rule__XtextTest__Group_6__0"
	// InternalXtextTest.g:1556:1: rule__XtextTest__Group_6__0 : rule__XtextTest__Group_6__0__Impl rule__XtextTest__Group_6__1 ;
	public final void rule__XtextTest__Group_6__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1560:2: ( rule__XtextTest__Group_6__0__Impl rule__XtextTest__Group_6__1 )
			// InternalXtextTest.g:1561:2: rule__XtextTest__Group_6__0__Impl rule__XtextTest__Group_6__1
			{
			pushFollow(FOLLOW_16);
			rule__XtextTest__Group_6__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_6__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_6__0"



	// $ANTLR start "rule__XtextTest__Group_6__0__Impl"
	// InternalXtextTest.g:1568:1: rule__XtextTest__Group_6__0__Impl : ( RULE_SPLITLEXER ) ;
	public final void rule__XtextTest__Group_6__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1572:1: ( ( RULE_SPLITLEXER ) )
			// InternalXtextTest.g:1574:1: ( RULE_SPLITLEXER )
			{
			// InternalXtextTest.g:1574:1: ( RULE_SPLITLEXER )
			// InternalXtextTest.g:1575:1: RULE_SPLITLEXER
			{
			 before(grammarAccess.getXtextTestAccess().getSPLITLEXERTerminalRuleCall_6_0()); 
			match(input,RULE_SPLITLEXER,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getSPLITLEXERTerminalRuleCall_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_6__0__Impl"



	// $ANTLR start "rule__XtextTest__Group_6__1"
	// InternalXtextTest.g:1588:1: rule__XtextTest__Group_6__1 : rule__XtextTest__Group_6__1__Impl rule__XtextTest__Group_6__2 ;
	public final void rule__XtextTest__Group_6__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1592:2: ( rule__XtextTest__Group_6__1__Impl rule__XtextTest__Group_6__2 )
			// InternalXtextTest.g:1593:2: rule__XtextTest__Group_6__1__Impl rule__XtextTest__Group_6__2
			{
			pushFollow(FOLLOW_17);
			rule__XtextTest__Group_6__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_6__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_6__1"



	// $ANTLR start "rule__XtextTest__Group_6__1__Impl"
	// InternalXtextTest.g:1600:1: rule__XtextTest__Group_6__1__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__XtextTest__Group_6__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1604:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:1606:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:1606:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:1607:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getXtextTestAccess().getASSIGNASSINGLETerminalRuleCall_6_1()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getASSIGNASSINGLETerminalRuleCall_6_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_6__1__Impl"



	// $ANTLR start "rule__XtextTest__Group_6__2"
	// InternalXtextTest.g:1620:1: rule__XtextTest__Group_6__2 : rule__XtextTest__Group_6__2__Impl ;
	public final void rule__XtextTest__Group_6__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1624:2: ( rule__XtextTest__Group_6__2__Impl )
			// InternalXtextTest.g:1625:2: rule__XtextTest__Group_6__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_6__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_6__2"



	// $ANTLR start "rule__XtextTest__Group_6__2__Impl"
	// InternalXtextTest.g:1631:1: rule__XtextTest__Group_6__2__Impl : ( ( rule__XtextTest__BooleanAssignment_6_2 ) ) ;
	public final void rule__XtextTest__Group_6__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1635:1: ( ( ( rule__XtextTest__BooleanAssignment_6_2 ) ) )
			// InternalXtextTest.g:1637:1: ( ( rule__XtextTest__BooleanAssignment_6_2 ) )
			{
			// InternalXtextTest.g:1637:1: ( ( rule__XtextTest__BooleanAssignment_6_2 ) )
			// InternalXtextTest.g:1638:1: ( rule__XtextTest__BooleanAssignment_6_2 )
			{
			 before(grammarAccess.getXtextTestAccess().getBooleanAssignment_6_2()); 
			// InternalXtextTest.g:1639:2: ( rule__XtextTest__BooleanAssignment_6_2 )
			// InternalXtextTest.g:1639:2: rule__XtextTest__BooleanAssignment_6_2
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__BooleanAssignment_6_2();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getBooleanAssignment_6_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_6__2__Impl"



	// $ANTLR start "rule__XtextTest__Group_8__0"
	// InternalXtextTest.g:1657:1: rule__XtextTest__Group_8__0 : rule__XtextTest__Group_8__0__Impl rule__XtextTest__Group_8__1 ;
	public final void rule__XtextTest__Group_8__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1661:2: ( rule__XtextTest__Group_8__0__Impl rule__XtextTest__Group_8__1 )
			// InternalXtextTest.g:1662:2: rule__XtextTest__Group_8__0__Impl rule__XtextTest__Group_8__1
			{
			pushFollow(FOLLOW_16);
			rule__XtextTest__Group_8__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_8__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_8__0"



	// $ANTLR start "rule__XtextTest__Group_8__0__Impl"
	// InternalXtextTest.g:1669:1: rule__XtextTest__Group_8__0__Impl : ( RULE_TIMEOUT ) ;
	public final void rule__XtextTest__Group_8__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1673:1: ( ( RULE_TIMEOUT ) )
			// InternalXtextTest.g:1675:1: ( RULE_TIMEOUT )
			{
			// InternalXtextTest.g:1675:1: ( RULE_TIMEOUT )
			// InternalXtextTest.g:1676:1: RULE_TIMEOUT
			{
			 before(grammarAccess.getXtextTestAccess().getTIMEOUTTerminalRuleCall_8_0()); 
			match(input,RULE_TIMEOUT,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getTIMEOUTTerminalRuleCall_8_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_8__0__Impl"



	// $ANTLR start "rule__XtextTest__Group_8__1"
	// InternalXtextTest.g:1689:1: rule__XtextTest__Group_8__1 : rule__XtextTest__Group_8__1__Impl rule__XtextTest__Group_8__2 ;
	public final void rule__XtextTest__Group_8__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1693:2: ( rule__XtextTest__Group_8__1__Impl rule__XtextTest__Group_8__2 )
			// InternalXtextTest.g:1694:2: rule__XtextTest__Group_8__1__Impl rule__XtextTest__Group_8__2
			{
			pushFollow(FOLLOW_18);
			rule__XtextTest__Group_8__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_8__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_8__1"



	// $ANTLR start "rule__XtextTest__Group_8__1__Impl"
	// InternalXtextTest.g:1701:1: rule__XtextTest__Group_8__1__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__XtextTest__Group_8__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1705:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:1707:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:1707:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:1708:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getXtextTestAccess().getASSIGNASSINGLETerminalRuleCall_8_1()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getASSIGNASSINGLETerminalRuleCall_8_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_8__1__Impl"



	// $ANTLR start "rule__XtextTest__Group_8__2"
	// InternalXtextTest.g:1721:1: rule__XtextTest__Group_8__2 : rule__XtextTest__Group_8__2__Impl ;
	public final void rule__XtextTest__Group_8__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1725:2: ( rule__XtextTest__Group_8__2__Impl )
			// InternalXtextTest.g:1726:2: rule__XtextTest__Group_8__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__Group_8__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_8__2"



	// $ANTLR start "rule__XtextTest__Group_8__2__Impl"
	// InternalXtextTest.g:1732:1: rule__XtextTest__Group_8__2__Impl : ( ( rule__XtextTest__TimeOutAssignment_8_2 ) ) ;
	public final void rule__XtextTest__Group_8__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1736:1: ( ( ( rule__XtextTest__TimeOutAssignment_8_2 ) ) )
			// InternalXtextTest.g:1738:1: ( ( rule__XtextTest__TimeOutAssignment_8_2 ) )
			{
			// InternalXtextTest.g:1738:1: ( ( rule__XtextTest__TimeOutAssignment_8_2 ) )
			// InternalXtextTest.g:1739:1: ( rule__XtextTest__TimeOutAssignment_8_2 )
			{
			 before(grammarAccess.getXtextTestAccess().getTimeOutAssignment_8_2()); 
			// InternalXtextTest.g:1740:2: ( rule__XtextTest__TimeOutAssignment_8_2 )
			// InternalXtextTest.g:1740:2: rule__XtextTest__TimeOutAssignment_8_2
			{
			pushFollow(FOLLOW_2);
			rule__XtextTest__TimeOutAssignment_8_2();
			state._fsp--;

			}

			 after(grammarAccess.getXtextTestAccess().getTimeOutAssignment_8_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__Group_8__2__Impl"



	// $ANTLR start "rule__EmfTest__Group__0"
	// InternalXtextTest.g:1758:1: rule__EmfTest__Group__0 : rule__EmfTest__Group__0__Impl rule__EmfTest__Group__1 ;
	public final void rule__EmfTest__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1762:2: ( rule__EmfTest__Group__0__Impl rule__EmfTest__Group__1 )
			// InternalXtextTest.g:1763:2: rule__EmfTest__Group__0__Impl rule__EmfTest__Group__1
			{
			pushFollow(FOLLOW_19);
			rule__EmfTest__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__0"



	// $ANTLR start "rule__EmfTest__Group__0__Impl"
	// InternalXtextTest.g:1770:1: rule__EmfTest__Group__0__Impl : ( () ) ;
	public final void rule__EmfTest__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1774:1: ( ( () ) )
			// InternalXtextTest.g:1776:1: ( () )
			{
			// InternalXtextTest.g:1776:1: ( () )
			// InternalXtextTest.g:1777:1: ()
			{
			 before(grammarAccess.getEmfTestAccess().getEmfTestAction_0()); 
			// InternalXtextTest.g:1778:1: ()
			// InternalXtextTest.g:1780:1: 
			{
			}

			 after(grammarAccess.getEmfTestAccess().getEmfTestAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__0__Impl"



	// $ANTLR start "rule__EmfTest__Group__1"
	// InternalXtextTest.g:1792:1: rule__EmfTest__Group__1 : rule__EmfTest__Group__1__Impl rule__EmfTest__Group__2 ;
	public final void rule__EmfTest__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1796:2: ( rule__EmfTest__Group__1__Impl rule__EmfTest__Group__2 )
			// InternalXtextTest.g:1797:2: rule__EmfTest__Group__1__Impl rule__EmfTest__Group__2
			{
			pushFollow(FOLLOW_4);
			rule__EmfTest__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__1"



	// $ANTLR start "rule__EmfTest__Group__1__Impl"
	// InternalXtextTest.g:1804:1: rule__EmfTest__Group__1__Impl : ( RULE_KW_EMFTEST ) ;
	public final void rule__EmfTest__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1808:1: ( ( RULE_KW_EMFTEST ) )
			// InternalXtextTest.g:1810:1: ( RULE_KW_EMFTEST )
			{
			// InternalXtextTest.g:1810:1: ( RULE_KW_EMFTEST )
			// InternalXtextTest.g:1811:1: RULE_KW_EMFTEST
			{
			 before(grammarAccess.getEmfTestAccess().getKW_EMFTESTTerminalRuleCall_1()); 
			match(input,RULE_KW_EMFTEST,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getKW_EMFTESTTerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__1__Impl"



	// $ANTLR start "rule__EmfTest__Group__2"
	// InternalXtextTest.g:1824:1: rule__EmfTest__Group__2 : rule__EmfTest__Group__2__Impl rule__EmfTest__Group__3 ;
	public final void rule__EmfTest__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1828:2: ( rule__EmfTest__Group__2__Impl rule__EmfTest__Group__3 )
			// InternalXtextTest.g:1829:2: rule__EmfTest__Group__2__Impl rule__EmfTest__Group__3
			{
			pushFollow(FOLLOW_5);
			rule__EmfTest__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__2"



	// $ANTLR start "rule__EmfTest__Group__2__Impl"
	// InternalXtextTest.g:1836:1: rule__EmfTest__Group__2__Impl : ( RULE_PACKAGE ) ;
	public final void rule__EmfTest__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1840:1: ( ( RULE_PACKAGE ) )
			// InternalXtextTest.g:1842:1: ( RULE_PACKAGE )
			{
			// InternalXtextTest.g:1842:1: ( RULE_PACKAGE )
			// InternalXtextTest.g:1843:1: RULE_PACKAGE
			{
			 before(grammarAccess.getEmfTestAccess().getPACKAGETerminalRuleCall_2()); 
			match(input,RULE_PACKAGE,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getPACKAGETerminalRuleCall_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__2__Impl"



	// $ANTLR start "rule__EmfTest__Group__3"
	// InternalXtextTest.g:1856:1: rule__EmfTest__Group__3 : rule__EmfTest__Group__3__Impl rule__EmfTest__Group__4 ;
	public final void rule__EmfTest__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1860:2: ( rule__EmfTest__Group__3__Impl rule__EmfTest__Group__4 )
			// InternalXtextTest.g:1861:2: rule__EmfTest__Group__3__Impl rule__EmfTest__Group__4
			{
			pushFollow(FOLLOW_20);
			rule__EmfTest__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__3"



	// $ANTLR start "rule__EmfTest__Group__3__Impl"
	// InternalXtextTest.g:1868:1: rule__EmfTest__Group__3__Impl : ( ( rule__EmfTest__PackageAssignment_3 ) ) ;
	public final void rule__EmfTest__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1872:1: ( ( ( rule__EmfTest__PackageAssignment_3 ) ) )
			// InternalXtextTest.g:1874:1: ( ( rule__EmfTest__PackageAssignment_3 ) )
			{
			// InternalXtextTest.g:1874:1: ( ( rule__EmfTest__PackageAssignment_3 ) )
			// InternalXtextTest.g:1875:1: ( rule__EmfTest__PackageAssignment_3 )
			{
			 before(grammarAccess.getEmfTestAccess().getPackageAssignment_3()); 
			// InternalXtextTest.g:1876:2: ( rule__EmfTest__PackageAssignment_3 )
			// InternalXtextTest.g:1876:2: rule__EmfTest__PackageAssignment_3
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__PackageAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getPackageAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__3__Impl"



	// $ANTLR start "rule__EmfTest__Group__4"
	// InternalXtextTest.g:1888:1: rule__EmfTest__Group__4 : rule__EmfTest__Group__4__Impl rule__EmfTest__Group__5 ;
	public final void rule__EmfTest__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1892:2: ( rule__EmfTest__Group__4__Impl rule__EmfTest__Group__5 )
			// InternalXtextTest.g:1893:2: rule__EmfTest__Group__4__Impl rule__EmfTest__Group__5
			{
			pushFollow(FOLLOW_5);
			rule__EmfTest__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__4"



	// $ANTLR start "rule__EmfTest__Group__4__Impl"
	// InternalXtextTest.g:1900:1: rule__EmfTest__Group__4__Impl : ( RULE_DEFAULT ) ;
	public final void rule__EmfTest__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1904:1: ( ( RULE_DEFAULT ) )
			// InternalXtextTest.g:1906:1: ( RULE_DEFAULT )
			{
			// InternalXtextTest.g:1906:1: ( RULE_DEFAULT )
			// InternalXtextTest.g:1907:1: RULE_DEFAULT
			{
			 before(grammarAccess.getEmfTestAccess().getDEFAULTTerminalRuleCall_4()); 
			match(input,RULE_DEFAULT,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getDEFAULTTerminalRuleCall_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__4__Impl"



	// $ANTLR start "rule__EmfTest__Group__5"
	// InternalXtextTest.g:1920:1: rule__EmfTest__Group__5 : rule__EmfTest__Group__5__Impl rule__EmfTest__Group__6 ;
	public final void rule__EmfTest__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1924:2: ( rule__EmfTest__Group__5__Impl rule__EmfTest__Group__6 )
			// InternalXtextTest.g:1925:2: rule__EmfTest__Group__5__Impl rule__EmfTest__Group__6
			{
			pushFollow(FOLLOW_21);
			rule__EmfTest__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__5"



	// $ANTLR start "rule__EmfTest__Group__5__Impl"
	// InternalXtextTest.g:1932:1: rule__EmfTest__Group__5__Impl : ( ( rule__EmfTest__MydefaultAssignment_5 ) ) ;
	public final void rule__EmfTest__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1936:1: ( ( ( rule__EmfTest__MydefaultAssignment_5 ) ) )
			// InternalXtextTest.g:1938:1: ( ( rule__EmfTest__MydefaultAssignment_5 ) )
			{
			// InternalXtextTest.g:1938:1: ( ( rule__EmfTest__MydefaultAssignment_5 ) )
			// InternalXtextTest.g:1939:1: ( rule__EmfTest__MydefaultAssignment_5 )
			{
			 before(grammarAccess.getEmfTestAccess().getMydefaultAssignment_5()); 
			// InternalXtextTest.g:1940:2: ( rule__EmfTest__MydefaultAssignment_5 )
			// InternalXtextTest.g:1940:2: rule__EmfTest__MydefaultAssignment_5
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__MydefaultAssignment_5();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getMydefaultAssignment_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__5__Impl"



	// $ANTLR start "rule__EmfTest__Group__6"
	// InternalXtextTest.g:1952:1: rule__EmfTest__Group__6 : rule__EmfTest__Group__6__Impl rule__EmfTest__Group__7 ;
	public final void rule__EmfTest__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1956:2: ( rule__EmfTest__Group__6__Impl rule__EmfTest__Group__7 )
			// InternalXtextTest.g:1957:2: rule__EmfTest__Group__6__Impl rule__EmfTest__Group__7
			{
			pushFollow(FOLLOW_22);
			rule__EmfTest__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__6"



	// $ANTLR start "rule__EmfTest__Group__6__Impl"
	// InternalXtextTest.g:1964:1: rule__EmfTest__Group__6__Impl : ( ( rule__EmfTest__MyimportAssignment_6 )* ) ;
	public final void rule__EmfTest__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1968:1: ( ( ( rule__EmfTest__MyimportAssignment_6 )* ) )
			// InternalXtextTest.g:1970:1: ( ( rule__EmfTest__MyimportAssignment_6 )* )
			{
			// InternalXtextTest.g:1970:1: ( ( rule__EmfTest__MyimportAssignment_6 )* )
			// InternalXtextTest.g:1971:1: ( rule__EmfTest__MyimportAssignment_6 )*
			{
			 before(grammarAccess.getEmfTestAccess().getMyimportAssignment_6()); 
			// InternalXtextTest.g:1972:2: ( rule__EmfTest__MyimportAssignment_6 )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==RULE_IMPORTS) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// InternalXtextTest.g:1972:2: rule__EmfTest__MyimportAssignment_6
					{
					pushFollow(FOLLOW_23);
					rule__EmfTest__MyimportAssignment_6();
					state._fsp--;

					}
					break;

				default :
					break loop15;
				}
			}

			 after(grammarAccess.getEmfTestAccess().getMyimportAssignment_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__6__Impl"



	// $ANTLR start "rule__EmfTest__Group__7"
	// InternalXtextTest.g:1984:1: rule__EmfTest__Group__7 : rule__EmfTest__Group__7__Impl rule__EmfTest__Group__8 ;
	public final void rule__EmfTest__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:1988:2: ( rule__EmfTest__Group__7__Impl rule__EmfTest__Group__8 )
			// InternalXtextTest.g:1989:2: rule__EmfTest__Group__7__Impl rule__EmfTest__Group__8
			{
			pushFollow(FOLLOW_24);
			rule__EmfTest__Group__7__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__7"



	// $ANTLR start "rule__EmfTest__Group__7__Impl"
	// InternalXtextTest.g:1996:1: rule__EmfTest__Group__7__Impl : ( ( rule__EmfTest__Group_7__0 )? ) ;
	public final void rule__EmfTest__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2000:1: ( ( ( rule__EmfTest__Group_7__0 )? ) )
			// InternalXtextTest.g:2002:1: ( ( rule__EmfTest__Group_7__0 )? )
			{
			// InternalXtextTest.g:2002:1: ( ( rule__EmfTest__Group_7__0 )? )
			// InternalXtextTest.g:2003:1: ( rule__EmfTest__Group_7__0 )?
			{
			 before(grammarAccess.getEmfTestAccess().getGroup_7()); 
			// InternalXtextTest.g:2004:2: ( rule__EmfTest__Group_7__0 )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==RULE_TIMEOUT) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// InternalXtextTest.g:2004:2: rule__EmfTest__Group_7__0
					{
					pushFollow(FOLLOW_2);
					rule__EmfTest__Group_7__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getEmfTestAccess().getGroup_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__7__Impl"



	// $ANTLR start "rule__EmfTest__Group__8"
	// InternalXtextTest.g:2016:1: rule__EmfTest__Group__8 : rule__EmfTest__Group__8__Impl rule__EmfTest__Group__9 ;
	public final void rule__EmfTest__Group__8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2020:2: ( rule__EmfTest__Group__8__Impl rule__EmfTest__Group__9 )
			// InternalXtextTest.g:2021:2: rule__EmfTest__Group__8__Impl rule__EmfTest__Group__9
			{
			pushFollow(FOLLOW_25);
			rule__EmfTest__Group__8__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__9();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__8"



	// $ANTLR start "rule__EmfTest__Group__8__Impl"
	// InternalXtextTest.g:2028:1: rule__EmfTest__Group__8__Impl : ( ( rule__EmfTest__CodeCallAssignment_8 ) ) ;
	public final void rule__EmfTest__Group__8__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2032:1: ( ( ( rule__EmfTest__CodeCallAssignment_8 ) ) )
			// InternalXtextTest.g:2034:1: ( ( rule__EmfTest__CodeCallAssignment_8 ) )
			{
			// InternalXtextTest.g:2034:1: ( ( rule__EmfTest__CodeCallAssignment_8 ) )
			// InternalXtextTest.g:2035:1: ( rule__EmfTest__CodeCallAssignment_8 )
			{
			 before(grammarAccess.getEmfTestAccess().getCodeCallAssignment_8()); 
			// InternalXtextTest.g:2036:2: ( rule__EmfTest__CodeCallAssignment_8 )
			// InternalXtextTest.g:2036:2: rule__EmfTest__CodeCallAssignment_8
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__CodeCallAssignment_8();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getCodeCallAssignment_8()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__8__Impl"



	// $ANTLR start "rule__EmfTest__Group__9"
	// InternalXtextTest.g:2048:1: rule__EmfTest__Group__9 : rule__EmfTest__Group__9__Impl rule__EmfTest__Group__10 ;
	public final void rule__EmfTest__Group__9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2052:2: ( rule__EmfTest__Group__9__Impl rule__EmfTest__Group__10 )
			// InternalXtextTest.g:2053:2: rule__EmfTest__Group__9__Impl rule__EmfTest__Group__10
			{
			pushFollow(FOLLOW_9);
			rule__EmfTest__Group__9__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__10();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__9"



	// $ANTLR start "rule__EmfTest__Group__9__Impl"
	// InternalXtextTest.g:2060:1: rule__EmfTest__Group__9__Impl : ( ( rule__EmfTest__Group_9__0 )? ) ;
	public final void rule__EmfTest__Group__9__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2064:1: ( ( ( rule__EmfTest__Group_9__0 )? ) )
			// InternalXtextTest.g:2066:1: ( ( rule__EmfTest__Group_9__0 )? )
			{
			// InternalXtextTest.g:2066:1: ( ( rule__EmfTest__Group_9__0 )? )
			// InternalXtextTest.g:2067:1: ( rule__EmfTest__Group_9__0 )?
			{
			 before(grammarAccess.getEmfTestAccess().getGroup_9()); 
			// InternalXtextTest.g:2068:2: ( rule__EmfTest__Group_9__0 )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==RULE_OPTIONS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// InternalXtextTest.g:2068:2: rule__EmfTest__Group_9__0
					{
					pushFollow(FOLLOW_2);
					rule__EmfTest__Group_9__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getEmfTestAccess().getGroup_9()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__9__Impl"



	// $ANTLR start "rule__EmfTest__Group__10"
	// InternalXtextTest.g:2080:1: rule__EmfTest__Group__10 : rule__EmfTest__Group__10__Impl rule__EmfTest__Group__11 ;
	public final void rule__EmfTest__Group__10() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2084:2: ( rule__EmfTest__Group__10__Impl rule__EmfTest__Group__11 )
			// InternalXtextTest.g:2085:2: rule__EmfTest__Group__10__Impl rule__EmfTest__Group__11
			{
			pushFollow(FOLLOW_12);
			rule__EmfTest__Group__10__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__11();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__10"



	// $ANTLR start "rule__EmfTest__Group__10__Impl"
	// InternalXtextTest.g:2092:1: rule__EmfTest__Group__10__Impl : ( ( rule__EmfTest__Group_10__0 ) ) ;
	public final void rule__EmfTest__Group__10__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2096:1: ( ( ( rule__EmfTest__Group_10__0 ) ) )
			// InternalXtextTest.g:2098:1: ( ( rule__EmfTest__Group_10__0 ) )
			{
			// InternalXtextTest.g:2098:1: ( ( rule__EmfTest__Group_10__0 ) )
			// InternalXtextTest.g:2099:1: ( rule__EmfTest__Group_10__0 )
			{
			 before(grammarAccess.getEmfTestAccess().getGroup_10()); 
			// InternalXtextTest.g:2100:2: ( rule__EmfTest__Group_10__0 )
			// InternalXtextTest.g:2100:2: rule__EmfTest__Group_10__0
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_10__0();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getGroup_10()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__10__Impl"



	// $ANTLR start "rule__EmfTest__Group__11"
	// InternalXtextTest.g:2112:1: rule__EmfTest__Group__11 : rule__EmfTest__Group__11__Impl rule__EmfTest__Group__12 ;
	public final void rule__EmfTest__Group__11() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2116:2: ( rule__EmfTest__Group__11__Impl rule__EmfTest__Group__12 )
			// InternalXtextTest.g:2117:2: rule__EmfTest__Group__11__Impl rule__EmfTest__Group__12
			{
			pushFollow(FOLLOW_14);
			rule__EmfTest__Group__11__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__12();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__11"



	// $ANTLR start "rule__EmfTest__Group__11__Impl"
	// InternalXtextTest.g:2124:1: rule__EmfTest__Group__11__Impl : ( ( rule__EmfTest__RootAssignment_11 ) ) ;
	public final void rule__EmfTest__Group__11__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2128:1: ( ( ( rule__EmfTest__RootAssignment_11 ) ) )
			// InternalXtextTest.g:2130:1: ( ( rule__EmfTest__RootAssignment_11 ) )
			{
			// InternalXtextTest.g:2130:1: ( ( rule__EmfTest__RootAssignment_11 ) )
			// InternalXtextTest.g:2131:1: ( rule__EmfTest__RootAssignment_11 )
			{
			 before(grammarAccess.getEmfTestAccess().getRootAssignment_11()); 
			// InternalXtextTest.g:2132:2: ( rule__EmfTest__RootAssignment_11 )
			// InternalXtextTest.g:2132:2: rule__EmfTest__RootAssignment_11
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__RootAssignment_11();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getRootAssignment_11()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__11__Impl"



	// $ANTLR start "rule__EmfTest__Group__12"
	// InternalXtextTest.g:2144:1: rule__EmfTest__Group__12 : rule__EmfTest__Group__12__Impl rule__EmfTest__Group__13 ;
	public final void rule__EmfTest__Group__12() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2148:2: ( rule__EmfTest__Group__12__Impl rule__EmfTest__Group__13 )
			// InternalXtextTest.g:2149:2: rule__EmfTest__Group__12__Impl rule__EmfTest__Group__13
			{
			pushFollow(FOLLOW_15);
			rule__EmfTest__Group__12__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__13();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__12"



	// $ANTLR start "rule__EmfTest__Group__12__Impl"
	// InternalXtextTest.g:2156:1: rule__EmfTest__Group__12__Impl : ( ( rule__EmfTest__BeforeAssignment_12 )? ) ;
	public final void rule__EmfTest__Group__12__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2160:1: ( ( ( rule__EmfTest__BeforeAssignment_12 )? ) )
			// InternalXtextTest.g:2162:1: ( ( rule__EmfTest__BeforeAssignment_12 )? )
			{
			// InternalXtextTest.g:2162:1: ( ( rule__EmfTest__BeforeAssignment_12 )? )
			// InternalXtextTest.g:2163:1: ( rule__EmfTest__BeforeAssignment_12 )?
			{
			 before(grammarAccess.getEmfTestAccess().getBeforeAssignment_12()); 
			// InternalXtextTest.g:2164:2: ( rule__EmfTest__BeforeAssignment_12 )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==RULE_BEFORE_KW) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// InternalXtextTest.g:2164:2: rule__EmfTest__BeforeAssignment_12
					{
					pushFollow(FOLLOW_2);
					rule__EmfTest__BeforeAssignment_12();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getEmfTestAccess().getBeforeAssignment_12()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__12__Impl"



	// $ANTLR start "rule__EmfTest__Group__13"
	// InternalXtextTest.g:2176:1: rule__EmfTest__Group__13 : rule__EmfTest__Group__13__Impl ;
	public final void rule__EmfTest__Group__13() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2180:2: ( rule__EmfTest__Group__13__Impl )
			// InternalXtextTest.g:2181:2: rule__EmfTest__Group__13__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__Group__13__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__13"



	// $ANTLR start "rule__EmfTest__Group__13__Impl"
	// InternalXtextTest.g:2187:1: rule__EmfTest__Group__13__Impl : ( ( rule__EmfTest__AfterAssignment_13 )? ) ;
	public final void rule__EmfTest__Group__13__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2191:1: ( ( ( rule__EmfTest__AfterAssignment_13 )? ) )
			// InternalXtextTest.g:2193:1: ( ( rule__EmfTest__AfterAssignment_13 )? )
			{
			// InternalXtextTest.g:2193:1: ( ( rule__EmfTest__AfterAssignment_13 )? )
			// InternalXtextTest.g:2194:1: ( rule__EmfTest__AfterAssignment_13 )?
			{
			 before(grammarAccess.getEmfTestAccess().getAfterAssignment_13()); 
			// InternalXtextTest.g:2195:2: ( rule__EmfTest__AfterAssignment_13 )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==RULE_AFTER_KW) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// InternalXtextTest.g:2195:2: rule__EmfTest__AfterAssignment_13
					{
					pushFollow(FOLLOW_2);
					rule__EmfTest__AfterAssignment_13();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getEmfTestAccess().getAfterAssignment_13()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group__13__Impl"



	// $ANTLR start "rule__EmfTest__Group_7__0"
	// InternalXtextTest.g:2235:1: rule__EmfTest__Group_7__0 : rule__EmfTest__Group_7__0__Impl rule__EmfTest__Group_7__1 ;
	public final void rule__EmfTest__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2239:2: ( rule__EmfTest__Group_7__0__Impl rule__EmfTest__Group_7__1 )
			// InternalXtextTest.g:2240:2: rule__EmfTest__Group_7__0__Impl rule__EmfTest__Group_7__1
			{
			pushFollow(FOLLOW_16);
			rule__EmfTest__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_7__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_7__0"



	// $ANTLR start "rule__EmfTest__Group_7__0__Impl"
	// InternalXtextTest.g:2247:1: rule__EmfTest__Group_7__0__Impl : ( RULE_TIMEOUT ) ;
	public final void rule__EmfTest__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2251:1: ( ( RULE_TIMEOUT ) )
			// InternalXtextTest.g:2253:1: ( RULE_TIMEOUT )
			{
			// InternalXtextTest.g:2253:1: ( RULE_TIMEOUT )
			// InternalXtextTest.g:2254:1: RULE_TIMEOUT
			{
			 before(grammarAccess.getEmfTestAccess().getTIMEOUTTerminalRuleCall_7_0()); 
			match(input,RULE_TIMEOUT,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getTIMEOUTTerminalRuleCall_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_7__0__Impl"



	// $ANTLR start "rule__EmfTest__Group_7__1"
	// InternalXtextTest.g:2267:1: rule__EmfTest__Group_7__1 : rule__EmfTest__Group_7__1__Impl rule__EmfTest__Group_7__2 ;
	public final void rule__EmfTest__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2271:2: ( rule__EmfTest__Group_7__1__Impl rule__EmfTest__Group_7__2 )
			// InternalXtextTest.g:2272:2: rule__EmfTest__Group_7__1__Impl rule__EmfTest__Group_7__2
			{
			pushFollow(FOLLOW_18);
			rule__EmfTest__Group_7__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_7__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_7__1"



	// $ANTLR start "rule__EmfTest__Group_7__1__Impl"
	// InternalXtextTest.g:2279:1: rule__EmfTest__Group_7__1__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__EmfTest__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2283:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:2285:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:2285:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:2286:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getEmfTestAccess().getASSIGNASSINGLETerminalRuleCall_7_1()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getASSIGNASSINGLETerminalRuleCall_7_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_7__1__Impl"



	// $ANTLR start "rule__EmfTest__Group_7__2"
	// InternalXtextTest.g:2299:1: rule__EmfTest__Group_7__2 : rule__EmfTest__Group_7__2__Impl ;
	public final void rule__EmfTest__Group_7__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2303:2: ( rule__EmfTest__Group_7__2__Impl )
			// InternalXtextTest.g:2304:2: rule__EmfTest__Group_7__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_7__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_7__2"



	// $ANTLR start "rule__EmfTest__Group_7__2__Impl"
	// InternalXtextTest.g:2310:1: rule__EmfTest__Group_7__2__Impl : ( ( rule__EmfTest__TimeOutAssignment_7_2 ) ) ;
	public final void rule__EmfTest__Group_7__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2314:1: ( ( ( rule__EmfTest__TimeOutAssignment_7_2 ) ) )
			// InternalXtextTest.g:2316:1: ( ( rule__EmfTest__TimeOutAssignment_7_2 ) )
			{
			// InternalXtextTest.g:2316:1: ( ( rule__EmfTest__TimeOutAssignment_7_2 ) )
			// InternalXtextTest.g:2317:1: ( rule__EmfTest__TimeOutAssignment_7_2 )
			{
			 before(grammarAccess.getEmfTestAccess().getTimeOutAssignment_7_2()); 
			// InternalXtextTest.g:2318:2: ( rule__EmfTest__TimeOutAssignment_7_2 )
			// InternalXtextTest.g:2318:2: rule__EmfTest__TimeOutAssignment_7_2
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__TimeOutAssignment_7_2();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getTimeOutAssignment_7_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_7__2__Impl"



	// $ANTLR start "rule__EmfTest__Group_9__0"
	// InternalXtextTest.g:2336:1: rule__EmfTest__Group_9__0 : rule__EmfTest__Group_9__0__Impl rule__EmfTest__Group_9__1 ;
	public final void rule__EmfTest__Group_9__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2340:2: ( rule__EmfTest__Group_9__0__Impl rule__EmfTest__Group_9__1 )
			// InternalXtextTest.g:2341:2: rule__EmfTest__Group_9__0__Impl rule__EmfTest__Group_9__1
			{
			pushFollow(FOLLOW_24);
			rule__EmfTest__Group_9__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_9__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_9__0"



	// $ANTLR start "rule__EmfTest__Group_9__0__Impl"
	// InternalXtextTest.g:2348:1: rule__EmfTest__Group_9__0__Impl : ( RULE_OPTIONS ) ;
	public final void rule__EmfTest__Group_9__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2352:1: ( ( RULE_OPTIONS ) )
			// InternalXtextTest.g:2354:1: ( RULE_OPTIONS )
			{
			// InternalXtextTest.g:2354:1: ( RULE_OPTIONS )
			// InternalXtextTest.g:2355:1: RULE_OPTIONS
			{
			 before(grammarAccess.getEmfTestAccess().getOPTIONSTerminalRuleCall_9_0()); 
			match(input,RULE_OPTIONS,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getOPTIONSTerminalRuleCall_9_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_9__0__Impl"



	// $ANTLR start "rule__EmfTest__Group_9__1"
	// InternalXtextTest.g:2368:1: rule__EmfTest__Group_9__1 : rule__EmfTest__Group_9__1__Impl ;
	public final void rule__EmfTest__Group_9__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2372:2: ( rule__EmfTest__Group_9__1__Impl )
			// InternalXtextTest.g:2373:2: rule__EmfTest__Group_9__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_9__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_9__1"



	// $ANTLR start "rule__EmfTest__Group_9__1__Impl"
	// InternalXtextTest.g:2379:1: rule__EmfTest__Group_9__1__Impl : ( ( rule__EmfTest__OptionCallAssignment_9_1 ) ) ;
	public final void rule__EmfTest__Group_9__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2383:1: ( ( ( rule__EmfTest__OptionCallAssignment_9_1 ) ) )
			// InternalXtextTest.g:2385:1: ( ( rule__EmfTest__OptionCallAssignment_9_1 ) )
			{
			// InternalXtextTest.g:2385:1: ( ( rule__EmfTest__OptionCallAssignment_9_1 ) )
			// InternalXtextTest.g:2386:1: ( rule__EmfTest__OptionCallAssignment_9_1 )
			{
			 before(grammarAccess.getEmfTestAccess().getOptionCallAssignment_9_1()); 
			// InternalXtextTest.g:2387:2: ( rule__EmfTest__OptionCallAssignment_9_1 )
			// InternalXtextTest.g:2387:2: rule__EmfTest__OptionCallAssignment_9_1
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__OptionCallAssignment_9_1();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getOptionCallAssignment_9_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_9__1__Impl"



	// $ANTLR start "rule__EmfTest__Group_10__0"
	// InternalXtextTest.g:2403:1: rule__EmfTest__Group_10__0 : rule__EmfTest__Group_10__0__Impl rule__EmfTest__Group_10__1 ;
	public final void rule__EmfTest__Group_10__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2407:2: ( rule__EmfTest__Group_10__0__Impl rule__EmfTest__Group_10__1 )
			// InternalXtextTest.g:2408:2: rule__EmfTest__Group_10__0__Impl rule__EmfTest__Group_10__1
			{
			pushFollow(FOLLOW_26);
			rule__EmfTest__Group_10__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_10__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__0"



	// $ANTLR start "rule__EmfTest__Group_10__0__Impl"
	// InternalXtextTest.g:2415:1: rule__EmfTest__Group_10__0__Impl : ( RULE_SOURCE ) ;
	public final void rule__EmfTest__Group_10__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2419:1: ( ( RULE_SOURCE ) )
			// InternalXtextTest.g:2421:1: ( RULE_SOURCE )
			{
			// InternalXtextTest.g:2421:1: ( RULE_SOURCE )
			// InternalXtextTest.g:2422:1: RULE_SOURCE
			{
			 before(grammarAccess.getEmfTestAccess().getSOURCETerminalRuleCall_10_0()); 
			match(input,RULE_SOURCE,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getSOURCETerminalRuleCall_10_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__0__Impl"



	// $ANTLR start "rule__EmfTest__Group_10__1"
	// InternalXtextTest.g:2435:1: rule__EmfTest__Group_10__1 : rule__EmfTest__Group_10__1__Impl rule__EmfTest__Group_10__2 ;
	public final void rule__EmfTest__Group_10__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2439:2: ( rule__EmfTest__Group_10__1__Impl rule__EmfTest__Group_10__2 )
			// InternalXtextTest.g:2440:2: rule__EmfTest__Group_10__1__Impl rule__EmfTest__Group_10__2
			{
			pushFollow(FOLLOW_16);
			rule__EmfTest__Group_10__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_10__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__1"



	// $ANTLR start "rule__EmfTest__Group_10__1__Impl"
	// InternalXtextTest.g:2447:1: rule__EmfTest__Group_10__1__Impl : ( RULE_FILE ) ;
	public final void rule__EmfTest__Group_10__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2451:1: ( ( RULE_FILE ) )
			// InternalXtextTest.g:2453:1: ( RULE_FILE )
			{
			// InternalXtextTest.g:2453:1: ( RULE_FILE )
			// InternalXtextTest.g:2454:1: RULE_FILE
			{
			 before(grammarAccess.getEmfTestAccess().getFILETerminalRuleCall_10_1()); 
			match(input,RULE_FILE,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getFILETerminalRuleCall_10_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__1__Impl"



	// $ANTLR start "rule__EmfTest__Group_10__2"
	// InternalXtextTest.g:2467:1: rule__EmfTest__Group_10__2 : rule__EmfTest__Group_10__2__Impl rule__EmfTest__Group_10__3 ;
	public final void rule__EmfTest__Group_10__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2471:2: ( rule__EmfTest__Group_10__2__Impl rule__EmfTest__Group_10__3 )
			// InternalXtextTest.g:2472:2: rule__EmfTest__Group_10__2__Impl rule__EmfTest__Group_10__3
			{
			pushFollow(FOLLOW_27);
			rule__EmfTest__Group_10__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_10__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__2"



	// $ANTLR start "rule__EmfTest__Group_10__2__Impl"
	// InternalXtextTest.g:2479:1: rule__EmfTest__Group_10__2__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__EmfTest__Group_10__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2483:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:2485:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:2485:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:2486:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getEmfTestAccess().getASSIGNASSINGLETerminalRuleCall_10_2()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getASSIGNASSINGLETerminalRuleCall_10_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__2__Impl"



	// $ANTLR start "rule__EmfTest__Group_10__3"
	// InternalXtextTest.g:2499:1: rule__EmfTest__Group_10__3 : rule__EmfTest__Group_10__3__Impl ;
	public final void rule__EmfTest__Group_10__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2503:2: ( rule__EmfTest__Group_10__3__Impl )
			// InternalXtextTest.g:2504:2: rule__EmfTest__Group_10__3__Impl
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__Group_10__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__3"



	// $ANTLR start "rule__EmfTest__Group_10__3__Impl"
	// InternalXtextTest.g:2510:1: rule__EmfTest__Group_10__3__Impl : ( ( rule__EmfTest__FileAssignment_10_3 ) ) ;
	public final void rule__EmfTest__Group_10__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2514:1: ( ( ( rule__EmfTest__FileAssignment_10_3 ) ) )
			// InternalXtextTest.g:2516:1: ( ( rule__EmfTest__FileAssignment_10_3 ) )
			{
			// InternalXtextTest.g:2516:1: ( ( rule__EmfTest__FileAssignment_10_3 ) )
			// InternalXtextTest.g:2517:1: ( rule__EmfTest__FileAssignment_10_3 )
			{
			 before(grammarAccess.getEmfTestAccess().getFileAssignment_10_3()); 
			// InternalXtextTest.g:2518:2: ( rule__EmfTest__FileAssignment_10_3 )
			// InternalXtextTest.g:2518:2: rule__EmfTest__FileAssignment_10_3
			{
			pushFollow(FOLLOW_2);
			rule__EmfTest__FileAssignment_10_3();
			state._fsp--;

			}

			 after(grammarAccess.getEmfTestAccess().getFileAssignment_10_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__Group_10__3__Impl"



	// $ANTLR start "rule__Import__Group__0"
	// InternalXtextTest.g:2538:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
	public final void rule__Import__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2542:2: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
			// InternalXtextTest.g:2543:2: rule__Import__Group__0__Impl rule__Import__Group__1
			{
			pushFollow(FOLLOW_28);
			rule__Import__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Import__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__0"



	// $ANTLR start "rule__Import__Group__0__Impl"
	// InternalXtextTest.g:2550:1: rule__Import__Group__0__Impl : ( () ) ;
	public final void rule__Import__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2554:1: ( ( () ) )
			// InternalXtextTest.g:2556:1: ( () )
			{
			// InternalXtextTest.g:2556:1: ( () )
			// InternalXtextTest.g:2557:1: ()
			{
			 before(grammarAccess.getImportAccess().getImportAction_0()); 
			// InternalXtextTest.g:2558:1: ()
			// InternalXtextTest.g:2560:1: 
			{
			}

			 after(grammarAccess.getImportAccess().getImportAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__0__Impl"



	// $ANTLR start "rule__Import__Group__1"
	// InternalXtextTest.g:2572:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
	public final void rule__Import__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2576:2: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
			// InternalXtextTest.g:2577:2: rule__Import__Group__1__Impl rule__Import__Group__2
			{
			pushFollow(FOLLOW_5);
			rule__Import__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Import__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__1"



	// $ANTLR start "rule__Import__Group__1__Impl"
	// InternalXtextTest.g:2584:1: rule__Import__Group__1__Impl : ( RULE_IMPORTS ) ;
	public final void rule__Import__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2588:1: ( ( RULE_IMPORTS ) )
			// InternalXtextTest.g:2590:1: ( RULE_IMPORTS )
			{
			// InternalXtextTest.g:2590:1: ( RULE_IMPORTS )
			// InternalXtextTest.g:2591:1: RULE_IMPORTS
			{
			 before(grammarAccess.getImportAccess().getIMPORTSTerminalRuleCall_1()); 
			match(input,RULE_IMPORTS,FOLLOW_2); 
			 after(grammarAccess.getImportAccess().getIMPORTSTerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__1__Impl"



	// $ANTLR start "rule__Import__Group__2"
	// InternalXtextTest.g:2604:1: rule__Import__Group__2 : rule__Import__Group__2__Impl rule__Import__Group__3 ;
	public final void rule__Import__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2608:2: ( rule__Import__Group__2__Impl rule__Import__Group__3 )
			// InternalXtextTest.g:2609:2: rule__Import__Group__2__Impl rule__Import__Group__3
			{
			pushFollow(FOLLOW_29);
			rule__Import__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Import__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__2"



	// $ANTLR start "rule__Import__Group__2__Impl"
	// InternalXtextTest.g:2616:1: rule__Import__Group__2__Impl : ( ( rule__Import__IdAssignment_2 ) ) ;
	public final void rule__Import__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2620:1: ( ( ( rule__Import__IdAssignment_2 ) ) )
			// InternalXtextTest.g:2622:1: ( ( rule__Import__IdAssignment_2 ) )
			{
			// InternalXtextTest.g:2622:1: ( ( rule__Import__IdAssignment_2 ) )
			// InternalXtextTest.g:2623:1: ( rule__Import__IdAssignment_2 )
			{
			 before(grammarAccess.getImportAccess().getIdAssignment_2()); 
			// InternalXtextTest.g:2624:2: ( rule__Import__IdAssignment_2 )
			// InternalXtextTest.g:2624:2: rule__Import__IdAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__Import__IdAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getImportAccess().getIdAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__2__Impl"



	// $ANTLR start "rule__Import__Group__3"
	// InternalXtextTest.g:2636:1: rule__Import__Group__3 : rule__Import__Group__3__Impl rule__Import__Group__4 ;
	public final void rule__Import__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2640:2: ( rule__Import__Group__3__Impl rule__Import__Group__4 )
			// InternalXtextTest.g:2641:2: rule__Import__Group__3__Impl rule__Import__Group__4
			{
			pushFollow(FOLLOW_5);
			rule__Import__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Import__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__3"



	// $ANTLR start "rule__Import__Group__3__Impl"
	// InternalXtextTest.g:2648:1: rule__Import__Group__3__Impl : ( RULE_KW_AS ) ;
	public final void rule__Import__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2652:1: ( ( RULE_KW_AS ) )
			// InternalXtextTest.g:2654:1: ( RULE_KW_AS )
			{
			// InternalXtextTest.g:2654:1: ( RULE_KW_AS )
			// InternalXtextTest.g:2655:1: RULE_KW_AS
			{
			 before(grammarAccess.getImportAccess().getKW_ASTerminalRuleCall_3()); 
			match(input,RULE_KW_AS,FOLLOW_2); 
			 after(grammarAccess.getImportAccess().getKW_ASTerminalRuleCall_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__3__Impl"



	// $ANTLR start "rule__Import__Group__4"
	// InternalXtextTest.g:2668:1: rule__Import__Group__4 : rule__Import__Group__4__Impl ;
	public final void rule__Import__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2672:2: ( rule__Import__Group__4__Impl )
			// InternalXtextTest.g:2673:2: rule__Import__Group__4__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Import__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__4"



	// $ANTLR start "rule__Import__Group__4__Impl"
	// InternalXtextTest.g:2679:1: rule__Import__Group__4__Impl : ( ( rule__Import__AliasAssignment_4 ) ) ;
	public final void rule__Import__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2683:1: ( ( ( rule__Import__AliasAssignment_4 ) ) )
			// InternalXtextTest.g:2685:1: ( ( rule__Import__AliasAssignment_4 ) )
			{
			// InternalXtextTest.g:2685:1: ( ( rule__Import__AliasAssignment_4 ) )
			// InternalXtextTest.g:2686:1: ( rule__Import__AliasAssignment_4 )
			{
			 before(grammarAccess.getImportAccess().getAliasAssignment_4()); 
			// InternalXtextTest.g:2687:2: ( rule__Import__AliasAssignment_4 )
			// InternalXtextTest.g:2687:2: rule__Import__AliasAssignment_4
			{
			pushFollow(FOLLOW_2);
			rule__Import__AliasAssignment_4();
			state._fsp--;

			}

			 after(grammarAccess.getImportAccess().getAliasAssignment_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__Group__4__Impl"



	// $ANTLR start "rule__PackageID__Group__0"
	// InternalXtextTest.g:2709:1: rule__PackageID__Group__0 : rule__PackageID__Group__0__Impl rule__PackageID__Group__1 ;
	public final void rule__PackageID__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2713:2: ( rule__PackageID__Group__0__Impl rule__PackageID__Group__1 )
			// InternalXtextTest.g:2714:2: rule__PackageID__Group__0__Impl rule__PackageID__Group__1
			{
			pushFollow(FOLLOW_30);
			rule__PackageID__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__PackageID__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group__0"



	// $ANTLR start "rule__PackageID__Group__0__Impl"
	// InternalXtextTest.g:2721:1: rule__PackageID__Group__0__Impl : ( RULE_IDENTIFIER ) ;
	public final void rule__PackageID__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2725:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:2727:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:2727:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:2728:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getPackageIDAccess().getIDENTIFIERTerminalRuleCall_0()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getPackageIDAccess().getIDENTIFIERTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group__0__Impl"



	// $ANTLR start "rule__PackageID__Group__1"
	// InternalXtextTest.g:2741:1: rule__PackageID__Group__1 : rule__PackageID__Group__1__Impl ;
	public final void rule__PackageID__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2745:2: ( rule__PackageID__Group__1__Impl )
			// InternalXtextTest.g:2746:2: rule__PackageID__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__PackageID__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group__1"



	// $ANTLR start "rule__PackageID__Group__1__Impl"
	// InternalXtextTest.g:2752:1: rule__PackageID__Group__1__Impl : ( ( rule__PackageID__Group_1__0 )* ) ;
	public final void rule__PackageID__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2756:1: ( ( ( rule__PackageID__Group_1__0 )* ) )
			// InternalXtextTest.g:2758:1: ( ( rule__PackageID__Group_1__0 )* )
			{
			// InternalXtextTest.g:2758:1: ( ( rule__PackageID__Group_1__0 )* )
			// InternalXtextTest.g:2759:1: ( rule__PackageID__Group_1__0 )*
			{
			 before(grammarAccess.getPackageIDAccess().getGroup_1()); 
			// InternalXtextTest.g:2760:2: ( rule__PackageID__Group_1__0 )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==RULE_POINT) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// InternalXtextTest.g:2760:2: rule__PackageID__Group_1__0
					{
					pushFollow(FOLLOW_31);
					rule__PackageID__Group_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}

			 after(grammarAccess.getPackageIDAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group__1__Impl"



	// $ANTLR start "rule__PackageID__Group_1__0"
	// InternalXtextTest.g:2776:1: rule__PackageID__Group_1__0 : rule__PackageID__Group_1__0__Impl rule__PackageID__Group_1__1 ;
	public final void rule__PackageID__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2780:2: ( rule__PackageID__Group_1__0__Impl rule__PackageID__Group_1__1 )
			// InternalXtextTest.g:2781:2: rule__PackageID__Group_1__0__Impl rule__PackageID__Group_1__1
			{
			pushFollow(FOLLOW_5);
			rule__PackageID__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__PackageID__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group_1__0"



	// $ANTLR start "rule__PackageID__Group_1__0__Impl"
	// InternalXtextTest.g:2788:1: rule__PackageID__Group_1__0__Impl : ( RULE_POINT ) ;
	public final void rule__PackageID__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2792:1: ( ( RULE_POINT ) )
			// InternalXtextTest.g:2794:1: ( RULE_POINT )
			{
			// InternalXtextTest.g:2794:1: ( RULE_POINT )
			// InternalXtextTest.g:2795:1: RULE_POINT
			{
			 before(grammarAccess.getPackageIDAccess().getPOINTTerminalRuleCall_1_0()); 
			match(input,RULE_POINT,FOLLOW_2); 
			 after(grammarAccess.getPackageIDAccess().getPOINTTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group_1__0__Impl"



	// $ANTLR start "rule__PackageID__Group_1__1"
	// InternalXtextTest.g:2808:1: rule__PackageID__Group_1__1 : rule__PackageID__Group_1__1__Impl ;
	public final void rule__PackageID__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2812:2: ( rule__PackageID__Group_1__1__Impl )
			// InternalXtextTest.g:2813:2: rule__PackageID__Group_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__PackageID__Group_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group_1__1"



	// $ANTLR start "rule__PackageID__Group_1__1__Impl"
	// InternalXtextTest.g:2819:1: rule__PackageID__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
	public final void rule__PackageID__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2823:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:2825:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:2825:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:2826:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getPackageIDAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getPackageIDAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__PackageID__Group_1__1__Impl"



	// $ANTLR start "rule__ImportID__Group__0"
	// InternalXtextTest.g:2843:1: rule__ImportID__Group__0 : rule__ImportID__Group__0__Impl rule__ImportID__Group__1 ;
	public final void rule__ImportID__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2847:2: ( rule__ImportID__Group__0__Impl rule__ImportID__Group__1 )
			// InternalXtextTest.g:2848:2: rule__ImportID__Group__0__Impl rule__ImportID__Group__1
			{
			pushFollow(FOLLOW_30);
			rule__ImportID__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__ImportID__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group__0"



	// $ANTLR start "rule__ImportID__Group__0__Impl"
	// InternalXtextTest.g:2855:1: rule__ImportID__Group__0__Impl : ( RULE_IDENTIFIER ) ;
	public final void rule__ImportID__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2859:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:2861:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:2861:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:2862:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getImportIDAccess().getIDENTIFIERTerminalRuleCall_0()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getImportIDAccess().getIDENTIFIERTerminalRuleCall_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group__0__Impl"



	// $ANTLR start "rule__ImportID__Group__1"
	// InternalXtextTest.g:2875:1: rule__ImportID__Group__1 : rule__ImportID__Group__1__Impl ;
	public final void rule__ImportID__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2879:2: ( rule__ImportID__Group__1__Impl )
			// InternalXtextTest.g:2880:2: rule__ImportID__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__ImportID__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group__1"



	// $ANTLR start "rule__ImportID__Group__1__Impl"
	// InternalXtextTest.g:2886:1: rule__ImportID__Group__1__Impl : ( ( rule__ImportID__Group_1__0 )* ) ;
	public final void rule__ImportID__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2890:1: ( ( ( rule__ImportID__Group_1__0 )* ) )
			// InternalXtextTest.g:2892:1: ( ( rule__ImportID__Group_1__0 )* )
			{
			// InternalXtextTest.g:2892:1: ( ( rule__ImportID__Group_1__0 )* )
			// InternalXtextTest.g:2893:1: ( rule__ImportID__Group_1__0 )*
			{
			 before(grammarAccess.getImportIDAccess().getGroup_1()); 
			// InternalXtextTest.g:2894:2: ( rule__ImportID__Group_1__0 )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==RULE_POINT) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// InternalXtextTest.g:2894:2: rule__ImportID__Group_1__0
					{
					pushFollow(FOLLOW_31);
					rule__ImportID__Group_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop21;
				}
			}

			 after(grammarAccess.getImportIDAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group__1__Impl"



	// $ANTLR start "rule__ImportID__Group_1__0"
	// InternalXtextTest.g:2910:1: rule__ImportID__Group_1__0 : rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1 ;
	public final void rule__ImportID__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2914:2: ( rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1 )
			// InternalXtextTest.g:2915:2: rule__ImportID__Group_1__0__Impl rule__ImportID__Group_1__1
			{
			pushFollow(FOLLOW_5);
			rule__ImportID__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__ImportID__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group_1__0"



	// $ANTLR start "rule__ImportID__Group_1__0__Impl"
	// InternalXtextTest.g:2922:1: rule__ImportID__Group_1__0__Impl : ( RULE_POINT ) ;
	public final void rule__ImportID__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2926:1: ( ( RULE_POINT ) )
			// InternalXtextTest.g:2928:1: ( RULE_POINT )
			{
			// InternalXtextTest.g:2928:1: ( RULE_POINT )
			// InternalXtextTest.g:2929:1: RULE_POINT
			{
			 before(grammarAccess.getImportIDAccess().getPOINTTerminalRuleCall_1_0()); 
			match(input,RULE_POINT,FOLLOW_2); 
			 after(grammarAccess.getImportIDAccess().getPOINTTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group_1__0__Impl"



	// $ANTLR start "rule__ImportID__Group_1__1"
	// InternalXtextTest.g:2942:1: rule__ImportID__Group_1__1 : rule__ImportID__Group_1__1__Impl ;
	public final void rule__ImportID__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2946:2: ( rule__ImportID__Group_1__1__Impl )
			// InternalXtextTest.g:2947:2: rule__ImportID__Group_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__ImportID__Group_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group_1__1"



	// $ANTLR start "rule__ImportID__Group_1__1__Impl"
	// InternalXtextTest.g:2953:1: rule__ImportID__Group_1__1__Impl : ( RULE_IDENTIFIER ) ;
	public final void rule__ImportID__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2957:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:2959:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:2959:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:2960:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getImportIDAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getImportIDAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ImportID__Group_1__1__Impl"



	// $ANTLR start "rule__Input__Group__0"
	// InternalXtextTest.g:2977:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
	public final void rule__Input__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2981:2: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
			// InternalXtextTest.g:2982:2: rule__Input__Group__0__Impl rule__Input__Group__1
			{
			pushFollow(FOLLOW_9);
			rule__Input__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Input__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group__0"



	// $ANTLR start "rule__Input__Group__0__Impl"
	// InternalXtextTest.g:2989:1: rule__Input__Group__0__Impl : ( () ) ;
	public final void rule__Input__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:2993:1: ( ( () ) )
			// InternalXtextTest.g:2995:1: ( () )
			{
			// InternalXtextTest.g:2995:1: ( () )
			// InternalXtextTest.g:2996:1: ()
			{
			 before(grammarAccess.getInputAccess().getInputAction_0()); 
			// InternalXtextTest.g:2997:1: ()
			// InternalXtextTest.g:2999:1: 
			{
			}

			 after(grammarAccess.getInputAccess().getInputAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group__0__Impl"



	// $ANTLR start "rule__Input__Group__1"
	// InternalXtextTest.g:3011:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
	public final void rule__Input__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3015:2: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
			// InternalXtextTest.g:3016:2: rule__Input__Group__1__Impl rule__Input__Group__2
			{
			pushFollow(FOLLOW_32);
			rule__Input__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Input__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group__1"



	// $ANTLR start "rule__Input__Group__1__Impl"
	// InternalXtextTest.g:3023:1: rule__Input__Group__1__Impl : ( RULE_SOURCE ) ;
	public final void rule__Input__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3027:1: ( ( RULE_SOURCE ) )
			// InternalXtextTest.g:3029:1: ( RULE_SOURCE )
			{
			// InternalXtextTest.g:3029:1: ( RULE_SOURCE )
			// InternalXtextTest.g:3030:1: RULE_SOURCE
			{
			 before(grammarAccess.getInputAccess().getSOURCETerminalRuleCall_1()); 
			match(input,RULE_SOURCE,FOLLOW_2); 
			 after(grammarAccess.getInputAccess().getSOURCETerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group__1__Impl"



	// $ANTLR start "rule__Input__Group__2"
	// InternalXtextTest.g:3043:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
	public final void rule__Input__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3047:2: ( rule__Input__Group__2__Impl )
			// InternalXtextTest.g:3048:2: rule__Input__Group__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Input__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group__2"



	// $ANTLR start "rule__Input__Group__2__Impl"
	// InternalXtextTest.g:3054:1: rule__Input__Group__2__Impl : ( ( rule__Input__Alternatives_2 ) ) ;
	public final void rule__Input__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3058:1: ( ( ( rule__Input__Alternatives_2 ) ) )
			// InternalXtextTest.g:3060:1: ( ( rule__Input__Alternatives_2 ) )
			{
			// InternalXtextTest.g:3060:1: ( ( rule__Input__Alternatives_2 ) )
			// InternalXtextTest.g:3061:1: ( rule__Input__Alternatives_2 )
			{
			 before(grammarAccess.getInputAccess().getAlternatives_2()); 
			// InternalXtextTest.g:3062:2: ( rule__Input__Alternatives_2 )
			// InternalXtextTest.g:3062:2: rule__Input__Alternatives_2
			{
			pushFollow(FOLLOW_2);
			rule__Input__Alternatives_2();
			state._fsp--;

			}

			 after(grammarAccess.getInputAccess().getAlternatives_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group__2__Impl"



	// $ANTLR start "rule__Input__Group_2_0__0"
	// InternalXtextTest.g:3080:1: rule__Input__Group_2_0__0 : rule__Input__Group_2_0__0__Impl rule__Input__Group_2_0__1 ;
	public final void rule__Input__Group_2_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3084:2: ( rule__Input__Group_2_0__0__Impl rule__Input__Group_2_0__1 )
			// InternalXtextTest.g:3085:2: rule__Input__Group_2_0__0__Impl rule__Input__Group_2_0__1
			{
			pushFollow(FOLLOW_16);
			rule__Input__Group_2_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Input__Group_2_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_0__0"



	// $ANTLR start "rule__Input__Group_2_0__0__Impl"
	// InternalXtextTest.g:3092:1: rule__Input__Group_2_0__0__Impl : ( RULE_SRCTEXT ) ;
	public final void rule__Input__Group_2_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3096:1: ( ( RULE_SRCTEXT ) )
			// InternalXtextTest.g:3098:1: ( RULE_SRCTEXT )
			{
			// InternalXtextTest.g:3098:1: ( RULE_SRCTEXT )
			// InternalXtextTest.g:3099:1: RULE_SRCTEXT
			{
			 before(grammarAccess.getInputAccess().getSRCTEXTTerminalRuleCall_2_0_0()); 
			match(input,RULE_SRCTEXT,FOLLOW_2); 
			 after(grammarAccess.getInputAccess().getSRCTEXTTerminalRuleCall_2_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_0__0__Impl"



	// $ANTLR start "rule__Input__Group_2_0__1"
	// InternalXtextTest.g:3112:1: rule__Input__Group_2_0__1 : rule__Input__Group_2_0__1__Impl rule__Input__Group_2_0__2 ;
	public final void rule__Input__Group_2_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3116:2: ( rule__Input__Group_2_0__1__Impl rule__Input__Group_2_0__2 )
			// InternalXtextTest.g:3117:2: rule__Input__Group_2_0__1__Impl rule__Input__Group_2_0__2
			{
			pushFollow(FOLLOW_27);
			rule__Input__Group_2_0__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Input__Group_2_0__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_0__1"



	// $ANTLR start "rule__Input__Group_2_0__1__Impl"
	// InternalXtextTest.g:3124:1: rule__Input__Group_2_0__1__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__Input__Group_2_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3128:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:3130:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:3130:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:3131:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getInputAccess().getASSIGNASSINGLETerminalRuleCall_2_0_1()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getInputAccess().getASSIGNASSINGLETerminalRuleCall_2_0_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_0__1__Impl"



	// $ANTLR start "rule__Input__Group_2_0__2"
	// InternalXtextTest.g:3144:1: rule__Input__Group_2_0__2 : rule__Input__Group_2_0__2__Impl ;
	public final void rule__Input__Group_2_0__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3148:2: ( rule__Input__Group_2_0__2__Impl )
			// InternalXtextTest.g:3149:2: rule__Input__Group_2_0__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Input__Group_2_0__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_0__2"



	// $ANTLR start "rule__Input__Group_2_0__2__Impl"
	// InternalXtextTest.g:3155:1: rule__Input__Group_2_0__2__Impl : ( ( rule__Input__TextAssignment_2_0_2 ) ) ;
	public final void rule__Input__Group_2_0__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3159:1: ( ( ( rule__Input__TextAssignment_2_0_2 ) ) )
			// InternalXtextTest.g:3161:1: ( ( rule__Input__TextAssignment_2_0_2 ) )
			{
			// InternalXtextTest.g:3161:1: ( ( rule__Input__TextAssignment_2_0_2 ) )
			// InternalXtextTest.g:3162:1: ( rule__Input__TextAssignment_2_0_2 )
			{
			 before(grammarAccess.getInputAccess().getTextAssignment_2_0_2()); 
			// InternalXtextTest.g:3163:2: ( rule__Input__TextAssignment_2_0_2 )
			// InternalXtextTest.g:3163:2: rule__Input__TextAssignment_2_0_2
			{
			pushFollow(FOLLOW_2);
			rule__Input__TextAssignment_2_0_2();
			state._fsp--;

			}

			 after(grammarAccess.getInputAccess().getTextAssignment_2_0_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_0__2__Impl"



	// $ANTLR start "rule__Input__Group_2_1__0"
	// InternalXtextTest.g:3181:1: rule__Input__Group_2_1__0 : rule__Input__Group_2_1__0__Impl rule__Input__Group_2_1__1 ;
	public final void rule__Input__Group_2_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3185:2: ( rule__Input__Group_2_1__0__Impl rule__Input__Group_2_1__1 )
			// InternalXtextTest.g:3186:2: rule__Input__Group_2_1__0__Impl rule__Input__Group_2_1__1
			{
			pushFollow(FOLLOW_16);
			rule__Input__Group_2_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Input__Group_2_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_1__0"



	// $ANTLR start "rule__Input__Group_2_1__0__Impl"
	// InternalXtextTest.g:3193:1: rule__Input__Group_2_1__0__Impl : ( RULE_FILE ) ;
	public final void rule__Input__Group_2_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3197:1: ( ( RULE_FILE ) )
			// InternalXtextTest.g:3199:1: ( RULE_FILE )
			{
			// InternalXtextTest.g:3199:1: ( RULE_FILE )
			// InternalXtextTest.g:3200:1: RULE_FILE
			{
			 before(grammarAccess.getInputAccess().getFILETerminalRuleCall_2_1_0()); 
			match(input,RULE_FILE,FOLLOW_2); 
			 after(grammarAccess.getInputAccess().getFILETerminalRuleCall_2_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_1__0__Impl"



	// $ANTLR start "rule__Input__Group_2_1__1"
	// InternalXtextTest.g:3213:1: rule__Input__Group_2_1__1 : rule__Input__Group_2_1__1__Impl rule__Input__Group_2_1__2 ;
	public final void rule__Input__Group_2_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3217:2: ( rule__Input__Group_2_1__1__Impl rule__Input__Group_2_1__2 )
			// InternalXtextTest.g:3218:2: rule__Input__Group_2_1__1__Impl rule__Input__Group_2_1__2
			{
			pushFollow(FOLLOW_27);
			rule__Input__Group_2_1__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Input__Group_2_1__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_1__1"



	// $ANTLR start "rule__Input__Group_2_1__1__Impl"
	// InternalXtextTest.g:3225:1: rule__Input__Group_2_1__1__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__Input__Group_2_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3229:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:3231:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:3231:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:3232:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getInputAccess().getASSIGNASSINGLETerminalRuleCall_2_1_1()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getInputAccess().getASSIGNASSINGLETerminalRuleCall_2_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_1__1__Impl"



	// $ANTLR start "rule__Input__Group_2_1__2"
	// InternalXtextTest.g:3245:1: rule__Input__Group_2_1__2 : rule__Input__Group_2_1__2__Impl ;
	public final void rule__Input__Group_2_1__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3249:2: ( rule__Input__Group_2_1__2__Impl )
			// InternalXtextTest.g:3250:2: rule__Input__Group_2_1__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Input__Group_2_1__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_1__2"



	// $ANTLR start "rule__Input__Group_2_1__2__Impl"
	// InternalXtextTest.g:3256:1: rule__Input__Group_2_1__2__Impl : ( ( rule__Input__FileAssignment_2_1_2 ) ) ;
	public final void rule__Input__Group_2_1__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3260:1: ( ( ( rule__Input__FileAssignment_2_1_2 ) ) )
			// InternalXtextTest.g:3262:1: ( ( rule__Input__FileAssignment_2_1_2 ) )
			{
			// InternalXtextTest.g:3262:1: ( ( rule__Input__FileAssignment_2_1_2 ) )
			// InternalXtextTest.g:3263:1: ( rule__Input__FileAssignment_2_1_2 )
			{
			 before(grammarAccess.getInputAccess().getFileAssignment_2_1_2()); 
			// InternalXtextTest.g:3264:2: ( rule__Input__FileAssignment_2_1_2 )
			// InternalXtextTest.g:3264:2: rule__Input__FileAssignment_2_1_2
			{
			pushFollow(FOLLOW_2);
			rule__Input__FileAssignment_2_1_2();
			state._fsp--;

			}

			 after(grammarAccess.getInputAccess().getFileAssignment_2_1_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__Group_2_1__2__Impl"



	// $ANTLR start "rule__Tokens__Group__0"
	// InternalXtextTest.g:3282:1: rule__Tokens__Group__0 : rule__Tokens__Group__0__Impl rule__Tokens__Group__1 ;
	public final void rule__Tokens__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3286:2: ( rule__Tokens__Group__0__Impl rule__Tokens__Group__1 )
			// InternalXtextTest.g:3287:2: rule__Tokens__Group__0__Impl rule__Tokens__Group__1
			{
			pushFollow(FOLLOW_33);
			rule__Tokens__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Tokens__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Tokens__Group__0"



	// $ANTLR start "rule__Tokens__Group__0__Impl"
	// InternalXtextTest.g:3294:1: rule__Tokens__Group__0__Impl : ( () ) ;
	public final void rule__Tokens__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3298:1: ( ( () ) )
			// InternalXtextTest.g:3300:1: ( () )
			{
			// InternalXtextTest.g:3300:1: ( () )
			// InternalXtextTest.g:3301:1: ()
			{
			 before(grammarAccess.getTokensAccess().getTokensAction_0()); 
			// InternalXtextTest.g:3302:1: ()
			// InternalXtextTest.g:3304:1: 
			{
			}

			 after(grammarAccess.getTokensAccess().getTokensAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Tokens__Group__0__Impl"



	// $ANTLR start "rule__Tokens__Group__1"
	// InternalXtextTest.g:3316:1: rule__Tokens__Group__1 : rule__Tokens__Group__1__Impl rule__Tokens__Group__2 ;
	public final void rule__Tokens__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3320:2: ( rule__Tokens__Group__1__Impl rule__Tokens__Group__2 )
			// InternalXtextTest.g:3321:2: rule__Tokens__Group__1__Impl rule__Tokens__Group__2
			{
			pushFollow(FOLLOW_34);
			rule__Tokens__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Tokens__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Tokens__Group__1"



	// $ANTLR start "rule__Tokens__Group__1__Impl"
	// InternalXtextTest.g:3328:1: rule__Tokens__Group__1__Impl : ( RULE_LEXER ) ;
	public final void rule__Tokens__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3332:1: ( ( RULE_LEXER ) )
			// InternalXtextTest.g:3334:1: ( RULE_LEXER )
			{
			// InternalXtextTest.g:3334:1: ( RULE_LEXER )
			// InternalXtextTest.g:3335:1: RULE_LEXER
			{
			 before(grammarAccess.getTokensAccess().getLEXERTerminalRuleCall_1()); 
			match(input,RULE_LEXER,FOLLOW_2); 
			 after(grammarAccess.getTokensAccess().getLEXERTerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Tokens__Group__1__Impl"



	// $ANTLR start "rule__Tokens__Group__2"
	// InternalXtextTest.g:3348:1: rule__Tokens__Group__2 : rule__Tokens__Group__2__Impl ;
	public final void rule__Tokens__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3352:2: ( rule__Tokens__Group__2__Impl )
			// InternalXtextTest.g:3353:2: rule__Tokens__Group__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Tokens__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Tokens__Group__2"



	// $ANTLR start "rule__Tokens__Group__2__Impl"
	// InternalXtextTest.g:3359:1: rule__Tokens__Group__2__Impl : ( ( ( rule__Tokens__TokensAssignment_2 ) ) ( ( rule__Tokens__TokensAssignment_2 )* ) ) ;
	public final void rule__Tokens__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3363:1: ( ( ( ( rule__Tokens__TokensAssignment_2 ) ) ( ( rule__Tokens__TokensAssignment_2 )* ) ) )
			// InternalXtextTest.g:3365:1: ( ( ( rule__Tokens__TokensAssignment_2 ) ) ( ( rule__Tokens__TokensAssignment_2 )* ) )
			{
			// InternalXtextTest.g:3365:1: ( ( ( rule__Tokens__TokensAssignment_2 ) ) ( ( rule__Tokens__TokensAssignment_2 )* ) )
			// InternalXtextTest.g:3366:1: ( ( rule__Tokens__TokensAssignment_2 ) ) ( ( rule__Tokens__TokensAssignment_2 )* )
			{
			// InternalXtextTest.g:3366:1: ( ( rule__Tokens__TokensAssignment_2 ) )
			// InternalXtextTest.g:3367:1: ( rule__Tokens__TokensAssignment_2 )
			{
			 before(grammarAccess.getTokensAccess().getTokensAssignment_2()); 
			// InternalXtextTest.g:3368:2: ( rule__Tokens__TokensAssignment_2 )
			// InternalXtextTest.g:3368:2: rule__Tokens__TokensAssignment_2
			{
			pushFollow(FOLLOW_35);
			rule__Tokens__TokensAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getTokensAccess().getTokensAssignment_2()); 
			}

			// InternalXtextTest.g:3371:1: ( ( rule__Tokens__TokensAssignment_2 )* )
			// InternalXtextTest.g:3372:1: ( rule__Tokens__TokensAssignment_2 )*
			{
			 before(grammarAccess.getTokensAccess().getTokensAssignment_2()); 
			// InternalXtextTest.g:3373:2: ( rule__Tokens__TokensAssignment_2 )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==RULE_IDENTIFIER||LA22_0==RULE_STRING) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// InternalXtextTest.g:3373:2: rule__Tokens__TokensAssignment_2
					{
					pushFollow(FOLLOW_35);
					rule__Tokens__TokensAssignment_2();
					state._fsp--;

					}
					break;

				default :
					break loop22;
				}
			}

			 after(grammarAccess.getTokensAccess().getTokensAssignment_2()); 
			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Tokens__Group__2__Impl"



	// $ANTLR start "rule__MyTokens__Group__0"
	// InternalXtextTest.g:3392:1: rule__MyTokens__Group__0 : rule__MyTokens__Group__0__Impl rule__MyTokens__Group__1 ;
	public final void rule__MyTokens__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3396:2: ( rule__MyTokens__Group__0__Impl rule__MyTokens__Group__1 )
			// InternalXtextTest.g:3397:2: rule__MyTokens__Group__0__Impl rule__MyTokens__Group__1
			{
			pushFollow(FOLLOW_36);
			rule__MyTokens__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MyTokens__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group__0"



	// $ANTLR start "rule__MyTokens__Group__0__Impl"
	// InternalXtextTest.g:3404:1: rule__MyTokens__Group__0__Impl : ( ( rule__MyTokens__Alternatives_0 ) ) ;
	public final void rule__MyTokens__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3408:1: ( ( ( rule__MyTokens__Alternatives_0 ) ) )
			// InternalXtextTest.g:3410:1: ( ( rule__MyTokens__Alternatives_0 ) )
			{
			// InternalXtextTest.g:3410:1: ( ( rule__MyTokens__Alternatives_0 ) )
			// InternalXtextTest.g:3411:1: ( rule__MyTokens__Alternatives_0 )
			{
			 before(grammarAccess.getMyTokensAccess().getAlternatives_0()); 
			// InternalXtextTest.g:3412:2: ( rule__MyTokens__Alternatives_0 )
			// InternalXtextTest.g:3412:2: rule__MyTokens__Alternatives_0
			{
			pushFollow(FOLLOW_2);
			rule__MyTokens__Alternatives_0();
			state._fsp--;

			}

			 after(grammarAccess.getMyTokensAccess().getAlternatives_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group__0__Impl"



	// $ANTLR start "rule__MyTokens__Group__1"
	// InternalXtextTest.g:3424:1: rule__MyTokens__Group__1 : rule__MyTokens__Group__1__Impl ;
	public final void rule__MyTokens__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3428:2: ( rule__MyTokens__Group__1__Impl )
			// InternalXtextTest.g:3429:2: rule__MyTokens__Group__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__MyTokens__Group__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group__1"



	// $ANTLR start "rule__MyTokens__Group__1__Impl"
	// InternalXtextTest.g:3435:1: rule__MyTokens__Group__1__Impl : ( ( rule__MyTokens__Group_1__0 )? ) ;
	public final void rule__MyTokens__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3439:1: ( ( ( rule__MyTokens__Group_1__0 )? ) )
			// InternalXtextTest.g:3441:1: ( ( rule__MyTokens__Group_1__0 )? )
			{
			// InternalXtextTest.g:3441:1: ( ( rule__MyTokens__Group_1__0 )? )
			// InternalXtextTest.g:3442:1: ( rule__MyTokens__Group_1__0 )?
			{
			 before(grammarAccess.getMyTokensAccess().getGroup_1()); 
			// InternalXtextTest.g:3443:2: ( rule__MyTokens__Group_1__0 )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==RULE_ASSIGNASDATALIST) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// InternalXtextTest.g:3443:2: rule__MyTokens__Group_1__0
					{
					pushFollow(FOLLOW_2);
					rule__MyTokens__Group_1__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getMyTokensAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group__1__Impl"



	// $ANTLR start "rule__MyTokens__Group_1__0"
	// InternalXtextTest.g:3459:1: rule__MyTokens__Group_1__0 : rule__MyTokens__Group_1__0__Impl rule__MyTokens__Group_1__1 ;
	public final void rule__MyTokens__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3463:2: ( rule__MyTokens__Group_1__0__Impl rule__MyTokens__Group_1__1 )
			// InternalXtextTest.g:3464:2: rule__MyTokens__Group_1__0__Impl rule__MyTokens__Group_1__1
			{
			pushFollow(FOLLOW_18);
			rule__MyTokens__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__MyTokens__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group_1__0"



	// $ANTLR start "rule__MyTokens__Group_1__0__Impl"
	// InternalXtextTest.g:3471:1: rule__MyTokens__Group_1__0__Impl : ( RULE_ASSIGNASDATALIST ) ;
	public final void rule__MyTokens__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3475:1: ( ( RULE_ASSIGNASDATALIST ) )
			// InternalXtextTest.g:3477:1: ( RULE_ASSIGNASDATALIST )
			{
			// InternalXtextTest.g:3477:1: ( RULE_ASSIGNASDATALIST )
			// InternalXtextTest.g:3478:1: RULE_ASSIGNASDATALIST
			{
			 before(grammarAccess.getMyTokensAccess().getASSIGNASDATALISTTerminalRuleCall_1_0()); 
			match(input,RULE_ASSIGNASDATALIST,FOLLOW_2); 
			 after(grammarAccess.getMyTokensAccess().getASSIGNASDATALISTTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group_1__0__Impl"



	// $ANTLR start "rule__MyTokens__Group_1__1"
	// InternalXtextTest.g:3491:1: rule__MyTokens__Group_1__1 : rule__MyTokens__Group_1__1__Impl ;
	public final void rule__MyTokens__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3495:2: ( rule__MyTokens__Group_1__1__Impl )
			// InternalXtextTest.g:3496:2: rule__MyTokens__Group_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__MyTokens__Group_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group_1__1"



	// $ANTLR start "rule__MyTokens__Group_1__1__Impl"
	// InternalXtextTest.g:3502:1: rule__MyTokens__Group_1__1__Impl : ( ( rule__MyTokens__CountAssignment_1_1 ) ) ;
	public final void rule__MyTokens__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3506:1: ( ( ( rule__MyTokens__CountAssignment_1_1 ) ) )
			// InternalXtextTest.g:3508:1: ( ( rule__MyTokens__CountAssignment_1_1 ) )
			{
			// InternalXtextTest.g:3508:1: ( ( rule__MyTokens__CountAssignment_1_1 ) )
			// InternalXtextTest.g:3509:1: ( rule__MyTokens__CountAssignment_1_1 )
			{
			 before(grammarAccess.getMyTokensAccess().getCountAssignment_1_1()); 
			// InternalXtextTest.g:3510:2: ( rule__MyTokens__CountAssignment_1_1 )
			// InternalXtextTest.g:3510:2: rule__MyTokens__CountAssignment_1_1
			{
			pushFollow(FOLLOW_2);
			rule__MyTokens__CountAssignment_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getMyTokensAccess().getCountAssignment_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__Group_1__1__Impl"



	// $ANTLR start "rule__Element__Group__0"
	// InternalXtextTest.g:3526:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
	public final void rule__Element__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3530:2: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
			// InternalXtextTest.g:3531:2: rule__Element__Group__0__Impl rule__Element__Group__1
			{
			pushFollow(FOLLOW_12);
			rule__Element__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__0"



	// $ANTLR start "rule__Element__Group__0__Impl"
	// InternalXtextTest.g:3538:1: rule__Element__Group__0__Impl : ( () ) ;
	public final void rule__Element__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3542:1: ( ( () ) )
			// InternalXtextTest.g:3544:1: ( () )
			{
			// InternalXtextTest.g:3544:1: ( () )
			// InternalXtextTest.g:3545:1: ()
			{
			 before(grammarAccess.getElementAccess().getElementAction_0()); 
			// InternalXtextTest.g:3546:1: ()
			// InternalXtextTest.g:3548:1: 
			{
			}

			 after(grammarAccess.getElementAccess().getElementAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__0__Impl"



	// $ANTLR start "rule__Element__Group__1"
	// InternalXtextTest.g:3560:1: rule__Element__Group__1 : rule__Element__Group__1__Impl rule__Element__Group__2 ;
	public final void rule__Element__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3564:2: ( rule__Element__Group__1__Impl rule__Element__Group__2 )
			// InternalXtextTest.g:3565:2: rule__Element__Group__1__Impl rule__Element__Group__2
			{
			pushFollow(FOLLOW_5);
			rule__Element__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__1"



	// $ANTLR start "rule__Element__Group__1__Impl"
	// InternalXtextTest.g:3572:1: rule__Element__Group__1__Impl : ( RULE_LEFTPAREN ) ;
	public final void rule__Element__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3576:1: ( ( RULE_LEFTPAREN ) )
			// InternalXtextTest.g:3578:1: ( RULE_LEFTPAREN )
			{
			// InternalXtextTest.g:3578:1: ( RULE_LEFTPAREN )
			// InternalXtextTest.g:3579:1: RULE_LEFTPAREN
			{
			 before(grammarAccess.getElementAccess().getLEFTPARENTerminalRuleCall_1()); 
			match(input,RULE_LEFTPAREN,FOLLOW_2); 
			 after(grammarAccess.getElementAccess().getLEFTPARENTerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__1__Impl"



	// $ANTLR start "rule__Element__Group__2"
	// InternalXtextTest.g:3592:1: rule__Element__Group__2 : rule__Element__Group__2__Impl rule__Element__Group__3 ;
	public final void rule__Element__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3596:2: ( rule__Element__Group__2__Impl rule__Element__Group__3 )
			// InternalXtextTest.g:3597:2: rule__Element__Group__2__Impl rule__Element__Group__3
			{
			pushFollow(FOLLOW_5);
			rule__Element__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__2"



	// $ANTLR start "rule__Element__Group__2__Impl"
	// InternalXtextTest.g:3604:1: rule__Element__Group__2__Impl : ( ( rule__Element__Group_2__0 )? ) ;
	public final void rule__Element__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3608:1: ( ( ( rule__Element__Group_2__0 )? ) )
			// InternalXtextTest.g:3610:1: ( ( rule__Element__Group_2__0 )? )
			{
			// InternalXtextTest.g:3610:1: ( ( rule__Element__Group_2__0 )? )
			// InternalXtextTest.g:3611:1: ( rule__Element__Group_2__0 )?
			{
			 before(grammarAccess.getElementAccess().getGroup_2()); 
			// InternalXtextTest.g:3612:2: ( rule__Element__Group_2__0 )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==RULE_IDENTIFIER) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==RULE_IMPORTER) ) {
					alt24=1;
				}
			}
			switch (alt24) {
				case 1 :
					// InternalXtextTest.g:3612:2: rule__Element__Group_2__0
					{
					pushFollow(FOLLOW_2);
					rule__Element__Group_2__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getElementAccess().getGroup_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__2__Impl"



	// $ANTLR start "rule__Element__Group__3"
	// InternalXtextTest.g:3624:1: rule__Element__Group__3 : rule__Element__Group__3__Impl rule__Element__Group__4 ;
	public final void rule__Element__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3628:2: ( rule__Element__Group__3__Impl rule__Element__Group__4 )
			// InternalXtextTest.g:3629:2: rule__Element__Group__3__Impl rule__Element__Group__4
			{
			pushFollow(FOLLOW_37);
			rule__Element__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__3"



	// $ANTLR start "rule__Element__Group__3__Impl"
	// InternalXtextTest.g:3636:1: rule__Element__Group__3__Impl : ( ( rule__Element__NameAssignment_3 ) ) ;
	public final void rule__Element__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3640:1: ( ( ( rule__Element__NameAssignment_3 ) ) )
			// InternalXtextTest.g:3642:1: ( ( rule__Element__NameAssignment_3 ) )
			{
			// InternalXtextTest.g:3642:1: ( ( rule__Element__NameAssignment_3 ) )
			// InternalXtextTest.g:3643:1: ( rule__Element__NameAssignment_3 )
			{
			 before(grammarAccess.getElementAccess().getNameAssignment_3()); 
			// InternalXtextTest.g:3644:2: ( rule__Element__NameAssignment_3 )
			// InternalXtextTest.g:3644:2: rule__Element__NameAssignment_3
			{
			pushFollow(FOLLOW_2);
			rule__Element__NameAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getElementAccess().getNameAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__3__Impl"



	// $ANTLR start "rule__Element__Group__4"
	// InternalXtextTest.g:3656:1: rule__Element__Group__4 : rule__Element__Group__4__Impl rule__Element__Group__5 ;
	public final void rule__Element__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3660:2: ( rule__Element__Group__4__Impl rule__Element__Group__5 )
			// InternalXtextTest.g:3661:2: rule__Element__Group__4__Impl rule__Element__Group__5
			{
			pushFollow(FOLLOW_38);
			rule__Element__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__4"



	// $ANTLR start "rule__Element__Group__4__Impl"
	// InternalXtextTest.g:3668:1: rule__Element__Group__4__Impl : ( ( rule__Element__Group_4__0 )? ) ;
	public final void rule__Element__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3672:1: ( ( ( rule__Element__Group_4__0 )? ) )
			// InternalXtextTest.g:3674:1: ( ( rule__Element__Group_4__0 )? )
			{
			// InternalXtextTest.g:3674:1: ( ( rule__Element__Group_4__0 )? )
			// InternalXtextTest.g:3675:1: ( rule__Element__Group_4__0 )?
			{
			 before(grammarAccess.getElementAccess().getGroup_4()); 
			// InternalXtextTest.g:3676:2: ( rule__Element__Group_4__0 )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==RULE_IDENTIFIER) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// InternalXtextTest.g:3676:2: rule__Element__Group_4__0
					{
					pushFollow(FOLLOW_2);
					rule__Element__Group_4__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getElementAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__4__Impl"



	// $ANTLR start "rule__Element__Group__5"
	// InternalXtextTest.g:3688:1: rule__Element__Group__5 : rule__Element__Group__5__Impl ;
	public final void rule__Element__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3692:2: ( rule__Element__Group__5__Impl )
			// InternalXtextTest.g:3693:2: rule__Element__Group__5__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Element__Group__5__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__5"



	// $ANTLR start "rule__Element__Group__5__Impl"
	// InternalXtextTest.g:3699:1: rule__Element__Group__5__Impl : ( RULE_RIGHTPAREN ) ;
	public final void rule__Element__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3703:1: ( ( RULE_RIGHTPAREN ) )
			// InternalXtextTest.g:3705:1: ( RULE_RIGHTPAREN )
			{
			// InternalXtextTest.g:3705:1: ( RULE_RIGHTPAREN )
			// InternalXtextTest.g:3706:1: RULE_RIGHTPAREN
			{
			 before(grammarAccess.getElementAccess().getRIGHTPARENTerminalRuleCall_5()); 
			match(input,RULE_RIGHTPAREN,FOLLOW_2); 
			 after(grammarAccess.getElementAccess().getRIGHTPARENTerminalRuleCall_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group__5__Impl"



	// $ANTLR start "rule__Element__Group_2__0"
	// InternalXtextTest.g:3731:1: rule__Element__Group_2__0 : rule__Element__Group_2__0__Impl rule__Element__Group_2__1 ;
	public final void rule__Element__Group_2__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3735:2: ( rule__Element__Group_2__0__Impl rule__Element__Group_2__1 )
			// InternalXtextTest.g:3736:2: rule__Element__Group_2__0__Impl rule__Element__Group_2__1
			{
			pushFollow(FOLLOW_39);
			rule__Element__Group_2__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group_2__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_2__0"



	// $ANTLR start "rule__Element__Group_2__0__Impl"
	// InternalXtextTest.g:3743:1: rule__Element__Group_2__0__Impl : ( ( rule__Element__ImportingAssignment_2_0 ) ) ;
	public final void rule__Element__Group_2__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3747:1: ( ( ( rule__Element__ImportingAssignment_2_0 ) ) )
			// InternalXtextTest.g:3749:1: ( ( rule__Element__ImportingAssignment_2_0 ) )
			{
			// InternalXtextTest.g:3749:1: ( ( rule__Element__ImportingAssignment_2_0 ) )
			// InternalXtextTest.g:3750:1: ( rule__Element__ImportingAssignment_2_0 )
			{
			 before(grammarAccess.getElementAccess().getImportingAssignment_2_0()); 
			// InternalXtextTest.g:3751:2: ( rule__Element__ImportingAssignment_2_0 )
			// InternalXtextTest.g:3751:2: rule__Element__ImportingAssignment_2_0
			{
			pushFollow(FOLLOW_2);
			rule__Element__ImportingAssignment_2_0();
			state._fsp--;

			}

			 after(grammarAccess.getElementAccess().getImportingAssignment_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_2__0__Impl"



	// $ANTLR start "rule__Element__Group_2__1"
	// InternalXtextTest.g:3763:1: rule__Element__Group_2__1 : rule__Element__Group_2__1__Impl ;
	public final void rule__Element__Group_2__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3767:2: ( rule__Element__Group_2__1__Impl )
			// InternalXtextTest.g:3768:2: rule__Element__Group_2__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Element__Group_2__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_2__1"



	// $ANTLR start "rule__Element__Group_2__1__Impl"
	// InternalXtextTest.g:3774:1: rule__Element__Group_2__1__Impl : ( RULE_IMPORTER ) ;
	public final void rule__Element__Group_2__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3778:1: ( ( RULE_IMPORTER ) )
			// InternalXtextTest.g:3780:1: ( RULE_IMPORTER )
			{
			// InternalXtextTest.g:3780:1: ( RULE_IMPORTER )
			// InternalXtextTest.g:3781:1: RULE_IMPORTER
			{
			 before(grammarAccess.getElementAccess().getIMPORTERTerminalRuleCall_2_1()); 
			match(input,RULE_IMPORTER,FOLLOW_2); 
			 after(grammarAccess.getElementAccess().getIMPORTERTerminalRuleCall_2_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_2__1__Impl"



	// $ANTLR start "rule__Element__Group_4__0"
	// InternalXtextTest.g:3798:1: rule__Element__Group_4__0 : rule__Element__Group_4__0__Impl rule__Element__Group_4__1 ;
	public final void rule__Element__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3802:2: ( rule__Element__Group_4__0__Impl rule__Element__Group_4__1 )
			// InternalXtextTest.g:3803:2: rule__Element__Group_4__0__Impl rule__Element__Group_4__1
			{
			pushFollow(FOLLOW_40);
			rule__Element__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4__0"



	// $ANTLR start "rule__Element__Group_4__0__Impl"
	// InternalXtextTest.g:3810:1: rule__Element__Group_4__0__Impl : ( ( rule__Element__InnerAssignment_4_0 ) ) ;
	public final void rule__Element__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3814:1: ( ( ( rule__Element__InnerAssignment_4_0 ) ) )
			// InternalXtextTest.g:3816:1: ( ( rule__Element__InnerAssignment_4_0 ) )
			{
			// InternalXtextTest.g:3816:1: ( ( rule__Element__InnerAssignment_4_0 ) )
			// InternalXtextTest.g:3817:1: ( rule__Element__InnerAssignment_4_0 )
			{
			 before(grammarAccess.getElementAccess().getInnerAssignment_4_0()); 
			// InternalXtextTest.g:3818:2: ( rule__Element__InnerAssignment_4_0 )
			// InternalXtextTest.g:3818:2: rule__Element__InnerAssignment_4_0
			{
			pushFollow(FOLLOW_2);
			rule__Element__InnerAssignment_4_0();
			state._fsp--;

			}

			 after(grammarAccess.getElementAccess().getInnerAssignment_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4__0__Impl"



	// $ANTLR start "rule__Element__Group_4__1"
	// InternalXtextTest.g:3830:1: rule__Element__Group_4__1 : rule__Element__Group_4__1__Impl ;
	public final void rule__Element__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3834:2: ( rule__Element__Group_4__1__Impl )
			// InternalXtextTest.g:3835:2: rule__Element__Group_4__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Element__Group_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4__1"



	// $ANTLR start "rule__Element__Group_4__1__Impl"
	// InternalXtextTest.g:3841:1: rule__Element__Group_4__1__Impl : ( ( rule__Element__Group_4_1__0 )* ) ;
	public final void rule__Element__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3845:1: ( ( ( rule__Element__Group_4_1__0 )* ) )
			// InternalXtextTest.g:3847:1: ( ( rule__Element__Group_4_1__0 )* )
			{
			// InternalXtextTest.g:3847:1: ( ( rule__Element__Group_4_1__0 )* )
			// InternalXtextTest.g:3848:1: ( rule__Element__Group_4_1__0 )*
			{
			 before(grammarAccess.getElementAccess().getGroup_4_1()); 
			// InternalXtextTest.g:3849:2: ( rule__Element__Group_4_1__0 )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==RULE_COMMA) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// InternalXtextTest.g:3849:2: rule__Element__Group_4_1__0
					{
					pushFollow(FOLLOW_41);
					rule__Element__Group_4_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop26;
				}
			}

			 after(grammarAccess.getElementAccess().getGroup_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4__1__Impl"



	// $ANTLR start "rule__Element__Group_4_1__0"
	// InternalXtextTest.g:3865:1: rule__Element__Group_4_1__0 : rule__Element__Group_4_1__0__Impl rule__Element__Group_4_1__1 ;
	public final void rule__Element__Group_4_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3869:2: ( rule__Element__Group_4_1__0__Impl rule__Element__Group_4_1__1 )
			// InternalXtextTest.g:3870:2: rule__Element__Group_4_1__0__Impl rule__Element__Group_4_1__1
			{
			pushFollow(FOLLOW_5);
			rule__Element__Group_4_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Element__Group_4_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4_1__0"



	// $ANTLR start "rule__Element__Group_4_1__0__Impl"
	// InternalXtextTest.g:3877:1: rule__Element__Group_4_1__0__Impl : ( RULE_COMMA ) ;
	public final void rule__Element__Group_4_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3881:1: ( ( RULE_COMMA ) )
			// InternalXtextTest.g:3883:1: ( RULE_COMMA )
			{
			// InternalXtextTest.g:3883:1: ( RULE_COMMA )
			// InternalXtextTest.g:3884:1: RULE_COMMA
			{
			 before(grammarAccess.getElementAccess().getCOMMATerminalRuleCall_4_1_0()); 
			match(input,RULE_COMMA,FOLLOW_2); 
			 after(grammarAccess.getElementAccess().getCOMMATerminalRuleCall_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4_1__0__Impl"



	// $ANTLR start "rule__Element__Group_4_1__1"
	// InternalXtextTest.g:3897:1: rule__Element__Group_4_1__1 : rule__Element__Group_4_1__1__Impl ;
	public final void rule__Element__Group_4_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3901:2: ( rule__Element__Group_4_1__1__Impl )
			// InternalXtextTest.g:3902:2: rule__Element__Group_4_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Element__Group_4_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4_1__1"



	// $ANTLR start "rule__Element__Group_4_1__1__Impl"
	// InternalXtextTest.g:3908:1: rule__Element__Group_4_1__1__Impl : ( ( rule__Element__InnerAssignment_4_1_1 ) ) ;
	public final void rule__Element__Group_4_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3912:1: ( ( ( rule__Element__InnerAssignment_4_1_1 ) ) )
			// InternalXtextTest.g:3914:1: ( ( rule__Element__InnerAssignment_4_1_1 ) )
			{
			// InternalXtextTest.g:3914:1: ( ( rule__Element__InnerAssignment_4_1_1 ) )
			// InternalXtextTest.g:3915:1: ( rule__Element__InnerAssignment_4_1_1 )
			{
			 before(grammarAccess.getElementAccess().getInnerAssignment_4_1_1()); 
			// InternalXtextTest.g:3916:2: ( rule__Element__InnerAssignment_4_1_1 )
			// InternalXtextTest.g:3916:2: rule__Element__InnerAssignment_4_1_1
			{
			pushFollow(FOLLOW_2);
			rule__Element__InnerAssignment_4_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getElementAccess().getInnerAssignment_4_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__Group_4_1__1__Impl"



	// $ANTLR start "rule__Inner__Group__0"
	// InternalXtextTest.g:3932:1: rule__Inner__Group__0 : rule__Inner__Group__0__Impl rule__Inner__Group__1 ;
	public final void rule__Inner__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3936:2: ( rule__Inner__Group__0__Impl rule__Inner__Group__1 )
			// InternalXtextTest.g:3937:2: rule__Inner__Group__0__Impl rule__Inner__Group__1
			{
			pushFollow(FOLLOW_5);
			rule__Inner__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group__0"



	// $ANTLR start "rule__Inner__Group__0__Impl"
	// InternalXtextTest.g:3944:1: rule__Inner__Group__0__Impl : ( () ) ;
	public final void rule__Inner__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3948:1: ( ( () ) )
			// InternalXtextTest.g:3950:1: ( () )
			{
			// InternalXtextTest.g:3950:1: ( () )
			// InternalXtextTest.g:3951:1: ()
			{
			 before(grammarAccess.getInnerAccess().getInnerAction_0()); 
			// InternalXtextTest.g:3952:1: ()
			// InternalXtextTest.g:3954:1: 
			{
			}

			 after(grammarAccess.getInnerAccess().getInnerAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group__0__Impl"



	// $ANTLR start "rule__Inner__Group__1"
	// InternalXtextTest.g:3966:1: rule__Inner__Group__1 : rule__Inner__Group__1__Impl rule__Inner__Group__2 ;
	public final void rule__Inner__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3970:2: ( rule__Inner__Group__1__Impl rule__Inner__Group__2 )
			// InternalXtextTest.g:3971:2: rule__Inner__Group__1__Impl rule__Inner__Group__2
			{
			pushFollow(FOLLOW_42);
			rule__Inner__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group__1"



	// $ANTLR start "rule__Inner__Group__1__Impl"
	// InternalXtextTest.g:3978:1: rule__Inner__Group__1__Impl : ( ( rule__Inner__ParameterAssignment_1 ) ) ;
	public final void rule__Inner__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:3982:1: ( ( ( rule__Inner__ParameterAssignment_1 ) ) )
			// InternalXtextTest.g:3984:1: ( ( rule__Inner__ParameterAssignment_1 ) )
			{
			// InternalXtextTest.g:3984:1: ( ( rule__Inner__ParameterAssignment_1 ) )
			// InternalXtextTest.g:3985:1: ( rule__Inner__ParameterAssignment_1 )
			{
			 before(grammarAccess.getInnerAccess().getParameterAssignment_1()); 
			// InternalXtextTest.g:3986:2: ( rule__Inner__ParameterAssignment_1 )
			// InternalXtextTest.g:3986:2: rule__Inner__ParameterAssignment_1
			{
			pushFollow(FOLLOW_2);
			rule__Inner__ParameterAssignment_1();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getParameterAssignment_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group__1__Impl"



	// $ANTLR start "rule__Inner__Group__2"
	// InternalXtextTest.g:3998:1: rule__Inner__Group__2 : rule__Inner__Group__2__Impl ;
	public final void rule__Inner__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4002:2: ( rule__Inner__Group__2__Impl )
			// InternalXtextTest.g:4003:2: rule__Inner__Group__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group__2"



	// $ANTLR start "rule__Inner__Group__2__Impl"
	// InternalXtextTest.g:4009:1: rule__Inner__Group__2__Impl : ( ( rule__Inner__Alternatives_2 ) ) ;
	public final void rule__Inner__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4013:1: ( ( ( rule__Inner__Alternatives_2 ) ) )
			// InternalXtextTest.g:4015:1: ( ( rule__Inner__Alternatives_2 ) )
			{
			// InternalXtextTest.g:4015:1: ( ( rule__Inner__Alternatives_2 ) )
			// InternalXtextTest.g:4016:1: ( rule__Inner__Alternatives_2 )
			{
			 before(grammarAccess.getInnerAccess().getAlternatives_2()); 
			// InternalXtextTest.g:4017:2: ( rule__Inner__Alternatives_2 )
			// InternalXtextTest.g:4017:2: rule__Inner__Alternatives_2
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Alternatives_2();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getAlternatives_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group__2__Impl"



	// $ANTLR start "rule__Inner__Group_2_0__0"
	// InternalXtextTest.g:4035:1: rule__Inner__Group_2_0__0 : rule__Inner__Group_2_0__0__Impl rule__Inner__Group_2_0__1 ;
	public final void rule__Inner__Group_2_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4039:2: ( rule__Inner__Group_2_0__0__Impl rule__Inner__Group_2_0__1 )
			// InternalXtextTest.g:4040:2: rule__Inner__Group_2_0__0__Impl rule__Inner__Group_2_0__1
			{
			pushFollow(FOLLOW_12);
			rule__Inner__Group_2_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_0__0"



	// $ANTLR start "rule__Inner__Group_2_0__0__Impl"
	// InternalXtextTest.g:4047:1: rule__Inner__Group_2_0__0__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__Inner__Group_2_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4051:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:4053:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:4053:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:4054:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getInnerAccess().getASSIGNASSINGLETerminalRuleCall_2_0_0()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getASSIGNASSINGLETerminalRuleCall_2_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_0__0__Impl"



	// $ANTLR start "rule__Inner__Group_2_0__1"
	// InternalXtextTest.g:4067:1: rule__Inner__Group_2_0__1 : rule__Inner__Group_2_0__1__Impl ;
	public final void rule__Inner__Group_2_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4071:2: ( rule__Inner__Group_2_0__1__Impl )
			// InternalXtextTest.g:4072:2: rule__Inner__Group_2_0__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_0__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_0__1"



	// $ANTLR start "rule__Inner__Group_2_0__1__Impl"
	// InternalXtextTest.g:4078:1: rule__Inner__Group_2_0__1__Impl : ( ( rule__Inner__AssignAssignment_2_0_1 ) ) ;
	public final void rule__Inner__Group_2_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4082:1: ( ( ( rule__Inner__AssignAssignment_2_0_1 ) ) )
			// InternalXtextTest.g:4084:1: ( ( rule__Inner__AssignAssignment_2_0_1 ) )
			{
			// InternalXtextTest.g:4084:1: ( ( rule__Inner__AssignAssignment_2_0_1 ) )
			// InternalXtextTest.g:4085:1: ( rule__Inner__AssignAssignment_2_0_1 )
			{
			 before(grammarAccess.getInnerAccess().getAssignAssignment_2_0_1()); 
			// InternalXtextTest.g:4086:2: ( rule__Inner__AssignAssignment_2_0_1 )
			// InternalXtextTest.g:4086:2: rule__Inner__AssignAssignment_2_0_1
			{
			pushFollow(FOLLOW_2);
			rule__Inner__AssignAssignment_2_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getAssignAssignment_2_0_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_0__1__Impl"



	// $ANTLR start "rule__Inner__Group_2_1__0"
	// InternalXtextTest.g:4102:1: rule__Inner__Group_2_1__0 : rule__Inner__Group_2_1__0__Impl rule__Inner__Group_2_1__1 ;
	public final void rule__Inner__Group_2_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4106:2: ( rule__Inner__Group_2_1__0__Impl rule__Inner__Group_2_1__1 )
			// InternalXtextTest.g:4107:2: rule__Inner__Group_2_1__0__Impl rule__Inner__Group_2_1__1
			{
			pushFollow(FOLLOW_12);
			rule__Inner__Group_2_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1__0"



	// $ANTLR start "rule__Inner__Group_2_1__0__Impl"
	// InternalXtextTest.g:4114:1: rule__Inner__Group_2_1__0__Impl : ( RULE_ASSIGNASLIST ) ;
	public final void rule__Inner__Group_2_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4118:1: ( ( RULE_ASSIGNASLIST ) )
			// InternalXtextTest.g:4120:1: ( RULE_ASSIGNASLIST )
			{
			// InternalXtextTest.g:4120:1: ( RULE_ASSIGNASLIST )
			// InternalXtextTest.g:4121:1: RULE_ASSIGNASLIST
			{
			 before(grammarAccess.getInnerAccess().getASSIGNASLISTTerminalRuleCall_2_1_0()); 
			match(input,RULE_ASSIGNASLIST,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getASSIGNASLISTTerminalRuleCall_2_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1__0__Impl"



	// $ANTLR start "rule__Inner__Group_2_1__1"
	// InternalXtextTest.g:4134:1: rule__Inner__Group_2_1__1 : rule__Inner__Group_2_1__1__Impl rule__Inner__Group_2_1__2 ;
	public final void rule__Inner__Group_2_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4138:2: ( rule__Inner__Group_2_1__1__Impl rule__Inner__Group_2_1__2 )
			// InternalXtextTest.g:4139:2: rule__Inner__Group_2_1__1__Impl rule__Inner__Group_2_1__2
			{
			pushFollow(FOLLOW_40);
			rule__Inner__Group_2_1__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_1__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1__1"



	// $ANTLR start "rule__Inner__Group_2_1__1__Impl"
	// InternalXtextTest.g:4146:1: rule__Inner__Group_2_1__1__Impl : ( ( rule__Inner__AssignListAssignment_2_1_1 ) ) ;
	public final void rule__Inner__Group_2_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4150:1: ( ( ( rule__Inner__AssignListAssignment_2_1_1 ) ) )
			// InternalXtextTest.g:4152:1: ( ( rule__Inner__AssignListAssignment_2_1_1 ) )
			{
			// InternalXtextTest.g:4152:1: ( ( rule__Inner__AssignListAssignment_2_1_1 ) )
			// InternalXtextTest.g:4153:1: ( rule__Inner__AssignListAssignment_2_1_1 )
			{
			 before(grammarAccess.getInnerAccess().getAssignListAssignment_2_1_1()); 
			// InternalXtextTest.g:4154:2: ( rule__Inner__AssignListAssignment_2_1_1 )
			// InternalXtextTest.g:4154:2: rule__Inner__AssignListAssignment_2_1_1
			{
			pushFollow(FOLLOW_2);
			rule__Inner__AssignListAssignment_2_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getAssignListAssignment_2_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1__1__Impl"



	// $ANTLR start "rule__Inner__Group_2_1__2"
	// InternalXtextTest.g:4166:1: rule__Inner__Group_2_1__2 : rule__Inner__Group_2_1__2__Impl ;
	public final void rule__Inner__Group_2_1__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4170:2: ( rule__Inner__Group_2_1__2__Impl )
			// InternalXtextTest.g:4171:2: rule__Inner__Group_2_1__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_1__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1__2"



	// $ANTLR start "rule__Inner__Group_2_1__2__Impl"
	// InternalXtextTest.g:4177:1: rule__Inner__Group_2_1__2__Impl : ( ( rule__Inner__Group_2_1_2__0 )* ) ;
	public final void rule__Inner__Group_2_1__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4181:1: ( ( ( rule__Inner__Group_2_1_2__0 )* ) )
			// InternalXtextTest.g:4183:1: ( ( rule__Inner__Group_2_1_2__0 )* )
			{
			// InternalXtextTest.g:4183:1: ( ( rule__Inner__Group_2_1_2__0 )* )
			// InternalXtextTest.g:4184:1: ( rule__Inner__Group_2_1_2__0 )*
			{
			 before(grammarAccess.getInnerAccess().getGroup_2_1_2()); 
			// InternalXtextTest.g:4185:2: ( rule__Inner__Group_2_1_2__0 )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==RULE_COMMA) ) {
					int LA27_2 = input.LA(2);
					if ( (LA27_2==RULE_LEFTPAREN) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// InternalXtextTest.g:4185:2: rule__Inner__Group_2_1_2__0
					{
					pushFollow(FOLLOW_41);
					rule__Inner__Group_2_1_2__0();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			 after(grammarAccess.getInnerAccess().getGroup_2_1_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1__2__Impl"



	// $ANTLR start "rule__Inner__Group_2_1_2__0"
	// InternalXtextTest.g:4203:1: rule__Inner__Group_2_1_2__0 : rule__Inner__Group_2_1_2__0__Impl rule__Inner__Group_2_1_2__1 ;
	public final void rule__Inner__Group_2_1_2__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4207:2: ( rule__Inner__Group_2_1_2__0__Impl rule__Inner__Group_2_1_2__1 )
			// InternalXtextTest.g:4208:2: rule__Inner__Group_2_1_2__0__Impl rule__Inner__Group_2_1_2__1
			{
			pushFollow(FOLLOW_12);
			rule__Inner__Group_2_1_2__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_1_2__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1_2__0"



	// $ANTLR start "rule__Inner__Group_2_1_2__0__Impl"
	// InternalXtextTest.g:4215:1: rule__Inner__Group_2_1_2__0__Impl : ( RULE_COMMA ) ;
	public final void rule__Inner__Group_2_1_2__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4219:1: ( ( RULE_COMMA ) )
			// InternalXtextTest.g:4221:1: ( RULE_COMMA )
			{
			// InternalXtextTest.g:4221:1: ( RULE_COMMA )
			// InternalXtextTest.g:4222:1: RULE_COMMA
			{
			 before(grammarAccess.getInnerAccess().getCOMMATerminalRuleCall_2_1_2_0()); 
			match(input,RULE_COMMA,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getCOMMATerminalRuleCall_2_1_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1_2__0__Impl"



	// $ANTLR start "rule__Inner__Group_2_1_2__1"
	// InternalXtextTest.g:4235:1: rule__Inner__Group_2_1_2__1 : rule__Inner__Group_2_1_2__1__Impl ;
	public final void rule__Inner__Group_2_1_2__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4239:2: ( rule__Inner__Group_2_1_2__1__Impl )
			// InternalXtextTest.g:4240:2: rule__Inner__Group_2_1_2__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_1_2__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1_2__1"



	// $ANTLR start "rule__Inner__Group_2_1_2__1__Impl"
	// InternalXtextTest.g:4246:1: rule__Inner__Group_2_1_2__1__Impl : ( ( rule__Inner__AssignListAssignment_2_1_2_1 ) ) ;
	public final void rule__Inner__Group_2_1_2__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4250:1: ( ( ( rule__Inner__AssignListAssignment_2_1_2_1 ) ) )
			// InternalXtextTest.g:4252:1: ( ( rule__Inner__AssignListAssignment_2_1_2_1 ) )
			{
			// InternalXtextTest.g:4252:1: ( ( rule__Inner__AssignListAssignment_2_1_2_1 ) )
			// InternalXtextTest.g:4253:1: ( rule__Inner__AssignListAssignment_2_1_2_1 )
			{
			 before(grammarAccess.getInnerAccess().getAssignListAssignment_2_1_2_1()); 
			// InternalXtextTest.g:4254:2: ( rule__Inner__AssignListAssignment_2_1_2_1 )
			// InternalXtextTest.g:4254:2: rule__Inner__AssignListAssignment_2_1_2_1
			{
			pushFollow(FOLLOW_2);
			rule__Inner__AssignListAssignment_2_1_2_1();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getAssignListAssignment_2_1_2_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_1_2__1__Impl"



	// $ANTLR start "rule__Inner__Group_2_2__0"
	// InternalXtextTest.g:4270:1: rule__Inner__Group_2_2__0 : rule__Inner__Group_2_2__0__Impl rule__Inner__Group_2_2__1 ;
	public final void rule__Inner__Group_2_2__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4274:2: ( rule__Inner__Group_2_2__0__Impl rule__Inner__Group_2_2__1 )
			// InternalXtextTest.g:4275:2: rule__Inner__Group_2_2__0__Impl rule__Inner__Group_2_2__1
			{
			pushFollow(FOLLOW_27);
			rule__Inner__Group_2_2__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_2__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_2__0"



	// $ANTLR start "rule__Inner__Group_2_2__0__Impl"
	// InternalXtextTest.g:4282:1: rule__Inner__Group_2_2__0__Impl : ( RULE_ASSIGNASSTRING ) ;
	public final void rule__Inner__Group_2_2__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4286:1: ( ( RULE_ASSIGNASSTRING ) )
			// InternalXtextTest.g:4288:1: ( RULE_ASSIGNASSTRING )
			{
			// InternalXtextTest.g:4288:1: ( RULE_ASSIGNASSTRING )
			// InternalXtextTest.g:4289:1: RULE_ASSIGNASSTRING
			{
			 before(grammarAccess.getInnerAccess().getASSIGNASSTRINGTerminalRuleCall_2_2_0()); 
			match(input,RULE_ASSIGNASSTRING,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getASSIGNASSTRINGTerminalRuleCall_2_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_2__0__Impl"



	// $ANTLR start "rule__Inner__Group_2_2__1"
	// InternalXtextTest.g:4302:1: rule__Inner__Group_2_2__1 : rule__Inner__Group_2_2__1__Impl ;
	public final void rule__Inner__Group_2_2__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4306:2: ( rule__Inner__Group_2_2__1__Impl )
			// InternalXtextTest.g:4307:2: rule__Inner__Group_2_2__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_2__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_2__1"



	// $ANTLR start "rule__Inner__Group_2_2__1__Impl"
	// InternalXtextTest.g:4313:1: rule__Inner__Group_2_2__1__Impl : ( ( rule__Inner__ValueAssignment_2_2_1 ) ) ;
	public final void rule__Inner__Group_2_2__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4317:1: ( ( ( rule__Inner__ValueAssignment_2_2_1 ) ) )
			// InternalXtextTest.g:4319:1: ( ( rule__Inner__ValueAssignment_2_2_1 ) )
			{
			// InternalXtextTest.g:4319:1: ( ( rule__Inner__ValueAssignment_2_2_1 ) )
			// InternalXtextTest.g:4320:1: ( rule__Inner__ValueAssignment_2_2_1 )
			{
			 before(grammarAccess.getInnerAccess().getValueAssignment_2_2_1()); 
			// InternalXtextTest.g:4321:2: ( rule__Inner__ValueAssignment_2_2_1 )
			// InternalXtextTest.g:4321:2: rule__Inner__ValueAssignment_2_2_1
			{
			pushFollow(FOLLOW_2);
			rule__Inner__ValueAssignment_2_2_1();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getValueAssignment_2_2_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_2__1__Impl"



	// $ANTLR start "rule__Inner__Group_2_3__0"
	// InternalXtextTest.g:4337:1: rule__Inner__Group_2_3__0 : rule__Inner__Group_2_3__0__Impl rule__Inner__Group_2_3__1 ;
	public final void rule__Inner__Group_2_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4341:2: ( rule__Inner__Group_2_3__0__Impl rule__Inner__Group_2_3__1 )
			// InternalXtextTest.g:4342:2: rule__Inner__Group_2_3__0__Impl rule__Inner__Group_2_3__1
			{
			pushFollow(FOLLOW_27);
			rule__Inner__Group_2_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_3__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_3__0"



	// $ANTLR start "rule__Inner__Group_2_3__0__Impl"
	// InternalXtextTest.g:4349:1: rule__Inner__Group_2_3__0__Impl : ( RULE_ASSIGNASDATALIST ) ;
	public final void rule__Inner__Group_2_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4353:1: ( ( RULE_ASSIGNASDATALIST ) )
			// InternalXtextTest.g:4355:1: ( RULE_ASSIGNASDATALIST )
			{
			// InternalXtextTest.g:4355:1: ( RULE_ASSIGNASDATALIST )
			// InternalXtextTest.g:4356:1: RULE_ASSIGNASDATALIST
			{
			 before(grammarAccess.getInnerAccess().getASSIGNASDATALISTTerminalRuleCall_2_3_0()); 
			match(input,RULE_ASSIGNASDATALIST,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getASSIGNASDATALISTTerminalRuleCall_2_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_3__0__Impl"



	// $ANTLR start "rule__Inner__Group_2_3__1"
	// InternalXtextTest.g:4369:1: rule__Inner__Group_2_3__1 : rule__Inner__Group_2_3__1__Impl ;
	public final void rule__Inner__Group_2_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4373:2: ( rule__Inner__Group_2_3__1__Impl )
			// InternalXtextTest.g:4374:2: rule__Inner__Group_2_3__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_3__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_3__1"



	// $ANTLR start "rule__Inner__Group_2_3__1__Impl"
	// InternalXtextTest.g:4380:1: rule__Inner__Group_2_3__1__Impl : ( ( rule__Inner__AssignAsDataAssignment_2_3_1 ) ) ;
	public final void rule__Inner__Group_2_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4384:1: ( ( ( rule__Inner__AssignAsDataAssignment_2_3_1 ) ) )
			// InternalXtextTest.g:4386:1: ( ( rule__Inner__AssignAsDataAssignment_2_3_1 ) )
			{
			// InternalXtextTest.g:4386:1: ( ( rule__Inner__AssignAsDataAssignment_2_3_1 ) )
			// InternalXtextTest.g:4387:1: ( rule__Inner__AssignAsDataAssignment_2_3_1 )
			{
			 before(grammarAccess.getInnerAccess().getAssignAsDataAssignment_2_3_1()); 
			// InternalXtextTest.g:4388:2: ( rule__Inner__AssignAsDataAssignment_2_3_1 )
			// InternalXtextTest.g:4388:2: rule__Inner__AssignAsDataAssignment_2_3_1
			{
			pushFollow(FOLLOW_2);
			rule__Inner__AssignAsDataAssignment_2_3_1();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getAssignAsDataAssignment_2_3_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_3__1__Impl"



	// $ANTLR start "rule__Inner__Group_2_4__0"
	// InternalXtextTest.g:4404:1: rule__Inner__Group_2_4__0 : rule__Inner__Group_2_4__0__Impl rule__Inner__Group_2_4__1 ;
	public final void rule__Inner__Group_2_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4408:2: ( rule__Inner__Group_2_4__0__Impl rule__Inner__Group_2_4__1 )
			// InternalXtextTest.g:4409:2: rule__Inner__Group_2_4__0__Impl rule__Inner__Group_2_4__1
			{
			pushFollow(FOLLOW_17);
			rule__Inner__Group_2_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_4__0"



	// $ANTLR start "rule__Inner__Group_2_4__0__Impl"
	// InternalXtextTest.g:4416:1: rule__Inner__Group_2_4__0__Impl : ( RULE_ASSIGNASBOOL ) ;
	public final void rule__Inner__Group_2_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4420:1: ( ( RULE_ASSIGNASBOOL ) )
			// InternalXtextTest.g:4422:1: ( RULE_ASSIGNASBOOL )
			{
			// InternalXtextTest.g:4422:1: ( RULE_ASSIGNASBOOL )
			// InternalXtextTest.g:4423:1: RULE_ASSIGNASBOOL
			{
			 before(grammarAccess.getInnerAccess().getASSIGNASBOOLTerminalRuleCall_2_4_0()); 
			match(input,RULE_ASSIGNASBOOL,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getASSIGNASBOOLTerminalRuleCall_2_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_4__0__Impl"



	// $ANTLR start "rule__Inner__Group_2_4__1"
	// InternalXtextTest.g:4436:1: rule__Inner__Group_2_4__1 : rule__Inner__Group_2_4__1__Impl ;
	public final void rule__Inner__Group_2_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4440:2: ( rule__Inner__Group_2_4__1__Impl )
			// InternalXtextTest.g:4441:2: rule__Inner__Group_2_4__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Inner__Group_2_4__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_4__1"



	// $ANTLR start "rule__Inner__Group_2_4__1__Impl"
	// InternalXtextTest.g:4447:1: rule__Inner__Group_2_4__1__Impl : ( ( rule__Inner__AssignAsBoolAssignment_2_4_1 ) ) ;
	public final void rule__Inner__Group_2_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4451:1: ( ( ( rule__Inner__AssignAsBoolAssignment_2_4_1 ) ) )
			// InternalXtextTest.g:4453:1: ( ( rule__Inner__AssignAsBoolAssignment_2_4_1 ) )
			{
			// InternalXtextTest.g:4453:1: ( ( rule__Inner__AssignAsBoolAssignment_2_4_1 ) )
			// InternalXtextTest.g:4454:1: ( rule__Inner__AssignAsBoolAssignment_2_4_1 )
			{
			 before(grammarAccess.getInnerAccess().getAssignAsBoolAssignment_2_4_1()); 
			// InternalXtextTest.g:4455:2: ( rule__Inner__AssignAsBoolAssignment_2_4_1 )
			// InternalXtextTest.g:4455:2: rule__Inner__AssignAsBoolAssignment_2_4_1
			{
			pushFollow(FOLLOW_2);
			rule__Inner__AssignAsBoolAssignment_2_4_1();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getAssignAsBoolAssignment_2_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__Group_2_4__1__Impl"



	// $ANTLR start "rule__Generator__Group__0"
	// InternalXtextTest.g:4471:1: rule__Generator__Group__0 : rule__Generator__Group__0__Impl rule__Generator__Group__1 ;
	public final void rule__Generator__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4475:2: ( rule__Generator__Group__0__Impl rule__Generator__Group__1 )
			// InternalXtextTest.g:4476:2: rule__Generator__Group__0__Impl rule__Generator__Group__1
			{
			pushFollow(FOLLOW_43);
			rule__Generator__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__0"



	// $ANTLR start "rule__Generator__Group__0__Impl"
	// InternalXtextTest.g:4483:1: rule__Generator__Group__0__Impl : ( () ) ;
	public final void rule__Generator__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4487:1: ( ( () ) )
			// InternalXtextTest.g:4489:1: ( () )
			{
			// InternalXtextTest.g:4489:1: ( () )
			// InternalXtextTest.g:4490:1: ()
			{
			 before(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
			// InternalXtextTest.g:4491:1: ()
			// InternalXtextTest.g:4493:1: 
			{
			}

			 after(grammarAccess.getGeneratorAccess().getGeneratorAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__0__Impl"



	// $ANTLR start "rule__Generator__Group__1"
	// InternalXtextTest.g:4505:1: rule__Generator__Group__1 : rule__Generator__Group__1__Impl rule__Generator__Group__2 ;
	public final void rule__Generator__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4509:2: ( rule__Generator__Group__1__Impl rule__Generator__Group__2 )
			// InternalXtextTest.g:4510:2: rule__Generator__Group__1__Impl rule__Generator__Group__2
			{
			pushFollow(FOLLOW_44);
			rule__Generator__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__1"



	// $ANTLR start "rule__Generator__Group__1__Impl"
	// InternalXtextTest.g:4517:1: rule__Generator__Group__1__Impl : ( ( rule__Generator__Group_1__0 ) ) ;
	public final void rule__Generator__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4521:1: ( ( ( rule__Generator__Group_1__0 ) ) )
			// InternalXtextTest.g:4523:1: ( ( rule__Generator__Group_1__0 ) )
			{
			// InternalXtextTest.g:4523:1: ( ( rule__Generator__Group_1__0 ) )
			// InternalXtextTest.g:4524:1: ( rule__Generator__Group_1__0 )
			{
			 before(grammarAccess.getGeneratorAccess().getGroup_1()); 
			// InternalXtextTest.g:4525:2: ( rule__Generator__Group_1__0 )
			// InternalXtextTest.g:4525:2: rule__Generator__Group_1__0
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_1__0();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getGroup_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__1__Impl"



	// $ANTLR start "rule__Generator__Group__2"
	// InternalXtextTest.g:4537:1: rule__Generator__Group__2 : rule__Generator__Group__2__Impl rule__Generator__Group__3 ;
	public final void rule__Generator__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4541:2: ( rule__Generator__Group__2__Impl rule__Generator__Group__3 )
			// InternalXtextTest.g:4542:2: rule__Generator__Group__2__Impl rule__Generator__Group__3
			{
			pushFollow(FOLLOW_45);
			rule__Generator__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__2"



	// $ANTLR start "rule__Generator__Group__2__Impl"
	// InternalXtextTest.g:4549:1: rule__Generator__Group__2__Impl : ( ( rule__Generator__Group_2__0 ) ) ;
	public final void rule__Generator__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4553:1: ( ( ( rule__Generator__Group_2__0 ) ) )
			// InternalXtextTest.g:4555:1: ( ( rule__Generator__Group_2__0 ) )
			{
			// InternalXtextTest.g:4555:1: ( ( rule__Generator__Group_2__0 ) )
			// InternalXtextTest.g:4556:1: ( rule__Generator__Group_2__0 )
			{
			 before(grammarAccess.getGeneratorAccess().getGroup_2()); 
			// InternalXtextTest.g:4557:2: ( rule__Generator__Group_2__0 )
			// InternalXtextTest.g:4557:2: rule__Generator__Group_2__0
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_2__0();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getGroup_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__2__Impl"



	// $ANTLR start "rule__Generator__Group__3"
	// InternalXtextTest.g:4569:1: rule__Generator__Group__3 : rule__Generator__Group__3__Impl rule__Generator__Group__4 ;
	public final void rule__Generator__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4573:2: ( rule__Generator__Group__3__Impl rule__Generator__Group__4 )
			// InternalXtextTest.g:4574:2: rule__Generator__Group__3__Impl rule__Generator__Group__4
			{
			pushFollow(FOLLOW_44);
			rule__Generator__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__3"



	// $ANTLR start "rule__Generator__Group__3__Impl"
	// InternalXtextTest.g:4581:1: rule__Generator__Group__3__Impl : ( ( rule__Generator__Group_3__0 )? ) ;
	public final void rule__Generator__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4585:1: ( ( ( rule__Generator__Group_3__0 )? ) )
			// InternalXtextTest.g:4587:1: ( ( rule__Generator__Group_3__0 )? )
			{
			// InternalXtextTest.g:4587:1: ( ( rule__Generator__Group_3__0 )? )
			// InternalXtextTest.g:4588:1: ( rule__Generator__Group_3__0 )?
			{
			 before(grammarAccess.getGeneratorAccess().getGroup_3()); 
			// InternalXtextTest.g:4589:2: ( rule__Generator__Group_3__0 )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==RULE_PATTERNS) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// InternalXtextTest.g:4589:2: rule__Generator__Group_3__0
					{
					pushFollow(FOLLOW_2);
					rule__Generator__Group_3__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getGeneratorAccess().getGroup_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__3__Impl"



	// $ANTLR start "rule__Generator__Group__4"
	// InternalXtextTest.g:4601:1: rule__Generator__Group__4 : rule__Generator__Group__4__Impl ;
	public final void rule__Generator__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4605:2: ( rule__Generator__Group__4__Impl )
			// InternalXtextTest.g:4606:2: rule__Generator__Group__4__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group__4__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__4"



	// $ANTLR start "rule__Generator__Group__4__Impl"
	// InternalXtextTest.g:4612:1: rule__Generator__Group__4__Impl : ( ( rule__Generator__Group_4__0 )? ) ;
	public final void rule__Generator__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4616:1: ( ( ( rule__Generator__Group_4__0 )? ) )
			// InternalXtextTest.g:4618:1: ( ( rule__Generator__Group_4__0 )? )
			{
			// InternalXtextTest.g:4618:1: ( ( rule__Generator__Group_4__0 )? )
			// InternalXtextTest.g:4619:1: ( rule__Generator__Group_4__0 )?
			{
			 before(grammarAccess.getGeneratorAccess().getGroup_4()); 
			// InternalXtextTest.g:4620:2: ( rule__Generator__Group_4__0 )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==RULE_EXPECTED) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// InternalXtextTest.g:4620:2: rule__Generator__Group_4__0
					{
					pushFollow(FOLLOW_2);
					rule__Generator__Group_4__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getGeneratorAccess().getGroup_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group__4__Impl"



	// $ANTLR start "rule__Generator__Group_1__0"
	// InternalXtextTest.g:4642:1: rule__Generator__Group_1__0 : rule__Generator__Group_1__0__Impl rule__Generator__Group_1__1 ;
	public final void rule__Generator__Group_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4646:2: ( rule__Generator__Group_1__0__Impl rule__Generator__Group_1__1 )
			// InternalXtextTest.g:4647:2: rule__Generator__Group_1__0__Impl rule__Generator__Group_1__1
			{
			pushFollow(FOLLOW_26);
			rule__Generator__Group_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__0"



	// $ANTLR start "rule__Generator__Group_1__0__Impl"
	// InternalXtextTest.g:4654:1: rule__Generator__Group_1__0__Impl : ( RULE_OUTPUT ) ;
	public final void rule__Generator__Group_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4658:1: ( ( RULE_OUTPUT ) )
			// InternalXtextTest.g:4660:1: ( RULE_OUTPUT )
			{
			// InternalXtextTest.g:4660:1: ( RULE_OUTPUT )
			// InternalXtextTest.g:4661:1: RULE_OUTPUT
			{
			 before(grammarAccess.getGeneratorAccess().getOUTPUTTerminalRuleCall_1_0()); 
			match(input,RULE_OUTPUT,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getOUTPUTTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__0__Impl"



	// $ANTLR start "rule__Generator__Group_1__1"
	// InternalXtextTest.g:4674:1: rule__Generator__Group_1__1 : rule__Generator__Group_1__1__Impl rule__Generator__Group_1__2 ;
	public final void rule__Generator__Group_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4678:2: ( rule__Generator__Group_1__1__Impl rule__Generator__Group_1__2 )
			// InternalXtextTest.g:4679:2: rule__Generator__Group_1__1__Impl rule__Generator__Group_1__2
			{
			pushFollow(FOLLOW_16);
			rule__Generator__Group_1__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_1__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__1"



	// $ANTLR start "rule__Generator__Group_1__1__Impl"
	// InternalXtextTest.g:4686:1: rule__Generator__Group_1__1__Impl : ( RULE_FILE ) ;
	public final void rule__Generator__Group_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4690:1: ( ( RULE_FILE ) )
			// InternalXtextTest.g:4692:1: ( RULE_FILE )
			{
			// InternalXtextTest.g:4692:1: ( RULE_FILE )
			// InternalXtextTest.g:4693:1: RULE_FILE
			{
			 before(grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_1_1()); 
			match(input,RULE_FILE,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__1__Impl"



	// $ANTLR start "rule__Generator__Group_1__2"
	// InternalXtextTest.g:4706:1: rule__Generator__Group_1__2 : rule__Generator__Group_1__2__Impl rule__Generator__Group_1__3 ;
	public final void rule__Generator__Group_1__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4710:2: ( rule__Generator__Group_1__2__Impl rule__Generator__Group_1__3 )
			// InternalXtextTest.g:4711:2: rule__Generator__Group_1__2__Impl rule__Generator__Group_1__3
			{
			pushFollow(FOLLOW_27);
			rule__Generator__Group_1__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_1__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__2"



	// $ANTLR start "rule__Generator__Group_1__2__Impl"
	// InternalXtextTest.g:4718:1: rule__Generator__Group_1__2__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__Generator__Group_1__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4722:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:4724:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:4724:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:4725:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_1_2()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_1_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__2__Impl"



	// $ANTLR start "rule__Generator__Group_1__3"
	// InternalXtextTest.g:4738:1: rule__Generator__Group_1__3 : rule__Generator__Group_1__3__Impl ;
	public final void rule__Generator__Group_1__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4742:2: ( rule__Generator__Group_1__3__Impl )
			// InternalXtextTest.g:4743:2: rule__Generator__Group_1__3__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_1__3__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__3"



	// $ANTLR start "rule__Generator__Group_1__3__Impl"
	// InternalXtextTest.g:4749:1: rule__Generator__Group_1__3__Impl : ( ( rule__Generator__OutputAssignment_1_3 ) ) ;
	public final void rule__Generator__Group_1__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4753:1: ( ( ( rule__Generator__OutputAssignment_1_3 ) ) )
			// InternalXtextTest.g:4755:1: ( ( rule__Generator__OutputAssignment_1_3 ) )
			{
			// InternalXtextTest.g:4755:1: ( ( rule__Generator__OutputAssignment_1_3 ) )
			// InternalXtextTest.g:4756:1: ( rule__Generator__OutputAssignment_1_3 )
			{
			 before(grammarAccess.getGeneratorAccess().getOutputAssignment_1_3()); 
			// InternalXtextTest.g:4757:2: ( rule__Generator__OutputAssignment_1_3 )
			// InternalXtextTest.g:4757:2: rule__Generator__OutputAssignment_1_3
			{
			pushFollow(FOLLOW_2);
			rule__Generator__OutputAssignment_1_3();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getOutputAssignment_1_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_1__3__Impl"



	// $ANTLR start "rule__Generator__Group_2__0"
	// InternalXtextTest.g:4777:1: rule__Generator__Group_2__0 : rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 ;
	public final void rule__Generator__Group_2__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4781:2: ( rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1 )
			// InternalXtextTest.g:4782:2: rule__Generator__Group_2__0__Impl rule__Generator__Group_2__1
			{
			pushFollow(FOLLOW_26);
			rule__Generator__Group_2__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_2__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2__0"



	// $ANTLR start "rule__Generator__Group_2__0__Impl"
	// InternalXtextTest.g:4789:1: rule__Generator__Group_2__0__Impl : ( RULE_EXPECTED ) ;
	public final void rule__Generator__Group_2__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4793:1: ( ( RULE_EXPECTED ) )
			// InternalXtextTest.g:4795:1: ( RULE_EXPECTED )
			{
			// InternalXtextTest.g:4795:1: ( RULE_EXPECTED )
			// InternalXtextTest.g:4796:1: RULE_EXPECTED
			{
			 before(grammarAccess.getGeneratorAccess().getEXPECTEDTerminalRuleCall_2_0()); 
			match(input,RULE_EXPECTED,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getEXPECTEDTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2__0__Impl"



	// $ANTLR start "rule__Generator__Group_2__1"
	// InternalXtextTest.g:4809:1: rule__Generator__Group_2__1 : rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 ;
	public final void rule__Generator__Group_2__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4813:2: ( rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2 )
			// InternalXtextTest.g:4814:2: rule__Generator__Group_2__1__Impl rule__Generator__Group_2__2
			{
			pushFollow(FOLLOW_46);
			rule__Generator__Group_2__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_2__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2__1"



	// $ANTLR start "rule__Generator__Group_2__1__Impl"
	// InternalXtextTest.g:4821:1: rule__Generator__Group_2__1__Impl : ( RULE_FILE ) ;
	public final void rule__Generator__Group_2__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4825:1: ( ( RULE_FILE ) )
			// InternalXtextTest.g:4827:1: ( RULE_FILE )
			{
			// InternalXtextTest.g:4827:1: ( RULE_FILE )
			// InternalXtextTest.g:4828:1: RULE_FILE
			{
			 before(grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_2_1()); 
			match(input,RULE_FILE,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_2_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2__1__Impl"



	// $ANTLR start "rule__Generator__Group_2__2"
	// InternalXtextTest.g:4841:1: rule__Generator__Group_2__2 : rule__Generator__Group_2__2__Impl ;
	public final void rule__Generator__Group_2__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4845:2: ( rule__Generator__Group_2__2__Impl )
			// InternalXtextTest.g:4846:2: rule__Generator__Group_2__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_2__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2__2"



	// $ANTLR start "rule__Generator__Group_2__2__Impl"
	// InternalXtextTest.g:4852:1: rule__Generator__Group_2__2__Impl : ( ( rule__Generator__Alternatives_2_2 ) ) ;
	public final void rule__Generator__Group_2__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4856:1: ( ( ( rule__Generator__Alternatives_2_2 ) ) )
			// InternalXtextTest.g:4858:1: ( ( rule__Generator__Alternatives_2_2 ) )
			{
			// InternalXtextTest.g:4858:1: ( ( rule__Generator__Alternatives_2_2 ) )
			// InternalXtextTest.g:4859:1: ( rule__Generator__Alternatives_2_2 )
			{
			 before(grammarAccess.getGeneratorAccess().getAlternatives_2_2()); 
			// InternalXtextTest.g:4860:2: ( rule__Generator__Alternatives_2_2 )
			// InternalXtextTest.g:4860:2: rule__Generator__Alternatives_2_2
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Alternatives_2_2();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getAlternatives_2_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2__2__Impl"



	// $ANTLR start "rule__Generator__Group_2_2_0__0"
	// InternalXtextTest.g:4878:1: rule__Generator__Group_2_2_0__0 : rule__Generator__Group_2_2_0__0__Impl rule__Generator__Group_2_2_0__1 ;
	public final void rule__Generator__Group_2_2_0__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4882:2: ( rule__Generator__Group_2_2_0__0__Impl rule__Generator__Group_2_2_0__1 )
			// InternalXtextTest.g:4883:2: rule__Generator__Group_2_2_0__0__Impl rule__Generator__Group_2_2_0__1
			{
			pushFollow(FOLLOW_27);
			rule__Generator__Group_2_2_0__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_2_2_0__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2_2_0__0"



	// $ANTLR start "rule__Generator__Group_2_2_0__0__Impl"
	// InternalXtextTest.g:4890:1: rule__Generator__Group_2_2_0__0__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__Generator__Group_2_2_0__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4894:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:4896:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:4896:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:4897:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_2_2_0_0()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_2_2_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2_2_0__0__Impl"



	// $ANTLR start "rule__Generator__Group_2_2_0__1"
	// InternalXtextTest.g:4910:1: rule__Generator__Group_2_2_0__1 : rule__Generator__Group_2_2_0__1__Impl ;
	public final void rule__Generator__Group_2_2_0__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4914:2: ( rule__Generator__Group_2_2_0__1__Impl )
			// InternalXtextTest.g:4915:2: rule__Generator__Group_2_2_0__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_2_2_0__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2_2_0__1"



	// $ANTLR start "rule__Generator__Group_2_2_0__1__Impl"
	// InternalXtextTest.g:4921:1: rule__Generator__Group_2_2_0__1__Impl : ( ( rule__Generator__ExpectedAssignment_2_2_0_1 ) ) ;
	public final void rule__Generator__Group_2_2_0__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4925:1: ( ( ( rule__Generator__ExpectedAssignment_2_2_0_1 ) ) )
			// InternalXtextTest.g:4927:1: ( ( rule__Generator__ExpectedAssignment_2_2_0_1 ) )
			{
			// InternalXtextTest.g:4927:1: ( ( rule__Generator__ExpectedAssignment_2_2_0_1 ) )
			// InternalXtextTest.g:4928:1: ( rule__Generator__ExpectedAssignment_2_2_0_1 )
			{
			 before(grammarAccess.getGeneratorAccess().getExpectedAssignment_2_2_0_1()); 
			// InternalXtextTest.g:4929:2: ( rule__Generator__ExpectedAssignment_2_2_0_1 )
			// InternalXtextTest.g:4929:2: rule__Generator__ExpectedAssignment_2_2_0_1
			{
			pushFollow(FOLLOW_2);
			rule__Generator__ExpectedAssignment_2_2_0_1();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getExpectedAssignment_2_2_0_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_2_2_0__1__Impl"



	// $ANTLR start "rule__Generator__Group_3__0"
	// InternalXtextTest.g:4945:1: rule__Generator__Group_3__0 : rule__Generator__Group_3__0__Impl rule__Generator__Group_3__1 ;
	public final void rule__Generator__Group_3__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4949:2: ( rule__Generator__Group_3__0__Impl rule__Generator__Group_3__1 )
			// InternalXtextTest.g:4950:2: rule__Generator__Group_3__0__Impl rule__Generator__Group_3__1
			{
			pushFollow(FOLLOW_47);
			rule__Generator__Group_3__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_3__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3__0"



	// $ANTLR start "rule__Generator__Group_3__0__Impl"
	// InternalXtextTest.g:4957:1: rule__Generator__Group_3__0__Impl : ( RULE_PATTERNS ) ;
	public final void rule__Generator__Group_3__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4961:1: ( ( RULE_PATTERNS ) )
			// InternalXtextTest.g:4963:1: ( RULE_PATTERNS )
			{
			// InternalXtextTest.g:4963:1: ( RULE_PATTERNS )
			// InternalXtextTest.g:4964:1: RULE_PATTERNS
			{
			 before(grammarAccess.getGeneratorAccess().getPATTERNSTerminalRuleCall_3_0()); 
			match(input,RULE_PATTERNS,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getPATTERNSTerminalRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3__0__Impl"



	// $ANTLR start "rule__Generator__Group_3__1"
	// InternalXtextTest.g:4977:1: rule__Generator__Group_3__1 : rule__Generator__Group_3__1__Impl rule__Generator__Group_3__2 ;
	public final void rule__Generator__Group_3__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4981:2: ( rule__Generator__Group_3__1__Impl rule__Generator__Group_3__2 )
			// InternalXtextTest.g:4982:2: rule__Generator__Group_3__1__Impl rule__Generator__Group_3__2
			{
			pushFollow(FOLLOW_27);
			rule__Generator__Group_3__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_3__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3__1"



	// $ANTLR start "rule__Generator__Group_3__1__Impl"
	// InternalXtextTest.g:4989:1: rule__Generator__Group_3__1__Impl : ( ( rule__Generator__Group_3_1__0 )? ) ;
	public final void rule__Generator__Group_3__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:4993:1: ( ( ( rule__Generator__Group_3_1__0 )? ) )
			// InternalXtextTest.g:4995:1: ( ( rule__Generator__Group_3_1__0 )? )
			{
			// InternalXtextTest.g:4995:1: ( ( rule__Generator__Group_3_1__0 )? )
			// InternalXtextTest.g:4996:1: ( rule__Generator__Group_3_1__0 )?
			{
			 before(grammarAccess.getGeneratorAccess().getGroup_3_1()); 
			// InternalXtextTest.g:4997:2: ( rule__Generator__Group_3_1__0 )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==RULE_FILE) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// InternalXtextTest.g:4997:2: rule__Generator__Group_3_1__0
					{
					pushFollow(FOLLOW_2);
					rule__Generator__Group_3_1__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getGeneratorAccess().getGroup_3_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3__1__Impl"



	// $ANTLR start "rule__Generator__Group_3__2"
	// InternalXtextTest.g:5009:1: rule__Generator__Group_3__2 : rule__Generator__Group_3__2__Impl ;
	public final void rule__Generator__Group_3__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5013:2: ( rule__Generator__Group_3__2__Impl )
			// InternalXtextTest.g:5014:2: rule__Generator__Group_3__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_3__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3__2"



	// $ANTLR start "rule__Generator__Group_3__2__Impl"
	// InternalXtextTest.g:5020:1: rule__Generator__Group_3__2__Impl : ( ( rule__Generator__ReplacePatternsAssignment_3_2 )* ) ;
	public final void rule__Generator__Group_3__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5024:1: ( ( ( rule__Generator__ReplacePatternsAssignment_3_2 )* ) )
			// InternalXtextTest.g:5026:1: ( ( rule__Generator__ReplacePatternsAssignment_3_2 )* )
			{
			// InternalXtextTest.g:5026:1: ( ( rule__Generator__ReplacePatternsAssignment_3_2 )* )
			// InternalXtextTest.g:5027:1: ( rule__Generator__ReplacePatternsAssignment_3_2 )*
			{
			 before(grammarAccess.getGeneratorAccess().getReplacePatternsAssignment_3_2()); 
			// InternalXtextTest.g:5028:2: ( rule__Generator__ReplacePatternsAssignment_3_2 )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==RULE_STRING) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// InternalXtextTest.g:5028:2: rule__Generator__ReplacePatternsAssignment_3_2
					{
					pushFollow(FOLLOW_48);
					rule__Generator__ReplacePatternsAssignment_3_2();
					state._fsp--;

					}
					break;

				default :
					break loop31;
				}
			}

			 after(grammarAccess.getGeneratorAccess().getReplacePatternsAssignment_3_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3__2__Impl"



	// $ANTLR start "rule__Generator__Group_3_1__0"
	// InternalXtextTest.g:5046:1: rule__Generator__Group_3_1__0 : rule__Generator__Group_3_1__0__Impl rule__Generator__Group_3_1__1 ;
	public final void rule__Generator__Group_3_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5050:2: ( rule__Generator__Group_3_1__0__Impl rule__Generator__Group_3_1__1 )
			// InternalXtextTest.g:5051:2: rule__Generator__Group_3_1__0__Impl rule__Generator__Group_3_1__1
			{
			pushFollow(FOLLOW_16);
			rule__Generator__Group_3_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_3_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3_1__0"



	// $ANTLR start "rule__Generator__Group_3_1__0__Impl"
	// InternalXtextTest.g:5058:1: rule__Generator__Group_3_1__0__Impl : ( RULE_FILE ) ;
	public final void rule__Generator__Group_3_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5062:1: ( ( RULE_FILE ) )
			// InternalXtextTest.g:5064:1: ( RULE_FILE )
			{
			// InternalXtextTest.g:5064:1: ( RULE_FILE )
			// InternalXtextTest.g:5065:1: RULE_FILE
			{
			 before(grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_3_1_0()); 
			match(input,RULE_FILE,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_3_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3_1__0__Impl"



	// $ANTLR start "rule__Generator__Group_3_1__1"
	// InternalXtextTest.g:5078:1: rule__Generator__Group_3_1__1 : rule__Generator__Group_3_1__1__Impl rule__Generator__Group_3_1__2 ;
	public final void rule__Generator__Group_3_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5082:2: ( rule__Generator__Group_3_1__1__Impl rule__Generator__Group_3_1__2 )
			// InternalXtextTest.g:5083:2: rule__Generator__Group_3_1__1__Impl rule__Generator__Group_3_1__2
			{
			pushFollow(FOLLOW_27);
			rule__Generator__Group_3_1__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_3_1__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3_1__1"



	// $ANTLR start "rule__Generator__Group_3_1__1__Impl"
	// InternalXtextTest.g:5090:1: rule__Generator__Group_3_1__1__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__Generator__Group_3_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5094:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:5096:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:5096:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:5097:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_3_1_1()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_3_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3_1__1__Impl"



	// $ANTLR start "rule__Generator__Group_3_1__2"
	// InternalXtextTest.g:5110:1: rule__Generator__Group_3_1__2 : rule__Generator__Group_3_1__2__Impl ;
	public final void rule__Generator__Group_3_1__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5114:2: ( rule__Generator__Group_3_1__2__Impl )
			// InternalXtextTest.g:5115:2: rule__Generator__Group_3_1__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_3_1__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3_1__2"



	// $ANTLR start "rule__Generator__Group_3_1__2__Impl"
	// InternalXtextTest.g:5121:1: rule__Generator__Group_3_1__2__Impl : ( ( rule__Generator__PatternFileAssignment_3_1_2 ) ) ;
	public final void rule__Generator__Group_3_1__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5125:1: ( ( ( rule__Generator__PatternFileAssignment_3_1_2 ) ) )
			// InternalXtextTest.g:5127:1: ( ( rule__Generator__PatternFileAssignment_3_1_2 ) )
			{
			// InternalXtextTest.g:5127:1: ( ( rule__Generator__PatternFileAssignment_3_1_2 ) )
			// InternalXtextTest.g:5128:1: ( rule__Generator__PatternFileAssignment_3_1_2 )
			{
			 before(grammarAccess.getGeneratorAccess().getPatternFileAssignment_3_1_2()); 
			// InternalXtextTest.g:5129:2: ( rule__Generator__PatternFileAssignment_3_1_2 )
			// InternalXtextTest.g:5129:2: rule__Generator__PatternFileAssignment_3_1_2
			{
			pushFollow(FOLLOW_2);
			rule__Generator__PatternFileAssignment_3_1_2();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getPatternFileAssignment_3_1_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_3_1__2__Impl"



	// $ANTLR start "rule__Generator__Group_4__0"
	// InternalXtextTest.g:5147:1: rule__Generator__Group_4__0 : rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1 ;
	public final void rule__Generator__Group_4__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5151:2: ( rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1 )
			// InternalXtextTest.g:5152:2: rule__Generator__Group_4__0__Impl rule__Generator__Group_4__1
			{
			pushFollow(FOLLOW_49);
			rule__Generator__Group_4__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_4__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_4__0"



	// $ANTLR start "rule__Generator__Group_4__0__Impl"
	// InternalXtextTest.g:5159:1: rule__Generator__Group_4__0__Impl : ( RULE_EXPECTED ) ;
	public final void rule__Generator__Group_4__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5163:1: ( ( RULE_EXPECTED ) )
			// InternalXtextTest.g:5165:1: ( RULE_EXPECTED )
			{
			// InternalXtextTest.g:5165:1: ( RULE_EXPECTED )
			// InternalXtextTest.g:5166:1: RULE_EXPECTED
			{
			 before(grammarAccess.getGeneratorAccess().getEXPECTEDTerminalRuleCall_4_0()); 
			match(input,RULE_EXPECTED,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getEXPECTEDTerminalRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_4__0__Impl"



	// $ANTLR start "rule__Generator__Group_4__1"
	// InternalXtextTest.g:5179:1: rule__Generator__Group_4__1 : rule__Generator__Group_4__1__Impl rule__Generator__Group_4__2 ;
	public final void rule__Generator__Group_4__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5183:2: ( rule__Generator__Group_4__1__Impl rule__Generator__Group_4__2 )
			// InternalXtextTest.g:5184:2: rule__Generator__Group_4__1__Impl rule__Generator__Group_4__2
			{
			pushFollow(FOLLOW_5);
			rule__Generator__Group_4__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Generator__Group_4__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_4__1"



	// $ANTLR start "rule__Generator__Group_4__1__Impl"
	// InternalXtextTest.g:5191:1: rule__Generator__Group_4__1__Impl : ( RULE_EXCEPTIONS ) ;
	public final void rule__Generator__Group_4__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5195:1: ( ( RULE_EXCEPTIONS ) )
			// InternalXtextTest.g:5197:1: ( RULE_EXCEPTIONS )
			{
			// InternalXtextTest.g:5197:1: ( RULE_EXCEPTIONS )
			// InternalXtextTest.g:5198:1: RULE_EXCEPTIONS
			{
			 before(grammarAccess.getGeneratorAccess().getEXCEPTIONSTerminalRuleCall_4_1()); 
			match(input,RULE_EXCEPTIONS,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getEXCEPTIONSTerminalRuleCall_4_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_4__1__Impl"



	// $ANTLR start "rule__Generator__Group_4__2"
	// InternalXtextTest.g:5211:1: rule__Generator__Group_4__2 : rule__Generator__Group_4__2__Impl ;
	public final void rule__Generator__Group_4__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5215:2: ( rule__Generator__Group_4__2__Impl )
			// InternalXtextTest.g:5216:2: rule__Generator__Group_4__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Generator__Group_4__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_4__2"



	// $ANTLR start "rule__Generator__Group_4__2__Impl"
	// InternalXtextTest.g:5222:1: rule__Generator__Group_4__2__Impl : ( ( rule__Generator__ExceptionAssignment_4_2 ) ) ;
	public final void rule__Generator__Group_4__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5226:1: ( ( ( rule__Generator__ExceptionAssignment_4_2 ) ) )
			// InternalXtextTest.g:5228:1: ( ( rule__Generator__ExceptionAssignment_4_2 ) )
			{
			// InternalXtextTest.g:5228:1: ( ( rule__Generator__ExceptionAssignment_4_2 ) )
			// InternalXtextTest.g:5229:1: ( rule__Generator__ExceptionAssignment_4_2 )
			{
			 before(grammarAccess.getGeneratorAccess().getExceptionAssignment_4_2()); 
			// InternalXtextTest.g:5230:2: ( rule__Generator__ExceptionAssignment_4_2 )
			// InternalXtextTest.g:5230:2: rule__Generator__ExceptionAssignment_4_2
			{
			pushFollow(FOLLOW_2);
			rule__Generator__ExceptionAssignment_4_2();
			state._fsp--;

			}

			 after(grammarAccess.getGeneratorAccess().getExceptionAssignment_4_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__Group_4__2__Impl"



	// $ANTLR start "rule__ReplacePatterns__Group__0"
	// InternalXtextTest.g:5248:1: rule__ReplacePatterns__Group__0 : rule__ReplacePatterns__Group__0__Impl rule__ReplacePatterns__Group__1 ;
	public final void rule__ReplacePatterns__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5252:2: ( rule__ReplacePatterns__Group__0__Impl rule__ReplacePatterns__Group__1 )
			// InternalXtextTest.g:5253:2: rule__ReplacePatterns__Group__0__Impl rule__ReplacePatterns__Group__1
			{
			pushFollow(FOLLOW_16);
			rule__ReplacePatterns__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__ReplacePatterns__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__Group__0"



	// $ANTLR start "rule__ReplacePatterns__Group__0__Impl"
	// InternalXtextTest.g:5260:1: rule__ReplacePatterns__Group__0__Impl : ( ( rule__ReplacePatterns__RegexAssignment_0 ) ) ;
	public final void rule__ReplacePatterns__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5264:1: ( ( ( rule__ReplacePatterns__RegexAssignment_0 ) ) )
			// InternalXtextTest.g:5266:1: ( ( rule__ReplacePatterns__RegexAssignment_0 ) )
			{
			// InternalXtextTest.g:5266:1: ( ( rule__ReplacePatterns__RegexAssignment_0 ) )
			// InternalXtextTest.g:5267:1: ( rule__ReplacePatterns__RegexAssignment_0 )
			{
			 before(grammarAccess.getReplacePatternsAccess().getRegexAssignment_0()); 
			// InternalXtextTest.g:5268:2: ( rule__ReplacePatterns__RegexAssignment_0 )
			// InternalXtextTest.g:5268:2: rule__ReplacePatterns__RegexAssignment_0
			{
			pushFollow(FOLLOW_2);
			rule__ReplacePatterns__RegexAssignment_0();
			state._fsp--;

			}

			 after(grammarAccess.getReplacePatternsAccess().getRegexAssignment_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__Group__0__Impl"



	// $ANTLR start "rule__ReplacePatterns__Group__1"
	// InternalXtextTest.g:5280:1: rule__ReplacePatterns__Group__1 : rule__ReplacePatterns__Group__1__Impl rule__ReplacePatterns__Group__2 ;
	public final void rule__ReplacePatterns__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5284:2: ( rule__ReplacePatterns__Group__1__Impl rule__ReplacePatterns__Group__2 )
			// InternalXtextTest.g:5285:2: rule__ReplacePatterns__Group__1__Impl rule__ReplacePatterns__Group__2
			{
			pushFollow(FOLLOW_27);
			rule__ReplacePatterns__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__ReplacePatterns__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__Group__1"



	// $ANTLR start "rule__ReplacePatterns__Group__1__Impl"
	// InternalXtextTest.g:5292:1: rule__ReplacePatterns__Group__1__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__ReplacePatterns__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5296:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:5298:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:5298:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:5299:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getReplacePatternsAccess().getASSIGNASSINGLETerminalRuleCall_1()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getReplacePatternsAccess().getASSIGNASSINGLETerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__Group__1__Impl"



	// $ANTLR start "rule__ReplacePatterns__Group__2"
	// InternalXtextTest.g:5312:1: rule__ReplacePatterns__Group__2 : rule__ReplacePatterns__Group__2__Impl ;
	public final void rule__ReplacePatterns__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5316:2: ( rule__ReplacePatterns__Group__2__Impl )
			// InternalXtextTest.g:5317:2: rule__ReplacePatterns__Group__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__ReplacePatterns__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__Group__2"



	// $ANTLR start "rule__ReplacePatterns__Group__2__Impl"
	// InternalXtextTest.g:5323:1: rule__ReplacePatterns__Group__2__Impl : ( ( rule__ReplacePatterns__ReplaceAssignment_2 ) ) ;
	public final void rule__ReplacePatterns__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5327:1: ( ( ( rule__ReplacePatterns__ReplaceAssignment_2 ) ) )
			// InternalXtextTest.g:5329:1: ( ( rule__ReplacePatterns__ReplaceAssignment_2 ) )
			{
			// InternalXtextTest.g:5329:1: ( ( rule__ReplacePatterns__ReplaceAssignment_2 ) )
			// InternalXtextTest.g:5330:1: ( rule__ReplacePatterns__ReplaceAssignment_2 )
			{
			 before(grammarAccess.getReplacePatternsAccess().getReplaceAssignment_2()); 
			// InternalXtextTest.g:5331:2: ( rule__ReplacePatterns__ReplaceAssignment_2 )
			// InternalXtextTest.g:5331:2: rule__ReplacePatterns__ReplaceAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__ReplacePatterns__ReplaceAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getReplacePatternsAccess().getReplaceAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__Group__2__Impl"



	// $ANTLR start "rule__Before__Group__0"
	// InternalXtextTest.g:5349:1: rule__Before__Group__0 : rule__Before__Group__0__Impl rule__Before__Group__1 ;
	public final void rule__Before__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5353:2: ( rule__Before__Group__0__Impl rule__Before__Group__1 )
			// InternalXtextTest.g:5354:2: rule__Before__Group__0__Impl rule__Before__Group__1
			{
			pushFollow(FOLLOW_50);
			rule__Before__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Before__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Before__Group__0"



	// $ANTLR start "rule__Before__Group__0__Impl"
	// InternalXtextTest.g:5361:1: rule__Before__Group__0__Impl : ( () ) ;
	public final void rule__Before__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5365:1: ( ( () ) )
			// InternalXtextTest.g:5367:1: ( () )
			{
			// InternalXtextTest.g:5367:1: ( () )
			// InternalXtextTest.g:5368:1: ()
			{
			 before(grammarAccess.getBeforeAccess().getBeforeAction_0()); 
			// InternalXtextTest.g:5369:1: ()
			// InternalXtextTest.g:5371:1: 
			{
			}

			 after(grammarAccess.getBeforeAccess().getBeforeAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Before__Group__0__Impl"



	// $ANTLR start "rule__Before__Group__1"
	// InternalXtextTest.g:5383:1: rule__Before__Group__1 : rule__Before__Group__1__Impl rule__Before__Group__2 ;
	public final void rule__Before__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5387:2: ( rule__Before__Group__1__Impl rule__Before__Group__2 )
			// InternalXtextTest.g:5388:2: rule__Before__Group__1__Impl rule__Before__Group__2
			{
			pushFollow(FOLLOW_24);
			rule__Before__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__Before__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Before__Group__1"



	// $ANTLR start "rule__Before__Group__1__Impl"
	// InternalXtextTest.g:5395:1: rule__Before__Group__1__Impl : ( RULE_BEFORE_KW ) ;
	public final void rule__Before__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5399:1: ( ( RULE_BEFORE_KW ) )
			// InternalXtextTest.g:5401:1: ( RULE_BEFORE_KW )
			{
			// InternalXtextTest.g:5401:1: ( RULE_BEFORE_KW )
			// InternalXtextTest.g:5402:1: RULE_BEFORE_KW
			{
			 before(grammarAccess.getBeforeAccess().getBEFORE_KWTerminalRuleCall_1()); 
			match(input,RULE_BEFORE_KW,FOLLOW_2); 
			 after(grammarAccess.getBeforeAccess().getBEFORE_KWTerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Before__Group__1__Impl"



	// $ANTLR start "rule__Before__Group__2"
	// InternalXtextTest.g:5415:1: rule__Before__Group__2 : rule__Before__Group__2__Impl ;
	public final void rule__Before__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5419:2: ( rule__Before__Group__2__Impl )
			// InternalXtextTest.g:5420:2: rule__Before__Group__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__Before__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Before__Group__2"



	// $ANTLR start "rule__Before__Group__2__Impl"
	// InternalXtextTest.g:5426:1: rule__Before__Group__2__Impl : ( ( rule__Before__CodeCallAssignment_2 ) ) ;
	public final void rule__Before__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5430:1: ( ( ( rule__Before__CodeCallAssignment_2 ) ) )
			// InternalXtextTest.g:5432:1: ( ( rule__Before__CodeCallAssignment_2 ) )
			{
			// InternalXtextTest.g:5432:1: ( ( rule__Before__CodeCallAssignment_2 ) )
			// InternalXtextTest.g:5433:1: ( rule__Before__CodeCallAssignment_2 )
			{
			 before(grammarAccess.getBeforeAccess().getCodeCallAssignment_2()); 
			// InternalXtextTest.g:5434:2: ( rule__Before__CodeCallAssignment_2 )
			// InternalXtextTest.g:5434:2: rule__Before__CodeCallAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__Before__CodeCallAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getBeforeAccess().getCodeCallAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Before__Group__2__Impl"



	// $ANTLR start "rule__After__Group__0"
	// InternalXtextTest.g:5452:1: rule__After__Group__0 : rule__After__Group__0__Impl rule__After__Group__1 ;
	public final void rule__After__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5456:2: ( rule__After__Group__0__Impl rule__After__Group__1 )
			// InternalXtextTest.g:5457:2: rule__After__Group__0__Impl rule__After__Group__1
			{
			pushFollow(FOLLOW_15);
			rule__After__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__After__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__After__Group__0"



	// $ANTLR start "rule__After__Group__0__Impl"
	// InternalXtextTest.g:5464:1: rule__After__Group__0__Impl : ( () ) ;
	public final void rule__After__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5468:1: ( ( () ) )
			// InternalXtextTest.g:5470:1: ( () )
			{
			// InternalXtextTest.g:5470:1: ( () )
			// InternalXtextTest.g:5471:1: ()
			{
			 before(grammarAccess.getAfterAccess().getAfterAction_0()); 
			// InternalXtextTest.g:5472:1: ()
			// InternalXtextTest.g:5474:1: 
			{
			}

			 after(grammarAccess.getAfterAccess().getAfterAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__After__Group__0__Impl"



	// $ANTLR start "rule__After__Group__1"
	// InternalXtextTest.g:5486:1: rule__After__Group__1 : rule__After__Group__1__Impl rule__After__Group__2 ;
	public final void rule__After__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5490:2: ( rule__After__Group__1__Impl rule__After__Group__2 )
			// InternalXtextTest.g:5491:2: rule__After__Group__1__Impl rule__After__Group__2
			{
			pushFollow(FOLLOW_24);
			rule__After__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__After__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__After__Group__1"



	// $ANTLR start "rule__After__Group__1__Impl"
	// InternalXtextTest.g:5498:1: rule__After__Group__1__Impl : ( RULE_AFTER_KW ) ;
	public final void rule__After__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5502:1: ( ( RULE_AFTER_KW ) )
			// InternalXtextTest.g:5504:1: ( RULE_AFTER_KW )
			{
			// InternalXtextTest.g:5504:1: ( RULE_AFTER_KW )
			// InternalXtextTest.g:5505:1: RULE_AFTER_KW
			{
			 before(grammarAccess.getAfterAccess().getAFTER_KWTerminalRuleCall_1()); 
			match(input,RULE_AFTER_KW,FOLLOW_2); 
			 after(grammarAccess.getAfterAccess().getAFTER_KWTerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__After__Group__1__Impl"



	// $ANTLR start "rule__After__Group__2"
	// InternalXtextTest.g:5518:1: rule__After__Group__2 : rule__After__Group__2__Impl ;
	public final void rule__After__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5522:2: ( rule__After__Group__2__Impl )
			// InternalXtextTest.g:5523:2: rule__After__Group__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__After__Group__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__After__Group__2"



	// $ANTLR start "rule__After__Group__2__Impl"
	// InternalXtextTest.g:5529:1: rule__After__Group__2__Impl : ( ( rule__After__CodeCallAssignment_2 ) ) ;
	public final void rule__After__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5533:1: ( ( ( rule__After__CodeCallAssignment_2 ) ) )
			// InternalXtextTest.g:5535:1: ( ( rule__After__CodeCallAssignment_2 ) )
			{
			// InternalXtextTest.g:5535:1: ( ( rule__After__CodeCallAssignment_2 ) )
			// InternalXtextTest.g:5536:1: ( rule__After__CodeCallAssignment_2 )
			{
			 before(grammarAccess.getAfterAccess().getCodeCallAssignment_2()); 
			// InternalXtextTest.g:5537:2: ( rule__After__CodeCallAssignment_2 )
			// InternalXtextTest.g:5537:2: rule__After__CodeCallAssignment_2
			{
			pushFollow(FOLLOW_2);
			rule__After__CodeCallAssignment_2();
			state._fsp--;

			}

			 after(grammarAccess.getAfterAccess().getCodeCallAssignment_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__After__Group__2__Impl"



	// $ANTLR start "rule__CodeCall__Group__0"
	// InternalXtextTest.g:5555:1: rule__CodeCall__Group__0 : rule__CodeCall__Group__0__Impl rule__CodeCall__Group__1 ;
	public final void rule__CodeCall__Group__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5559:2: ( rule__CodeCall__Group__0__Impl rule__CodeCall__Group__1 )
			// InternalXtextTest.g:5560:2: rule__CodeCall__Group__0__Impl rule__CodeCall__Group__1
			{
			pushFollow(FOLLOW_24);
			rule__CodeCall__Group__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__0"



	// $ANTLR start "rule__CodeCall__Group__0__Impl"
	// InternalXtextTest.g:5567:1: rule__CodeCall__Group__0__Impl : ( () ) ;
	public final void rule__CodeCall__Group__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5571:1: ( ( () ) )
			// InternalXtextTest.g:5573:1: ( () )
			{
			// InternalXtextTest.g:5573:1: ( () )
			// InternalXtextTest.g:5574:1: ()
			{
			 before(grammarAccess.getCodeCallAccess().getCodeCallAction_0()); 
			// InternalXtextTest.g:5575:1: ()
			// InternalXtextTest.g:5577:1: 
			{
			}

			 after(grammarAccess.getCodeCallAccess().getCodeCallAction_0()); 
			}

			}

		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__0__Impl"



	// $ANTLR start "rule__CodeCall__Group__1"
	// InternalXtextTest.g:5589:1: rule__CodeCall__Group__1 : rule__CodeCall__Group__1__Impl rule__CodeCall__Group__2 ;
	public final void rule__CodeCall__Group__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5593:2: ( rule__CodeCall__Group__1__Impl rule__CodeCall__Group__2 )
			// InternalXtextTest.g:5594:2: rule__CodeCall__Group__1__Impl rule__CodeCall__Group__2
			{
			pushFollow(FOLLOW_16);
			rule__CodeCall__Group__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__1"



	// $ANTLR start "rule__CodeCall__Group__1__Impl"
	// InternalXtextTest.g:5601:1: rule__CodeCall__Group__1__Impl : ( RULE_CLASS_KW ) ;
	public final void rule__CodeCall__Group__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5605:1: ( ( RULE_CLASS_KW ) )
			// InternalXtextTest.g:5607:1: ( RULE_CLASS_KW )
			{
			// InternalXtextTest.g:5607:1: ( RULE_CLASS_KW )
			// InternalXtextTest.g:5608:1: RULE_CLASS_KW
			{
			 before(grammarAccess.getCodeCallAccess().getCLASS_KWTerminalRuleCall_1()); 
			match(input,RULE_CLASS_KW,FOLLOW_2); 
			 after(grammarAccess.getCodeCallAccess().getCLASS_KWTerminalRuleCall_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__1__Impl"



	// $ANTLR start "rule__CodeCall__Group__2"
	// InternalXtextTest.g:5621:1: rule__CodeCall__Group__2 : rule__CodeCall__Group__2__Impl rule__CodeCall__Group__3 ;
	public final void rule__CodeCall__Group__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5625:2: ( rule__CodeCall__Group__2__Impl rule__CodeCall__Group__3 )
			// InternalXtextTest.g:5626:2: rule__CodeCall__Group__2__Impl rule__CodeCall__Group__3
			{
			pushFollow(FOLLOW_5);
			rule__CodeCall__Group__2__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__3();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__2"



	// $ANTLR start "rule__CodeCall__Group__2__Impl"
	// InternalXtextTest.g:5633:1: rule__CodeCall__Group__2__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__CodeCall__Group__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5637:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:5639:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:5639:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:5640:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getCodeCallAccess().getASSIGNASSINGLETerminalRuleCall_2()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getCodeCallAccess().getASSIGNASSINGLETerminalRuleCall_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__2__Impl"



	// $ANTLR start "rule__CodeCall__Group__3"
	// InternalXtextTest.g:5653:1: rule__CodeCall__Group__3 : rule__CodeCall__Group__3__Impl rule__CodeCall__Group__4 ;
	public final void rule__CodeCall__Group__3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5657:2: ( rule__CodeCall__Group__3__Impl rule__CodeCall__Group__4 )
			// InternalXtextTest.g:5658:2: rule__CodeCall__Group__3__Impl rule__CodeCall__Group__4
			{
			pushFollow(FOLLOW_51);
			rule__CodeCall__Group__3__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__4();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__3"



	// $ANTLR start "rule__CodeCall__Group__3__Impl"
	// InternalXtextTest.g:5665:1: rule__CodeCall__Group__3__Impl : ( ( rule__CodeCall__MyclassAssignment_3 ) ) ;
	public final void rule__CodeCall__Group__3__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5669:1: ( ( ( rule__CodeCall__MyclassAssignment_3 ) ) )
			// InternalXtextTest.g:5671:1: ( ( rule__CodeCall__MyclassAssignment_3 ) )
			{
			// InternalXtextTest.g:5671:1: ( ( rule__CodeCall__MyclassAssignment_3 ) )
			// InternalXtextTest.g:5672:1: ( rule__CodeCall__MyclassAssignment_3 )
			{
			 before(grammarAccess.getCodeCallAccess().getMyclassAssignment_3()); 
			// InternalXtextTest.g:5673:2: ( rule__CodeCall__MyclassAssignment_3 )
			// InternalXtextTest.g:5673:2: rule__CodeCall__MyclassAssignment_3
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__MyclassAssignment_3();
			state._fsp--;

			}

			 after(grammarAccess.getCodeCallAccess().getMyclassAssignment_3()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__3__Impl"



	// $ANTLR start "rule__CodeCall__Group__4"
	// InternalXtextTest.g:5685:1: rule__CodeCall__Group__4 : rule__CodeCall__Group__4__Impl rule__CodeCall__Group__5 ;
	public final void rule__CodeCall__Group__4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5689:2: ( rule__CodeCall__Group__4__Impl rule__CodeCall__Group__5 )
			// InternalXtextTest.g:5690:2: rule__CodeCall__Group__4__Impl rule__CodeCall__Group__5
			{
			pushFollow(FOLLOW_16);
			rule__CodeCall__Group__4__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__5();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__4"



	// $ANTLR start "rule__CodeCall__Group__4__Impl"
	// InternalXtextTest.g:5697:1: rule__CodeCall__Group__4__Impl : ( RULE_METHOD_KW ) ;
	public final void rule__CodeCall__Group__4__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5701:1: ( ( RULE_METHOD_KW ) )
			// InternalXtextTest.g:5703:1: ( RULE_METHOD_KW )
			{
			// InternalXtextTest.g:5703:1: ( RULE_METHOD_KW )
			// InternalXtextTest.g:5704:1: RULE_METHOD_KW
			{
			 before(grammarAccess.getCodeCallAccess().getMETHOD_KWTerminalRuleCall_4()); 
			match(input,RULE_METHOD_KW,FOLLOW_2); 
			 after(grammarAccess.getCodeCallAccess().getMETHOD_KWTerminalRuleCall_4()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__4__Impl"



	// $ANTLR start "rule__CodeCall__Group__5"
	// InternalXtextTest.g:5717:1: rule__CodeCall__Group__5 : rule__CodeCall__Group__5__Impl rule__CodeCall__Group__6 ;
	public final void rule__CodeCall__Group__5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5721:2: ( rule__CodeCall__Group__5__Impl rule__CodeCall__Group__6 )
			// InternalXtextTest.g:5722:2: rule__CodeCall__Group__5__Impl rule__CodeCall__Group__6
			{
			pushFollow(FOLLOW_5);
			rule__CodeCall__Group__5__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__5"



	// $ANTLR start "rule__CodeCall__Group__5__Impl"
	// InternalXtextTest.g:5729:1: rule__CodeCall__Group__5__Impl : ( RULE_ASSIGNASSINGLE ) ;
	public final void rule__CodeCall__Group__5__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5733:1: ( ( RULE_ASSIGNASSINGLE ) )
			// InternalXtextTest.g:5735:1: ( RULE_ASSIGNASSINGLE )
			{
			// InternalXtextTest.g:5735:1: ( RULE_ASSIGNASSINGLE )
			// InternalXtextTest.g:5736:1: RULE_ASSIGNASSINGLE
			{
			 before(grammarAccess.getCodeCallAccess().getASSIGNASSINGLETerminalRuleCall_5()); 
			match(input,RULE_ASSIGNASSINGLE,FOLLOW_2); 
			 after(grammarAccess.getCodeCallAccess().getASSIGNASSINGLETerminalRuleCall_5()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__5__Impl"



	// $ANTLR start "rule__CodeCall__Group__6"
	// InternalXtextTest.g:5749:1: rule__CodeCall__Group__6 : rule__CodeCall__Group__6__Impl rule__CodeCall__Group__7 ;
	public final void rule__CodeCall__Group__6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5753:2: ( rule__CodeCall__Group__6__Impl rule__CodeCall__Group__7 )
			// InternalXtextTest.g:5754:2: rule__CodeCall__Group__6__Impl rule__CodeCall__Group__7
			{
			pushFollow(FOLLOW_12);
			rule__CodeCall__Group__6__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__7();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__6"



	// $ANTLR start "rule__CodeCall__Group__6__Impl"
	// InternalXtextTest.g:5761:1: rule__CodeCall__Group__6__Impl : ( ( rule__CodeCall__MethodAssignment_6 ) ) ;
	public final void rule__CodeCall__Group__6__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5765:1: ( ( ( rule__CodeCall__MethodAssignment_6 ) ) )
			// InternalXtextTest.g:5767:1: ( ( rule__CodeCall__MethodAssignment_6 ) )
			{
			// InternalXtextTest.g:5767:1: ( ( rule__CodeCall__MethodAssignment_6 ) )
			// InternalXtextTest.g:5768:1: ( rule__CodeCall__MethodAssignment_6 )
			{
			 before(grammarAccess.getCodeCallAccess().getMethodAssignment_6()); 
			// InternalXtextTest.g:5769:2: ( rule__CodeCall__MethodAssignment_6 )
			// InternalXtextTest.g:5769:2: rule__CodeCall__MethodAssignment_6
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__MethodAssignment_6();
			state._fsp--;

			}

			 after(grammarAccess.getCodeCallAccess().getMethodAssignment_6()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__6__Impl"



	// $ANTLR start "rule__CodeCall__Group__7"
	// InternalXtextTest.g:5781:1: rule__CodeCall__Group__7 : rule__CodeCall__Group__7__Impl ;
	public final void rule__CodeCall__Group__7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5785:2: ( rule__CodeCall__Group__7__Impl )
			// InternalXtextTest.g:5786:2: rule__CodeCall__Group__7__Impl
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__Group__7__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__7"



	// $ANTLR start "rule__CodeCall__Group__7__Impl"
	// InternalXtextTest.g:5792:1: rule__CodeCall__Group__7__Impl : ( ( rule__CodeCall__Group_7__0 ) ) ;
	public final void rule__CodeCall__Group__7__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5796:1: ( ( ( rule__CodeCall__Group_7__0 ) ) )
			// InternalXtextTest.g:5798:1: ( ( rule__CodeCall__Group_7__0 ) )
			{
			// InternalXtextTest.g:5798:1: ( ( rule__CodeCall__Group_7__0 ) )
			// InternalXtextTest.g:5799:1: ( rule__CodeCall__Group_7__0 )
			{
			 before(grammarAccess.getCodeCallAccess().getGroup_7()); 
			// InternalXtextTest.g:5800:2: ( rule__CodeCall__Group_7__0 )
			// InternalXtextTest.g:5800:2: rule__CodeCall__Group_7__0
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7__0();
			state._fsp--;

			}

			 after(grammarAccess.getCodeCallAccess().getGroup_7()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group__7__Impl"



	// $ANTLR start "rule__CodeCall__Group_7__0"
	// InternalXtextTest.g:5828:1: rule__CodeCall__Group_7__0 : rule__CodeCall__Group_7__0__Impl rule__CodeCall__Group_7__1 ;
	public final void rule__CodeCall__Group_7__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5832:2: ( rule__CodeCall__Group_7__0__Impl rule__CodeCall__Group_7__1 )
			// InternalXtextTest.g:5833:2: rule__CodeCall__Group_7__0__Impl rule__CodeCall__Group_7__1
			{
			pushFollow(FOLLOW_37);
			rule__CodeCall__Group_7__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7__0"



	// $ANTLR start "rule__CodeCall__Group_7__0__Impl"
	// InternalXtextTest.g:5840:1: rule__CodeCall__Group_7__0__Impl : ( RULE_LEFTPAREN ) ;
	public final void rule__CodeCall__Group_7__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5844:1: ( ( RULE_LEFTPAREN ) )
			// InternalXtextTest.g:5846:1: ( RULE_LEFTPAREN )
			{
			// InternalXtextTest.g:5846:1: ( RULE_LEFTPAREN )
			// InternalXtextTest.g:5847:1: RULE_LEFTPAREN
			{
			 before(grammarAccess.getCodeCallAccess().getLEFTPARENTerminalRuleCall_7_0()); 
			match(input,RULE_LEFTPAREN,FOLLOW_2); 
			 after(grammarAccess.getCodeCallAccess().getLEFTPARENTerminalRuleCall_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7__0__Impl"



	// $ANTLR start "rule__CodeCall__Group_7__1"
	// InternalXtextTest.g:5860:1: rule__CodeCall__Group_7__1 : rule__CodeCall__Group_7__1__Impl rule__CodeCall__Group_7__2 ;
	public final void rule__CodeCall__Group_7__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5864:2: ( rule__CodeCall__Group_7__1__Impl rule__CodeCall__Group_7__2 )
			// InternalXtextTest.g:5865:2: rule__CodeCall__Group_7__1__Impl rule__CodeCall__Group_7__2
			{
			pushFollow(FOLLOW_38);
			rule__CodeCall__Group_7__1__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7__2();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7__1"



	// $ANTLR start "rule__CodeCall__Group_7__1__Impl"
	// InternalXtextTest.g:5872:1: rule__CodeCall__Group_7__1__Impl : ( ( rule__CodeCall__Group_7_1__0 )? ) ;
	public final void rule__CodeCall__Group_7__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5876:1: ( ( ( rule__CodeCall__Group_7_1__0 )? ) )
			// InternalXtextTest.g:5878:1: ( ( rule__CodeCall__Group_7_1__0 )? )
			{
			// InternalXtextTest.g:5878:1: ( ( rule__CodeCall__Group_7_1__0 )? )
			// InternalXtextTest.g:5879:1: ( rule__CodeCall__Group_7_1__0 )?
			{
			 before(grammarAccess.getCodeCallAccess().getGroup_7_1()); 
			// InternalXtextTest.g:5880:2: ( rule__CodeCall__Group_7_1__0 )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==RULE_IDENTIFIER) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// InternalXtextTest.g:5880:2: rule__CodeCall__Group_7_1__0
					{
					pushFollow(FOLLOW_2);
					rule__CodeCall__Group_7_1__0();
					state._fsp--;

					}
					break;

			}

			 after(grammarAccess.getCodeCallAccess().getGroup_7_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7__1__Impl"



	// $ANTLR start "rule__CodeCall__Group_7__2"
	// InternalXtextTest.g:5892:1: rule__CodeCall__Group_7__2 : rule__CodeCall__Group_7__2__Impl ;
	public final void rule__CodeCall__Group_7__2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5896:2: ( rule__CodeCall__Group_7__2__Impl )
			// InternalXtextTest.g:5897:2: rule__CodeCall__Group_7__2__Impl
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7__2__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7__2"



	// $ANTLR start "rule__CodeCall__Group_7__2__Impl"
	// InternalXtextTest.g:5903:1: rule__CodeCall__Group_7__2__Impl : ( RULE_RIGHTPAREN ) ;
	public final void rule__CodeCall__Group_7__2__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5907:1: ( ( RULE_RIGHTPAREN ) )
			// InternalXtextTest.g:5909:1: ( RULE_RIGHTPAREN )
			{
			// InternalXtextTest.g:5909:1: ( RULE_RIGHTPAREN )
			// InternalXtextTest.g:5910:1: RULE_RIGHTPAREN
			{
			 before(grammarAccess.getCodeCallAccess().getRIGHTPARENTerminalRuleCall_7_2()); 
			match(input,RULE_RIGHTPAREN,FOLLOW_2); 
			 after(grammarAccess.getCodeCallAccess().getRIGHTPARENTerminalRuleCall_7_2()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7__2__Impl"



	// $ANTLR start "rule__CodeCall__Group_7_1__0"
	// InternalXtextTest.g:5929:1: rule__CodeCall__Group_7_1__0 : rule__CodeCall__Group_7_1__0__Impl rule__CodeCall__Group_7_1__1 ;
	public final void rule__CodeCall__Group_7_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5933:2: ( rule__CodeCall__Group_7_1__0__Impl rule__CodeCall__Group_7_1__1 )
			// InternalXtextTest.g:5934:2: rule__CodeCall__Group_7_1__0__Impl rule__CodeCall__Group_7_1__1
			{
			pushFollow(FOLLOW_40);
			rule__CodeCall__Group_7_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1__0"



	// $ANTLR start "rule__CodeCall__Group_7_1__0__Impl"
	// InternalXtextTest.g:5941:1: rule__CodeCall__Group_7_1__0__Impl : ( ( rule__CodeCall__ParamsAssignment_7_1_0 ) ) ;
	public final void rule__CodeCall__Group_7_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5945:1: ( ( ( rule__CodeCall__ParamsAssignment_7_1_0 ) ) )
			// InternalXtextTest.g:5947:1: ( ( rule__CodeCall__ParamsAssignment_7_1_0 ) )
			{
			// InternalXtextTest.g:5947:1: ( ( rule__CodeCall__ParamsAssignment_7_1_0 ) )
			// InternalXtextTest.g:5948:1: ( rule__CodeCall__ParamsAssignment_7_1_0 )
			{
			 before(grammarAccess.getCodeCallAccess().getParamsAssignment_7_1_0()); 
			// InternalXtextTest.g:5949:2: ( rule__CodeCall__ParamsAssignment_7_1_0 )
			// InternalXtextTest.g:5949:2: rule__CodeCall__ParamsAssignment_7_1_0
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__ParamsAssignment_7_1_0();
			state._fsp--;

			}

			 after(grammarAccess.getCodeCallAccess().getParamsAssignment_7_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1__0__Impl"



	// $ANTLR start "rule__CodeCall__Group_7_1__1"
	// InternalXtextTest.g:5961:1: rule__CodeCall__Group_7_1__1 : rule__CodeCall__Group_7_1__1__Impl ;
	public final void rule__CodeCall__Group_7_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5965:2: ( rule__CodeCall__Group_7_1__1__Impl )
			// InternalXtextTest.g:5966:2: rule__CodeCall__Group_7_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1__1"



	// $ANTLR start "rule__CodeCall__Group_7_1__1__Impl"
	// InternalXtextTest.g:5972:1: rule__CodeCall__Group_7_1__1__Impl : ( ( rule__CodeCall__Group_7_1_1__0 )* ) ;
	public final void rule__CodeCall__Group_7_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:5976:1: ( ( ( rule__CodeCall__Group_7_1_1__0 )* ) )
			// InternalXtextTest.g:5978:1: ( ( rule__CodeCall__Group_7_1_1__0 )* )
			{
			// InternalXtextTest.g:5978:1: ( ( rule__CodeCall__Group_7_1_1__0 )* )
			// InternalXtextTest.g:5979:1: ( rule__CodeCall__Group_7_1_1__0 )*
			{
			 before(grammarAccess.getCodeCallAccess().getGroup_7_1_1()); 
			// InternalXtextTest.g:5980:2: ( rule__CodeCall__Group_7_1_1__0 )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==RULE_COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// InternalXtextTest.g:5980:2: rule__CodeCall__Group_7_1_1__0
					{
					pushFollow(FOLLOW_41);
					rule__CodeCall__Group_7_1_1__0();
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			 after(grammarAccess.getCodeCallAccess().getGroup_7_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1__1__Impl"



	// $ANTLR start "rule__CodeCall__Group_7_1_1__0"
	// InternalXtextTest.g:5996:1: rule__CodeCall__Group_7_1_1__0 : rule__CodeCall__Group_7_1_1__0__Impl rule__CodeCall__Group_7_1_1__1 ;
	public final void rule__CodeCall__Group_7_1_1__0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6000:2: ( rule__CodeCall__Group_7_1_1__0__Impl rule__CodeCall__Group_7_1_1__1 )
			// InternalXtextTest.g:6001:2: rule__CodeCall__Group_7_1_1__0__Impl rule__CodeCall__Group_7_1_1__1
			{
			pushFollow(FOLLOW_5);
			rule__CodeCall__Group_7_1_1__0__Impl();
			state._fsp--;

			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7_1_1__1();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1_1__0"



	// $ANTLR start "rule__CodeCall__Group_7_1_1__0__Impl"
	// InternalXtextTest.g:6008:1: rule__CodeCall__Group_7_1_1__0__Impl : ( RULE_COMMA ) ;
	public final void rule__CodeCall__Group_7_1_1__0__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6012:1: ( ( RULE_COMMA ) )
			// InternalXtextTest.g:6014:1: ( RULE_COMMA )
			{
			// InternalXtextTest.g:6014:1: ( RULE_COMMA )
			// InternalXtextTest.g:6015:1: RULE_COMMA
			{
			 before(grammarAccess.getCodeCallAccess().getCOMMATerminalRuleCall_7_1_1_0()); 
			match(input,RULE_COMMA,FOLLOW_2); 
			 after(grammarAccess.getCodeCallAccess().getCOMMATerminalRuleCall_7_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1_1__0__Impl"



	// $ANTLR start "rule__CodeCall__Group_7_1_1__1"
	// InternalXtextTest.g:6028:1: rule__CodeCall__Group_7_1_1__1 : rule__CodeCall__Group_7_1_1__1__Impl ;
	public final void rule__CodeCall__Group_7_1_1__1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6032:2: ( rule__CodeCall__Group_7_1_1__1__Impl )
			// InternalXtextTest.g:6033:2: rule__CodeCall__Group_7_1_1__1__Impl
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__Group_7_1_1__1__Impl();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1_1__1"



	// $ANTLR start "rule__CodeCall__Group_7_1_1__1__Impl"
	// InternalXtextTest.g:6039:1: rule__CodeCall__Group_7_1_1__1__Impl : ( ( rule__CodeCall__ParamsAssignment_7_1_1_1 ) ) ;
	public final void rule__CodeCall__Group_7_1_1__1__Impl() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6043:1: ( ( ( rule__CodeCall__ParamsAssignment_7_1_1_1 ) ) )
			// InternalXtextTest.g:6045:1: ( ( rule__CodeCall__ParamsAssignment_7_1_1_1 ) )
			{
			// InternalXtextTest.g:6045:1: ( ( rule__CodeCall__ParamsAssignment_7_1_1_1 ) )
			// InternalXtextTest.g:6046:1: ( rule__CodeCall__ParamsAssignment_7_1_1_1 )
			{
			 before(grammarAccess.getCodeCallAccess().getParamsAssignment_7_1_1_1()); 
			// InternalXtextTest.g:6047:2: ( rule__CodeCall__ParamsAssignment_7_1_1_1 )
			// InternalXtextTest.g:6047:2: rule__CodeCall__ParamsAssignment_7_1_1_1
			{
			pushFollow(FOLLOW_2);
			rule__CodeCall__ParamsAssignment_7_1_1_1();
			state._fsp--;

			}

			 after(grammarAccess.getCodeCallAccess().getParamsAssignment_7_1_1_1()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__Group_7_1_1__1__Impl"



	// $ANTLR start "rule__Model__XtextTestAssignment_1_0"
	// InternalXtextTest.g:6064:1: rule__Model__XtextTestAssignment_1_0 : ( ruleXtextTest ) ;
	public final void rule__Model__XtextTestAssignment_1_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6068:1: ( ( ruleXtextTest ) )
			// InternalXtextTest.g:6069:1: ( ruleXtextTest )
			{
			// InternalXtextTest.g:6069:1: ( ruleXtextTest )
			// InternalXtextTest.g:6070:1: ruleXtextTest
			{
			 before(grammarAccess.getModelAccess().getXtextTestXtextTestParserRuleCall_1_0_0()); 
			pushFollow(FOLLOW_2);
			ruleXtextTest();
			state._fsp--;

			 after(grammarAccess.getModelAccess().getXtextTestXtextTestParserRuleCall_1_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Model__XtextTestAssignment_1_0"



	// $ANTLR start "rule__Model__EmfTestAssignment_1_1"
	// InternalXtextTest.g:6079:1: rule__Model__EmfTestAssignment_1_1 : ( ruleEmfTest ) ;
	public final void rule__Model__EmfTestAssignment_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6083:1: ( ( ruleEmfTest ) )
			// InternalXtextTest.g:6084:1: ( ruleEmfTest )
			{
			// InternalXtextTest.g:6084:1: ( ruleEmfTest )
			// InternalXtextTest.g:6085:1: ruleEmfTest
			{
			 before(grammarAccess.getModelAccess().getEmfTestEmfTestParserRuleCall_1_1_0()); 
			pushFollow(FOLLOW_2);
			ruleEmfTest();
			state._fsp--;

			 after(grammarAccess.getModelAccess().getEmfTestEmfTestParserRuleCall_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Model__EmfTestAssignment_1_1"



	// $ANTLR start "rule__XtextTest__PackageAssignment_2"
	// InternalXtextTest.g:6094:1: rule__XtextTest__PackageAssignment_2 : ( rulePackageID ) ;
	public final void rule__XtextTest__PackageAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6098:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6099:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6099:1: ( rulePackageID )
			// InternalXtextTest.g:6100:1: rulePackageID
			{
			 before(grammarAccess.getXtextTestAccess().getPackagePackageIDParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getPackagePackageIDParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__PackageAssignment_2"



	// $ANTLR start "rule__XtextTest__LangAssignment_4"
	// InternalXtextTest.g:6109:1: rule__XtextTest__LangAssignment_4 : ( ruleLangID ) ;
	public final void rule__XtextTest__LangAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6113:1: ( ( ruleLangID ) )
			// InternalXtextTest.g:6114:1: ( ruleLangID )
			{
			// InternalXtextTest.g:6114:1: ( ruleLangID )
			// InternalXtextTest.g:6115:1: ruleLangID
			{
			 before(grammarAccess.getXtextTestAccess().getLangLangIDParserRuleCall_4_0()); 
			pushFollow(FOLLOW_2);
			ruleLangID();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getLangLangIDParserRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__LangAssignment_4"



	// $ANTLR start "rule__XtextTest__ImportsAssignment_5_1"
	// InternalXtextTest.g:6124:1: rule__XtextTest__ImportsAssignment_5_1 : ( ruleImportID ) ;
	public final void rule__XtextTest__ImportsAssignment_5_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6128:1: ( ( ruleImportID ) )
			// InternalXtextTest.g:6129:1: ( ruleImportID )
			{
			// InternalXtextTest.g:6129:1: ( ruleImportID )
			// InternalXtextTest.g:6130:1: ruleImportID
			{
			 before(grammarAccess.getXtextTestAccess().getImportsImportIDParserRuleCall_5_1_0()); 
			pushFollow(FOLLOW_2);
			ruleImportID();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getImportsImportIDParserRuleCall_5_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__ImportsAssignment_5_1"



	// $ANTLR start "rule__XtextTest__BooleanAssignment_6_2"
	// InternalXtextTest.g:6139:1: rule__XtextTest__BooleanAssignment_6_2 : ( ruleBoolean ) ;
	public final void rule__XtextTest__BooleanAssignment_6_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6143:1: ( ( ruleBoolean ) )
			// InternalXtextTest.g:6144:1: ( ruleBoolean )
			{
			// InternalXtextTest.g:6144:1: ( ruleBoolean )
			// InternalXtextTest.g:6145:1: ruleBoolean
			{
			 before(grammarAccess.getXtextTestAccess().getBooleanBooleanParserRuleCall_6_2_0()); 
			pushFollow(FOLLOW_2);
			ruleBoolean();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getBooleanBooleanParserRuleCall_6_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__BooleanAssignment_6_2"



	// $ANTLR start "rule__XtextTest__InputAssignment_7"
	// InternalXtextTest.g:6154:1: rule__XtextTest__InputAssignment_7 : ( ruleInput ) ;
	public final void rule__XtextTest__InputAssignment_7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6158:1: ( ( ruleInput ) )
			// InternalXtextTest.g:6159:1: ( ruleInput )
			{
			// InternalXtextTest.g:6159:1: ( ruleInput )
			// InternalXtextTest.g:6160:1: ruleInput
			{
			 before(grammarAccess.getXtextTestAccess().getInputInputParserRuleCall_7_0()); 
			pushFollow(FOLLOW_2);
			ruleInput();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getInputInputParserRuleCall_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__InputAssignment_7"



	// $ANTLR start "rule__XtextTest__TimeOutAssignment_8_2"
	// InternalXtextTest.g:6169:1: rule__XtextTest__TimeOutAssignment_8_2 : ( RULE_INT ) ;
	public final void rule__XtextTest__TimeOutAssignment_8_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6173:1: ( ( RULE_INT ) )
			// InternalXtextTest.g:6174:1: ( RULE_INT )
			{
			// InternalXtextTest.g:6174:1: ( RULE_INT )
			// InternalXtextTest.g:6175:1: RULE_INT
			{
			 before(grammarAccess.getXtextTestAccess().getTimeOutINTTerminalRuleCall_8_2_0()); 
			match(input,RULE_INT,FOLLOW_2); 
			 after(grammarAccess.getXtextTestAccess().getTimeOutINTTerminalRuleCall_8_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__TimeOutAssignment_8_2"



	// $ANTLR start "rule__XtextTest__TokensAssignment_9"
	// InternalXtextTest.g:6184:1: rule__XtextTest__TokensAssignment_9 : ( ruleTokens ) ;
	public final void rule__XtextTest__TokensAssignment_9() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6188:1: ( ( ruleTokens ) )
			// InternalXtextTest.g:6189:1: ( ruleTokens )
			{
			// InternalXtextTest.g:6189:1: ( ruleTokens )
			// InternalXtextTest.g:6190:1: ruleTokens
			{
			 before(grammarAccess.getXtextTestAccess().getTokensTokensParserRuleCall_9_0()); 
			pushFollow(FOLLOW_2);
			ruleTokens();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getTokensTokensParserRuleCall_9_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__TokensAssignment_9"



	// $ANTLR start "rule__XtextTest__RootAssignment_10"
	// InternalXtextTest.g:6199:1: rule__XtextTest__RootAssignment_10 : ( ruleElement ) ;
	public final void rule__XtextTest__RootAssignment_10() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6203:1: ( ( ruleElement ) )
			// InternalXtextTest.g:6204:1: ( ruleElement )
			{
			// InternalXtextTest.g:6204:1: ( ruleElement )
			// InternalXtextTest.g:6205:1: ruleElement
			{
			 before(grammarAccess.getXtextTestAccess().getRootElementParserRuleCall_10_0()); 
			pushFollow(FOLLOW_2);
			ruleElement();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getRootElementParserRuleCall_10_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__RootAssignment_10"



	// $ANTLR start "rule__XtextTest__OutputAssignment_11"
	// InternalXtextTest.g:6214:1: rule__XtextTest__OutputAssignment_11 : ( ruleGenerator ) ;
	public final void rule__XtextTest__OutputAssignment_11() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6218:1: ( ( ruleGenerator ) )
			// InternalXtextTest.g:6219:1: ( ruleGenerator )
			{
			// InternalXtextTest.g:6219:1: ( ruleGenerator )
			// InternalXtextTest.g:6220:1: ruleGenerator
			{
			 before(grammarAccess.getXtextTestAccess().getOutputGeneratorParserRuleCall_11_0()); 
			pushFollow(FOLLOW_2);
			ruleGenerator();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getOutputGeneratorParserRuleCall_11_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__OutputAssignment_11"



	// $ANTLR start "rule__XtextTest__BeforeAssignment_12"
	// InternalXtextTest.g:6229:1: rule__XtextTest__BeforeAssignment_12 : ( ruleBefore ) ;
	public final void rule__XtextTest__BeforeAssignment_12() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6233:1: ( ( ruleBefore ) )
			// InternalXtextTest.g:6234:1: ( ruleBefore )
			{
			// InternalXtextTest.g:6234:1: ( ruleBefore )
			// InternalXtextTest.g:6235:1: ruleBefore
			{
			 before(grammarAccess.getXtextTestAccess().getBeforeBeforeParserRuleCall_12_0()); 
			pushFollow(FOLLOW_2);
			ruleBefore();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getBeforeBeforeParserRuleCall_12_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__BeforeAssignment_12"



	// $ANTLR start "rule__XtextTest__AfterAssignment_13"
	// InternalXtextTest.g:6244:1: rule__XtextTest__AfterAssignment_13 : ( ruleAfter ) ;
	public final void rule__XtextTest__AfterAssignment_13() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6248:1: ( ( ruleAfter ) )
			// InternalXtextTest.g:6249:1: ( ruleAfter )
			{
			// InternalXtextTest.g:6249:1: ( ruleAfter )
			// InternalXtextTest.g:6250:1: ruleAfter
			{
			 before(grammarAccess.getXtextTestAccess().getAfterAfterParserRuleCall_13_0()); 
			pushFollow(FOLLOW_2);
			ruleAfter();
			state._fsp--;

			 after(grammarAccess.getXtextTestAccess().getAfterAfterParserRuleCall_13_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__XtextTest__AfterAssignment_13"



	// $ANTLR start "rule__EmfTest__PackageAssignment_3"
	// InternalXtextTest.g:6259:1: rule__EmfTest__PackageAssignment_3 : ( rulePackageID ) ;
	public final void rule__EmfTest__PackageAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6263:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6264:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6264:1: ( rulePackageID )
			// InternalXtextTest.g:6265:1: rulePackageID
			{
			 before(grammarAccess.getEmfTestAccess().getPackagePackageIDParserRuleCall_3_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getPackagePackageIDParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__PackageAssignment_3"



	// $ANTLR start "rule__EmfTest__MydefaultAssignment_5"
	// InternalXtextTest.g:6274:1: rule__EmfTest__MydefaultAssignment_5 : ( rulePackageID ) ;
	public final void rule__EmfTest__MydefaultAssignment_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6278:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6279:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6279:1: ( rulePackageID )
			// InternalXtextTest.g:6280:1: rulePackageID
			{
			 before(grammarAccess.getEmfTestAccess().getMydefaultPackageIDParserRuleCall_5_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getMydefaultPackageIDParserRuleCall_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__MydefaultAssignment_5"



	// $ANTLR start "rule__EmfTest__MyimportAssignment_6"
	// InternalXtextTest.g:6289:1: rule__EmfTest__MyimportAssignment_6 : ( ruleImport ) ;
	public final void rule__EmfTest__MyimportAssignment_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6293:1: ( ( ruleImport ) )
			// InternalXtextTest.g:6294:1: ( ruleImport )
			{
			// InternalXtextTest.g:6294:1: ( ruleImport )
			// InternalXtextTest.g:6295:1: ruleImport
			{
			 before(grammarAccess.getEmfTestAccess().getMyimportImportParserRuleCall_6_0()); 
			pushFollow(FOLLOW_2);
			ruleImport();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getMyimportImportParserRuleCall_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__MyimportAssignment_6"



	// $ANTLR start "rule__EmfTest__TimeOutAssignment_7_2"
	// InternalXtextTest.g:6304:1: rule__EmfTest__TimeOutAssignment_7_2 : ( RULE_INT ) ;
	public final void rule__EmfTest__TimeOutAssignment_7_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6308:1: ( ( RULE_INT ) )
			// InternalXtextTest.g:6309:1: ( RULE_INT )
			{
			// InternalXtextTest.g:6309:1: ( RULE_INT )
			// InternalXtextTest.g:6310:1: RULE_INT
			{
			 before(grammarAccess.getEmfTestAccess().getTimeOutINTTerminalRuleCall_7_2_0()); 
			match(input,RULE_INT,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getTimeOutINTTerminalRuleCall_7_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__TimeOutAssignment_7_2"



	// $ANTLR start "rule__EmfTest__CodeCallAssignment_8"
	// InternalXtextTest.g:6319:1: rule__EmfTest__CodeCallAssignment_8 : ( ruleCodeCall ) ;
	public final void rule__EmfTest__CodeCallAssignment_8() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6323:1: ( ( ruleCodeCall ) )
			// InternalXtextTest.g:6324:1: ( ruleCodeCall )
			{
			// InternalXtextTest.g:6324:1: ( ruleCodeCall )
			// InternalXtextTest.g:6325:1: ruleCodeCall
			{
			 before(grammarAccess.getEmfTestAccess().getCodeCallCodeCallParserRuleCall_8_0()); 
			pushFollow(FOLLOW_2);
			ruleCodeCall();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getCodeCallCodeCallParserRuleCall_8_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__CodeCallAssignment_8"



	// $ANTLR start "rule__EmfTest__OptionCallAssignment_9_1"
	// InternalXtextTest.g:6334:1: rule__EmfTest__OptionCallAssignment_9_1 : ( ruleCodeCall ) ;
	public final void rule__EmfTest__OptionCallAssignment_9_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6338:1: ( ( ruleCodeCall ) )
			// InternalXtextTest.g:6339:1: ( ruleCodeCall )
			{
			// InternalXtextTest.g:6339:1: ( ruleCodeCall )
			// InternalXtextTest.g:6340:1: ruleCodeCall
			{
			 before(grammarAccess.getEmfTestAccess().getOptionCallCodeCallParserRuleCall_9_1_0()); 
			pushFollow(FOLLOW_2);
			ruleCodeCall();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getOptionCallCodeCallParserRuleCall_9_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__OptionCallAssignment_9_1"



	// $ANTLR start "rule__EmfTest__FileAssignment_10_3"
	// InternalXtextTest.g:6349:1: rule__EmfTest__FileAssignment_10_3 : ( RULE_STRING ) ;
	public final void rule__EmfTest__FileAssignment_10_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6353:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6354:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6354:1: ( RULE_STRING )
			// InternalXtextTest.g:6355:1: RULE_STRING
			{
			 before(grammarAccess.getEmfTestAccess().getFileSTRINGTerminalRuleCall_10_3_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getEmfTestAccess().getFileSTRINGTerminalRuleCall_10_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__FileAssignment_10_3"



	// $ANTLR start "rule__EmfTest__RootAssignment_11"
	// InternalXtextTest.g:6364:1: rule__EmfTest__RootAssignment_11 : ( ruleElement ) ;
	public final void rule__EmfTest__RootAssignment_11() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6368:1: ( ( ruleElement ) )
			// InternalXtextTest.g:6369:1: ( ruleElement )
			{
			// InternalXtextTest.g:6369:1: ( ruleElement )
			// InternalXtextTest.g:6370:1: ruleElement
			{
			 before(grammarAccess.getEmfTestAccess().getRootElementParserRuleCall_11_0()); 
			pushFollow(FOLLOW_2);
			ruleElement();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getRootElementParserRuleCall_11_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__RootAssignment_11"



	// $ANTLR start "rule__EmfTest__BeforeAssignment_12"
	// InternalXtextTest.g:6379:1: rule__EmfTest__BeforeAssignment_12 : ( ruleBefore ) ;
	public final void rule__EmfTest__BeforeAssignment_12() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6383:1: ( ( ruleBefore ) )
			// InternalXtextTest.g:6384:1: ( ruleBefore )
			{
			// InternalXtextTest.g:6384:1: ( ruleBefore )
			// InternalXtextTest.g:6385:1: ruleBefore
			{
			 before(grammarAccess.getEmfTestAccess().getBeforeBeforeParserRuleCall_12_0()); 
			pushFollow(FOLLOW_2);
			ruleBefore();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getBeforeBeforeParserRuleCall_12_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__BeforeAssignment_12"



	// $ANTLR start "rule__EmfTest__AfterAssignment_13"
	// InternalXtextTest.g:6394:1: rule__EmfTest__AfterAssignment_13 : ( ruleAfter ) ;
	public final void rule__EmfTest__AfterAssignment_13() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6398:1: ( ( ruleAfter ) )
			// InternalXtextTest.g:6399:1: ( ruleAfter )
			{
			// InternalXtextTest.g:6399:1: ( ruleAfter )
			// InternalXtextTest.g:6400:1: ruleAfter
			{
			 before(grammarAccess.getEmfTestAccess().getAfterAfterParserRuleCall_13_0()); 
			pushFollow(FOLLOW_2);
			ruleAfter();
			state._fsp--;

			 after(grammarAccess.getEmfTestAccess().getAfterAfterParserRuleCall_13_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__EmfTest__AfterAssignment_13"



	// $ANTLR start "rule__Import__IdAssignment_2"
	// InternalXtextTest.g:6409:1: rule__Import__IdAssignment_2 : ( ruleImportID ) ;
	public final void rule__Import__IdAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6413:1: ( ( ruleImportID ) )
			// InternalXtextTest.g:6414:1: ( ruleImportID )
			{
			// InternalXtextTest.g:6414:1: ( ruleImportID )
			// InternalXtextTest.g:6415:1: ruleImportID
			{
			 before(grammarAccess.getImportAccess().getIdImportIDParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleImportID();
			state._fsp--;

			 after(grammarAccess.getImportAccess().getIdImportIDParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__IdAssignment_2"



	// $ANTLR start "rule__Import__AliasAssignment_4"
	// InternalXtextTest.g:6424:1: rule__Import__AliasAssignment_4 : ( RULE_IDENTIFIER ) ;
	public final void rule__Import__AliasAssignment_4() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6428:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:6429:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:6429:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:6430:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getImportAccess().getAliasIDENTIFIERTerminalRuleCall_4_0()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getImportAccess().getAliasIDENTIFIERTerminalRuleCall_4_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Import__AliasAssignment_4"



	// $ANTLR start "rule__Input__TextAssignment_2_0_2"
	// InternalXtextTest.g:6439:1: rule__Input__TextAssignment_2_0_2 : ( RULE_STRING ) ;
	public final void rule__Input__TextAssignment_2_0_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6443:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6444:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6444:1: ( RULE_STRING )
			// InternalXtextTest.g:6445:1: RULE_STRING
			{
			 before(grammarAccess.getInputAccess().getTextSTRINGTerminalRuleCall_2_0_2_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getInputAccess().getTextSTRINGTerminalRuleCall_2_0_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__TextAssignment_2_0_2"



	// $ANTLR start "rule__Input__FileAssignment_2_1_2"
	// InternalXtextTest.g:6454:1: rule__Input__FileAssignment_2_1_2 : ( RULE_STRING ) ;
	public final void rule__Input__FileAssignment_2_1_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6458:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6459:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6459:1: ( RULE_STRING )
			// InternalXtextTest.g:6460:1: RULE_STRING
			{
			 before(grammarAccess.getInputAccess().getFileSTRINGTerminalRuleCall_2_1_2_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getInputAccess().getFileSTRINGTerminalRuleCall_2_1_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Input__FileAssignment_2_1_2"



	// $ANTLR start "rule__Tokens__TokensAssignment_2"
	// InternalXtextTest.g:6469:1: rule__Tokens__TokensAssignment_2 : ( ruleMyTokens ) ;
	public final void rule__Tokens__TokensAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6473:1: ( ( ruleMyTokens ) )
			// InternalXtextTest.g:6474:1: ( ruleMyTokens )
			{
			// InternalXtextTest.g:6474:1: ( ruleMyTokens )
			// InternalXtextTest.g:6475:1: ruleMyTokens
			{
			 before(grammarAccess.getTokensAccess().getTokensMyTokensParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleMyTokens();
			state._fsp--;

			 after(grammarAccess.getTokensAccess().getTokensMyTokensParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Tokens__TokensAssignment_2"



	// $ANTLR start "rule__MyTokens__TokenAssignment_0_0"
	// InternalXtextTest.g:6484:1: rule__MyTokens__TokenAssignment_0_0 : ( RULE_IDENTIFIER ) ;
	public final void rule__MyTokens__TokenAssignment_0_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6488:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:6489:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:6489:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:6490:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getMyTokensAccess().getTokenIDENTIFIERTerminalRuleCall_0_0_0()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getMyTokensAccess().getTokenIDENTIFIERTerminalRuleCall_0_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__TokenAssignment_0_0"



	// $ANTLR start "rule__MyTokens__StringAssignment_0_1"
	// InternalXtextTest.g:6499:1: rule__MyTokens__StringAssignment_0_1 : ( RULE_STRING ) ;
	public final void rule__MyTokens__StringAssignment_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6503:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6504:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6504:1: ( RULE_STRING )
			// InternalXtextTest.g:6505:1: RULE_STRING
			{
			 before(grammarAccess.getMyTokensAccess().getStringSTRINGTerminalRuleCall_0_1_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getMyTokensAccess().getStringSTRINGTerminalRuleCall_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__StringAssignment_0_1"



	// $ANTLR start "rule__MyTokens__CountAssignment_1_1"
	// InternalXtextTest.g:6514:1: rule__MyTokens__CountAssignment_1_1 : ( RULE_INT ) ;
	public final void rule__MyTokens__CountAssignment_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6518:1: ( ( RULE_INT ) )
			// InternalXtextTest.g:6519:1: ( RULE_INT )
			{
			// InternalXtextTest.g:6519:1: ( RULE_INT )
			// InternalXtextTest.g:6520:1: RULE_INT
			{
			 before(grammarAccess.getMyTokensAccess().getCountINTTerminalRuleCall_1_1_0()); 
			match(input,RULE_INT,FOLLOW_2); 
			 after(grammarAccess.getMyTokensAccess().getCountINTTerminalRuleCall_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__MyTokens__CountAssignment_1_1"



	// $ANTLR start "rule__Element__ImportingAssignment_2_0"
	// InternalXtextTest.g:6529:1: rule__Element__ImportingAssignment_2_0 : ( RULE_IDENTIFIER ) ;
	public final void rule__Element__ImportingAssignment_2_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6533:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:6534:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:6534:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:6535:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getElementAccess().getImportingIDENTIFIERTerminalRuleCall_2_0_0()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getElementAccess().getImportingIDENTIFIERTerminalRuleCall_2_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__ImportingAssignment_2_0"



	// $ANTLR start "rule__Element__NameAssignment_3"
	// InternalXtextTest.g:6544:1: rule__Element__NameAssignment_3 : ( RULE_IDENTIFIER ) ;
	public final void rule__Element__NameAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6548:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:6549:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:6549:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:6550:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getElementAccess().getNameIDENTIFIERTerminalRuleCall_3_0()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getElementAccess().getNameIDENTIFIERTerminalRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__NameAssignment_3"



	// $ANTLR start "rule__Element__InnerAssignment_4_0"
	// InternalXtextTest.g:6559:1: rule__Element__InnerAssignment_4_0 : ( ruleInner ) ;
	public final void rule__Element__InnerAssignment_4_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6563:1: ( ( ruleInner ) )
			// InternalXtextTest.g:6564:1: ( ruleInner )
			{
			// InternalXtextTest.g:6564:1: ( ruleInner )
			// InternalXtextTest.g:6565:1: ruleInner
			{
			 before(grammarAccess.getElementAccess().getInnerInnerParserRuleCall_4_0_0()); 
			pushFollow(FOLLOW_2);
			ruleInner();
			state._fsp--;

			 after(grammarAccess.getElementAccess().getInnerInnerParserRuleCall_4_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__InnerAssignment_4_0"



	// $ANTLR start "rule__Element__InnerAssignment_4_1_1"
	// InternalXtextTest.g:6574:1: rule__Element__InnerAssignment_4_1_1 : ( ruleInner ) ;
	public final void rule__Element__InnerAssignment_4_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6578:1: ( ( ruleInner ) )
			// InternalXtextTest.g:6579:1: ( ruleInner )
			{
			// InternalXtextTest.g:6579:1: ( ruleInner )
			// InternalXtextTest.g:6580:1: ruleInner
			{
			 before(grammarAccess.getElementAccess().getInnerInnerParserRuleCall_4_1_1_0()); 
			pushFollow(FOLLOW_2);
			ruleInner();
			state._fsp--;

			 after(grammarAccess.getElementAccess().getInnerInnerParserRuleCall_4_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Element__InnerAssignment_4_1_1"



	// $ANTLR start "rule__Inner__ParameterAssignment_1"
	// InternalXtextTest.g:6589:1: rule__Inner__ParameterAssignment_1 : ( RULE_IDENTIFIER ) ;
	public final void rule__Inner__ParameterAssignment_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6593:1: ( ( RULE_IDENTIFIER ) )
			// InternalXtextTest.g:6594:1: ( RULE_IDENTIFIER )
			{
			// InternalXtextTest.g:6594:1: ( RULE_IDENTIFIER )
			// InternalXtextTest.g:6595:1: RULE_IDENTIFIER
			{
			 before(grammarAccess.getInnerAccess().getParameterIDENTIFIERTerminalRuleCall_1_0()); 
			match(input,RULE_IDENTIFIER,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getParameterIDENTIFIERTerminalRuleCall_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__ParameterAssignment_1"



	// $ANTLR start "rule__Inner__AssignAssignment_2_0_1"
	// InternalXtextTest.g:6604:1: rule__Inner__AssignAssignment_2_0_1 : ( ruleElement ) ;
	public final void rule__Inner__AssignAssignment_2_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6608:1: ( ( ruleElement ) )
			// InternalXtextTest.g:6609:1: ( ruleElement )
			{
			// InternalXtextTest.g:6609:1: ( ruleElement )
			// InternalXtextTest.g:6610:1: ruleElement
			{
			 before(grammarAccess.getInnerAccess().getAssignElementParserRuleCall_2_0_1_0()); 
			pushFollow(FOLLOW_2);
			ruleElement();
			state._fsp--;

			 after(grammarAccess.getInnerAccess().getAssignElementParserRuleCall_2_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__AssignAssignment_2_0_1"



	// $ANTLR start "rule__Inner__AssignListAssignment_2_1_1"
	// InternalXtextTest.g:6619:1: rule__Inner__AssignListAssignment_2_1_1 : ( ruleElement ) ;
	public final void rule__Inner__AssignListAssignment_2_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6623:1: ( ( ruleElement ) )
			// InternalXtextTest.g:6624:1: ( ruleElement )
			{
			// InternalXtextTest.g:6624:1: ( ruleElement )
			// InternalXtextTest.g:6625:1: ruleElement
			{
			 before(grammarAccess.getInnerAccess().getAssignListElementParserRuleCall_2_1_1_0()); 
			pushFollow(FOLLOW_2);
			ruleElement();
			state._fsp--;

			 after(grammarAccess.getInnerAccess().getAssignListElementParserRuleCall_2_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__AssignListAssignment_2_1_1"



	// $ANTLR start "rule__Inner__AssignListAssignment_2_1_2_1"
	// InternalXtextTest.g:6634:1: rule__Inner__AssignListAssignment_2_1_2_1 : ( ruleElement ) ;
	public final void rule__Inner__AssignListAssignment_2_1_2_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6638:1: ( ( ruleElement ) )
			// InternalXtextTest.g:6639:1: ( ruleElement )
			{
			// InternalXtextTest.g:6639:1: ( ruleElement )
			// InternalXtextTest.g:6640:1: ruleElement
			{
			 before(grammarAccess.getInnerAccess().getAssignListElementParserRuleCall_2_1_2_1_0()); 
			pushFollow(FOLLOW_2);
			ruleElement();
			state._fsp--;

			 after(grammarAccess.getInnerAccess().getAssignListElementParserRuleCall_2_1_2_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__AssignListAssignment_2_1_2_1"



	// $ANTLR start "rule__Inner__ValueAssignment_2_2_1"
	// InternalXtextTest.g:6649:1: rule__Inner__ValueAssignment_2_2_1 : ( RULE_STRING ) ;
	public final void rule__Inner__ValueAssignment_2_2_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6653:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6654:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6654:1: ( RULE_STRING )
			// InternalXtextTest.g:6655:1: RULE_STRING
			{
			 before(grammarAccess.getInnerAccess().getValueSTRINGTerminalRuleCall_2_2_1_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getValueSTRINGTerminalRuleCall_2_2_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__ValueAssignment_2_2_1"



	// $ANTLR start "rule__Inner__AssignAsDataAssignment_2_3_1"
	// InternalXtextTest.g:6664:1: rule__Inner__AssignAsDataAssignment_2_3_1 : ( RULE_STRING ) ;
	public final void rule__Inner__AssignAsDataAssignment_2_3_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6668:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6669:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6669:1: ( RULE_STRING )
			// InternalXtextTest.g:6670:1: RULE_STRING
			{
			 before(grammarAccess.getInnerAccess().getAssignAsDataSTRINGTerminalRuleCall_2_3_1_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getAssignAsDataSTRINGTerminalRuleCall_2_3_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__AssignAsDataAssignment_2_3_1"



	// $ANTLR start "rule__Inner__AssignAsBoolAssignment_2_4_1"
	// InternalXtextTest.g:6679:1: rule__Inner__AssignAsBoolAssignment_2_4_1 : ( ( rule__Inner__AssignAsBoolAlternatives_2_4_1_0 ) ) ;
	public final void rule__Inner__AssignAsBoolAssignment_2_4_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6683:1: ( ( ( rule__Inner__AssignAsBoolAlternatives_2_4_1_0 ) ) )
			// InternalXtextTest.g:6684:1: ( ( rule__Inner__AssignAsBoolAlternatives_2_4_1_0 ) )
			{
			// InternalXtextTest.g:6684:1: ( ( rule__Inner__AssignAsBoolAlternatives_2_4_1_0 ) )
			// InternalXtextTest.g:6685:1: ( rule__Inner__AssignAsBoolAlternatives_2_4_1_0 )
			{
			 before(grammarAccess.getInnerAccess().getAssignAsBoolAlternatives_2_4_1_0()); 
			// InternalXtextTest.g:6686:2: ( rule__Inner__AssignAsBoolAlternatives_2_4_1_0 )
			// InternalXtextTest.g:6686:2: rule__Inner__AssignAsBoolAlternatives_2_4_1_0
			{
			pushFollow(FOLLOW_2);
			rule__Inner__AssignAsBoolAlternatives_2_4_1_0();
			state._fsp--;

			}

			 after(grammarAccess.getInnerAccess().getAssignAsBoolAlternatives_2_4_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__AssignAsBoolAssignment_2_4_1"



	// $ANTLR start "rule__Inner__IsNullAssignment_2_5"
	// InternalXtextTest.g:6695:1: rule__Inner__IsNullAssignment_2_5 : ( RULE_ISNULL ) ;
	public final void rule__Inner__IsNullAssignment_2_5() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6699:1: ( ( RULE_ISNULL ) )
			// InternalXtextTest.g:6700:1: ( RULE_ISNULL )
			{
			// InternalXtextTest.g:6700:1: ( RULE_ISNULL )
			// InternalXtextTest.g:6701:1: RULE_ISNULL
			{
			 before(grammarAccess.getInnerAccess().getIsNullISNULLTerminalRuleCall_2_5_0()); 
			match(input,RULE_ISNULL,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getIsNullISNULLTerminalRuleCall_2_5_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__IsNullAssignment_2_5"



	// $ANTLR start "rule__Inner__IsNotNullAssignment_2_6"
	// InternalXtextTest.g:6710:1: rule__Inner__IsNotNullAssignment_2_6 : ( RULE_ISNOTNULL ) ;
	public final void rule__Inner__IsNotNullAssignment_2_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6714:1: ( ( RULE_ISNOTNULL ) )
			// InternalXtextTest.g:6715:1: ( RULE_ISNOTNULL )
			{
			// InternalXtextTest.g:6715:1: ( RULE_ISNOTNULL )
			// InternalXtextTest.g:6716:1: RULE_ISNOTNULL
			{
			 before(grammarAccess.getInnerAccess().getIsNotNullISNOTNULLTerminalRuleCall_2_6_0()); 
			match(input,RULE_ISNOTNULL,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getIsNotNullISNOTNULLTerminalRuleCall_2_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__IsNotNullAssignment_2_6"



	// $ANTLR start "rule__Inner__IsEmptyAssignment_2_7"
	// InternalXtextTest.g:6725:1: rule__Inner__IsEmptyAssignment_2_7 : ( RULE_ISEMPTY ) ;
	public final void rule__Inner__IsEmptyAssignment_2_7() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6729:1: ( ( RULE_ISEMPTY ) )
			// InternalXtextTest.g:6730:1: ( RULE_ISEMPTY )
			{
			// InternalXtextTest.g:6730:1: ( RULE_ISEMPTY )
			// InternalXtextTest.g:6731:1: RULE_ISEMPTY
			{
			 before(grammarAccess.getInnerAccess().getIsEmptyISEMPTYTerminalRuleCall_2_7_0()); 
			match(input,RULE_ISEMPTY,FOLLOW_2); 
			 after(grammarAccess.getInnerAccess().getIsEmptyISEMPTYTerminalRuleCall_2_7_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Inner__IsEmptyAssignment_2_7"



	// $ANTLR start "rule__Generator__OutputAssignment_1_3"
	// InternalXtextTest.g:6740:1: rule__Generator__OutputAssignment_1_3 : ( RULE_STRING ) ;
	public final void rule__Generator__OutputAssignment_1_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6744:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6745:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6745:1: ( RULE_STRING )
			// InternalXtextTest.g:6746:1: RULE_STRING
			{
			 before(grammarAccess.getGeneratorAccess().getOutputSTRINGTerminalRuleCall_1_3_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getOutputSTRINGTerminalRuleCall_1_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__OutputAssignment_1_3"



	// $ANTLR start "rule__Generator__ExpectedAssignment_2_2_0_1"
	// InternalXtextTest.g:6755:1: rule__Generator__ExpectedAssignment_2_2_0_1 : ( RULE_STRING ) ;
	public final void rule__Generator__ExpectedAssignment_2_2_0_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6759:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6760:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6760:1: ( RULE_STRING )
			// InternalXtextTest.g:6761:1: RULE_STRING
			{
			 before(grammarAccess.getGeneratorAccess().getExpectedSTRINGTerminalRuleCall_2_2_0_1_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getExpectedSTRINGTerminalRuleCall_2_2_0_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__ExpectedAssignment_2_2_0_1"



	// $ANTLR start "rule__Generator__IsSameAsInputFileAssignment_2_2_1"
	// InternalXtextTest.g:6770:1: rule__Generator__IsSameAsInputFileAssignment_2_2_1 : ( RULE_ISSAMEASINPUTFILE ) ;
	public final void rule__Generator__IsSameAsInputFileAssignment_2_2_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6774:1: ( ( RULE_ISSAMEASINPUTFILE ) )
			// InternalXtextTest.g:6775:1: ( RULE_ISSAMEASINPUTFILE )
			{
			// InternalXtextTest.g:6775:1: ( RULE_ISSAMEASINPUTFILE )
			// InternalXtextTest.g:6776:1: RULE_ISSAMEASINPUTFILE
			{
			 before(grammarAccess.getGeneratorAccess().getIsSameAsInputFileISSAMEASINPUTFILETerminalRuleCall_2_2_1_0()); 
			match(input,RULE_ISSAMEASINPUTFILE,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getIsSameAsInputFileISSAMEASINPUTFILETerminalRuleCall_2_2_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__IsSameAsInputFileAssignment_2_2_1"



	// $ANTLR start "rule__Generator__PatternFileAssignment_3_1_2"
	// InternalXtextTest.g:6785:1: rule__Generator__PatternFileAssignment_3_1_2 : ( RULE_STRING ) ;
	public final void rule__Generator__PatternFileAssignment_3_1_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6789:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6790:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6790:1: ( RULE_STRING )
			// InternalXtextTest.g:6791:1: RULE_STRING
			{
			 before(grammarAccess.getGeneratorAccess().getPatternFileSTRINGTerminalRuleCall_3_1_2_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getGeneratorAccess().getPatternFileSTRINGTerminalRuleCall_3_1_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__PatternFileAssignment_3_1_2"



	// $ANTLR start "rule__Generator__ReplacePatternsAssignment_3_2"
	// InternalXtextTest.g:6800:1: rule__Generator__ReplacePatternsAssignment_3_2 : ( ruleReplacePatterns ) ;
	public final void rule__Generator__ReplacePatternsAssignment_3_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6804:1: ( ( ruleReplacePatterns ) )
			// InternalXtextTest.g:6805:1: ( ruleReplacePatterns )
			{
			// InternalXtextTest.g:6805:1: ( ruleReplacePatterns )
			// InternalXtextTest.g:6806:1: ruleReplacePatterns
			{
			 before(grammarAccess.getGeneratorAccess().getReplacePatternsReplacePatternsParserRuleCall_3_2_0()); 
			pushFollow(FOLLOW_2);
			ruleReplacePatterns();
			state._fsp--;

			 after(grammarAccess.getGeneratorAccess().getReplacePatternsReplacePatternsParserRuleCall_3_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__ReplacePatternsAssignment_3_2"



	// $ANTLR start "rule__Generator__ExceptionAssignment_4_2"
	// InternalXtextTest.g:6815:1: rule__Generator__ExceptionAssignment_4_2 : ( rulePackageID ) ;
	public final void rule__Generator__ExceptionAssignment_4_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6819:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6820:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6820:1: ( rulePackageID )
			// InternalXtextTest.g:6821:1: rulePackageID
			{
			 before(grammarAccess.getGeneratorAccess().getExceptionPackageIDParserRuleCall_4_2_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getGeneratorAccess().getExceptionPackageIDParserRuleCall_4_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Generator__ExceptionAssignment_4_2"



	// $ANTLR start "rule__ReplacePatterns__RegexAssignment_0"
	// InternalXtextTest.g:6830:1: rule__ReplacePatterns__RegexAssignment_0 : ( RULE_STRING ) ;
	public final void rule__ReplacePatterns__RegexAssignment_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6834:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6835:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6835:1: ( RULE_STRING )
			// InternalXtextTest.g:6836:1: RULE_STRING
			{
			 before(grammarAccess.getReplacePatternsAccess().getRegexSTRINGTerminalRuleCall_0_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getReplacePatternsAccess().getRegexSTRINGTerminalRuleCall_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__RegexAssignment_0"



	// $ANTLR start "rule__ReplacePatterns__ReplaceAssignment_2"
	// InternalXtextTest.g:6845:1: rule__ReplacePatterns__ReplaceAssignment_2 : ( RULE_STRING ) ;
	public final void rule__ReplacePatterns__ReplaceAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6849:1: ( ( RULE_STRING ) )
			// InternalXtextTest.g:6850:1: ( RULE_STRING )
			{
			// InternalXtextTest.g:6850:1: ( RULE_STRING )
			// InternalXtextTest.g:6851:1: RULE_STRING
			{
			 before(grammarAccess.getReplacePatternsAccess().getReplaceSTRINGTerminalRuleCall_2_0()); 
			match(input,RULE_STRING,FOLLOW_2); 
			 after(grammarAccess.getReplacePatternsAccess().getReplaceSTRINGTerminalRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__ReplacePatterns__ReplaceAssignment_2"



	// $ANTLR start "rule__Before__CodeCallAssignment_2"
	// InternalXtextTest.g:6860:1: rule__Before__CodeCallAssignment_2 : ( ruleCodeCall ) ;
	public final void rule__Before__CodeCallAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6864:1: ( ( ruleCodeCall ) )
			// InternalXtextTest.g:6865:1: ( ruleCodeCall )
			{
			// InternalXtextTest.g:6865:1: ( ruleCodeCall )
			// InternalXtextTest.g:6866:1: ruleCodeCall
			{
			 before(grammarAccess.getBeforeAccess().getCodeCallCodeCallParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleCodeCall();
			state._fsp--;

			 after(grammarAccess.getBeforeAccess().getCodeCallCodeCallParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__Before__CodeCallAssignment_2"



	// $ANTLR start "rule__After__CodeCallAssignment_2"
	// InternalXtextTest.g:6875:1: rule__After__CodeCallAssignment_2 : ( ruleCodeCall ) ;
	public final void rule__After__CodeCallAssignment_2() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6879:1: ( ( ruleCodeCall ) )
			// InternalXtextTest.g:6880:1: ( ruleCodeCall )
			{
			// InternalXtextTest.g:6880:1: ( ruleCodeCall )
			// InternalXtextTest.g:6881:1: ruleCodeCall
			{
			 before(grammarAccess.getAfterAccess().getCodeCallCodeCallParserRuleCall_2_0()); 
			pushFollow(FOLLOW_2);
			ruleCodeCall();
			state._fsp--;

			 after(grammarAccess.getAfterAccess().getCodeCallCodeCallParserRuleCall_2_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__After__CodeCallAssignment_2"



	// $ANTLR start "rule__CodeCall__MyclassAssignment_3"
	// InternalXtextTest.g:6890:1: rule__CodeCall__MyclassAssignment_3 : ( rulePackageID ) ;
	public final void rule__CodeCall__MyclassAssignment_3() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6894:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6895:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6895:1: ( rulePackageID )
			// InternalXtextTest.g:6896:1: rulePackageID
			{
			 before(grammarAccess.getCodeCallAccess().getMyclassPackageIDParserRuleCall_3_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getCodeCallAccess().getMyclassPackageIDParserRuleCall_3_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__MyclassAssignment_3"



	// $ANTLR start "rule__CodeCall__MethodAssignment_6"
	// InternalXtextTest.g:6905:1: rule__CodeCall__MethodAssignment_6 : ( rulePackageID ) ;
	public final void rule__CodeCall__MethodAssignment_6() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6909:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6910:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6910:1: ( rulePackageID )
			// InternalXtextTest.g:6911:1: rulePackageID
			{
			 before(grammarAccess.getCodeCallAccess().getMethodPackageIDParserRuleCall_6_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getCodeCallAccess().getMethodPackageIDParserRuleCall_6_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__MethodAssignment_6"



	// $ANTLR start "rule__CodeCall__ParamsAssignment_7_1_0"
	// InternalXtextTest.g:6920:1: rule__CodeCall__ParamsAssignment_7_1_0 : ( rulePackageID ) ;
	public final void rule__CodeCall__ParamsAssignment_7_1_0() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6924:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6925:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6925:1: ( rulePackageID )
			// InternalXtextTest.g:6926:1: rulePackageID
			{
			 before(grammarAccess.getCodeCallAccess().getParamsPackageIDParserRuleCall_7_1_0_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getCodeCallAccess().getParamsPackageIDParserRuleCall_7_1_0_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__ParamsAssignment_7_1_0"



	// $ANTLR start "rule__CodeCall__ParamsAssignment_7_1_1_1"
	// InternalXtextTest.g:6935:1: rule__CodeCall__ParamsAssignment_7_1_1_1 : ( rulePackageID ) ;
	public final void rule__CodeCall__ParamsAssignment_7_1_1_1() throws RecognitionException {

				int stackSize = keepStackSize();
		    
		try {
			// InternalXtextTest.g:6939:1: ( ( rulePackageID ) )
			// InternalXtextTest.g:6940:1: ( rulePackageID )
			{
			// InternalXtextTest.g:6940:1: ( rulePackageID )
			// InternalXtextTest.g:6941:1: rulePackageID
			{
			 before(grammarAccess.getCodeCallAccess().getParamsPackageIDParserRuleCall_7_1_1_1_0()); 
			pushFollow(FOLLOW_2);
			rulePackageID();
			state._fsp--;

			 after(grammarAccess.getCodeCallAccess().getParamsPackageIDParserRuleCall_7_1_1_1_0()); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

				restoreStackSize(stackSize);

		}
	}
	// $ANTLR end "rule__CodeCall__ParamsAssignment_7_1_1_1"

	// Delegated rules



	public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002020000000L});
	public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000C0000400000L});
	public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000C0000000000L});
	public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400180000000L});
	public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000810L});
	public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000020000L});
	public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000401000L});
	public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000001000L});
	public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040800000000L});
	public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000040000L});
	public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000100000L});
	public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000100002L});
	public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000100000L});
	public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000070007C0L});
	public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000010000L});
	public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008000200L});
	public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000040000L});
	public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000200000000L});
}
