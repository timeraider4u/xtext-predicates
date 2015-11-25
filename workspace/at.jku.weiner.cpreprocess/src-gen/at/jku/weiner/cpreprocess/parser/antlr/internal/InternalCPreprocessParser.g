/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
parser grammar InternalCPreprocessParser;

options {
	tokenVocab=InternalCPreprocessLexer;
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	
}

@header {
package at.jku.weiner.cpreprocess.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.weiner.cpreprocess.services.CPreprocessGrammarAccess;

}

@members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/
 

	private CPreprocessGrammarAccess grammarAccess;
	 	
	public InternalCPreprocessParser(TokenStream input, CPreprocessGrammarAccess grammarAccess) {
		this(input);
		this.grammarAccess = grammarAccess;
		registerRules(grammarAccess.getGrammar());
	}
	
	@Override
	protected String getFirstRuleName() {
		return "Model";	
	} 
	   	   	
	@Override
	protected CPreprocessGrammarAccess getGrammarAccess() {
		return grammarAccess;
	}
}

@rulecatch { 
	catch (RecognitionException re) { 
	    recover(input,re); 
	    appendSkippedTokens();
	}
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getUnitsTranslationUnitParserRuleCall_1_0()); 
	    }
		lv_units_1_0=ruleTranslationUnit		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"units",
        		lv_units_1_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.TranslationUnit");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleTranslationUnit
entryRuleTranslationUnit returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getTranslationUnitRule()); }
	 iv_ruleTranslationUnit=ruleTranslationUnit 
	 { $current=$iv_ruleTranslationUnit.current; } 
	 EOF 
;

// Rule TranslationUnit
ruleTranslationUnit returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getTranslationUnitAccess().getTranslationUnitAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getTranslationUnitAccess().getGroupGroupOptParserRuleCall_1_0()); 
	    }
		lv_group_1_0=ruleGroupOpt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTranslationUnitRule());
	        }
       		set(
       			$current, 
       			"group",
        		lv_group_1_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.GroupOpt");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleGroupOpt
entryRuleGroupOpt returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getGroupOptRule()); }
	 iv_ruleGroupOpt=ruleGroupOpt 
	 { $current=$iv_ruleGroupOpt.current; } 
	 EOF 
;

// Rule GroupOpt
ruleGroupOpt returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getGroupOptAccess().getGroupOptAction_0(),
            $current);
    }
)((
(
		{ 
	        newCompositeNode(grammarAccess.getGroupOptAccess().getLinesPreprocessorDirectivesParserRuleCall_1_0_0()); 
	    }
		lv_lines_1_0=rulePreprocessorDirectives		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupOptRule());
	        }
       		add(
       			$current, 
       			"lines",
        		lv_lines_1_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.PreprocessorDirectives");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupOptAccess().getLinesNewLineLineParserRuleCall_1_1_0()); 
	    }
		lv_lines_2_0=ruleNewLineLine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupOptRule());
	        }
       		add(
       			$current, 
       			"lines",
        		lv_lines_2_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.NewLineLine");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupOptAccess().getLinesCodeParserRuleCall_1_2_0()); 
	    }
		lv_lines_3_0=ruleCode		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupOptRule());
	        }
       		add(
       			$current, 
       			"lines",
        		lv_lines_3_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.Code");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePreprocessorDirectives
entryRulePreprocessorDirectives returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPreprocessorDirectivesRule()); }
	 iv_rulePreprocessorDirectives=rulePreprocessorDirectives 
	 { $current=$iv_rulePreprocessorDirectives.current; } 
	 EOF 
;

// Rule PreprocessorDirectives
rulePreprocessorDirectives returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getPreprocessorDirectivesAccess().getPreprocessorDirectivesAction_0(),
            $current);
    }
)(this_WS_1=RULE_WS
    { 
    newLeafNode(this_WS_1, grammarAccess.getPreprocessorDirectivesAccess().getWSTerminalRuleCall_1()); 
    }
)*this_HASH_2=RULE_HASH
    { 
    newLeafNode(this_HASH_2, grammarAccess.getPreprocessorDirectivesAccess().getHASHTerminalRuleCall_2()); 
    }
