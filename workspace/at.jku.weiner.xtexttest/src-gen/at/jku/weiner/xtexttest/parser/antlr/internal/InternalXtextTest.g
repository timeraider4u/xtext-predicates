/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
grammar InternalXtextTest;

options {
	superClass=AbstractInternalAntlrParser;
	
	
}

@lexer::header {
package at.jku.weiner.xtexttest.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.jku.weiner.xtexttest.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.weiner.xtexttest.services.XtextTestGrammarAccess;

}

@parser::members {

 	private XtextTestGrammarAccess grammarAccess;
 	
    public InternalXtextTestParser(TokenStream input, XtextTestGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "XtextTest";	
   	}
   	
   	@Override
   	protected XtextTestGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleXtextTest
entryRuleXtextTest returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getXtextTestRule()); }
	 iv_ruleXtextTest=ruleXtextTest 
	 { $current=$iv_ruleXtextTest.current; } 
	 EOF 
;

// Rule XtextTest
ruleXtextTest returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getXtextTestAccess().getXtextTestAction_0(),
            $current);
    }
)


this_PACKAGE_1=RULE_PACKAGE
    { 
    newLeafNode(this_PACKAGE_1, grammarAccess.getXtextTestAccess().getPACKAGETerminalRuleCall_1()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getPackagePackageIDParserRuleCall_2_0()); 
	    }
		lv_package_2_0=rulePackageID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"package",
        		lv_package_2_0, 
        		"at.jku.weiner.xtexttest.XtextTest.PackageID");
	        afterParserOrEnumRuleCall();
	    }

)
)


this_LANGUAGE_3=RULE_LANGUAGE
    { 
    newLeafNode(this_LANGUAGE_3, grammarAccess.getXtextTestAccess().getLANGUAGETerminalRuleCall_3()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getLangLangIDParserRuleCall_4_0()); 
	    }
		lv_lang_4_0=ruleLangID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"lang",
        		lv_lang_4_0, 
        		"at.jku.weiner.xtexttest.XtextTest.LangID");
	        afterParserOrEnumRuleCall();
	    }

)
)


(
this_IMPORTS_5=RULE_IMPORTS
    { 
    newLeafNode(this_IMPORTS_5, grammarAccess.getXtextTestAccess().getIMPORTSTerminalRuleCall_5_0()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getImportsImportIDParserRuleCall_5_1_0()); 
	    }
		lv_imports_6_0=ruleImportID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"imports",
        		lv_imports_6_0, 
        		"at.jku.weiner.xtexttest.XtextTest.ImportID");
	        afterParserOrEnumRuleCall();
	    }

)
)

)?


(
this_SPLITLEXER_7=RULE_SPLITLEXER
    { 
    newLeafNode(this_SPLITLEXER_7, grammarAccess.getXtextTestAccess().getSPLITLEXERTerminalRuleCall_6_0()); 
    }



this_ASSIGNASSINGLE_8=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_8, grammarAccess.getXtextTestAccess().getASSIGNASSINGLETerminalRuleCall_6_1()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getBooleanBooleanParserRuleCall_6_2_0()); 
	    }
		lv_boolean_9_0=ruleBoolean		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"boolean",
        		lv_boolean_9_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Boolean");
	        afterParserOrEnumRuleCall();
	    }

)
)

)?


(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getInputInputParserRuleCall_7_0()); 
	    }
		lv_input_10_0=ruleInput		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"input",
        		lv_input_10_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Input");
	        afterParserOrEnumRuleCall();
	    }

)
)


(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getTokensTokensParserRuleCall_8_0()); 
	    }
		lv_tokens_11_0=ruleTokens		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"tokens",
        		lv_tokens_11_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Tokens");
	        afterParserOrEnumRuleCall();
	    }

)
)?


(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getRootElementParserRuleCall_9_0()); 
	    }
		lv_root_12_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"root",
        		lv_root_12_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Element");
	        afterParserOrEnumRuleCall();
	    }

)
)


