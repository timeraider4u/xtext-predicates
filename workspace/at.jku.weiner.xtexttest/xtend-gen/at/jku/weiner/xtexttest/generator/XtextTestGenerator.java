/**
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.xtexttest.generator;

import at.jku.weiner.log.MyLog;
import at.jku.weiner.xtexttest.generator.EmfTestGenerator;
import at.jku.weiner.xtexttest.generator.MyXtextTestGenerator;
import at.jku.weiner.xtexttest.xtextTest.Model;
import at.jku.weiner.xtexttest.xtextTest.XtextTest;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class XtextTestGenerator implements IGenerator {
  private Model model;
  
  private URI uri;
  
  @Accessors
  private String fileName;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    this.uri = _uRI;
    Class<? extends Class> _class = XtextTestGenerator.class.getClass();
    MyLog.trace(_class, (("uri=\'" + this.uri) + "\'"));
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    Model _head = IteratorExtensions.<Model>head(_filter);
    this.model = _head;
    XtextTest _xtextTest = this.model.getXtextTest();
    boolean _notEquals = (!Objects.equal(_xtextTest, null));
    if (_notEquals) {
      final MyXtextTestGenerator generator = new MyXtextTestGenerator();
      generator.doGenerate(resource, fsa, this.model);
    } else {
      final EmfTestGenerator generator_1 = new EmfTestGenerator();
      generator_1.doGenerate(resource, fsa, this.model);
    }
  }
  
  @Pure
  public String getFileName() {
    return this.fileName;
  }
  
  public void setFileName(final String fileName) {
    this.fileName = fileName;
  }
}
