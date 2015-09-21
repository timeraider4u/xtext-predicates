/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
	
	 forceHoisting=true;
	
}

@lexer::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;
 	
    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
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
    @after { leaveRule();
    		
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)


(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_1_0()); 
	    }
		lv_greetings_1_0=ruleGreeting		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"greetings",
        		lv_greetings_1_0, 
        		"org.xtext.example.mydsl1.MyDsl.Greeting");
	        afterParserOrEnumRuleCall();
	    }

)
)+

)


;





// Entry rule entryRuleGreeting
entryRuleGreeting returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGreetingRule()); }
	 iv_ruleGreeting=ruleGreeting 
	 { $current=$iv_ruleGreeting.current; } 
	 EOF 
;

// Rule Greeting
ruleGreeting returns [EObject current=null] 
    @init { enterRule();
   		System.out.println("Greeting - initRuleAction");
    }
    @after { leaveRule();
    		System.out.println("Greeting - afterRuleaction");
     }:

(
(
    {
        $current = forceCreateModelElement(
            grammarAccess.getGreetingAccess().getGreetingAction_0(),
            $current);
    }
)


	otherlv_1='Hello' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getGreetingAccess().getHelloKeyword_1());
    }



(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGreetingRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)

{System.out.println("preAction-Hello");}

	otherlv_3='!' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_3());
    }

{System.out.println("postAction-Hello");}


(
(
		{ 
	        newCompositeNode(grammarAccess.getGreetingAccess().getTestTestParserRuleCall_4_0()); 
	    }
		lv_test_4_0=ruleTest		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGreetingRule());
	        }
       		set(
       			$current, 
       			"test",
        		lv_test_4_0, 
        		"org.xtext.example.mydsl1.MyDsl.Test");
	        afterParserOrEnumRuleCall();
	    }

)
)


(
    { 
        newCompositeNode(grammarAccess.getGreetingAccess().getPreParserRuleCall_5()); 
    }
rulePre
    { 
        afterParserOrEnumRuleCall();
    }
)?


(
(
		{ 
	        newCompositeNode(grammarAccess.getGreetingAccess().getResetResetParserRuleCall_6_0()); 
	    }
		lv_reset_6_0=ruleReset		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGreetingRule());
	        }
       		set(
       			$current, 
       			"reset",
        		lv_reset_6_0, 
        		"org.xtext.example.mydsl1.MyDsl.Reset");
	        afterParserOrEnumRuleCall();
	    }

)
)?


(
(
		{ 
	        newCompositeNode(grammarAccess.getGreetingAccess().getIncIncParserRuleCall_7_0()); 
	    }
		lv_inc_7_0=ruleInc		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGreetingRule());
	        }
       		add(
       			$current, 
       			"inc",
        		lv_inc_7_0, 
        		"org.xtext.example.mydsl1.MyDsl.Inc");
	        afterParserOrEnumRuleCall();
	    }

)
)*


(
(
		{ 
	        newCompositeNode(grammarAccess.getGreetingAccess().getDynamicDynamicParserRuleCall_8_0()); 
	    }
		lv_dynamic_8_0=ruleDynamic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGreetingRule());
	        }
       		set(
       			$current, 
       			"dynamic",
        		lv_dynamic_8_0, 
        		"org.xtext.example.mydsl1.MyDsl.Dynamic");
	        afterParserOrEnumRuleCall();
	    }

)
)?

)


;





// Entry rule entryRuleTest
entryRuleTest returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTestRule()); }
	 iv_ruleTest=ruleTest 
	 { $current=$iv_ruleTest.current; } 
	 EOF 
;

// Rule Test
ruleTest returns [EObject current=null] 
    @init { enterRule();
   		System.out.println("test-in");
    }
    @after { leaveRule();
    		
     }:

(
	otherlv_0='Test' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
    }


{System.out.println("preAction-Test");}

(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTestRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"org.eclipse.xtext.common.Terminals.ID");
	    }

)
)
{System.out.println("postAction-Test");}

)


;