(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getOutputGeneratorParserRuleCall_10_0()); 
	    }
		lv_output_13_0=ruleGenerator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"output",
        		lv_output_13_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Generator");
	        afterParserOrEnumRuleCall();
	    }

)
)?


(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getBeforeBeforeParserRuleCall_11_0()); 
	    }
		lv_before_14_0=ruleBefore		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"before",
        		lv_before_14_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Before");
	        afterParserOrEnumRuleCall();
	    }

)
)?


(
(
		{ 
	        newCompositeNode(grammarAccess.getXtextTestAccess().getAfterAfterParserRuleCall_12_0()); 
	    }
		lv_after_15_0=ruleAfter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXtextTestRule());
	        }
       		set(
       			$current, 
       			"after",
        		lv_after_15_0, 
        		"at.jku.weiner.xtexttest.XtextTest.After");
	        afterParserOrEnumRuleCall();
	    }

)
)?

)


;





// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanRule()); } 
	 iv_ruleBoolean=ruleBoolean 
	 { $current=$iv_ruleBoolean.current.getText(); }  
	 EOF 
;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_TRUE_0=RULE_TRUE    {
		$current.merge(this_TRUE_0);
    }

    { 
    newLeafNode(this_TRUE_0, grammarAccess.getBooleanAccess().getTRUETerminalRuleCall_0()); 
    }

    |    this_FALSE_1=RULE_FALSE    {
		$current.merge(this_FALSE_1);
    }

    { 
    newLeafNode(this_FALSE_1, grammarAccess.getBooleanAccess().getFALSETerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRulePackageID
entryRulePackageID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageIDRule()); } 
	 iv_rulePackageID=rulePackageID 
	 { $current=$iv_rulePackageID.current.getText(); }  
	 EOF 
;

// Rule PackageID
rulePackageID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_IDENTIFIER_0=RULE_IDENTIFIER    {
		$current.merge(this_IDENTIFIER_0);
    }

    { 
    newLeafNode(this_IDENTIFIER_0, grammarAccess.getPackageIDAccess().getIDENTIFIERTerminalRuleCall_0()); 
    }
(    this_POINT_1=RULE_POINT    {
		$current.merge(this_POINT_1);
    }

    { 
    newLeafNode(this_POINT_1, grammarAccess.getPackageIDAccess().getPOINTTerminalRuleCall_1_0()); 
    }
    this_IDENTIFIER_2=RULE_IDENTIFIER    {
		$current.merge(this_IDENTIFIER_2);
    }

    { 
    newLeafNode(this_IDENTIFIER_2, grammarAccess.getPackageIDAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleLangID
entryRuleLangID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLangIDRule()); } 
	 iv_ruleLangID=ruleLangID 
	 { $current=$iv_ruleLangID.current.getText(); }  
	 EOF 
;

// Rule LangID
ruleLangID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_IDENTIFIER_0=RULE_IDENTIFIER    {
		$current.merge(this_IDENTIFIER_0);
    }

    { 
    newLeafNode(this_IDENTIFIER_0, grammarAccess.getLangIDAccess().getIDENTIFIERTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleImportID
entryRuleImportID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportIDRule()); } 
	 iv_ruleImportID=ruleImportID 
	 { $current=$iv_ruleImportID.current.getText(); }  
	 EOF 
;

// Rule ImportID
ruleImportID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_IDENTIFIER_0=RULE_IDENTIFIER    {
		$current.merge(this_IDENTIFIER_0);
    }

    { 
    newLeafNode(this_IDENTIFIER_0, grammarAccess.getImportIDAccess().getIDENTIFIERTerminalRuleCall_0()); 
    }
(    this_POINT_1=RULE_POINT    {
		$current.merge(this_POINT_1);
    }

    { 
    newLeafNode(this_POINT_1, grammarAccess.getImportIDAccess().getPOINTTerminalRuleCall_1_0()); 
    }
    this_IDENTIFIER_2=RULE_IDENTIFIER    {
		$current.merge(this_IDENTIFIER_2);
    }

    { 
    newLeafNode(this_IDENTIFIER_2, grammarAccess.getImportIDAccess().getIDENTIFIERTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleInput
entryRuleInput returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInputRule()); }
	 iv_ruleInput=ruleInput 
	 { $current=$iv_ruleInput.current; } 
	 EOF 
;

// Rule Input
ruleInput returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getInputAccess().getInputAction_0(),
            $current);
    }
)


