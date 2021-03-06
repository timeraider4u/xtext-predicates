/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.preprocess.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import at.jku.weiner.c.preprocess.services.PreprocessGrammarAccess;

public class PreprocessParser extends AbstractContentAssistParser {
	
	@Inject
	private PreprocessGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected at.jku.weiner.c.preprocess.ui.contentassist.antlr.internal.InternalPreprocessParser createParser() {
		at.jku.weiner.c.preprocess.ui.contentassist.antlr.internal.InternalPreprocessParser result = new at.jku.weiner.c.preprocess.ui.contentassist.antlr.internal.InternalPreprocessParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGroupOptTemp1Access().getAlternatives(), "rule__GroupOptTemp1__Alternatives");
					put(grammarAccess.getGroupOptTemp2Access().getAlternatives(), "rule__GroupOptTemp2__Alternatives");
					put(grammarAccess.getPreprocessorDirectivesAccess().getAlternatives_4(), "rule__PreprocessorDirectives__Alternatives_4");
					put(grammarAccess.getIncludeDirectiveAccess().getAlternatives_1(), "rule__IncludeDirective__Alternatives_1");
					put(grammarAccess.getDefineDirectiveAccess().getAlternatives(), "rule__DefineDirective__Alternatives");
					put(grammarAccess.getIdentifierListAccess().getAlternatives_1(), "rule__IdentifierList__Alternatives_1");
					put(grammarAccess.getIdentifierListAccess().getAlternatives_1_0_3_2(), "rule__IdentifierList__Alternatives_1_0_3_2");
					put(grammarAccess.getConditionalDirectiveAccess().getConditionalAlternatives_1_0(), "rule__ConditionalDirective__ConditionalAlternatives_1_0");
					put(grammarAccess.getPP_IDAccess().getAlternatives(), "rule__PP_ID__Alternatives");
					put(grammarAccess.getMyCodeAccess().getAlternatives(), "rule__MyCode__Alternatives");
					put(grammarAccess.getMyDefineLineFunctionAccess().getAlternatives(), "rule__MyDefineLineFunction__Alternatives");
					put(grammarAccess.getMyDefineLineObjectAccess().getAlternatives(), "rule__MyDefineLineObject__Alternatives");
					put(grammarAccess.getMyCodeLineAccess().getAlternatives(), "rule__MyCodeLine__Alternatives");
					put(grammarAccess.getMyCodeLineExtendedAccess().getAlternatives(), "rule__MyCodeLineExtended__Alternatives");
					put(grammarAccess.getMyCodeLineExtendedNormalAccess().getAlternatives_2(), "rule__MyCodeLineExtendedNormal__Alternatives_2");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives_1(), "rule__PrimaryExpression__Alternatives_1");
					put(grammarAccess.getEqualityExpressionAccess().getAlternatives_1_1(), "rule__EqualityExpression__Alternatives_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getAlternatives_1_1(), "rule__RelationalExpression__Alternatives_1_1");
					put(grammarAccess.getShiftExpressionAccess().getAlternatives_1_1(), "rule__ShiftExpression__Alternatives_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1_1(), "rule__AdditiveExpression__Alternatives_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_1_1(), "rule__MultiplicativeExpression__Alternatives_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getConstant1Access().getAlternatives(), "rule__Constant1__Alternatives");
					put(grammarAccess.getConstant2Access().getAlternatives_1(), "rule__Constant2__Alternatives_1");
					put(grammarAccess.getSpecialKeywordsAccess().getAlternatives(), "rule__SpecialKeywords__Alternatives");
					put(grammarAccess.getPreprocessAccess().getGroup(), "rule__Preprocess__Group__0");
					put(grammarAccess.getGroupOptAccess().getGroup(), "rule__GroupOpt__Group__0");
					put(grammarAccess.getGroupOptAccess().getGroup_1(), "rule__GroupOpt__Group_1__0");
					put(grammarAccess.getGroupOpt2Access().getGroup(), "rule__GroupOpt2__Group__0");
					put(grammarAccess.getGroupOpt2Access().getGroup_1(), "rule__GroupOpt2__Group_1__0");
					put(grammarAccess.getPreprocessorDirectivesAccess().getGroup(), "rule__PreprocessorDirectives__Group__0");
					put(grammarAccess.getIncludeDirectiveAccess().getGroup(), "rule__IncludeDirective__Group__0");
					put(grammarAccess.getDefineObjectMacroAccess().getGroup(), "rule__DefineObjectMacro__Group__0");
					put(grammarAccess.getDefineObjectMacroAccess().getGroup_4(), "rule__DefineObjectMacro__Group_4__0");
					put(grammarAccess.getDefineFunctionLikeMacroAccess().getGroup(), "rule__DefineFunctionLikeMacro__Group__0");
					put(grammarAccess.getIdentifierListAccess().getGroup(), "rule__IdentifierList__Group__0");
					put(grammarAccess.getIdentifierListAccess().getGroup_1_0(), "rule__IdentifierList__Group_1_0__0");
					put(grammarAccess.getIdentifierListAccess().getGroup_1_0_1(), "rule__IdentifierList__Group_1_0_1__0");
					put(grammarAccess.getIdentifierListAccess().getGroup_1_0_3(), "rule__IdentifierList__Group_1_0_3__0");
					put(grammarAccess.getIdentifierListAccess().getGroup_1_0_3_2_1(), "rule__IdentifierList__Group_1_0_3_2_1__0");
					put(grammarAccess.getIdentifierListAccess().getGroup_1_1(), "rule__IdentifierList__Group_1_1__0");
					put(grammarAccess.getLineDirectiveAccess().getGroup(), "rule__LineDirective__Group__0");
					put(grammarAccess.getLineDirectiveAccess().getGroup_4(), "rule__LineDirective__Group_4__0");
					put(grammarAccess.getErrorDirectiveAccess().getGroup(), "rule__ErrorDirective__Group__0");
					put(grammarAccess.getWarningDirectiveAccess().getGroup(), "rule__WarningDirective__Group__0");
					put(grammarAccess.getUnDefineDirectiveAccess().getGroup(), "rule__UnDefineDirective__Group__0");
					put(grammarAccess.getConditionalDirectiveAccess().getGroup(), "rule__ConditionalDirective__Group__0");
					put(grammarAccess.getIfConditionalAccess().getGroup(), "rule__IfConditional__Group__0");
					put(grammarAccess.getIfDefConditionalAccess().getGroup(), "rule__IfDefConditional__Group__0");
					put(grammarAccess.getIfNotDefConditionalAccess().getGroup(), "rule__IfNotDefConditional__Group__0");
					put(grammarAccess.getElIfConditionalAccess().getGroup(), "rule__ElIfConditional__Group__0");
					put(grammarAccess.getElIfConditionalAccess().getGroup_1(), "rule__ElIfConditional__Group_1__0");
					put(grammarAccess.getElseConditionalAccess().getGroup(), "rule__ElseConditional__Group__0");
					put(grammarAccess.getPragmaDirectiveAccess().getGroup(), "rule__PragmaDirective__Group__0");
					put(grammarAccess.getCodeAccess().getGroup(), "rule__Code__Group__0");
					put(grammarAccess.getMyCodeLineExtendedNormalAccess().getGroup(), "rule__MyCodeLineExtendedNormal__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup(), "rule__PrimaryExpression__Group__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1_0(), "rule__PrimaryExpression__Group_1_0__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1_1(), "rule__PrimaryExpression__Group_1_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1_3(), "rule__PrimaryExpression__Group_1_3__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup_1(), "rule__ConditionalExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getInclusiveOrExpressionAccess().getGroup(), "rule__InclusiveOrExpression__Group__0");
					put(grammarAccess.getInclusiveOrExpressionAccess().getGroup_1(), "rule__InclusiveOrExpression__Group_1__0");
					put(grammarAccess.getExclusiveOrExpressionAccess().getGroup(), "rule__ExclusiveOrExpression__Group__0");
					put(grammarAccess.getExclusiveOrExpressionAccess().getGroup_1(), "rule__ExclusiveOrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup(), "rule__EqualityExpression__Group__0");
					put(grammarAccess.getEqualityExpressionAccess().getGroup_1(), "rule__EqualityExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup(), "rule__ShiftExpression__Group__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup_1(), "rule__ShiftExpression__Group_1__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup(), "rule__AdditiveExpression__Group__0");
					put(grammarAccess.getAdditiveExpressionAccess().getGroup_1(), "rule__AdditiveExpression__Group_1__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup(), "rule__MultiplicativeExpression__Group__0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1(), "rule__MultiplicativeExpression__Group_1__0");
					put(grammarAccess.getUnaryExpressionAccess().getGroup_1(), "rule__UnaryExpression__Group_1__0");
					put(grammarAccess.getPostfixExpressionAccess().getGroup(), "rule__PostfixExpression__Group__0");
					put(grammarAccess.getPostfixExpressionAccess().getGroup_1(), "rule__PostfixExpression__Group_1__0");
					put(grammarAccess.getPostfixExpressionSuffixArgumentAccess().getGroup(), "rule__PostfixExpressionSuffixArgument__Group__0");
					put(grammarAccess.getArgumentExpressionListAccess().getGroup(), "rule__ArgumentExpressionList__Group__0");
					put(grammarAccess.getArgumentExpressionListAccess().getGroup_1(), "rule__ArgumentExpressionList__Group_1__0");
					put(grammarAccess.getConstant2Access().getGroup(), "rule__Constant2__Group__0");
					put(grammarAccess.getEllipsisAccess().getGroup(), "rule__Ellipsis__Group__0");
					put(grammarAccess.getPreprocessAccess().getGroupAssignment_1(), "rule__Preprocess__GroupAssignment_1");
					put(grammarAccess.getGroupOptAccess().getLinesAssignment_1_0(), "rule__GroupOpt__LinesAssignment_1_0");
					put(grammarAccess.getGroupOpt2Access().getLinesAssignment_1_0(), "rule__GroupOpt2__LinesAssignment_1_0");
					put(grammarAccess.getGroupOpt2Access().getLinesAssignment_2(), "rule__GroupOpt2__LinesAssignment_2");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_0(), "rule__PreprocessorDirectives__DirectiveAssignment_4_0");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_1(), "rule__PreprocessorDirectives__DirectiveAssignment_4_1");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_2(), "rule__PreprocessorDirectives__DirectiveAssignment_4_2");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_3(), "rule__PreprocessorDirectives__DirectiveAssignment_4_3");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_4(), "rule__PreprocessorDirectives__DirectiveAssignment_4_4");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_5(), "rule__PreprocessorDirectives__DirectiveAssignment_4_5");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_6(), "rule__PreprocessorDirectives__DirectiveAssignment_4_6");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_7(), "rule__PreprocessorDirectives__DirectiveAssignment_4_7");
					put(grammarAccess.getPreprocessorDirectivesAccess().getDirectiveAssignment_4_8(), "rule__PreprocessorDirectives__DirectiveAssignment_4_8");
					put(grammarAccess.getIncludeDirectiveAccess().getNextAssignment_1_1(), "rule__IncludeDirective__NextAssignment_1_1");
					put(grammarAccess.getIncludeDirectiveAccess().getStringAssignment_3(), "rule__IncludeDirective__StringAssignment_3");
					put(grammarAccess.getDefineObjectMacroAccess().getIdentAssignment_3(), "rule__DefineObjectMacro__IdentAssignment_3");
					put(grammarAccess.getDefineObjectMacroAccess().getStringAssignment_4_1(), "rule__DefineObjectMacro__StringAssignment_4_1");
					put(grammarAccess.getDefineFunctionLikeMacroAccess().getIdentAssignment_3(), "rule__DefineFunctionLikeMacro__IdentAssignment_3");
					put(grammarAccess.getDefineFunctionLikeMacroAccess().getListAssignment_6(), "rule__DefineFunctionLikeMacro__ListAssignment_6");
					put(grammarAccess.getDefineFunctionLikeMacroAccess().getStringAssignment_8(), "rule__DefineFunctionLikeMacro__StringAssignment_8");
					put(grammarAccess.getIdentifierListAccess().getIdentAssignment_1_0_0(), "rule__IdentifierList__IdentAssignment_1_0_0");
					put(grammarAccess.getIdentifierListAccess().getIdentAssignment_1_0_1_3(), "rule__IdentifierList__IdentAssignment_1_0_1_3");
					put(grammarAccess.getIdentifierListAccess().getVariadicAssignment_1_0_3_2_0(), "rule__IdentifierList__VariadicAssignment_1_0_3_2_0");
					put(grammarAccess.getIdentifierListAccess().getVarIDAssignment_1_0_3_2_1_0(), "rule__IdentifierList__VarIDAssignment_1_0_3_2_1_0");
					put(grammarAccess.getIdentifierListAccess().getVariadicAssignment_1_0_3_2_1_1(), "rule__IdentifierList__VariadicAssignment_1_0_3_2_1_1");
					put(grammarAccess.getIdentifierListAccess().getVarIDAssignment_1_1_0(), "rule__IdentifierList__VarIDAssignment_1_1_0");
					put(grammarAccess.getIdentifierListAccess().getVariadicAssignment_1_1_1(), "rule__IdentifierList__VariadicAssignment_1_1_1");
					put(grammarAccess.getLineDirectiveAccess().getLineAssignment_3(), "rule__LineDirective__LineAssignment_3");
					put(grammarAccess.getLineDirectiveAccess().getPathAssignment_4_1(), "rule__LineDirective__PathAssignment_4_1");
					put(grammarAccess.getErrorDirectiveAccess().getMsgAssignment_3(), "rule__ErrorDirective__MsgAssignment_3");
					put(grammarAccess.getWarningDirectiveAccess().getMsgAssignment_3(), "rule__WarningDirective__MsgAssignment_3");
					put(grammarAccess.getUnDefineDirectiveAccess().getIdentAssignment_3(), "rule__UnDefineDirective__IdentAssignment_3");
					put(grammarAccess.getConditionalDirectiveAccess().getConditionalAssignment_1(), "rule__ConditionalDirective__ConditionalAssignment_1");
					put(grammarAccess.getConditionalDirectiveAccess().getElifsAssignment_2(), "rule__ConditionalDirective__ElifsAssignment_2");
					put(grammarAccess.getConditionalDirectiveAccess().getElseAssignment_3(), "rule__ConditionalDirective__ElseAssignment_3");
					put(grammarAccess.getIfConditionalAccess().getExpressionAssignment_3(), "rule__IfConditional__ExpressionAssignment_3");
					put(grammarAccess.getIfConditionalAccess().getGroupAssignment_6(), "rule__IfConditional__GroupAssignment_6");
					put(grammarAccess.getIfDefConditionalAccess().getIdentAssignment_3(), "rule__IfDefConditional__IdentAssignment_3");
					put(grammarAccess.getIfDefConditionalAccess().getGroupAssignment_6(), "rule__IfDefConditional__GroupAssignment_6");
					put(grammarAccess.getIfNotDefConditionalAccess().getIdentAssignment_3(), "rule__IfNotDefConditional__IdentAssignment_3");
					put(grammarAccess.getIfNotDefConditionalAccess().getGroupAssignment_6(), "rule__IfNotDefConditional__GroupAssignment_6");
					put(grammarAccess.getElIfConditionalAccess().getExpressionAssignment_3(), "rule__ElIfConditional__ExpressionAssignment_3");
					put(grammarAccess.getElIfConditionalAccess().getGroupAssignment_6(), "rule__ElIfConditional__GroupAssignment_6");
					put(grammarAccess.getElseConditionalAccess().getGroupAssignment_7(), "rule__ElseConditional__GroupAssignment_7");
					put(grammarAccess.getPragmaDirectiveAccess().getPragmaAssignment_3(), "rule__PragmaDirective__PragmaAssignment_3");
					put(grammarAccess.getCodeAccess().getCodeAssignment_1(), "rule__Code__CodeAssignment_1");
					put(grammarAccess.getPrimaryExpressionAccess().getDefinedAssignment_1_0_0(), "rule__PrimaryExpression__DefinedAssignment_1_0_0");
					put(grammarAccess.getPrimaryExpressionAccess().getIdentAssignment_1_0_1(), "rule__PrimaryExpression__IdentAssignment_1_0_1");
					put(grammarAccess.getPrimaryExpressionAccess().getDefinedAssignment_1_1_0(), "rule__PrimaryExpression__DefinedAssignment_1_1_0");
					put(grammarAccess.getPrimaryExpressionAccess().getIdentAssignment_1_1_2(), "rule__PrimaryExpression__IdentAssignment_1_1_2");
					put(grammarAccess.getPrimaryExpressionAccess().getConstAssignment_1_2(), "rule__PrimaryExpression__ConstAssignment_1_2");
					put(grammarAccess.getPrimaryExpressionAccess().getParenthesesAssignment_1_3_0(), "rule__PrimaryExpression__ParenthesesAssignment_1_3_0");
					put(grammarAccess.getPrimaryExpressionAccess().getExprAssignment_1_3_1(), "rule__PrimaryExpression__ExprAssignment_1_3_1");
					put(grammarAccess.getConditionalExpressionAccess().getQExprAssignment_1_2(), "rule__ConditionalExpression__QExprAssignment_1_2");
					put(grammarAccess.getConditionalExpressionAccess().getCExprAssignment_1_4(), "rule__ConditionalExpression__CExprAssignment_1_4");
					put(grammarAccess.getLogicalOrExpressionAccess().getRightAssignment_1_2(), "rule__LogicalOrExpression__RightAssignment_1_2");
					put(grammarAccess.getLogicalAndExpressionAccess().getRightAssignment_1_2(), "rule__LogicalAndExpression__RightAssignment_1_2");
					put(grammarAccess.getInclusiveOrExpressionAccess().getRightAssignment_1_2(), "rule__InclusiveOrExpression__RightAssignment_1_2");
					put(grammarAccess.getExclusiveOrExpressionAccess().getRightAssignment_1_2(), "rule__ExclusiveOrExpression__RightAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2(), "rule__AndExpression__RightAssignment_1_2");
					put(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1_0(), "rule__EqualityExpression__OpAssignment_1_1_0");
					put(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1_1(), "rule__EqualityExpression__OpAssignment_1_1_1");
					put(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2(), "rule__EqualityExpression__RightAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1_0(), "rule__RelationalExpression__OpAssignment_1_1_0");
					put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1_1(), "rule__RelationalExpression__OpAssignment_1_1_1");
					put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1_2(), "rule__RelationalExpression__OpAssignment_1_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOpAssignment_1_1_3(), "rule__RelationalExpression__OpAssignment_1_1_3");
					put(grammarAccess.getRelationalExpressionAccess().getRightAssignment_1_2(), "rule__RelationalExpression__RightAssignment_1_2");
					put(grammarAccess.getShiftExpressionAccess().getOpAssignment_1_1_0(), "rule__ShiftExpression__OpAssignment_1_1_0");
					put(grammarAccess.getShiftExpressionAccess().getOpAssignment_1_1_1(), "rule__ShiftExpression__OpAssignment_1_1_1");
					put(grammarAccess.getShiftExpressionAccess().getRightAssignment_1_2(), "rule__ShiftExpression__RightAssignment_1_2");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_1_0(), "rule__AdditiveExpression__OpAssignment_1_1_0");
					put(grammarAccess.getAdditiveExpressionAccess().getOpAssignment_1_1_1(), "rule__AdditiveExpression__OpAssignment_1_1_1");
					put(grammarAccess.getAdditiveExpressionAccess().getRightAssignment_1_2(), "rule__AdditiveExpression__RightAssignment_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1_0(), "rule__MultiplicativeExpression__OpAssignment_1_1_0");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1_1(), "rule__MultiplicativeExpression__OpAssignment_1_1_1");
					put(grammarAccess.getMultiplicativeExpressionAccess().getOpAssignment_1_1_2(), "rule__MultiplicativeExpression__OpAssignment_1_1_2");
					put(grammarAccess.getMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__MultiplicativeExpression__RightAssignment_1_2");
					put(grammarAccess.getUnaryExpressionAccess().getOpAssignment_1_1(), "rule__UnaryExpression__OpAssignment_1_1");
					put(grammarAccess.getUnaryExpressionAccess().getExprAssignment_1_2(), "rule__UnaryExpression__ExprAssignment_1_2");
					put(grammarAccess.getPostfixExpressionAccess().getSuffixAssignment_1_1(), "rule__PostfixExpression__SuffixAssignment_1_1");
					put(grammarAccess.getPostfixExpressionSuffixArgumentAccess().getArgumentExpressionListAssignment_2(), "rule__PostfixExpressionSuffixArgument__ArgumentExpressionListAssignment_2");
					put(grammarAccess.getArgumentExpressionListAccess().getExprAssignment_0(), "rule__ArgumentExpressionList__ExprAssignment_0");
					put(grammarAccess.getArgumentExpressionListAccess().getExprAssignment_1_1(), "rule__ArgumentExpressionList__ExprAssignment_1_1");
					put(grammarAccess.getConstant2Access().getHexAssignment_1_0(), "rule__Constant2__HexAssignment_1_0");
					put(grammarAccess.getConstant2Access().getOctAssignment_1_1(), "rule__Constant2__OctAssignment_1_1");
					put(grammarAccess.getConstant2Access().getDecAssignment_1_2(), "rule__Constant2__DecAssignment_1_2");
					put(grammarAccess.getConstant2Access().getChAssignment_1_3(), "rule__Constant2__ChAssignment_1_3");
					put(grammarAccess.getConstant2Access().getFloatAssignment_1_4(), "rule__Constant2__FloatAssignment_1_4");
					put(grammarAccess.getConstant2Access().getBinAssignment_1_5(), "rule__Constant2__BinAssignment_1_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			at.jku.weiner.c.preprocess.ui.contentassist.antlr.internal.InternalPreprocessParser typedParser = (at.jku.weiner.c.preprocess.ui.contentassist.antlr.internal.InternalPreprocessParser) parser;
			typedParser.entryRulePreprocess();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_IGNORED" };
	}
	
	public PreprocessGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PreprocessGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