(this_WS_3=RULE_WS
    { 
    newLeafNode(this_WS_3, grammarAccess.getPreprocessorDirectivesAccess().getWSTerminalRuleCall_3()); 
    }
)*((
(
		{ 
	        newCompositeNode(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveIncludeDirectiveParserRuleCall_4_0_0()); 
	    }
		lv_directive_4_0=ruleIncludeDirective		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreprocessorDirectivesRule());
	        }
       		set(
       			$current, 
       			"directive",
        		lv_directive_4_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.IncludeDirective");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveDefineDirectiveParserRuleCall_4_1_0()); 
	    }
		lv_directive_5_0=ruleDefineDirective		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreprocessorDirectivesRule());
	        }
       		set(
       			$current, 
       			"directive",
        		lv_directive_5_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.DefineDirective");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveErrorDirectiveParserRuleCall_4_2_0()); 
	    }
		lv_directive_6_0=ruleErrorDirective		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreprocessorDirectivesRule());
	        }
       		set(
       			$current, 
       			"directive",
        		lv_directive_6_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.ErrorDirective");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveUnDefineDirectiveParserRuleCall_4_3_0()); 
	    }
		lv_directive_7_0=ruleUnDefineDirective		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreprocessorDirectivesRule());
	        }
       		set(
       			$current, 
       			"directive",
        		lv_directive_7_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.UnDefineDirective");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getPreprocessorDirectivesAccess().getDirectivePragmaDirectiveParserRuleCall_4_4_0()); 
	    }
		lv_directive_8_0=rulePragmaDirective		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreprocessorDirectivesRule());
	        }
       		set(
       			$current, 
       			"directive",
        		lv_directive_8_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.PragmaDirective");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveNullDirectiveParserRuleCall_4_5_0()); 
	    }
		lv_directive_9_0=ruleNullDirective		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPreprocessorDirectivesRule());
	        }
       		set(
       			$current, 
       			"directive",
        		lv_directive_9_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.NullDirective");
	        afterParserOrEnumRuleCall();
	    }

)
))this_NEWLINE_10=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_10, grammarAccess.getPreprocessorDirectivesAccess().getNEWLINETerminalRuleCall_5()); 
    }
)
;





// Entry rule entryRuleIncludeDirective
entryRuleIncludeDirective returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getIncludeDirectiveRule()); }
	 iv_ruleIncludeDirective=ruleIncludeDirective 
	 { $current=$iv_ruleIncludeDirective.current; } 
	 EOF 
;

// Rule IncludeDirective
ruleIncludeDirective returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getIncludeDirectiveAccess().getIncludeDirectiveAction_0(),
            $current);
    }
)this_INCLUDE_1=RULE_INCLUDE
    { 
    newLeafNode(this_INCLUDE_1, grammarAccess.getIncludeDirectiveAccess().getINCLUDETerminalRuleCall_1()); 
    }
(this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getIncludeDirectiveAccess().getWSTerminalRuleCall_2()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getIncludeDirectiveAccess().getStringMyCodeLineParserRuleCall_3_0()); 
	    }
		lv_string_3_0=ruleMyCodeLine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIncludeDirectiveRule());
	        }
       		set(
       			$current, 
       			"string",
        		lv_string_3_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.MyCodeLine");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDefineDirective
entryRuleDefineDirective returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getDefineDirectiveRule()); }
	 iv_ruleDefineDirective=ruleDefineDirective 
	 { $current=$iv_ruleDefineDirective.current; } 
	 EOF 
;

// Rule DefineDirective
ruleDefineDirective returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getDefineDirectiveAccess().getDefineObjectMacroParserRuleCall_0()); 
    }
    this_DefineObjectMacro_0=ruleDefineObjectMacro
    {
        $current = $this_DefineObjectMacro_0.current;
        afterParserOrEnumRuleCall();
    }

    |
	{ 
	  /* */ 
	}
    { 
        newCompositeNode(grammarAccess.getDefineDirectiveAccess().getDefineFunctionLikeMacroParserRuleCall_1()); 
    }
    this_DefineFunctionLikeMacro_1=ruleDefineFunctionLikeMacro
    {
        $current = $this_DefineFunctionLikeMacro_1.current;
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleDefineObjectMacro
entryRuleDefineObjectMacro returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getDefineObjectMacroRule()); }
	 iv_ruleDefineObjectMacro=ruleDefineObjectMacro 
	 { $current=$iv_ruleDefineObjectMacro.current; } 
	 EOF 