this_SOURCE_1=RULE_SOURCE
    { 
    newLeafNode(this_SOURCE_1, grammarAccess.getInputAccess().getSOURCETerminalRuleCall_1()); 
    }



(
(
this_SRCTEXT_2=RULE_SRCTEXT
    { 
    newLeafNode(this_SRCTEXT_2, grammarAccess.getInputAccess().getSRCTEXTTerminalRuleCall_2_0_0()); 
    }



this_ASSIGNASSINGLE_3=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_3, grammarAccess.getInputAccess().getASSIGNASSINGLETerminalRuleCall_2_0_1()); 
    }



(
(
		lv_text_4_0=RULE_STRING
		{
			newLeafNode(lv_text_4_0, grammarAccess.getInputAccess().getTextSTRINGTerminalRuleCall_2_0_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_4_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)


    |
(
this_FILE_5=RULE_FILE
    { 
    newLeafNode(this_FILE_5, grammarAccess.getInputAccess().getFILETerminalRuleCall_2_1_0()); 
    }



this_ASSIGNASSINGLE_6=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_6, grammarAccess.getInputAccess().getASSIGNASSINGLETerminalRuleCall_2_1_1()); 
    }



(
(
		lv_file_7_0=RULE_STRING
		{
			newLeafNode(lv_file_7_0, grammarAccess.getInputAccess().getFileSTRINGTerminalRuleCall_2_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInputRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"file",
        		lv_file_7_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)

)

)


;





// Entry rule entryRuleTokens
entryRuleTokens returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTokensRule()); }
	 iv_ruleTokens=ruleTokens 
	 { $current=$iv_ruleTokens.current; } 
	 EOF 
;

// Rule Tokens
ruleTokens returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getTokensAccess().getTokensAction_0(),
            $current);
    }
)


this_LEXER_1=RULE_LEXER
    { 
    newLeafNode(this_LEXER_1, grammarAccess.getTokensAccess().getLEXERTerminalRuleCall_1()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getTokensAccess().getTokensMyTokensParserRuleCall_2_0()); 
	    }
		lv_tokens_2_0=ruleMyTokens		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTokensRule());
	        }
       		add(
       			$current, 
       			"tokens",
        		lv_tokens_2_0, 
        		"at.jku.weiner.xtexttest.XtextTest.MyTokens");
	        afterParserOrEnumRuleCall();
	    }

)
)+

)


;





// Entry rule entryRuleMyTokens
entryRuleMyTokens returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyTokensRule()); }
	 iv_ruleMyTokens=ruleMyTokens 
	 { $current=$iv_ruleMyTokens.current; } 
	 EOF 
;

// Rule MyTokens
ruleMyTokens returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
(
		lv_token_0_0=RULE_IDENTIFIER
		{
			newLeafNode(lv_token_0_0, grammarAccess.getMyTokensAccess().getTokenIDENTIFIERTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMyTokensRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"token",
        		lv_token_0_0, 
        		"at.jku.weiner.xtexttest.XtextTest.IDENTIFIER");
	    }

)
)


(
this_ASSIGNASDATALIST_1=RULE_ASSIGNASDATALIST
    { 
    newLeafNode(this_ASSIGNASDATALIST_1, grammarAccess.getMyTokensAccess().getASSIGNASDATALISTTerminalRuleCall_1_0()); 
    }



(
(
		lv_count_2_0=RULE_INT
		{
			newLeafNode(lv_count_2_0, grammarAccess.getMyTokensAccess().getCountINTTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMyTokensRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"count",
        		lv_count_2_0, 
        		"org.eclipse.xtext.common.Terminals.INT");
	    }

)
)

)?

)


