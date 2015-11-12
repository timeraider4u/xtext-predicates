/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
grammar InternalCPreprocess;

options {
	superClass=AbstractInternalContentAssistParser;
	
	
}

@lexer::header {
package at.jku.weiner.cpreprocess.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package at.jku.weiner.cpreprocess.ui.contentassist.antlr.internal; 

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
import at.jku.weiner.cpreprocess.services.CPreprocessGrammarAccess;

}

@parser::members {
 
 	private CPreprocessGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(CPreprocessGrammarAccess grammarAccess) {
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getModelAccess().getGroup()); }
(rule__Model__Group__0)
{ after(grammarAccess.getModelAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTranslationUnit
entryRuleTranslationUnit 
:
{ before(grammarAccess.getTranslationUnitRule()); }
	 ruleTranslationUnit
{ after(grammarAccess.getTranslationUnitRule()); } 
	 EOF 
;

// Rule TranslationUnit
ruleTranslationUnit
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getTranslationUnitAccess().getGroup()); }
(rule__TranslationUnit__Group__0)
{ after(grammarAccess.getTranslationUnitAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePreprocessorDirectives
entryRulePreprocessorDirectives 
:
{ before(grammarAccess.getPreprocessorDirectivesRule()); }
	 rulePreprocessorDirectives
{ after(grammarAccess.getPreprocessorDirectivesRule()); } 
	 EOF 
;

// Rule PreprocessorDirectives
rulePreprocessorDirectives
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getGroup()); }
(rule__PreprocessorDirectives__Group__0)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIncludeDirective
entryRuleIncludeDirective 
:
{ before(grammarAccess.getIncludeDirectiveRule()); }
	 ruleIncludeDirective
{ after(grammarAccess.getIncludeDirectiveRule()); } 
	 EOF 
;

// Rule IncludeDirective
ruleIncludeDirective
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getIncludeDirectiveAccess().getGroup()); }
(rule__IncludeDirective__Group__0)
{ after(grammarAccess.getIncludeDirectiveAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDefineDirective
entryRuleDefineDirective 
:
{ before(grammarAccess.getDefineDirectiveRule()); }
	 ruleDefineDirective
{ after(grammarAccess.getDefineDirectiveRule()); } 
	 EOF 
;

// Rule DefineDirective
ruleDefineDirective
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getDefineDirectiveAccess().getGroup()); }
(rule__DefineDirective__Group__0)
{ after(grammarAccess.getDefineDirectiveAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleUnDefineDirective
entryRuleUnDefineDirective 
:
{ before(grammarAccess.getUnDefineDirectiveRule()); }
	 ruleUnDefineDirective
{ after(grammarAccess.getUnDefineDirectiveRule()); } 
	 EOF 
;

// Rule UnDefineDirective
ruleUnDefineDirective
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getUnDefineDirectiveAccess().getGroup()); }
(rule__UnDefineDirective__Group__0)
{ after(grammarAccess.getUnDefineDirectiveAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleErrorDirective
entryRuleErrorDirective 
:
{ before(grammarAccess.getErrorDirectiveRule()); }
	 ruleErrorDirective
{ after(grammarAccess.getErrorDirectiveRule()); } 
	 EOF 
;

// Rule ErrorDirective
ruleErrorDirective
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getErrorDirectiveAccess().getGroup()); }
(rule__ErrorDirective__Group__0)
{ after(grammarAccess.getErrorDirectiveAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePragmaDirective
entryRulePragmaDirective 
:
{ before(grammarAccess.getPragmaDirectiveRule()); }
	 rulePragmaDirective
{ after(grammarAccess.getPragmaDirectiveRule()); } 
	 EOF 
;

// Rule PragmaDirective
rulePragmaDirective
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getPragmaDirectiveAccess().getGroup()); }
(rule__PragmaDirective__Group__0)
{ after(grammarAccess.getPragmaDirectiveAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNewLineLine
entryRuleNewLineLine 
:
{ before(grammarAccess.getNewLineLineRule()); }
	 ruleNewLineLine
{ after(grammarAccess.getNewLineLineRule()); } 
	 EOF 
;

// Rule NewLineLine
ruleNewLineLine
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getNewLineLineAccess().getGroup()); }
(rule__NewLineLine__Group__0)
{ after(grammarAccess.getNewLineLineAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCode
entryRuleCode 
:
{ before(grammarAccess.getCodeRule()); }
	 ruleCode
{ after(grammarAccess.getCodeRule()); } 
	 EOF 
;

// Rule Code
ruleCode
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
{ before(grammarAccess.getCodeAccess().getGroup()); }
(rule__Code__Group__0)
{ after(grammarAccess.getCodeAccess().getGroup()); }
)



;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMyCodeLine
entryRuleMyCodeLine 
:
{ before(grammarAccess.getMyCodeLineRule()); }
	 ruleMyCodeLine
{ after(grammarAccess.getMyCodeLineRule()); } 
	 EOF 
;

// Rule MyCodeLine
ruleMyCodeLine
    @init {
		int stackSize = keepStackSize();
		/*no init found*/
    }
	@after {
    		/*no after found*/
     }:

(
(
{ before(grammarAccess.getMyCodeLineAccess().getAlternatives()); }
(rule__MyCodeLine__Alternatives)
{ after(grammarAccess.getMyCodeLineAccess().getAlternatives()); }
)
(
{ before(grammarAccess.getMyCodeLineAccess().getAlternatives()); }
(rule__MyCodeLine__Alternatives)*
{ after(grammarAccess.getMyCodeLineAccess().getAlternatives()); }
)
)



;
finally {
	restoreStackSize(stackSize);
}




rule__TranslationUnit__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getTranslationUnitAccess().getLinesAssignment_1_0()); }
(rule__TranslationUnit__LinesAssignment_1_0)
{ after(grammarAccess.getTranslationUnitAccess().getLinesAssignment_1_0()); }
)



    |
