/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.xtexttest.serializer;

import at.jku.weiner.xtexttest.services.XtextTestGrammarAccess;
import at.jku.weiner.xtexttest.xtextTest.Element;
import at.jku.weiner.xtexttest.xtextTest.Generator;
import at.jku.weiner.xtexttest.xtextTest.Inner;
import at.jku.weiner.xtexttest.xtextTest.Input;
import at.jku.weiner.xtexttest.xtextTest.Tokens;
import at.jku.weiner.xtexttest.xtextTest.XtextTest;
import at.jku.weiner.xtexttest.xtextTest.XtextTestPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class XtextTestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XtextTestGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XtextTestPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtextTestPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case XtextTestPackage.GENERATOR:
				sequence_Generator(context, (Generator) semanticObject); 
				return; 
			case XtextTestPackage.INNER:
				sequence_Inner(context, (Inner) semanticObject); 
				return; 
			case XtextTestPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
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
	 *     (name=IDENTIFIER (inner+=Inner inner+=Inner*)?)
	 */
	protected void sequence_Element(EObject context, Element semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (output=STRING (expected=STRING | isSameAsInputFile?=ISSAMEASINPUTFILE))
	 */
	protected void sequence_Generator(EObject context, Generator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=IDENTIFIER (assign=Element | (assignList+=Element assignList+=Element*) | value=STRING | assignAsData=STRING))
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
	 *     tokens+=IDENTIFIER+
	 */
	protected void sequence_Tokens(EObject context, Tokens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         package=PackageID 
	 *         lang=LangID 
	 *         input=Input 
	 *         tokens=Tokens? 
	 *         root=Element 
	 *         output=Generator?
	 *     )
	 */
	protected void sequence_XtextTest(EObject context, XtextTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