;





// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	 iv_ruleElement=ruleElement 
	 { $current=$iv_ruleElement.current; } 
	 EOF 
;

// Rule Element
ruleElement returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getElementAccess().getElementAction_0(),
            $current);
    }
)


this_LEFTPAREN_1=RULE_LEFTPAREN
    { 
    newLeafNode(this_LEFTPAREN_1, grammarAccess.getElementAccess().getLEFTPARENTerminalRuleCall_1()); 
    }



(
(
(
		lv_importing_2_0=RULE_IDENTIFIER
		{
			newLeafNode(lv_importing_2_0, grammarAccess.getElementAccess().getImportingIDENTIFIERTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"importing",
        		lv_importing_2_0, 
        		"at.jku.weiner.xtexttest.XtextTest.IDENTIFIER");
	    }

)
)


this_IMPORTER_3=RULE_IMPORTER
    { 
    newLeafNode(this_IMPORTER_3, grammarAccess.getElementAccess().getIMPORTERTerminalRuleCall_2_1()); 
    }


)?


(
(
		lv_name_4_0=RULE_IDENTIFIER
		{
			newLeafNode(lv_name_4_0, grammarAccess.getElementAccess().getNameIDENTIFIERTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getElementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_4_0, 
        		"at.jku.weiner.xtexttest.XtextTest.IDENTIFIER");
	    }

)
)


(
(
(
		{ 
	        newCompositeNode(grammarAccess.getElementAccess().getInnerInnerParserRuleCall_4_0_0()); 
	    }
		lv_inner_5_0=ruleInner		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElementRule());
	        }
       		add(
       			$current, 
       			"inner",
        		lv_inner_5_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Inner");
	        afterParserOrEnumRuleCall();
	    }

)
)


(
this_COMMA_6=RULE_COMMA
    { 
    newLeafNode(this_COMMA_6, grammarAccess.getElementAccess().getCOMMATerminalRuleCall_4_1_0()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getElementAccess().getInnerInnerParserRuleCall_4_1_1_0()); 
	    }
		lv_inner_7_0=ruleInner		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getElementRule());
	        }
       		add(
       			$current, 
       			"inner",
        		lv_inner_7_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Inner");
	        afterParserOrEnumRuleCall();
	    }

)
)

)*

)?


this_RIGHTPAREN_8=RULE_RIGHTPAREN
    { 
    newLeafNode(this_RIGHTPAREN_8, grammarAccess.getElementAccess().getRIGHTPARENTerminalRuleCall_5()); 
    }


)


;





// Entry rule entryRuleInner
entryRuleInner returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInnerRule()); }
	 iv_ruleInner=ruleInner 
	 { $current=$iv_ruleInner.current; } 
	 EOF 
;

// Rule Inner
ruleInner returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getInnerAccess().getInnerAction_0(),
            $current);
    }
)


(
(
		lv_parameter_1_0=RULE_IDENTIFIER
		{
			newLeafNode(lv_parameter_1_0, grammarAccess.getInnerAccess().getParameterIDENTIFIERTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInnerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"parameter",
        		lv_parameter_1_0, 
        		"at.jku.weiner.xtexttest.XtextTest.IDENTIFIER");
	    }

)
)


(
(
this_ASSIGNASSINGLE_2=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_2, grammarAccess.getInnerAccess().getASSIGNASSINGLETerminalRuleCall_2_0_0()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getInnerAccess().getAssignElementParserRuleCall_2_0_1_0()); 
	    }
		lv_assign_3_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInnerRule());
	        }
       		set(
       			$current, 
       			"assign",
        		lv_assign_3_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Element");
	        afterParserOrEnumRuleCall();
	    }

)
)

)


    |
