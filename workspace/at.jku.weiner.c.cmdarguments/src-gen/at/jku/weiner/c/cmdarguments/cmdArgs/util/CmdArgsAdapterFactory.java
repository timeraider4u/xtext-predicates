/**
 */
package at.jku.weiner.c.cmdarguments.cmdArgs.util;

import at.jku.weiner.c.cmdarguments.cmdArgs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.weiner.c.cmdarguments.cmdArgs.CmdArgsPackage
 * @generated
 */
public class CmdArgsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CmdArgsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmdArgsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CmdArgsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CmdArgsSwitch<Adapter> modelSwitch =
    new CmdArgsSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCmdLine(CmdLine object)
      {
        return createCmdLineAdapter();
      }
      @Override
      public Adapter caseTarget(Target object)
      {
        return createTargetAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseMacro(Macro object)
      {
        return createMacroAdapter();
      }
      @Override
      public Adapter casePathCmd(PathCmd object)
      {
        return createPathCmdAdapter();
      }
      @Override
      public Adapter caseSimpleMacro(SimpleMacro object)
      {
        return createSimpleMacroAdapter();
      }
      @Override
      public Adapter caseObjectMacro(ObjectMacro object)
      {
        return createObjectMacroAdapter();
      }
      @Override
      public Adapter caseFunctionMacro(FunctionMacro object)
      {
        return createFunctionMacroAdapter();
      }
      @Override
      public Adapter caseStringMacro(StringMacro object)
      {
        return createStringMacroAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine <em>Cmd Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.CmdLine
   * @generated
   */
  public Adapter createCmdLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.Target <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.Target
   * @generated
   */
  public Adapter createTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.Macro <em>Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.Macro
   * @generated
   */
  public Adapter createMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.PathCmd <em>Path Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.PathCmd
   * @generated
   */
  public Adapter createPathCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.SimpleMacro <em>Simple Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.SimpleMacro
   * @generated
   */
  public Adapter createSimpleMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.ObjectMacro <em>Object Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.ObjectMacro
   * @generated
   */
  public Adapter createObjectMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro <em>Function Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.FunctionMacro
   * @generated
   */
  public Adapter createFunctionMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.jku.weiner.c.cmdarguments.cmdArgs.StringMacro <em>String Macro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.jku.weiner.c.cmdarguments.cmdArgs.StringMacro
   * @generated
   */
  public Adapter createStringMacroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CmdArgsAdapterFactory