;

// Rule DefineObjectMacro
ruleDefineObjectMacro returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getDefineObjectMacroAccess().getDefineObjectMacroAction_0(),
            $current);
    }
)this_DEFINE_1=RULE_DEFINE
    { 
    newLeafNode(this_DEFINE_1, grammarAccess.getDefineObjectMacroAccess().getDEFINETerminalRuleCall_1()); 
    }
(this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getDefineObjectMacroAccess().getWSTerminalRuleCall_2()); 
    }
)+(
(
		lv_id_3_0=RULE_ID
		{
			newLeafNode(lv_id_3_0, grammarAccess.getDefineObjectMacroAccess().getIdIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefineObjectMacroRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_3_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.ID");
	    }

)
)((this_WS_4=RULE_WS
    { 
    newLeafNode(this_WS_4, grammarAccess.getDefineObjectMacroAccess().getWSTerminalRuleCall_4_0()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getDefineObjectMacroAccess().getStringMyDefineLineParserRuleCall_4_1_0()); 
	    }
		lv_string_5_0=ruleMyDefineLine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefineObjectMacroRule());
	        }
       		set(
       			$current, 
       			"string",
        		lv_string_5_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.MyDefineLine");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleDefineFunctionLikeMacro
entryRuleDefineFunctionLikeMacro returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getDefineFunctionLikeMacroRule()); }
	 iv_ruleDefineFunctionLikeMacro=ruleDefineFunctionLikeMacro 
	 { $current=$iv_ruleDefineFunctionLikeMacro.current; } 
	 EOF 
;

// Rule DefineFunctionLikeMacro
ruleDefineFunctionLikeMacro returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getDefineFunctionLikeMacroAccess().getDefineFunctionLikeMacroAction_0(),
            $current);
    }
)this_DEFINE_1=RULE_DEFINE
    { 
    newLeafNode(this_DEFINE_1, grammarAccess.getDefineFunctionLikeMacroAccess().getDEFINETerminalRuleCall_1()); 
    }
(this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getDefineFunctionLikeMacroAccess().getWSTerminalRuleCall_2()); 
    }
)+(
(
		lv_id_3_0=RULE_ID
		{
			newLeafNode(lv_id_3_0, grammarAccess.getDefineFunctionLikeMacroAccess().getIdIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefineFunctionLikeMacroRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_3_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.ID");
	    }

)
)this_LPAREN_4=RULE_LPAREN
    { 
    newLeafNode(this_LPAREN_4, grammarAccess.getDefineFunctionLikeMacroAccess().getLPARENTerminalRuleCall_4()); 
    }
(this_WS_5=RULE_WS
    { 
    newLeafNode(this_WS_5, grammarAccess.getDefineFunctionLikeMacroAccess().getWSTerminalRuleCall_5()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getDefineFunctionLikeMacroAccess().getListIdentifierListParserRuleCall_6_0()); 
	    }
		lv_list_6_0=ruleIdentifierList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefineFunctionLikeMacroRule());
	        }
       		set(
       			$current, 
       			"list",
        		lv_list_6_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.IdentifierList");
	        afterParserOrEnumRuleCall();
	    }

)
)?this_RPAREN_7=RULE_RPAREN
    { 
    newLeafNode(this_RPAREN_7, grammarAccess.getDefineFunctionLikeMacroAccess().getRPARENTerminalRuleCall_7()); 
    }
(this_WS_8=RULE_WS
    { 
    newLeafNode(this_WS_8, grammarAccess.getDefineFunctionLikeMacroAccess().getWSTerminalRuleCall_8()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getDefineFunctionLikeMacroAccess().getStringMyDefineLineParserRuleCall_9_0()); 
	    }
		lv_string_9_0=ruleMyDefineLine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefineFunctionLikeMacroRule());
	        }
       		set(
       			$current, 
       			"string",
        		lv_string_9_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.MyDefineLine");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleIdentifierList
entryRuleIdentifierList returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getIdentifierListRule()); }
	 iv_ruleIdentifierList=ruleIdentifierList 
	 { $current=$iv_ruleIdentifierList.current; } 
	 EOF 
