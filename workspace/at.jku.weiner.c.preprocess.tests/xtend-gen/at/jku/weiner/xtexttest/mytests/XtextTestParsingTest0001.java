/**
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.xtexttest.mytests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.validation.IResourceValidator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)/* 
@InjectWith(/* name is null */) */
@SuppressWarnings("all")
public class XtextTestParsingTest0001 {
  @Inject
  private /* ParseHelper<Model> */Object parseHelper;
  
  @Inject
  private /* XtextTestGenerator */Object generator;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  private IResourceValidator validator;
  
  @Inject
  private JavaIoFileSystemAccess fileAccessSystem;
  
  private int wordCount = 0;
  
  public String getTextFromFile(final String fileName) throws Exception {
    final Path path = Paths.get(fileName);
    byte[] _readAllBytes = Files.readAllBytes(path);
    final String content = new String(_readAllBytes);
    return content;
  }
  
  @Test
  public void loadModel() {
    throw new Error("Unresolved compilation problems:"
      + "\nsetFileName cannot be resolved"
      + "\ndoGenerate cannot be resolved");
  }
}
