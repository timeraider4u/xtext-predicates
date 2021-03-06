/**
 */
package at.jku.weiner.xtexttest.xtextTest.impl;

import at.jku.weiner.xtexttest.xtextTest.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XtextTestFactoryImpl extends EFactoryImpl implements XtextTestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XtextTestFactory init()
  {
    try
    {
      XtextTestFactory theXtextTestFactory = (XtextTestFactory)EPackage.Registry.INSTANCE.getEFactory(XtextTestPackage.eNS_URI);
      if (theXtextTestFactory != null)
      {
        return theXtextTestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XtextTestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XtextTestFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XtextTestPackage.MODEL: return createModel();
      case XtextTestPackage.XTEXT_TEST: return createXtextTest();
      case XtextTestPackage.EMF_TEST: return createEmfTest();
      case XtextTestPackage.IMPORT: return createImport();
      case XtextTestPackage.INPUT: return createInput();
      case XtextTestPackage.TOKENS: return createTokens();
      case XtextTestPackage.MY_TOKENS: return createMyTokens();
      case XtextTestPackage.ELEMENT: return createElement();
      case XtextTestPackage.INNER: return createInner();
      case XtextTestPackage.GENERATOR: return createGenerator();
      case XtextTestPackage.REPLACE_PATTERNS: return createReplacePatterns();
      case XtextTestPackage.BEFORE: return createBefore();
      case XtextTestPackage.AFTER: return createAfter();
      case XtextTestPackage.CODE_CALL: return createCodeCall();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XtextTest createXtextTest()
  {
    XtextTestImpl xtextTest = new XtextTestImpl();
    return xtextTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfTest createEmfTest()
  {
    EmfTestImpl emfTest = new EmfTestImpl();
    return emfTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tokens createTokens()
  {
    TokensImpl tokens = new TokensImpl();
    return tokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyTokens createMyTokens()
  {
    MyTokensImpl myTokens = new MyTokensImpl();
    return myTokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inner createInner()
  {
    InnerImpl inner = new InnerImpl();
    return inner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator createGenerator()
  {
    GeneratorImpl generator = new GeneratorImpl();
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReplacePatterns createReplacePatterns()
  {
    ReplacePatternsImpl replacePatterns = new ReplacePatternsImpl();
    return replacePatterns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Before createBefore()
  {
    BeforeImpl before = new BeforeImpl();
    return before;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public After createAfter()
  {
    AfterImpl after = new AfterImpl();
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeCall createCodeCall()
  {
    CodeCallImpl codeCall = new CodeCallImpl();
    return codeCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XtextTestPackage getXtextTestPackage()
  {
    return (XtextTestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XtextTestPackage getPackage()
  {
    return XtextTestPackage.eINSTANCE;
  }

} //XtextTestFactoryImpl