(
{ before(grammarAccess.getTranslationUnitAccess().getLinesAssignment_1_1()); }
(rule__TranslationUnit__LinesAssignment_1_1)
{ after(grammarAccess.getTranslationUnitAccess().getLinesAssignment_1_1()); }
)



    |
(
{ before(grammarAccess.getTranslationUnitAccess().getLinesAssignment_1_2()); }
(rule__TranslationUnit__LinesAssignment_1_2)
{ after(grammarAccess.getTranslationUnitAccess().getLinesAssignment_1_2()); }
)



;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_0()); }
(rule__PreprocessorDirectives__DirectiveAssignment_1_0)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_0()); }
)



    |
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_1()); }
(rule__PreprocessorDirectives__DirectiveAssignment_1_1)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_1()); }
)



    |
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_2()); }
(rule__PreprocessorDirectives__DirectiveAssignment_1_2)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_2()); }
)



    |
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_3()); }
(rule__PreprocessorDirectives__DirectiveAssignment_1_3)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_3()); }
)



    |
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_4()); }
(rule__PreprocessorDirectives__DirectiveAssignment_1_4)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_1_4()); }
)



;
finally {
	restoreStackSize(stackSize);
}

rule__MyCodeLine__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getMyCodeLineAccess().getMYCODETerminalRuleCall_0()); }
	RULE_MYCODE
{ after(grammarAccess.getMyCodeLineAccess().getMYCODETerminalRuleCall_0()); }
)



    |
(
{ before(grammarAccess.getMyCodeLineAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getMyCodeLineAccess().getIDTerminalRuleCall_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}



rule__Model__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getModelAccess().getModelAction_0()); }
(

)
{ after(grammarAccess.getModelAccess().getModelAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Model__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getModelAccess().getUnitsAssignment_1()); }
(rule__Model__UnitsAssignment_1)
{ after(grammarAccess.getModelAccess().getUnitsAssignment_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}






rule__TranslationUnit__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TranslationUnit__Group__0__Impl
	rule__TranslationUnit__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TranslationUnit__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getTranslationUnitAccess().getTranslationUnitAction_0()); }