// Entry rule entryRulePre
entryRulePre returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPreRule()); } 
	 iv_rulePre=rulePre 
	 { $current=$iv_rulePre.current.getText(); }  
	 EOF 
;

// Rule Pre
rulePre returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='pre' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPreAccess().getPreKeyword()); 
    }

    ;





// Entry rule entryRuleReset
entryRuleReset returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getResetRule()); }
	 iv_ruleReset=ruleReset 
	 { $current=$iv_ruleReset.current; } 
	 EOF 
;

// Rule Reset
ruleReset returns [EObject current=null] 
    @init { enterRule();
   		
    }
    @after { leaveRule();
    		
     }:

(
(
		lv_reset_0_0=
	'reset' 
    {
        newLeafNode(lv_reset_0_0, grammarAccess.getResetAccess().getResetResetKeyword_0());
    }


 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getResetRule());
	        }
       		setWithLastConsumed($current, "reset", lv_reset_0_0, "reset");
	    }

)
)
{org.xtext.example.mydsl1.TestScope.reset();}


;





// Entry rule entryRuleInc
entryRuleInc returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIncRule()); }
	 iv_ruleInc=ruleInc 
	 { $current=$iv_ruleInc.current; } 
	 EOF 
;

// Rule Inc
ruleInc returns [EObject current=null] 
    @init { enterRule();
   		
    }
    @after { leaveRule();
    		
     }:

(
(
		lv_inc_0_0=
	'inc' 
    {
        newLeafNode(lv_inc_0_0, grammarAccess.getIncAccess().getIncIncKeyword_0());
    }


 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIncRule());
	        }
       		setWithLastConsumed($current, "inc", lv_inc_0_0, "inc");
	    }

)
)
{org.xtext.example.mydsl1.TestScope.inc();}


;





// Entry rule entryRuleDynamic
entryRuleDynamic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDynamicRule()); }
	 iv_ruleDynamic=ruleDynamic 
	 { $current=$iv_ruleDynamic.current; } 
	 EOF 
;

// Rule Dynamic
ruleDynamic returns [EObject current=null] 
    @init { enterRule();
   		
    }
    @after { leaveRule();
    		
     }:

(
(
(
		{ 
	        newCompositeNode(grammarAccess.getDynamicAccess().getTypeTypeAParserRuleCall_0_0()); 
	    }
		lv_type_0_0=ruleTypeA		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDynamicRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_0_0, 
        		"org.xtext.example.mydsl1.MyDsl.TypeA");
	        afterParserOrEnumRuleCall();
	    }

)
)


    |
(
(
		{ 
	        newCompositeNode(grammarAccess.getDynamicAccess().getTypeTypeBParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleTypeB		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDynamicRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"org.xtext.example.mydsl1.MyDsl.TypeB");
	        afterParserOrEnumRuleCall();
	    }

)
)

)


;





// Entry rule entryRuleTypeA
entryRuleTypeA returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeARule()); }
	 iv_ruleTypeA=ruleTypeA 
	 { $current=$iv_ruleTypeA.current; } 
	 EOF 
;

// Rule TypeA
ruleTypeA returns [EObject current=null] 
    @init { enterRule();
   		
    }
    @after { leaveRule();
    		
     }:

(
(
		lv_type_0_0=
	'type' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getTypeAAccess().getTypeTypeKeyword_0());
    }


 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeARule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "type");
	    }

)
)
{System.out.println("TypeA");}


;





// Entry rule entryRuleTypeB
entryRuleTypeB returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeBRule()); }
	 iv_ruleTypeB=ruleTypeB 
	 { $current=$iv_ruleTypeB.current; } 
	 EOF 
;

// Rule TypeB
ruleTypeB returns [EObject current=null] 
    @init { enterRule();
   		
    }
    @after { leaveRule();
    		
     }:
{org.xtext.example.mydsl1.TestScope.isValid()}?

(
(
		lv_type_0_0=
	'type' 
    {
        newLeafNode(lv_type_0_0, grammarAccess.getTypeBAccess().getTypeTypeKeyword_0());
    }


 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTypeBRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_0_0, "type");
	    }

)
)
{System.out.println("TypeB");}


;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