(
this_ASSIGNASLIST_4=RULE_ASSIGNASLIST
    { 
    newLeafNode(this_ASSIGNASLIST_4, grammarAccess.getInnerAccess().getASSIGNASLISTTerminalRuleCall_2_1_0()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getInnerAccess().getAssignListElementParserRuleCall_2_1_1_0()); 
	    }
		lv_assignList_5_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInnerRule());
	        }
       		add(
       			$current, 
       			"assignList",
        		lv_assignList_5_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Element");
	        afterParserOrEnumRuleCall();
	    }

)
)


(
this_COMMA_6=RULE_COMMA
    { 
    newLeafNode(this_COMMA_6, grammarAccess.getInnerAccess().getCOMMATerminalRuleCall_2_1_2_0()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getInnerAccess().getAssignListElementParserRuleCall_2_1_2_1_0()); 
	    }
		lv_assignList_7_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInnerRule());
	        }
       		add(
       			$current, 
       			"assignList",
        		lv_assignList_7_0, 
        		"at.jku.weiner.xtexttest.XtextTest.Element");
	        afterParserOrEnumRuleCall();
	    }

)
)

)*

)


    |
(
this_ASSIGNASSTRING_8=RULE_ASSIGNASSTRING
    { 
    newLeafNode(this_ASSIGNASSTRING_8, grammarAccess.getInnerAccess().getASSIGNASSTRINGTerminalRuleCall_2_2_0()); 
    }



(
(
		lv_value_9_0=RULE_STRING
		{
			newLeafNode(lv_value_9_0, grammarAccess.getInnerAccess().getValueSTRINGTerminalRuleCall_2_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInnerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_9_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)


    |
(
this_ASSIGNASDATALIST_10=RULE_ASSIGNASDATALIST
    { 
    newLeafNode(this_ASSIGNASDATALIST_10, grammarAccess.getInnerAccess().getASSIGNASDATALISTTerminalRuleCall_2_3_0()); 
    }



(
(
		lv_assignAsData_11_0=RULE_STRING
		{
			newLeafNode(lv_assignAsData_11_0, grammarAccess.getInnerAccess().getAssignAsDataSTRINGTerminalRuleCall_2_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInnerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"assignAsData",
        		lv_assignAsData_11_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)


    |
(
this_ASSIGNASBOOL_12=RULE_ASSIGNASBOOL
    { 
    newLeafNode(this_ASSIGNASBOOL_12, grammarAccess.getInnerAccess().getASSIGNASBOOLTerminalRuleCall_2_4_0()); 
    }



(
(
(
		lv_assignAsBool_13_1=RULE_TRUE
		{
			newLeafNode(lv_assignAsBool_13_1, grammarAccess.getInnerAccess().getAssignAsBoolTRUETerminalRuleCall_2_4_1_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInnerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"assignAsBool",
        		lv_assignAsBool_13_1, 
        		"at.jku.weiner.xtexttest.XtextTest.TRUE");
	    }

    |		lv_assignAsBool_13_2=RULE_FALSE
		{
			newLeafNode(lv_assignAsBool_13_2, grammarAccess.getInnerAccess().getAssignAsBoolFALSETerminalRuleCall_2_4_1_0_1()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInnerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"assignAsBool",
        		lv_assignAsBool_13_2, 
        		"at.jku.weiner.xtexttest.XtextTest.FALSE");
	    }

)

)
)

)


    |
(
(
		lv_isNull_14_0=RULE_ISNULL
		{
			newLeafNode(lv_isNull_14_0, grammarAccess.getInnerAccess().getIsNullISNULLTerminalRuleCall_2_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInnerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"isNull",
        		true, 
        		"at.jku.weiner.xtexttest.XtextTest.ISNULL");
	    }

)
)

)

)


;





// Entry rule entryRuleGenerator
entryRuleGenerator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGeneratorRule()); }
	 iv_ruleGenerator=ruleGenerator 
	 { $current=$iv_ruleGenerator.current; } 
	 EOF 
;

// Rule Generator
ruleGenerator returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getGeneratorAccess().getGeneratorAction_0(),
            $current);
    }
)


(
this_OUTPUT_1=RULE_OUTPUT
    { 
    newLeafNode(this_OUTPUT_1, grammarAccess.getGeneratorAccess().getOUTPUTTerminalRuleCall_1_0()); 
    }



this_FILE_2=RULE_FILE
    { 
    newLeafNode(this_FILE_2, grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_1_1()); 
    }



this_ASSIGNASSINGLE_3=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_3, grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_1_2()); 
    }