(

)
{ after(grammarAccess.getTranslationUnitAccess().getTranslationUnitAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__TranslationUnit__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TranslationUnit__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TranslationUnit__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getTranslationUnitAccess().getAlternatives_1()); }
(rule__TranslationUnit__Alternatives_1)*
{ after(grammarAccess.getTranslationUnitAccess().getAlternatives_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}






rule__PreprocessorDirectives__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PreprocessorDirectives__Group__0__Impl
	rule__PreprocessorDirectives__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getPreprocessorDirectivesAction_0()); }
(

)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getPreprocessorDirectivesAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__PreprocessorDirectives__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PreprocessorDirectives__Group__1__Impl
	rule__PreprocessorDirectives__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getAlternatives_1()); }
(rule__PreprocessorDirectives__Alternatives_1)
{ after(grammarAccess.getPreprocessorDirectivesAccess().getAlternatives_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__PreprocessorDirectives__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PreprocessorDirectives__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getNEWLINETerminalRuleCall_2()); }
	RULE_NEWLINE
{ after(grammarAccess.getPreprocessorDirectivesAccess().getNEWLINETerminalRuleCall_2()); }
)



;
finally {
	restoreStackSize(stackSize);
}








rule__IncludeDirective__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IncludeDirective__Group__0__Impl
	rule__IncludeDirective__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IncludeDirective__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getIncludeDirectiveAccess().getIncludeDirectiveAction_0()); }
(

)
{ after(grammarAccess.getIncludeDirectiveAccess().getIncludeDirectiveAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__IncludeDirective__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IncludeDirective__Group__1__Impl
	rule__IncludeDirective__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IncludeDirective__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getIncludeDirectiveAccess().getINCLUDETerminalRuleCall_1()); }
	RULE_INCLUDE
{ after(grammarAccess.getIncludeDirectiveAccess().getINCLUDETerminalRuleCall_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__IncludeDirective__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IncludeDirective__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IncludeDirective__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getIncludeDirectiveAccess().getStringAssignment_2()); }
(rule__IncludeDirective__StringAssignment_2)
{ after(grammarAccess.getIncludeDirectiveAccess().getStringAssignment_2()); }
)



;
finally {
	restoreStackSize(stackSize);
}








rule__DefineDirective__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DefineDirective__Group__0__Impl
	rule__DefineDirective__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefineDirective__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getDefineDirectiveAccess().getDefineDirectiveAction_0()); }
(

)
{ after(grammarAccess.getDefineDirectiveAccess().getDefineDirectiveAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__DefineDirective__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DefineDirective__Group__1__Impl
	rule__DefineDirective__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefineDirective__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getDefineDirectiveAccess().getDEFINETerminalRuleCall_1()); }
	RULE_DEFINE
{ after(grammarAccess.getDefineDirectiveAccess().getDEFINETerminalRuleCall_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__DefineDirective__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DefineDirective__Group__2__Impl
	rule__DefineDirective__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DefineDirective__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getDefineDirectiveAccess().getIdAssignment_2()); }
(rule__DefineDirective__IdAssignment_2)
{ after(grammarAccess.getDefineDirectiveAccess().getIdAssignment_2()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__DefineDirective__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DefineDirective__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefineDirective__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getDefineDirectiveAccess().getStringAssignment_3()); }
(rule__DefineDirective__StringAssignment_3)
{ after(grammarAccess.getDefineDirectiveAccess().getStringAssignment_3()); }
)



;
finally {
	restoreStackSize(stackSize);
}










rule__UnDefineDirective__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDefineDirective__Group__0__Impl
	rule__UnDefineDirective__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDefineDirective__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getUnDefineDirectiveAccess().getUnDefineDirectiveAction_0()); }