;

// Rule IdentifierList
ruleIdentifierList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getIdentifierListAccess().getIdentifierListAction_0(),
            $current);
    }
)(
(
		lv_id_1_0=RULE_ID
		{
			newLeafNode(lv_id_1_0, grammarAccess.getIdentifierListAccess().getIdIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIdentifierListRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_1_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.ID");
	    }

)
)(this_COMMA_2=RULE_COMMA
    { 
    newLeafNode(this_COMMA_2, grammarAccess.getIdentifierListAccess().getCOMMATerminalRuleCall_2_0()); 
    }
(this_WS_3=RULE_WS
    { 
    newLeafNode(this_WS_3, grammarAccess.getIdentifierListAccess().getWSTerminalRuleCall_2_1()); 
    }
)*(
(
		lv_id_4_0=RULE_ID
		{
			newLeafNode(lv_id_4_0, grammarAccess.getIdentifierListAccess().getIdIDTerminalRuleCall_2_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIdentifierListRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_4_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.ID");
	    }

)
))*)
;





// Entry rule entryRuleErrorDirective
entryRuleErrorDirective returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getErrorDirectiveRule()); }
	 iv_ruleErrorDirective=ruleErrorDirective 
	 { $current=$iv_ruleErrorDirective.current; } 
	 EOF 
;

// Rule ErrorDirective
ruleErrorDirective returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getErrorDirectiveAccess().getErrorDirectiveAction_0(),
            $current);
    }
)this_ERROR_1=RULE_ERROR
    { 
    newLeafNode(this_ERROR_1, grammarAccess.getErrorDirectiveAccess().getERRORTerminalRuleCall_1()); 
    }
(this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getErrorDirectiveAccess().getWSTerminalRuleCall_2()); 
    }
)+(
(
		{ 
	        newCompositeNode(grammarAccess.getErrorDirectiveAccess().getMsgMyCodeLineParserRuleCall_3_0()); 
	    }
		lv_msg_3_0=ruleMyCodeLine		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getErrorDirectiveRule());
	        }
       		set(
       			$current, 
       			"msg",
        		lv_msg_3_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.MyCodeLine");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleUnDefineDirective
entryRuleUnDefineDirective returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getUnDefineDirectiveRule()); }
	 iv_ruleUnDefineDirective=ruleUnDefineDirective 
	 { $current=$iv_ruleUnDefineDirective.current; } 
	 EOF 
;

// Rule UnDefineDirective
ruleUnDefineDirective returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getUnDefineDirectiveAccess().getUnDefineDirectiveAction_0(),
            $current);
    }
)this_UNDEF_1=RULE_UNDEF
    { 
    newLeafNode(this_UNDEF_1, grammarAccess.getUnDefineDirectiveAccess().getUNDEFTerminalRuleCall_1()); 
    }
(this_WS_2=RULE_WS
    { 
    newLeafNode(this_WS_2, grammarAccess.getUnDefineDirectiveAccess().getWSTerminalRuleCall_2()); 
    }
)+(
(
		lv_id_3_0=RULE_ID
		{
			newLeafNode(lv_id_3_0, grammarAccess.getUnDefineDirectiveAccess().getIdIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUnDefineDirectiveRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_3_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.ID");
	    }

)
))
;





// Entry rule entryRulePragmaDirective
entryRulePragmaDirective returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getPragmaDirectiveRule()); }
	 iv_rulePragmaDirective=rulePragmaDirective 
	 { $current=$iv_rulePragmaDirective.current; } 
	 EOF 
;

// Rule PragmaDirective
rulePragmaDirective returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getPragmaDirectiveAccess().getPragmaDirectiveAction_0(),
            $current);
    }
)this_PRAGMA_1=RULE_PRAGMA
    { 
    newLeafNode(this_PRAGMA_1, grammarAccess.getPragmaDirectiveAccess().getPRAGMATerminalRuleCall_1()); 
    }
)
;





