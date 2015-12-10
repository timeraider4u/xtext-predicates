/*
 * generated by Xtext
 */
grammar InternalDotconfig;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.jku.isse.ecco.kefax.dotconfig.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.jku.isse.ecco.kefax.dotconfig.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.isse.ecco.kefax.dotconfig.services.DotconfigGrammarAccess;

}

@parser::members {

 	private DotconfigGrammarAccess grammarAccess;
 	
    public InternalDotconfigParser(TokenStream input, DotconfigGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "DotConfigModel";	
   	}
   	
   	@Override
   	protected DotconfigGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleDotConfigModel
entryRuleDotConfigModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDotConfigModelRule()); }
	 iv_ruleDotConfigModel=ruleDotConfigModel 
	 { $current=$iv_ruleDotConfigModel.current; } 
	 EOF 
;

// Rule DotConfigModel
ruleDotConfigModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDotConfigModelAccess().getDotConfigModelAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDotConfigModelAccess().getConfigsConfigParserRuleCall_1_0()); 
	    }
		lv_Configs_1_0=ruleConfig		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDotConfigModelRule());
	        }
       		add(
       			$current, 
       			"Configs",
        		lv_Configs_1_0, 
        		"Config");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
    { 
        newCompositeNode(grammarAccess.getDotConfigModelAccess().getEolParserRuleCall_2_0()); 
    }
ruleEol
    { 
        afterParserOrEnumRuleCall();
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDotConfigModelAccess().getConfigsConfigParserRuleCall_2_1_0()); 
	    }
		lv_Configs_3_0=ruleConfig		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDotConfigModelRule());
	        }
       		add(
       			$current, 
       			"Configs",
        		lv_Configs_3_0, 
        		"Config");
	        afterParserOrEnumRuleCall();
	    }

)
))*(
    { 
        newCompositeNode(grammarAccess.getDotConfigModelAccess().getEolParserRuleCall_3()); 
    }
ruleEol
    { 
        afterParserOrEnumRuleCall();
    }
)?)
;





// Entry rule entryRuleConfig
entryRuleConfig returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConfigRule()); }
	 iv_ruleConfig=ruleConfig 
	 { $current=$iv_ruleConfig.current; } 
	 EOF 
;

// Rule Config
ruleConfig returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConfigAccess().getConfigStringAction_0_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_SYMBOL
		{
			newLeafNode(lv_name_1_0, grammarAccess.getConfigAccess().getNameSYMBOLTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"SYMBOL");
	    }

)
)this_EQ_2=RULE_EQ
    { 
    newLeafNode(this_EQ_2, grammarAccess.getConfigAccess().getEQTerminalRuleCall_0_2()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConfigAccess().getVValueParserRuleCall_0_3_0()); 
	    }
		lv_v_3_0=rulevalue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConfigRule());
	        }
       		set(
       			$current, 
       			"v",
        		lv_v_3_0, 
        		"value");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConfigAccess().getConfigLogicAction_1_0(),
            $current);
    }
)(
(
		lv_name_5_0=RULE_SYMBOL
		{
			newLeafNode(lv_name_5_0, grammarAccess.getConfigAccess().getNameSYMBOLTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_5_0, 
        		"SYMBOL");
	    }

)
)this_EQ_6=RULE_EQ
    { 
    newLeafNode(this_EQ_6, grammarAccess.getConfigAccess().getEQTerminalRuleCall_1_2()); 
    }
(
(
		lv_v_7_0=RULE_LOGIC_SYM
		{
			newLeafNode(lv_v_7_0, grammarAccess.getConfigAccess().getVLOGIC_SYMTerminalRuleCall_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"v",
        		lv_v_7_0, 
        		"LOGIC_SYM");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConfigAccess().getConfigLogicAction_2_0(),
            $current);
    }
)(
(
		lv_name_9_0=RULE_SL_COMMENT_NOT
		{
			newLeafNode(lv_name_9_0, grammarAccess.getConfigAccess().getNameSL_COMMENT_NOTTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConfigRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_9_0, 
        		"SL_COMMENT_NOT");
	    }

)
)))
;





// Entry rule entryRulevalue
entryRulevalue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); } 
	 iv_rulevalue=rulevalue 
	 { $current=$iv_rulevalue.current.getText(); }  
	 EOF 
;

// Rule value
rulevalue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_S_HEX_0=RULE_S_HEX    {
		$current.merge(this_S_HEX_0);
    }

    { 
    newLeafNode(this_S_HEX_0, grammarAccess.getValueAccess().getS_HEXTerminalRuleCall_0()); 
    }

    |    this_S_INT_1=RULE_S_INT    {
		$current.merge(this_S_INT_1);
    }

    { 
    newLeafNode(this_S_INT_1, grammarAccess.getValueAccess().getS_INTTerminalRuleCall_1()); 
    }

    |    this_STRING_2=RULE_STRING    {
		$current.merge(this_STRING_2);
    }

    { 
    newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2()); 
    }
)
    ;





// Entry rule entryRuleEol
entryRuleEol returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEolRule()); } 
	 iv_ruleEol=ruleEol 
	 { $current=$iv_ruleEol.current.getText(); }  
	 EOF 
;

// Rule Eol
ruleEol returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_NLI_0=RULE_NLI    {
		$current.merge(this_NLI_0);
    }

    { 
    newLeafNode(this_NLI_0, grammarAccess.getEolAccess().getNLITerminalRuleCall()); 
    }
)+
    ;





RULE_NLI : '\n';

RULE_WSS : (' '|'\t')+;

RULE_EQ : '=';

RULE_LOGIC_SYM : ('y'|'n'|'m');

RULE_S_HEX : '0' ('x'|'X') ('0'..'9'|'A'..'F'|'a'..'f')+;

RULE_S_INT : '-'? ('0'..'9')+;

RULE_SYMBOL : ('A'..'Z'|'a'..'z'|'0'..'9'|'_')+;

RULE_STRING : ('"' RULE_STR_D '"'|'\'' RULE_STR_S '\'');

fragment RULE_STR_D : (RULE_ESC|~(('\\'|'"')))*;

fragment RULE_STR_S : (RULE_ESC|~(('\\'|'\'')))*;

fragment RULE_ESC : '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\');

RULE_SL_COMMENT_NOT : '# ' RULE_SYMBOL ' is not set';

RULE_SL_COMMENT : '#' ~('\n')*;