(

)
{ after(grammarAccess.getUnDefineDirectiveAccess().getUnDefineDirectiveAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__UnDefineDirective__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__UnDefineDirective__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UnDefineDirective__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getUnDefineDirectiveAccess().getUNDEFTerminalRuleCall_1()); }
	RULE_UNDEF
{ after(grammarAccess.getUnDefineDirectiveAccess().getUNDEFTerminalRuleCall_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}






rule__ErrorDirective__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ErrorDirective__Group__0__Impl
	rule__ErrorDirective__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorDirective__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getErrorDirectiveAccess().getErrorDirectiveAction_0()); }
(

)
{ after(grammarAccess.getErrorDirectiveAccess().getErrorDirectiveAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__ErrorDirective__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ErrorDirective__Group__1__Impl
	rule__ErrorDirective__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorDirective__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getErrorDirectiveAccess().getERRORTerminalRuleCall_1()); }
	RULE_ERROR
{ after(grammarAccess.getErrorDirectiveAccess().getERRORTerminalRuleCall_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__ErrorDirective__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ErrorDirective__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorDirective__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getErrorDirectiveAccess().getMsgAssignment_2()); }
(rule__ErrorDirective__MsgAssignment_2)
{ after(grammarAccess.getErrorDirectiveAccess().getMsgAssignment_2()); }
)



;
finally {
	restoreStackSize(stackSize);
}








rule__PragmaDirective__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PragmaDirective__Group__0__Impl
	rule__PragmaDirective__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PragmaDirective__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getPragmaDirectiveAccess().getPragmaDirectiveAction_0()); }
(

)
{ after(grammarAccess.getPragmaDirectiveAccess().getPragmaDirectiveAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__PragmaDirective__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PragmaDirective__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PragmaDirective__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getPragmaDirectiveAccess().getPRAGMATerminalRuleCall_1()); }
	RULE_PRAGMA
{ after(grammarAccess.getPragmaDirectiveAccess().getPRAGMATerminalRuleCall_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}






rule__NewLineLine__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NewLineLine__Group__0__Impl
	rule__NewLineLine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NewLineLine__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getNewLineLineAccess().getNewLineLineAction_0()); }
(

)
{ after(grammarAccess.getNewLineLineAccess().getNewLineLineAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__NewLineLine__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NewLineLine__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NewLineLine__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getNewLineLineAccess().getNEWLINETerminalRuleCall_1()); }
	RULE_NEWLINE
{ after(grammarAccess.getNewLineLineAccess().getNEWLINETerminalRuleCall_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}






rule__Code__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Code__Group__0__Impl
	rule__Code__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Code__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getCodeAccess().getCodeAction_0()); }
(

)
{ after(grammarAccess.getCodeAccess().getCodeAction_0()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__Code__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Code__Group__1__Impl
	rule__Code__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Code__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getCodeAccess().getCodeAssignment_1()); }
(rule__Code__CodeAssignment_1)
{ after(grammarAccess.getCodeAccess().getCodeAssignment_1()); }
)



;
finally {
	restoreStackSize(stackSize);
}


rule__Code__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Code__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Code__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:

(
{ before(grammarAccess.getCodeAccess().getNEWLINETerminalRuleCall_2()); }
	RULE_NEWLINE
{ after(grammarAccess.getCodeAccess().getNEWLINETerminalRuleCall_2()); }
)



;
finally {
	restoreStackSize(stackSize);
}