// Entry rule entryRuleNullDirective
entryRuleNullDirective returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getNullDirectiveRule()); }
	 iv_ruleNullDirective=ruleNullDirective 
	 { $current=$iv_ruleNullDirective.current; } 
	 EOF 
;

// Rule NullDirective
ruleNullDirective returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getNullDirectiveAccess().getNullDirectiveAction(),
            $current);
    }
)
;





// Entry rule entryRuleNewLineLine
entryRuleNewLineLine returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getNewLineLineRule()); }
	 iv_ruleNewLineLine=ruleNewLineLine 
	 { $current=$iv_ruleNewLineLine.current; } 
	 EOF 
;

// Rule NewLineLine
ruleNewLineLine returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getNewLineLineAccess().getNewLineLineAction_0(),
            $current);
    }
)this_NEWLINE_1=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_1, grammarAccess.getNewLineLineAccess().getNEWLINETerminalRuleCall_1()); 
    }
)
;





// Entry rule entryRuleCode
entryRuleCode returns [EObject current=null]
	:
	{ newCompositeNode(grammarAccess.getCodeRule()); }
	 iv_ruleCode=ruleCode 
	 { $current=$iv_ruleCode.current; } 
	 EOF 
;

// Rule Code
ruleCode returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	{ 
	  /* */ 
	}
    {
        $current = forceCreateModelElement(
            grammarAccess.getCodeAccess().getCodeAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCodeAccess().getCodeMyCodeLineExtendedParserRuleCall_1_0()); 
	    }
		lv_code_1_0=ruleMyCodeLineExtended		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCodeRule());
	        }
       		set(
       			$current, 
       			"code",
        		lv_code_1_0, 
        		"at.jku.weiner.cpreprocess.CPreprocess.MyCodeLineExtended");
	        afterParserOrEnumRuleCall();
	    }

)
)this_NEWLINE_2=RULE_NEWLINE
    { 
    newLeafNode(this_NEWLINE_2, grammarAccess.getCodeAccess().getNEWLINETerminalRuleCall_2()); 
    }
)
;





// Entry rule entryRuleMyCode
entryRuleMyCode returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getMyCodeRule()); } 
	 iv_ruleMyCode=ruleMyCode 
	 { $current=$iv_ruleMyCode.current.getText(); }  
	 EOF 
;

// Rule MyCode
ruleMyCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getMyCodeAccess().getIDTerminalRuleCall_0()); 
    }

    |    this_SPECIAL_1=RULE_SPECIAL    {
		$current.merge(this_SPECIAL_1);
    }

    { 
    newLeafNode(this_SPECIAL_1, grammarAccess.getMyCodeAccess().getSPECIALTerminalRuleCall_1()); 
    }

    |    this_INCLUDE_2=RULE_INCLUDE    {
		$current.merge(this_INCLUDE_2);
    }

    { 
    newLeafNode(this_INCLUDE_2, grammarAccess.getMyCodeAccess().getINCLUDETerminalRuleCall_2()); 
    }

    |    this_DEFINE_3=RULE_DEFINE    {
		$current.merge(this_DEFINE_3);
    }

    { 
    newLeafNode(this_DEFINE_3, grammarAccess.getMyCodeAccess().getDEFINETerminalRuleCall_3()); 
    }

    |    this_ERROR_4=RULE_ERROR    {
		$current.merge(this_ERROR_4);
    }

    { 
    newLeafNode(this_ERROR_4, grammarAccess.getMyCodeAccess().getERRORTerminalRuleCall_4()); 
    }

    |    this_PRAGMA_5=RULE_PRAGMA    {
		$current.merge(this_PRAGMA_5);
    }

    { 
    newLeafNode(this_PRAGMA_5, grammarAccess.getMyCodeAccess().getPRAGMATerminalRuleCall_5()); 
    }

    |    this_LPAREN_6=RULE_LPAREN    {
		$current.merge(this_LPAREN_6);
    }

    { 
    newLeafNode(this_LPAREN_6, grammarAccess.getMyCodeAccess().getLPARENTerminalRuleCall_6()); 
    }

    |    this_RPAREN_7=RULE_RPAREN    {
		$current.merge(this_RPAREN_7);
    }

    { 
    newLeafNode(this_RPAREN_7, grammarAccess.getMyCodeAccess().getRPARENTerminalRuleCall_7()); 
    }

    |    this_COMMA_8=RULE_COMMA    {
		$current.merge(this_COMMA_8);
    }

    { 
    newLeafNode(this_COMMA_8, grammarAccess.getMyCodeAccess().getCOMMATerminalRuleCall_8()); 
    }
)
    ;





