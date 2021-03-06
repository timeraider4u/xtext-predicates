/**
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.preprocess.generator;

import at.jku.weiner.c.common.CommonStandaloneSetup;
import at.jku.weiner.c.common.common.CommonFactory;
import at.jku.weiner.c.common.common.Expression;
import at.jku.weiner.c.common.common.Model;
import at.jku.weiner.c.common.common.TranslationUnit;
import at.jku.weiner.c.preprocess.parser.antlr.internal.InternalPreprocessLexer;
import at.jku.weiner.c.preprocess.preprocess.Code;
import at.jku.weiner.c.preprocess.preprocess.ConditionalDirective;
import at.jku.weiner.c.preprocess.preprocess.DefineDirective;
import at.jku.weiner.c.preprocess.preprocess.DefineFunctionLikeMacro;
import at.jku.weiner.c.preprocess.preprocess.DefineObjectMacro;
import at.jku.weiner.c.preprocess.preprocess.ElIfConditional;
import at.jku.weiner.c.preprocess.preprocess.ElseConditional;
import at.jku.weiner.c.preprocess.preprocess.ErrorDirective;
import at.jku.weiner.c.preprocess.preprocess.GroupOpt;
import at.jku.weiner.c.preprocess.preprocess.IdentifierList;
import at.jku.weiner.c.preprocess.preprocess.IfAbstractConditional;
import at.jku.weiner.c.preprocess.preprocess.IfConditional;
import at.jku.weiner.c.preprocess.preprocess.IfDefConditional;
import at.jku.weiner.c.preprocess.preprocess.IfNotDefConditional;
import at.jku.weiner.c.preprocess.preprocess.IncludeDirective;
import at.jku.weiner.c.preprocess.preprocess.LineDirective;
import at.jku.weiner.c.preprocess.preprocess.NewLineLine;
import at.jku.weiner.c.preprocess.preprocess.PragmaDirective;
import at.jku.weiner.c.preprocess.preprocess.Preprocess;
import at.jku.weiner.c.preprocess.preprocess.PreprocessorDirectives;
import at.jku.weiner.c.preprocess.preprocess.SourceCodeLine;
import at.jku.weiner.c.preprocess.preprocess.UnDefineDirective;
import at.jku.weiner.c.preprocess.utils.IncludeDirs;
import at.jku.weiner.c.preprocess.utils.IncludeUtils;
import at.jku.weiner.c.preprocess.utils.LexerUtils;
import at.jku.weiner.c.preprocess.utils.Trimmer;
import at.jku.weiner.c.preprocess.utils.expressions.ExpressionEvaluation;
import at.jku.weiner.c.preprocess.utils.macros.AdditionalPreprocessingDirectives;
import at.jku.weiner.c.preprocess.utils.macros.DefinitionTable;
import at.jku.weiner.c.preprocess.utils.macros.MacroParentheseNotClosedYetException;
import at.jku.weiner.c.preprocess.utils.macros.PredefinedMacros;
import at.jku.weiner.log.MyLog;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PreprocessGenerator implements IGenerator {
  @Accessors
  private String fileName = "hello_world.cdt.i";
  
  @Accessors
  private TranslationUnit unit = null;
  
  @Accessors
  private boolean legacyMode = true;
  
  @Accessors
  private boolean insertPredefinedMacros = false;
  
  @Accessors
  private boolean validateUnit = true;
  
  @Accessors
  private Injector commonInjector;
  
  @Accessors
  private boolean stdInclude = true;
  
  @Accessors
  private String additionalPreprocessingDirectives = null;
  
  @Accessors
  private boolean trimPreprocessModel = false;
  
  @Inject
  private IResourceValidator validator;
  
  @Inject
  private ITokenDefProvider tokenDefProvider;
  
  @Inject
  private InternalPreprocessLexer lexer;
  
  private ResourceSet rs;
  
  private URI uri;
  
  private Stack<URI> currUri;
  
  private List<String> path = new ArrayList<String>();
  
  private boolean standAlone = false;
  
  private DefinitionTable definitionTable;
  
  private Stack<String> currFileNames;
  
  private Stack<String> currLineNumber;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    this.setUp();
    ResourceSet _resourceSet = input.getResourceSet();
    this.rs = _resourceSet;
    URI _uRI = input.getURI();
    this.uri = _uRI;
    Stack<URI> _stack = new Stack<URI>();
    this.currUri = _stack;
    Stack<String> _stack_1 = new Stack<String>();
    this.currFileNames = _stack_1;
    Stack<String> _stack_2 = new Stack<String>();
    this.currLineNumber = _stack_2;
    this.currUri.push(this.uri);
    if (this.stdInclude) {
      IncludeDirs.setUp();
    }
    this.path.clear();
    this.definitionTable.reset();
    if (this.insertPredefinedMacros) {
      this.insertPredefinedMacros();
    }
    final String additional = this.addAdditionalPreprocessingDirectives(this.rs);
    final Preprocess preprocess = this.getPreprocessFor(input, false);
    final String output = this.outputFor(preprocess);
    String _removeInvalid = this.removeInvalid(output);
    final String result = (additional + _removeInvalid);
    Class<? extends Class> _class = PreprocessGenerator.class.getClass();
    MyLog.debug(_class, (("generating output file=\'" + this.fileName) + "\'"));
    fsa.generateFile(this.fileName, result);
    this.trimPreprocess(preprocess);
  }
  
  public void setUp() {
    boolean _equals = Objects.equal(this.commonInjector, null);
    if (_equals) {
      this.standAlone = true;
      final CommonStandaloneSetup setup = new CommonStandaloneSetup();
      final Injector injector = setup.createInjectorAndDoEMFRegistration();
      this.commonInjector = injector;
    }
    final LexerUtils utils = new LexerUtils(this.lexer, this.tokenDefProvider);
    DefinitionTable _definitionTable = new DefinitionTable(utils);
    this.definitionTable = _definitionTable;
  }
  
  public void insertPredefinedMacros() {
    final Preprocess predefined = PredefinedMacros.loadPreDefinedMacros(this.standAlone, this.stdInclude);
    this.path.add("/predefined/");
    this.currFileNames.push("/predefined/");
    this.currLineNumber.push("0");
    this.registerFileName();
    this.registerLineNumber();
    final String output = this.outputFor(predefined);
    output.trim();
    this.currFileNames.pop();
    this.currLineNumber.pop();
  }
  
  public String addAdditionalPreprocessingDirectives(final ResourceSet resourceSet) {
    try {
      boolean _or = false;
      boolean _equals = Objects.equal(this.additionalPreprocessingDirectives, null);
      if (_equals) {
        _or = true;
      } else {
        boolean _isEmpty = this.additionalPreprocessingDirectives.isEmpty();
        _or = _isEmpty;
      }
      if (_or) {
        return "";
      }
      final Preprocess additional = AdditionalPreprocessingDirectives.getAdditionalDirectivesFor(
        this.additionalPreprocessingDirectives);
      this.currLineNumber.push("0");
      this.currFileNames.push("/additionalPreprocessingDirectives/");
      this.registerFileName();
      this.registerLineNumber();
      this.path.add("/additionalPreprocessingDirectives/");
      final String result = this.outputFor(additional);
      this.currFileNames.pop();
      this.currLineNumber.pop();
      return result.trim();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Preprocess getPreprocessFor(final Resource input, final boolean forceLoading) {
    Preprocess preprocess = null;
    this.validatePreprocess(input);
    final String tempFileName = this.getFileName(input);
    this.currLineNumber.push("0");
    this.currFileNames.push(tempFileName);
    this.registerFileName();
    this.registerLineNumber();
    boolean _equals = Objects.equal(this.unit, null);
    if (_equals) {
      TreeIterator<EObject> _allContents = input.getAllContents();
      Iterator<Preprocess> _filter = Iterators.<Preprocess>filter(_allContents, Preprocess.class);
      Preprocess _head = IteratorExtensions.<Preprocess>head(_filter);
      preprocess = _head;
      Class<? extends Class> _class = PreprocessGenerator.class.getClass();
      String _peek = this.currFileNames.peek();
      String _plus = ((("unit-null: preprocess=\'" + preprocess) + "\'") + _peek);
      String _plus_1 = (_plus + "\'");
      MyLog.trace(_class, _plus_1);
    } else {
      at.jku.weiner.c.common.common.Preprocess _preprocess = this.unit.getPreprocess();
      preprocess = ((Preprocess) _preprocess);
      boolean _or = false;
      boolean _equals_1 = Objects.equal(preprocess, null);
      if (_equals_1) {
        _or = true;
      } else {
        _or = forceLoading;
      }
      if (_or) {
        String _peek_1 = this.currFileNames.peek();
        Preprocess _loadExistingPreprocess = this.loadExistingPreprocess(_peek_1);
        preprocess = _loadExistingPreprocess;
        Class<? extends Class> _class_1 = PreprocessGenerator.class.getClass();
        String _peek_2 = this.currFileNames.peek();
        String _plus_2 = ((("force-loading: preprocess=\'" + preprocess) + "\'") + _peek_2);
        String _plus_3 = (_plus_2 + "\'");
        MyLog.debug(_class_1, _plus_3);
        boolean _equals_2 = Objects.equal(preprocess, null);
        if (_equals_2) {
          TreeIterator<EObject> _allContents_1 = input.getAllContents();
          Iterator<Preprocess> _filter_1 = Iterators.<Preprocess>filter(_allContents_1, Preprocess.class);
          Preprocess _head_1 = IteratorExtensions.<Preprocess>head(_filter_1);
          preprocess = _head_1;
          Class<? extends Class> _class_2 = PreprocessGenerator.class.getClass();
          String _peek_3 = this.currFileNames.peek();
          String _plus_4 = ((("filtering: preprocess=\'" + preprocess) + "\'") + _peek_3);
          String _plus_5 = (_plus_4 + "\'");
          MyLog.debug(_class_2, _plus_5);
        }
      }
    }
    boolean _equals_3 = Objects.equal(preprocess, null);
    if (_equals_3) {
      final RuntimeException ex = new RuntimeException("preprocess is null!");
      Class<? extends Class> _class_3 = PreprocessGenerator.class.getClass();
      MyLog.error(_class_3, ex);
    }
    String _peek_4 = this.currFileNames.peek();
    String _plus_6 = ("/" + _peek_4);
    String _plus_7 = (_plus_6 + "/");
    this.path.add(_plus_7);
    return preprocess;
  }
  
  public String getFileName(final Resource input) {
    final URI myuri = input.getURI();
    String fileName = myuri.toFileString();
    this.currUri.push(myuri);
    boolean _equals = Objects.equal(fileName, null);
    if (_equals) {
      String _platformString = myuri.toPlatformString(false);
      fileName = _platformString;
    }
    final String path = fileName.replaceAll("^///", "/");
    return path;
  }
  
  public Preprocess loadExistingPreprocess(final String filePath) {
    EObject _eContainer = this.unit.eContainer();
    final Model model = ((Model) _eContainer);
    boolean _equals = Objects.equal(model, null);
    if (_equals) {
      return null;
    }
    final EList<TranslationUnit> units = model.getUnits();
    for (int i = 0; (i < units.size()); i++) {
      {
        final TranslationUnit myUnit = units.get(i);
        String _path = myUnit.getPath();
        boolean _equals_1 = filePath.equals(_path);
        if (_equals_1) {
          at.jku.weiner.c.common.common.Preprocess _preprocess = myUnit.getPreprocess();
          return ((Preprocess) _preprocess);
        }
      }
    }
    return null;
  }
  
  public void validatePreprocess(final Resource resource) {
    if ((!this.validateUnit)) {
      return;
    }
    final List<Issue> list = this.validator.validate(resource, CheckMode.ALL, 
      CancelIndicator.NullImpl);
    boolean _isEmpty = list.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _string = list.toString();
      String _plus = ("error during validation of unit=\'" + _string);
      String _plus_1 = (_plus + "\'");
      final RuntimeException ex = new RuntimeException(_plus_1);
      Class<? extends Class> _class = PreprocessGenerator.class.getClass();
      MyLog.error(_class, ex);
    }
  }
  
  public String outputFor(final Preprocess preprocess) {
    GroupOpt _group = preprocess.getGroup();
    final String result = this.outputFor(_group);
    return result;
  }
  
  public String outputFor(final GroupOpt group) {
    Class<? extends Class> _class = PreprocessGenerator.class.getClass();
    MyLog.debug(_class, (("outputFor path=\'" + this.path) + "\'"));
    final StringBuffer result = new StringBuffer("");
    this.registerLineNumber();
    for (int i = 0; (i < group.getLines().size()); i++) {
      {
        EList<SourceCodeLine> _lines = group.getLines();
        SourceCodeLine obj = _lines.get(i);
        if ((obj instanceof PreprocessorDirectives)) {
          String _outputFor = this.outputFor(((PreprocessorDirectives) obj));
          result.append(_outputFor);
        } else {
          if ((obj instanceof NewLineLine)) {
            String _outputFor_1 = this.outputFor(((NewLineLine) obj));
            result.append(_outputFor_1);
          } else {
            if ((obj instanceof Code)) {
              boolean fullResolved = false;
              String codeResult = "";
              final List<Code> codeList = new ArrayList<Code>();
              do {
                try {
                  final SourceCodeLine line = ((SourceCodeLine) obj);
                  if ((line instanceof Code)) {
                    final Code code = ((Code) obj);
                    codeList.add(code);
                    String _outputFor_2 = this.outputFor(codeList);
                    codeResult = _outputFor_2;
                    fullResolved = true;
                  } else {
                    if ((line instanceof NewLineLine)) {
                      i++;
                      EList<SourceCodeLine> _lines_1 = group.getLines();
                      SourceCodeLine _get = _lines_1.get(i);
                      obj = _get;
                    } else {
                      final RuntimeException ex = new IllegalArgumentException("Can not nest a preprocessor directive while looking of a closing parentheses!");
                      Class<? extends Class> _class_1 = PreprocessGenerator.class.getClass();
                      MyLog.error(_class_1, ex);
                    }
                  }
                } catch (final Throwable _t) {
                  if (_t instanceof MacroParentheseNotClosedYetException) {
                    final MacroParentheseNotClosedYetException ex_1 = (MacroParentheseNotClosedYetException)_t;
                    Class<? extends Class> _class_2 = PreprocessGenerator.class.getClass();
                    MyLog.debug(_class_2, (("not fully resolved at=\'" + Integer.valueOf(i)) + "\'"));
                    i++;
                    EList<SourceCodeLine> _lines_2 = group.getLines();
                    SourceCodeLine _get_1 = _lines_2.get(i);
                    obj = _get_1;
                  } else {
                    throw Exceptions.sneakyThrow(_t);
                  }
                }
              } while((!fullResolved));
              result.append(codeResult);
              String _newLine = this.getNewLine();
              result.append(_newLine);
            }
          }
        }
        this.incrementCurrLineNumber();
      }
    }
    int _length = ((Object[])Conversions.unwrapArray(this.path, Object.class)).length;
    int _minus = (_length - 1);
    this.path.remove(_minus);
    Class<? extends Class> _class_1 = PreprocessGenerator.class.getClass();
    MyLog.debug(_class_1, (("back in path=\'" + this.path) + "\'"));
    return result.toString();
  }
  
  public String outputFor(final PreprocessorDirectives obj) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EObject _directive = obj.getDirective();
      if ((_directive instanceof IncludeDirective)) {
        EObject _directive_1 = obj.getDirective();
        String _outputFor = this.outputFor(((IncludeDirective) _directive_1));
        _builder.append(_outputFor, "");
        _builder.newLineIfNotEmpty();
      } else {
        EObject _directive_2 = obj.getDirective();
        if ((_directive_2 instanceof DefineDirective)) {
          EObject _directive_3 = obj.getDirective();
          String _outputFor_1 = this.outputFor(((DefineDirective) _directive_3));
          _builder.append(_outputFor_1, "");
          _builder.newLineIfNotEmpty();
        } else {
          EObject _directive_4 = obj.getDirective();
          if ((_directive_4 instanceof UnDefineDirective)) {
            EObject _directive_5 = obj.getDirective();
            String _outputFor_2 = this.outputFor(((UnDefineDirective) _directive_5));
            _builder.append(_outputFor_2, "");
            _builder.newLineIfNotEmpty();
          } else {
            EObject _directive_6 = obj.getDirective();
            if ((_directive_6 instanceof ConditionalDirective)) {
              EObject _directive_7 = obj.getDirective();
              String _outputFor_3 = this.outputFor(((ConditionalDirective) _directive_7));
              _builder.append(_outputFor_3, "");
              _builder.newLineIfNotEmpty();
            } else {
              EObject _directive_8 = obj.getDirective();
              if ((_directive_8 instanceof LineDirective)) {
                EObject _directive_9 = obj.getDirective();
                String _outputFor_4 = this.outputFor(((LineDirective) _directive_9));
                _builder.append(_outputFor_4, "");
                _builder.newLineIfNotEmpty();
              } else {
                EObject _directive_10 = obj.getDirective();
                if ((_directive_10 instanceof ErrorDirective)) {
                  EObject _directive_11 = obj.getDirective();
                  String _outputFor_5 = this.outputFor(((ErrorDirective) _directive_11));
                  _builder.append(_outputFor_5, "");
                  _builder.newLineIfNotEmpty();
                } else {
                  EObject _directive_12 = obj.getDirective();
                  if ((_directive_12 instanceof PragmaDirective)) {
                    EObject _directive_13 = obj.getDirective();
                    String _outputFor_6 = this.outputFor(((PragmaDirective) _directive_13));
                    _builder.append(_outputFor_6, "");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public String outputFor(final IncludeDirective obj) {
    if (this.legacyMode) {
      return this.outputForLegacyMode(obj);
    }
    return "";
  }
  
  public String outputForLegacyMode(final IncludeDirective obj) {
    try {
      final String inc = obj.getString();
      URI _peek = this.currUri.peek();
      boolean _isNext = obj.isNext();
      final IncludeUtils includeUtils = new IncludeUtils(this.rs, _peek, inc, this.definitionTable, _isNext);
      final Resource res = includeUtils.getResource();
      final Preprocess preprocess = this.getPreprocessFor(res, true);
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(this.unit, null));
      if (!_notEquals) {
        _and = false;
      } else {
        EObject _eContainer = preprocess.eContainer();
        boolean _equals = Objects.equal(_eContainer, null);
        _and = _equals;
      }
      if (_and) {
        EObject _eContainer_1 = this.unit.eContainer();
        final Model model = ((Model) _eContainer_1);
        final CommonFactory factory = CommonFactory.eINSTANCE;
        final TranslationUnit unit2 = factory.createTranslationUnit();
        final String path = this.getFileName(res);
        unit2.setPath(path);
        EList<TranslationUnit> _units = model.getUnits();
        _units.add(unit2);
        unit2.setPreprocess(preprocess);
        obj.setUnit(unit2);
      }
      final String output = this.outputFor(preprocess);
      this.currUri.pop();
      this.currFileNames.pop();
      this.currLineNumber.pop();
      return output;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String outputFor(final DefineDirective obj) {
    if ((obj instanceof DefineObjectMacro)) {
      String _ident = ((DefineObjectMacro)obj).getIdent();
      String _string = ((DefineObjectMacro)obj).getString();
      this.definitionTable.add(_ident, _string);
    } else {
      if ((obj instanceof DefineFunctionLikeMacro)) {
        String _ident_1 = ((DefineFunctionLikeMacro)obj).getIdent();
        IdentifierList _list = ((DefineFunctionLikeMacro)obj).getList();
        String _string_1 = ((DefineFunctionLikeMacro)obj).getString();
        this.definitionTable.addFunctionMacro(_ident_1, _list, _string_1);
      }
    }
    return "";
  }
  
  public String outputFor(final UnDefineDirective obj) {
    String _ident = obj.getIdent();
    this.definitionTable.remove(_ident);
    return "";
  }
  
  public String outputFor(final ConditionalDirective obj) {
    final StringBuffer result = new StringBuffer("");
    obj.setBranchTaken(null);
    IfAbstractConditional _conditional = obj.getConditional();
    if ((_conditional instanceof IfConditional)) {
      IfAbstractConditional _conditional_1 = obj.getConditional();
      String _outputFor = this.outputFor(obj, ((IfConditional) _conditional_1));
      result.append(_outputFor);
    } else {
      IfAbstractConditional _conditional_2 = obj.getConditional();
      if ((_conditional_2 instanceof IfDefConditional)) {
        IfAbstractConditional _conditional_3 = obj.getConditional();
        String _outputFor_1 = this.outputFor(obj, ((IfDefConditional) _conditional_3));
        result.append(_outputFor_1);
      } else {
        IfAbstractConditional _conditional_4 = obj.getConditional();
        if ((_conditional_4 instanceof IfNotDefConditional)) {
          IfAbstractConditional _conditional_5 = obj.getConditional();
          String _outputFor_2 = this.outputFor(obj, ((IfNotDefConditional) _conditional_5));
          result.append(_outputFor_2);
        }
      }
    }
    EList<ElIfConditional> _elifs = obj.getElifs();
    String _outputFor_3 = this.outputFor(obj, _elifs);
    result.append(_outputFor_3);
    ElseConditional _else = obj.getElse();
    String _outputFor_4 = this.outputFor(obj, _else);
    result.append(_outputFor_4);
    return result.toString();
  }
  
  public String outputFor(final ConditionalDirective condDirective, final IfDefConditional obj) {
    String _ident = obj.getIdent();
    boolean _isDefined = this.definitionTable.isDefined(_ident);
    if (_isDefined) {
      condDirective.setBranchTaken(obj);
      obj.setBranchTaken(true);
      String _ident_1 = obj.getIdent();
      String _plus = ("ifdef " + _ident_1);
      String _plus_1 = (_plus + "/");
      this.path.add(_plus_1);
      GroupOpt _group = obj.getGroup();
      String _outputFor = this.outputFor(_group);
      return _outputFor.trim();
    }
    return "";
  }
  
  public String outputFor(final ConditionalDirective condDirective, final IfNotDefConditional obj) {
    String _ident = obj.getIdent();
    boolean _isDefined = this.definitionTable.isDefined(_ident);
    boolean _not = (!_isDefined);
    if (_not) {
      condDirective.setBranchTaken(obj);
      obj.setBranchTaken(true);
      String _ident_1 = obj.getIdent();
      String _plus = ("ifnotdef " + _ident_1);
      String _plus_1 = (_plus + "/");
      this.path.add(_plus_1);
      GroupOpt _group = obj.getGroup();
      String _outputFor = this.outputFor(_group);
      return _outputFor.trim();
    }
    return "";
  }
  
  public String outputFor(final ConditionalDirective condDirective, final IfConditional obj) {
    final Expression expr = obj.getExpression();
    final String string = ExpressionEvaluation.evaluateFor(expr);
    final boolean result = ExpressionEvaluation.evaluateFor(expr, this.commonInjector, this.definitionTable);
    Class<? extends Class> _class = PreprocessGenerator.class.getClass();
    MyLog.trace(_class, (((("resultOfExpr=\'" + string) + "\'=\'") + Boolean.valueOf(result)) + "\'"));
    if (result) {
      this.path.add((("if " + string) + "/"));
      condDirective.setBranchTaken(obj);
      obj.setBranchTaken(true);
      GroupOpt _group = obj.getGroup();
      String _outputFor = this.outputFor(_group);
      return _outputFor.trim();
    }
    return "";
  }
  
  public String outputFor(final ConditionalDirective condDirective, final EList<ElIfConditional> obj) {
    boolean _equals = Objects.equal(obj, null);
    if (_equals) {
      return "";
    }
    final IfAbstractConditional condition = condDirective.getBranchTaken();
    boolean _notEquals = (!Objects.equal(condition, null));
    if (_notEquals) {
      return "";
    }
    final StringBuffer result = new StringBuffer("");
    for (final ElIfConditional cond : obj) {
      String _outputFor = this.outputFor(condDirective, cond);
      result.append(_outputFor);
    }
    return result.toString();
  }
  
  public String outputFor(final ConditionalDirective condDirective, final ElIfConditional obj) {
    final IfAbstractConditional condition = condDirective.getBranchTaken();
    boolean _notEquals = (!Objects.equal(condition, null));
    if (_notEquals) {
      return "";
    }
    final Expression expr = obj.getExpression();
    boolean _evaluateFor = ExpressionEvaluation.evaluateFor(expr, this.commonInjector, this.definitionTable);
    if (_evaluateFor) {
      final String string = ExpressionEvaluation.evaluateFor(expr);
      this.path.add((("elif" + string) + "/"));
      condDirective.setBranchTaken(obj);
      obj.setBranchTaken(true);
      GroupOpt _group = obj.getGroup();
      String _outputFor = this.outputFor(_group);
      return _outputFor.trim();
    }
    return "";
  }
  
  public String outputFor(final ConditionalDirective condDirective, final ElseConditional obj) {
    final IfAbstractConditional condition = condDirective.getBranchTaken();
    boolean _notEquals = (!Objects.equal(condition, null));
    if (_notEquals) {
      return "";
    } else {
      boolean _equals = Objects.equal(obj, null);
      if (_equals) {
        return "";
      }
    }
    condDirective.setBranchTaken(obj);
    obj.setBranchTaken(true);
    this.path.add("else/");
    GroupOpt _group = obj.getGroup();
    String _outputFor = this.outputFor(_group);
    return _outputFor.trim();
  }
  
  public String outputFor(final LineDirective obj) {
    final String lineUnresolved = obj.getLine();
    final String line = this.resolve(lineUnresolved);
    this.currLineNumber.pop();
    Integer _valueOf = Integer.valueOf(line);
    int _minus = ((_valueOf).intValue() - 1);
    String _valueOf_1 = String.valueOf(_minus);
    this.currLineNumber.push(_valueOf_1);
    this.registerLineNumber();
    final String pathUnresolved = obj.getPath();
    boolean _notEquals = (!Objects.equal(pathUnresolved, null));
    if (_notEquals) {
      final String pathPure = this.resolve(pathUnresolved);
      this.currFileNames.pop();
      this.currFileNames.push(pathPure);
      this.registerFileName();
    }
    return "";
  }
  
  public String outputFor(final ErrorDirective obj) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String outputFor(final PragmaDirective obj) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  public String outputFor(final NewLineLine obj) {
    return this.getNewLine();
  }
  
  public String getNewLine() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    return _builder.toString();
  }
  
  public String outputFor(final List<Code> obj) {
    final StringBuffer text = new StringBuffer("");
    for (final Code code : obj) {
      String _code = code.getCode();
      text.append(_code);
    }
    String _string = text.toString();
    final String result = this.resolve(_string);
    return result;
  }
  
  public String resolve(final String code) {
    return this.definitionTable.fullResolve(code);
  }
  
  public DefinitionTable getDefinitionTable() {
    return this.definitionTable;
  }
  
  public String removeInvalid(final String my) {
    return my;
  }
  
  public void trimPreprocess(final Preprocess preprocess) {
    if ((!this.trimPreprocessModel)) {
      return;
    }
    Trimmer.trimPreprocess(preprocess);
  }
  
  public void incrementCurrLineNumber() {
    final String tempLineNumAsStr = this.currLineNumber.pop();
    final Integer tempLineNum = Integer.valueOf(tempLineNumAsStr);
    int _intValue = tempLineNum.intValue();
    final int i = (_intValue + 1);
    this.currLineNumber.push(("" + Integer.valueOf(i)));
    this.registerLineNumber();
  }
  
  public void registerLineNumber() {
    this.definitionTable.remove(PredefinedMacros.MACRO_LINE);
    String _peek = this.currLineNumber.peek();
    this.definitionTable.add(PredefinedMacros.MACRO_LINE, _peek);
  }
  
  public void registerFileName() {
    this.definitionTable.remove(PredefinedMacros.MACRO_FILE);
    final String temp = this.currFileNames.peek();
    boolean _startsWith = temp.startsWith("\"");
    if (_startsWith) {
      String _peek = this.currFileNames.peek();
      this.definitionTable.add(PredefinedMacros.MACRO_FILE, _peek);
    } else {
      String _peek_1 = this.currFileNames.peek();
      String _plus = ("\"" + _peek_1);
      String _plus_1 = (_plus + "\"");
      this.definitionTable.add(PredefinedMacros.MACRO_FILE, _plus_1);
    }
  }
  
  @Pure
  public String getFileName() {
    return this.fileName;
  }
  
  public void setFileName(final String fileName) {
    this.fileName = fileName;
  }
  
  @Pure
  public TranslationUnit getUnit() {
    return this.unit;
  }
  
  public void setUnit(final TranslationUnit unit) {
    this.unit = unit;
  }
  
  @Pure
  public boolean isLegacyMode() {
    return this.legacyMode;
  }
  
  public void setLegacyMode(final boolean legacyMode) {
    this.legacyMode = legacyMode;
  }
  
  @Pure
  public boolean isInsertPredefinedMacros() {
    return this.insertPredefinedMacros;
  }
  
  public void setInsertPredefinedMacros(final boolean insertPredefinedMacros) {
    this.insertPredefinedMacros = insertPredefinedMacros;
  }
  
  @Pure
  public boolean isValidateUnit() {
    return this.validateUnit;
  }
  
  public void setValidateUnit(final boolean validateUnit) {
    this.validateUnit = validateUnit;
  }
  
  @Pure
  public Injector getCommonInjector() {
    return this.commonInjector;
  }
  
  public void setCommonInjector(final Injector commonInjector) {
    this.commonInjector = commonInjector;
  }
  
  @Pure
  public boolean isStdInclude() {
    return this.stdInclude;
  }
  
  public void setStdInclude(final boolean stdInclude) {
    this.stdInclude = stdInclude;
  }
  
  @Pure
  public String getAdditionalPreprocessingDirectives() {
    return this.additionalPreprocessingDirectives;
  }
  
  public void setAdditionalPreprocessingDirectives(final String additionalPreprocessingDirectives) {
    this.additionalPreprocessingDirectives = additionalPreprocessingDirectives;
  }
  
  @Pure
  public boolean isTrimPreprocessModel() {
    return this.trimPreprocessModel;
  }
  
  public void setTrimPreprocessModel(final boolean trimPreprocessModel) {
    this.trimPreprocessModel = trimPreprocessModel;
  }
}