rule__Model__UnitsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getUnitsTranslationUnitParserRuleCall_1_0()); }
	ruleTranslationUnit{ after(grammarAccess.getModelAccess().getUnitsTranslationUnitParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TranslationUnit__LinesAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTranslationUnitAccess().getLinesPreprocessorDirectivesParserRuleCall_1_0_0()); }
	rulePreprocessorDirectives{ after(grammarAccess.getTranslationUnitAccess().getLinesPreprocessorDirectivesParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TranslationUnit__LinesAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTranslationUnitAccess().getLinesNewLineLineParserRuleCall_1_1_0()); }
	ruleNewLineLine{ after(grammarAccess.getTranslationUnitAccess().getLinesNewLineLineParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TranslationUnit__LinesAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTranslationUnitAccess().getLinesCodeParserRuleCall_1_2_0()); }
	ruleCode{ after(grammarAccess.getTranslationUnitAccess().getLinesCodeParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__DirectiveAssignment_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveIncludeDirectiveParserRuleCall_1_0_0()); }
	ruleIncludeDirective{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveIncludeDirectiveParserRuleCall_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__DirectiveAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveDefineDirectiveParserRuleCall_1_1_0()); }
	ruleDefineDirective{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveDefineDirectiveParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__DirectiveAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveUnDefineDirectiveParserRuleCall_1_2_0()); }
	ruleUnDefineDirective{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveUnDefineDirectiveParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__DirectiveAssignment_1_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveErrorDirectiveParserRuleCall_1_3_0()); }
	ruleErrorDirective{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveErrorDirectiveParserRuleCall_1_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PreprocessorDirectives__DirectiveAssignment_1_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPreprocessorDirectivesAccess().getDirectivePragmaDirectiveParserRuleCall_1_4_0()); }
	rulePragmaDirective{ after(grammarAccess.getPreprocessorDirectivesAccess().getDirectivePragmaDirectiveParserRuleCall_1_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IncludeDirective__StringAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIncludeDirectiveAccess().getStringMyCodeLineParserRuleCall_2_0()); }
	ruleMyCodeLine{ after(grammarAccess.getIncludeDirectiveAccess().getStringMyCodeLineParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DefineDirective__IdAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefineDirectiveAccess().getIdIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getDefineDirectiveAccess().getIdIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DefineDirective__StringAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefineDirectiveAccess().getStringMyCodeLineParserRuleCall_3_0()); }
	ruleMyCodeLine{ after(grammarAccess.getDefineDirectiveAccess().getStringMyCodeLineParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorDirective__MsgAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getErrorDirectiveAccess().getMsgMYCODETerminalRuleCall_2_0()); }
	RULE_MYCODE{ after(grammarAccess.getErrorDirectiveAccess().getMsgMYCODETerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Code__CodeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCodeAccess().getCodeMYCODETerminalRuleCall_1_0()); }
	RULE_MYCODE{ after(grammarAccess.getCodeAccess().getCodeMYCODETerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


fragment RULE_LINEFEED : '\n';

fragment RULE_CARRIAGERETURN : '\r';

RULE_NEWLINE : (RULE_CARRIAGERETURN|RULE_LINEFEED);

fragment RULE_BACKSLASH : '\\';

fragment RULE_LINEBREAK : (RULE_BACKSLASH RULE_NEWLINE)+;

fragment RULE_WS : (' '|'\t'|RULE_LINEBREAK);

fragment RULE_HASH : '#';

RULE_DEFINE : RULE_HASH RULE_WS* 'define' RULE_WS+;

RULE_UNDEF : RULE_HASH RULE_WS* 'undef' RULE_WS+;

RULE_INCLUDE : RULE_HASH RULE_WS* 'include' RULE_WS+;

RULE_ERROR : RULE_HASH RULE_WS* 'error' RULE_WS+;

RULE_PRAGMA : RULE_HASH RULE_WS* 'pragma' RULE_WS+;

RULE_ID : RULE_IDENTIFIER;

fragment RULE_IDENTIFIER : RULE_LETTER (RULE_LETTER|'0'..'9')*;

fragment RULE_LETTER : ('$'|'A'..'Z'|'a'..'z'|'_');

RULE_MYCODE : ~((RULE_HASH|RULE_CARRIAGERETURN|RULE_LINEFEED)) ~((RULE_CARRIAGERETURN|RULE_LINEFEED))*;