// Entry rule entryRuleMyDefineLine
entryRuleMyDefineLine returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getMyDefineLineRule()); } 
	 iv_ruleMyDefineLine=ruleMyDefineLine 
	 { $current=$iv_ruleMyDefineLine.current.getText(); }  
	 EOF 
;

// Rule MyDefineLine
ruleMyDefineLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
    { 
        newCompositeNode(grammarAccess.getMyDefineLineAccess().getMyCodeParserRuleCall_0()); 
    }
    this_MyCode_0=ruleMyCode    {
		$current.merge(this_MyCode_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |    this_WS_1=RULE_WS    {
		$current.merge(this_WS_1);
    }

    { 
    newLeafNode(this_WS_1, grammarAccess.getMyDefineLineAccess().getWSTerminalRuleCall_1()); 
    }

    |    this_HASH_2=RULE_HASH    {
		$current.merge(this_HASH_2);
    }

    { 
    newLeafNode(this_HASH_2, grammarAccess.getMyDefineLineAccess().getHASHTerminalRuleCall_2()); 
    }
)*
    ;





// Entry rule entryRuleMyCodeLine
entryRuleMyCodeLine returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getMyCodeLineRule()); } 
	 iv_ruleMyCodeLine=ruleMyCodeLine 
	 { $current=$iv_ruleMyCodeLine.current.getText(); }  
	 EOF 
;

// Rule MyCodeLine
ruleMyCodeLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
(
    { 
        newCompositeNode(grammarAccess.getMyCodeLineAccess().getMyCodeParserRuleCall_0()); 
    }
    this_MyCode_0=ruleMyCode    {
		$current.merge(this_MyCode_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |    this_WS_1=RULE_WS    {
		$current.merge(this_WS_1);
    }

    { 
    newLeafNode(this_WS_1, grammarAccess.getMyCodeLineAccess().getWSTerminalRuleCall_1()); 
    }
)+
    ;





// Entry rule entryRuleMyCodeLineExtended
entryRuleMyCodeLineExtended returns [String current=null] 
:
	{ newCompositeNode(grammarAccess.getMyCodeLineExtendedRule()); } 
	 iv_ruleMyCodeLineExtended=ruleMyCodeLineExtended 
	 { $current=$iv_ruleMyCodeLineExtended.current.getText(); }  
	 EOF 
;

// Rule MyCodeLineExtended
ruleMyCodeLineExtended returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule();
    }:
((    this_WS_0=RULE_WS    {
		$current.merge(this_WS_0);
    }

    { 
    newLeafNode(this_WS_0, grammarAccess.getMyCodeLineExtendedAccess().getWSTerminalRuleCall_0()); 
    }
)*(
    { 
        newCompositeNode(grammarAccess.getMyCodeLineExtendedAccess().getMyCodeParserRuleCall_1_0()); 
    }
    this_MyCode_1=ruleMyCode    {
		$current.merge(this_MyCode_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
    { 
        newCompositeNode(grammarAccess.getMyCodeLineExtendedAccess().getMyCodeLineParserRuleCall_1_1_0()); 
    }
    this_MyCodeLine_2=ruleMyCodeLine    {
		$current.merge(this_MyCodeLine_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |    this_HASH_3=RULE_HASH    {
		$current.merge(this_HASH_3);
    }

    { 
    newLeafNode(this_HASH_3, grammarAccess.getMyCodeLineExtendedAccess().getHASHTerminalRuleCall_1_1_1()); 
    }
)*)?)
    ;