(
(
		lv_output_4_0=RULE_STRING
		{
			newLeafNode(lv_output_4_0, grammarAccess.getGeneratorAccess().getOutputSTRINGTerminalRuleCall_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneratorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"output",
        		lv_output_4_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)


(
this_EXPECTED_5=RULE_EXPECTED
    { 
    newLeafNode(this_EXPECTED_5, grammarAccess.getGeneratorAccess().getEXPECTEDTerminalRuleCall_2_0()); 
    }



this_FILE_6=RULE_FILE
    { 
    newLeafNode(this_FILE_6, grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_2_1()); 
    }



(
(
this_ASSIGNASSINGLE_7=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_7, grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_2_2_0_0()); 
    }



(
(
		lv_expected_8_0=RULE_STRING
		{
			newLeafNode(lv_expected_8_0, grammarAccess.getGeneratorAccess().getExpectedSTRINGTerminalRuleCall_2_2_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneratorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"expected",
        		lv_expected_8_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)


    |
(
(
		lv_isSameAsInputFile_9_0=RULE_ISSAMEASINPUTFILE
		{
			newLeafNode(lv_isSameAsInputFile_9_0, grammarAccess.getGeneratorAccess().getIsSameAsInputFileISSAMEASINPUTFILETerminalRuleCall_2_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneratorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"isSameAsInputFile",
        		true, 
        		"at.jku.weiner.xtexttest.XtextTest.ISSAMEASINPUTFILE");
	    }

)
)

)

)


(
this_PATTERNS_10=RULE_PATTERNS
    { 
    newLeafNode(this_PATTERNS_10, grammarAccess.getGeneratorAccess().getPATTERNSTerminalRuleCall_3_0()); 
    }



(
this_FILE_11=RULE_FILE
    { 
    newLeafNode(this_FILE_11, grammarAccess.getGeneratorAccess().getFILETerminalRuleCall_3_1_0()); 
    }



this_ASSIGNASSINGLE_12=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_12, grammarAccess.getGeneratorAccess().getASSIGNASSINGLETerminalRuleCall_3_1_1()); 
    }



(
(
		lv_patternFile_13_0=RULE_STRING
		{
			newLeafNode(lv_patternFile_13_0, grammarAccess.getGeneratorAccess().getPatternFileSTRINGTerminalRuleCall_3_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGeneratorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"patternFile",
        		lv_patternFile_13_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)?


(
(
		{ 
	        newCompositeNode(grammarAccess.getGeneratorAccess().getReplacePatternsReplacePatternsParserRuleCall_3_2_0()); 
	    }
		lv_replacePatterns_14_0=ruleReplacePatterns		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGeneratorRule());
	        }
       		add(
       			$current, 
       			"replacePatterns",
        		lv_replacePatterns_14_0, 
        		"at.jku.weiner.xtexttest.XtextTest.ReplacePatterns");
	        afterParserOrEnumRuleCall();
	    }

)
)*

)?


(
this_EXPECTED_15=RULE_EXPECTED
    { 
    newLeafNode(this_EXPECTED_15, grammarAccess.getGeneratorAccess().getEXPECTEDTerminalRuleCall_4_0()); 
    }



this_EXCEPTIONS_16=RULE_EXCEPTIONS
    { 
    newLeafNode(this_EXCEPTIONS_16, grammarAccess.getGeneratorAccess().getEXCEPTIONSTerminalRuleCall_4_1()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getGeneratorAccess().getExceptionPackageIDParserRuleCall_4_2_0()); 
	    }
		lv_exception_17_0=rulePackageID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGeneratorRule());
	        }
       		set(
       			$current, 
       			"exception",
        		lv_exception_17_0, 
        		"at.jku.weiner.xtexttest.XtextTest.PackageID");
	        afterParserOrEnumRuleCall();
	    }

)
)

)?

)


