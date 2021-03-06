/**
 */
package at.jku.weiner.c.cmdarguments.cmdArgs.impl;

import at.jku.weiner.c.cmdarguments.cmdArgs.Argument;
import at.jku.weiner.c.cmdarguments.cmdArgs.CmdArgsPackage;
import at.jku.weiner.c.cmdarguments.cmdArgs.Macro;
import at.jku.weiner.c.cmdarguments.cmdArgs.PathCmd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#getMacro <em>Macro</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#isIncDir <em>Inc Dir</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#getUseIncDir <em>Use Inc Dir</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#isIncSys <em>Inc Sys</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#isNostdinc <em>Nostdinc</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#getOut <em>Out</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#getOption <em>Option</em>}</li>
 *   <li>{@link at.jku.weiner.c.cmdarguments.cmdArgs.impl.ArgumentImpl#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
{
  /**
   * The cached value of the '{@link #getMacro() <em>Macro</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMacro()
   * @generated
   * @ordered
   */
  protected Macro macro;

  /**
   * The default value of the '{@link #isIncDir() <em>Inc Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncDir()
   * @generated
   * @ordered
   */
  protected static final boolean INC_DIR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncDir() <em>Inc Dir</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncDir()
   * @generated
   * @ordered
   */
  protected boolean incDir = INC_DIR_EDEFAULT;

  /**
   * The cached value of the '{@link #getUseIncDir() <em>Use Inc Dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUseIncDir()
   * @generated
   * @ordered
   */
  protected PathCmd useIncDir;

  /**
   * The default value of the '{@link #isIncSys() <em>Inc Sys</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncSys()
   * @generated
   * @ordered
   */
  protected static final boolean INC_SYS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncSys() <em>Inc Sys</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncSys()
   * @generated
   * @ordered
   */
  protected boolean incSys = INC_SYS_EDEFAULT;

  /**
   * The default value of the '{@link #isNostdinc() <em>Nostdinc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNostdinc()
   * @generated
   * @ordered
   */
  protected static final boolean NOSTDINC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNostdinc() <em>Nostdinc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNostdinc()
   * @generated
   * @ordered
   */
  protected boolean nostdinc = NOSTDINC_EDEFAULT;

  /**
   * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclude()
   * @generated
   * @ordered
   */
  protected PathCmd include;

  /**
   * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut()
   * @generated
   * @ordered
   */
  protected PathCmd out;

  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected PathCmd lang;

  /**
   * The default value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected static final String OPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected String option = OPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected static final String IN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected String in = IN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CmdArgsPackage.Literals.ARGUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Macro getMacro()
  {
    return macro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMacro(Macro newMacro, NotificationChain msgs)
  {
    Macro oldMacro = macro;
    macro = newMacro;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__MACRO, oldMacro, newMacro);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMacro(Macro newMacro)
  {
    if (newMacro != macro)
    {
      NotificationChain msgs = null;
      if (macro != null)
        msgs = ((InternalEObject)macro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__MACRO, null, msgs);
      if (newMacro != null)
        msgs = ((InternalEObject)newMacro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__MACRO, null, msgs);
      msgs = basicSetMacro(newMacro, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__MACRO, newMacro, newMacro));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncDir()
  {
    return incDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncDir(boolean newIncDir)
  {
    boolean oldIncDir = incDir;
    incDir = newIncDir;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__INC_DIR, oldIncDir, incDir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathCmd getUseIncDir()
  {
    return useIncDir;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUseIncDir(PathCmd newUseIncDir, NotificationChain msgs)
  {
    PathCmd oldUseIncDir = useIncDir;
    useIncDir = newUseIncDir;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__USE_INC_DIR, oldUseIncDir, newUseIncDir);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUseIncDir(PathCmd newUseIncDir)
  {
    if (newUseIncDir != useIncDir)
    {
      NotificationChain msgs = null;
      if (useIncDir != null)
        msgs = ((InternalEObject)useIncDir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__USE_INC_DIR, null, msgs);
      if (newUseIncDir != null)
        msgs = ((InternalEObject)newUseIncDir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__USE_INC_DIR, null, msgs);
      msgs = basicSetUseIncDir(newUseIncDir, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__USE_INC_DIR, newUseIncDir, newUseIncDir));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncSys()
  {
    return incSys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncSys(boolean newIncSys)
  {
    boolean oldIncSys = incSys;
    incSys = newIncSys;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__INC_SYS, oldIncSys, incSys));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNostdinc()
  {
    return nostdinc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNostdinc(boolean newNostdinc)
  {
    boolean oldNostdinc = nostdinc;
    nostdinc = newNostdinc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__NOSTDINC, oldNostdinc, nostdinc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathCmd getInclude()
  {
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInclude(PathCmd newInclude, NotificationChain msgs)
  {
    PathCmd oldInclude = include;
    include = newInclude;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__INCLUDE, oldInclude, newInclude);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInclude(PathCmd newInclude)
  {
    if (newInclude != include)
    {
      NotificationChain msgs = null;
      if (include != null)
        msgs = ((InternalEObject)include).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__INCLUDE, null, msgs);
      if (newInclude != null)
        msgs = ((InternalEObject)newInclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__INCLUDE, null, msgs);
      msgs = basicSetInclude(newInclude, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__INCLUDE, newInclude, newInclude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathCmd getOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOut(PathCmd newOut, NotificationChain msgs)
  {
    PathCmd oldOut = out;
    out = newOut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__OUT, oldOut, newOut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut(PathCmd newOut)
  {
    if (newOut != out)
    {
      NotificationChain msgs = null;
      if (out != null)
        msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__OUT, null, msgs);
      if (newOut != null)
        msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__OUT, null, msgs);
      msgs = basicSetOut(newOut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__OUT, newOut, newOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathCmd getLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLang(PathCmd newLang, NotificationChain msgs)
  {
    PathCmd oldLang = lang;
    lang = newLang;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__LANG, oldLang, newLang);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(PathCmd newLang)
  {
    if (newLang != lang)
    {
      NotificationChain msgs = null;
      if (lang != null)
        msgs = ((InternalEObject)lang).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__LANG, null, msgs);
      if (newLang != null)
        msgs = ((InternalEObject)newLang).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CmdArgsPackage.ARGUMENT__LANG, null, msgs);
      msgs = basicSetLang(newLang, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__LANG, newLang, newLang));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOption(String newOption)
  {
    String oldOption = option;
    option = newOption;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__OPTION, oldOption, option));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(String newIn)
  {
    String oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CmdArgsPackage.ARGUMENT__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CmdArgsPackage.ARGUMENT__MACRO:
        return basicSetMacro(null, msgs);
      case CmdArgsPackage.ARGUMENT__USE_INC_DIR:
        return basicSetUseIncDir(null, msgs);
      case CmdArgsPackage.ARGUMENT__INCLUDE:
        return basicSetInclude(null, msgs);
      case CmdArgsPackage.ARGUMENT__OUT:
        return basicSetOut(null, msgs);
      case CmdArgsPackage.ARGUMENT__LANG:
        return basicSetLang(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CmdArgsPackage.ARGUMENT__MACRO:
        return getMacro();
      case CmdArgsPackage.ARGUMENT__INC_DIR:
        return isIncDir();
      case CmdArgsPackage.ARGUMENT__USE_INC_DIR:
        return getUseIncDir();
      case CmdArgsPackage.ARGUMENT__INC_SYS:
        return isIncSys();
      case CmdArgsPackage.ARGUMENT__NOSTDINC:
        return isNostdinc();
      case CmdArgsPackage.ARGUMENT__INCLUDE:
        return getInclude();
      case CmdArgsPackage.ARGUMENT__OUT:
        return getOut();
      case CmdArgsPackage.ARGUMENT__LANG:
        return getLang();
      case CmdArgsPackage.ARGUMENT__OPTION:
        return getOption();
      case CmdArgsPackage.ARGUMENT__IN:
        return getIn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CmdArgsPackage.ARGUMENT__MACRO:
        setMacro((Macro)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__INC_DIR:
        setIncDir((Boolean)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__USE_INC_DIR:
        setUseIncDir((PathCmd)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__INC_SYS:
        setIncSys((Boolean)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__NOSTDINC:
        setNostdinc((Boolean)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__INCLUDE:
        setInclude((PathCmd)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__OUT:
        setOut((PathCmd)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__LANG:
        setLang((PathCmd)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__OPTION:
        setOption((String)newValue);
        return;
      case CmdArgsPackage.ARGUMENT__IN:
        setIn((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CmdArgsPackage.ARGUMENT__MACRO:
        setMacro((Macro)null);
        return;
      case CmdArgsPackage.ARGUMENT__INC_DIR:
        setIncDir(INC_DIR_EDEFAULT);
        return;
      case CmdArgsPackage.ARGUMENT__USE_INC_DIR:
        setUseIncDir((PathCmd)null);
        return;
      case CmdArgsPackage.ARGUMENT__INC_SYS:
        setIncSys(INC_SYS_EDEFAULT);
        return;
      case CmdArgsPackage.ARGUMENT__NOSTDINC:
        setNostdinc(NOSTDINC_EDEFAULT);
        return;
      case CmdArgsPackage.ARGUMENT__INCLUDE:
        setInclude((PathCmd)null);
        return;
      case CmdArgsPackage.ARGUMENT__OUT:
        setOut((PathCmd)null);
        return;
      case CmdArgsPackage.ARGUMENT__LANG:
        setLang((PathCmd)null);
        return;
      case CmdArgsPackage.ARGUMENT__OPTION:
        setOption(OPTION_EDEFAULT);
        return;
      case CmdArgsPackage.ARGUMENT__IN:
        setIn(IN_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CmdArgsPackage.ARGUMENT__MACRO:
        return macro != null;
      case CmdArgsPackage.ARGUMENT__INC_DIR:
        return incDir != INC_DIR_EDEFAULT;
      case CmdArgsPackage.ARGUMENT__USE_INC_DIR:
        return useIncDir != null;
      case CmdArgsPackage.ARGUMENT__INC_SYS:
        return incSys != INC_SYS_EDEFAULT;
      case CmdArgsPackage.ARGUMENT__NOSTDINC:
        return nostdinc != NOSTDINC_EDEFAULT;
      case CmdArgsPackage.ARGUMENT__INCLUDE:
        return include != null;
      case CmdArgsPackage.ARGUMENT__OUT:
        return out != null;
      case CmdArgsPackage.ARGUMENT__LANG:
        return lang != null;
      case CmdArgsPackage.ARGUMENT__OPTION:
        return OPTION_EDEFAULT == null ? option != null : !OPTION_EDEFAULT.equals(option);
      case CmdArgsPackage.ARGUMENT__IN:
        return IN_EDEFAULT == null ? in != null : !IN_EDEFAULT.equals(in);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (incDir: ");
    result.append(incDir);
    result.append(", incSys: ");
    result.append(incSys);
    result.append(", nostdinc: ");
    result.append(nostdinc);
    result.append(", option: ");
    result.append(option);
    result.append(", in: ");
    result.append(in);
    result.append(')');
    return result.toString();
  }

} //ArgumentImpl
