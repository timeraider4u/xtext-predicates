/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.xtexttest.serializer;

import at.jku.weiner.xtexttest.services.XtextTestGrammarAccess;
import at.jku.weiner.xtexttest.xtextTest.After;
import at.jku.weiner.xtexttest.xtextTest.Before;
import at.jku.weiner.xtexttest.xtextTest.CodeCall;
import at.jku.weiner.xtexttest.xtextTest.Element;
import at.jku.weiner.xtexttest.xtextTest.EmfTest;
import at.jku.weiner.xtexttest.xtextTest.Generator;
import at.jku.weiner.xtexttest.xtextTest.Import;
import at.jku.weiner.xtexttest.xtextTest.Inner;
import at.jku.weiner.xtexttest.xtextTest.Input;
import at.jku.weiner.xtexttest.xtextTest.Model;
import at.jku.weiner.xtexttest.xtextTest.MyTokens;
import at.jku.weiner.xtexttest.xtextTest.ReplacePatterns;
import at.jku.weiner.xtexttest.xtextTest.Tokens;
import at.jku.weiner.xtexttest.xtextTest.XtextTest;
import at.jku.weiner.xtexttest.xtextTest.XtextTestPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XtextTestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XtextTestGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XtextTestPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtextTestPackage.AFTER:
				sequence_After(context, (After) semanticObject); 
				return; 
			case XtextTestPackage.BEFORE:
				sequence_Before(context, (Before) semanticObject); 
				return; 
			case XtextTestPackage.CODE_CALL:
				sequence_CodeCall(context, (CodeCall) semanticObject); 
				return; 
			case XtextTestPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case XtextTestPackage.EMF_TEST:
				sequence_EmfTest(context, (EmfTest) semanticObject); 
				return; 
			case XtextTestPackage.GENERATOR:
				sequence_Generator(context, (Generator) semanticObject); 
				return; 
			case XtextTestPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case XtextTestPackage.INNER:
				sequence_Inner(context, (Inner) semanticObject); 
				return; 
			case XtextTestPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case XtextTestPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case XtextTestPackage.MY_TOKENS:
				sequence_MyTokens(context, (MyTokens) semanticObject); 
				return; 
			case XtextTestPackage.REPLACE_PATTERNS:
				sequence_ReplacePatterns(context, (ReplacePatterns) semanticObject); 
				return; 
			case XtextTestPackage.TOKENS:
				sequence_Tokens(context, (Tokens) semanticObject); 
				return; 
			case XtextTestPackage.XTEXT_TEST:
				sequence_XtextTest(context, (XtextTest) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     codeCall=CodeCall
	 */
	protected void sequence_After(EObject context, After semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XtextTestPackage.Literals.AFTER__CODE_CALL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XtextTestPackage.Literals.AFTER__CODE_CALL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAfterAccess().getCodeCallCodeCallParserRuleCall_2_0(), semanticObject.getCodeCall());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     codeCall=CodeCall
	 */
	protected void sequence_Before(EObject context, Before semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XtextTestPackage.Literals.BEFORE__CODE_CALL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XtextTestPackage.Literals.BEFORE__CODE_CALL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBeforeAccess().getCodeCallCodeCallParserRuleCall_2_0(), semanticObject.getCodeCall());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (myclass=PackageID method=PackageID (params+=PackageID params+=PackageID*)?)
	 */
	protected void sequence_CodeCall(EObject context, CodeCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importing=IDENTIFIER? name=IDENTIFIER (inner+=Inner inner+=Inner*)?)
	 */
	protected void sequence_Element(EObject context, Element semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         package=PackageID 
	 *         mydefault=PackageID 
	 *         myimport+=Import* 
	 *         codeCall=CodeCall 
	 *         optionCall=CodeCall? 
	 *         file=STRING 
	 *         root=Element 
	 *         before=Before? 
	 *         after=After?
	 *     )
	 */
	protected void sequence_EmfTest(EObject context, EmfTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         output=STRING 
	 *         (expected=STRING | isSameAsInputFile?=ISSAMEASINPUTFILE) 
	 *         (patternFile=STRING? replacePatterns+=ReplacePatterns*)? 
	 *         exception=PackageID?
	 *     )
	 */
	protected void sequence_Generator(EObject context, Generator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ImportID alias=IDENTIFIER)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XtextTestPackage.Literals.IMPORT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XtextTestPackage.Literals.IMPORT__ID));
			if(transientValues.isValueTransient(semanticObject, XtextTestPackage.Literals.IMPORT__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XtextTestPackage.Literals.IMPORT__ALIAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getIdImportIDParserRuleCall_2_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getImportAccess().getAliasIDENTIFIERTerminalRuleCall_4_0(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         parameter=IDENTIFIER 
	 *         (
	 *             assign=Element | 
	 *             (assignList+=Element assignList+=Element*) | 
	 *             value=STRING | 
	 *             assignAsData=STRING | 
	 *             assignAsBool=TRUE | 
	 *             assignAsBool=FALSE | 
	 *             isNull?=ISNULL | 
	 *             isNotNull?=ISNOTNULL | 
	 *             isEmpty?=ISEMPTY
	 *         )
	 *     )
	 */
	protected void sequence_Inner(EObject context, Inner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (text=STRING | file=STRING)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (xtextTest=XtextTest | emfTest=EmfTest)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((token=IDENTIFIER | string=STRING) count=INT?)
	 */
	protected void sequence_MyTokens(EObject context, MyTokens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (regex=STRING replace=STRING)
	 */
	protected void sequence_ReplacePatterns(EObject context, ReplacePatterns semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XtextTestPackage.Literals.REPLACE_PATTERNS__REGEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XtextTestPackage.Literals.REPLACE_PATTERNS__REGEX));
			if(transientValues.isValueTransient(semanticObject, XtextTestPackage.Literals.REPLACE_PATTERNS__REPLACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XtextTestPackage.Literals.REPLACE_PATTERNS__REPLACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReplacePatternsAccess().getRegexSTRINGTerminalRuleCall_0_0(), semanticObject.getRegex());
		feeder.accept(grammarAccess.getReplacePatternsAccess().getReplaceSTRINGTerminalRuleCall_2_0(), semanticObject.getReplace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tokens+=MyTokens+
	 */
	protected void sequence_Tokens(EObject context, Tokens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         package=PackageID 
	 *         lang=LangID 
	 *         imports=ImportID? 
	 *         boolean=Boolean? 
	 *         input=Input 
	 *         tokens=Tokens? 
	 *         root=Element 
	 *         output=Generator? 
	 *         before=Before? 
	 *         after=After?
	 *     )
	 */
	protected void sequence_XtextTest(EObject context, XtextTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