;





// Entry rule entryRuleReplacePatterns
entryRuleReplacePatterns returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReplacePatternsRule()); }
	 iv_ruleReplacePatterns=ruleReplacePatterns 
	 { $current=$iv_ruleReplacePatterns.current; } 
	 EOF 
;

// Rule ReplacePatterns
ruleReplacePatterns returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
(
(
		lv_regex_0_0=RULE_STRING
		{
			newLeafNode(lv_regex_0_0, grammarAccess.getReplacePatternsAccess().getRegexSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReplacePatternsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"regex",
        		lv_regex_0_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)


this_ASSIGNASSINGLE_1=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_1, grammarAccess.getReplacePatternsAccess().getASSIGNASSINGLETerminalRuleCall_1()); 
    }



(
(
		lv_replace_2_0=RULE_STRING
		{
			newLeafNode(lv_replace_2_0, grammarAccess.getReplacePatternsAccess().getReplaceSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getReplacePatternsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"replace",
        		lv_replace_2_0, 
        		"org.eclipse.xtext.common.Terminals.STRING");
	    }

)
)

)


;





// Entry rule entryRuleBefore
entryRuleBefore returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBeforeRule()); }
	 iv_ruleBefore=ruleBefore 
	 { $current=$iv_ruleBefore.current; } 
	 EOF 
;

// Rule Before
ruleBefore returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
this_BEFORE_KW_0=RULE_BEFORE_KW
    { 
    newLeafNode(this_BEFORE_KW_0, grammarAccess.getBeforeAccess().getBEFORE_KWTerminalRuleCall_0()); 
    }



this_CLASS_KW_1=RULE_CLASS_KW
    { 
    newLeafNode(this_CLASS_KW_1, grammarAccess.getBeforeAccess().getCLASS_KWTerminalRuleCall_1()); 
    }



this_ASSIGNASSINGLE_2=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_2, grammarAccess.getBeforeAccess().getASSIGNASSINGLETerminalRuleCall_2()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getBeforeAccess().getMyclassPackageIDParserRuleCall_3_0()); 
	    }
		lv_myclass_3_0=rulePackageID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBeforeRule());
	        }
       		set(
       			$current, 
       			"myclass",
        		lv_myclass_3_0, 
        		"at.jku.weiner.xtexttest.XtextTest.PackageID");
	        afterParserOrEnumRuleCall();
	    }

)
)


this_METHOD_KW_4=RULE_METHOD_KW
    { 
    newLeafNode(this_METHOD_KW_4, grammarAccess.getBeforeAccess().getMETHOD_KWTerminalRuleCall_4()); 
    }



this_ASSIGNASSINGLE_5=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_5, grammarAccess.getBeforeAccess().getASSIGNASSINGLETerminalRuleCall_5()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getBeforeAccess().getMethodPackageIDParserRuleCall_6_0()); 
	    }
		lv_method_6_0=rulePackageID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBeforeRule());
	        }
       		set(
       			$current, 
       			"method",
        		lv_method_6_0, 
        		"at.jku.weiner.xtexttest.XtextTest.PackageID");
	        afterParserOrEnumRuleCall();
	    }

)
)


this_LEFTPAREN_7=RULE_LEFTPAREN
    { 
    newLeafNode(this_LEFTPAREN_7, grammarAccess.getBeforeAccess().getLEFTPARENTerminalRuleCall_7()); 
    }



this_RIGHTPAREN_8=RULE_RIGHTPAREN
    { 
    newLeafNode(this_RIGHTPAREN_8, grammarAccess.getBeforeAccess().getRIGHTPARENTerminalRuleCall_8()); 
    }


)


;





// Entry rule entryRuleAfter
entryRuleAfter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAfterRule()); }
	 iv_ruleAfter=ruleAfter 
	 { $current=$iv_ruleAfter.current; } 
	 EOF 
;

// Rule After
ruleAfter returns [EObject current=null] 
    @init { enterRule();
   		/*no init found*/
    }
    @after { leaveRule();
    		/*no after found*/
     }:

(
this_AFTER_KW_0=RULE_AFTER_KW
    { 
    newLeafNode(this_AFTER_KW_0, grammarAccess.getAfterAccess().getAFTER_KWTerminalRuleCall_0()); 
    }



this_CLASS_KW_1=RULE_CLASS_KW
    { 
    newLeafNode(this_CLASS_KW_1, grammarAccess.getAfterAccess().getCLASS_KWTerminalRuleCall_1()); 
    }



this_ASSIGNASSINGLE_2=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_2, grammarAccess.getAfterAccess().getASSIGNASSINGLETerminalRuleCall_2()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getAfterAccess().getMyclassPackageIDParserRuleCall_3_0()); 
	    }
		lv_myclass_3_0=rulePackageID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAfterRule());
	        }
       		set(
       			$current, 
       			"myclass",
        		lv_myclass_3_0, 
        		"at.jku.weiner.xtexttest.XtextTest.PackageID");
	        afterParserOrEnumRuleCall();
	    }

)
)


this_METHOD_KW_4=RULE_METHOD_KW
    { 
    newLeafNode(this_METHOD_KW_4, grammarAccess.getAfterAccess().getMETHOD_KWTerminalRuleCall_4()); 
    }



this_ASSIGNASSINGLE_5=RULE_ASSIGNASSINGLE
    { 
    newLeafNode(this_ASSIGNASSINGLE_5, grammarAccess.getAfterAccess().getASSIGNASSINGLETerminalRuleCall_5()); 
    }



(
(
		{ 
	        newCompositeNode(grammarAccess.getAfterAccess().getMethodPackageIDParserRuleCall_6_0()); 
	    }
		lv_method_6_0=rulePackageID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAfterRule());
	        }
       		set(
       			$current, 
       			"method",
        		lv_method_6_0, 
        		"at.jku.weiner.xtexttest.XtextTest.PackageID");
	        afterParserOrEnumRuleCall();
	    }

)
)


this_LEFTPAREN_7=RULE_LEFTPAREN
    { 
    newLeafNode(this_LEFTPAREN_7, grammarAccess.getAfterAccess().getLEFTPARENTerminalRuleCall_7()); 
    }



this_RIGHTPAREN_8=RULE_RIGHTPAREN
    { 
    newLeafNode(this_RIGHTPAREN_8, grammarAccess.getAfterAccess().getRIGHTPARENTerminalRuleCall_8()); 
    }


)


;





RULE_PACKAGE : 'package';

RULE_LANGUAGE : 'language';

RULE_IMPORTS : 'imports';

RULE_POINT : '.';

RULE_SPLITLEXER : 'split-lexer';

RULE_SOURCE : 'source';

RULE_SRCTEXT : 'text';

RULE_FILE : 'file';

RULE_LEXER : 'lexer-tokens';

RULE_OUTPUT : 'output';

RULE_EXPECTED : 'expected';

RULE_ISSAMEASINPUTFILE : 'isSameAsInputFile';

RULE_PATTERNS : 'replacePatterns';

RULE_EXCEPTIONS : 'exceptions';

RULE_BEFORE_KW : 'before';

RULE_AFTER_KW : 'after';

RULE_CLASS_KW : 'class';

RULE_METHOD_KW : 'method';

RULE_ISNULL : 'isNull';

RULE_LEFTPAREN : '(';

RULE_RIGHTPAREN : ')';

RULE_ASSIGNASBOOL : '?=';

RULE_TRUE : 'true';

RULE_FALSE : 'false';

RULE_ASSIGNASSINGLE : '=';

RULE_ASSIGNASLIST : '+=';

RULE_ASSIGNASSTRING : '++';

RULE_ASSIGNASDATALIST : '+*';

RULE_COMMA : ',';

RULE_IDENTIFIER : RULE_ID;

RULE_IMPORTER : '::';

fragment RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


