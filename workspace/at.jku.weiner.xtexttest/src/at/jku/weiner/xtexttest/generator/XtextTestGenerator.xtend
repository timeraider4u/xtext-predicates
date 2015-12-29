/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.xtexttest.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.jku.weiner.xtexttest.xtextTest.XtextTest
import org.eclipse.emf.common.util.URI
import at.jku.weiner.xtexttest.xtextTest.Element
import at.jku.weiner.xtexttest.xtextTest.Inner
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.lib.annotations.Accessors
import at.jku.weiner.xtexttest.xtextTest.Model

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class XtextTestGenerator implements IGenerator {
	private Model model;
	private URI uri;
	
	@Accessors String fileName;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		uri = resource.URI;
		// System.out.println("uri='" + uri + "'");
		model = resource.allContents.filter(typeof(Model)).head;
		
		if (model.xtextTest != null) {
			val MyXtextTestGenerator generator = new MyXtextTestGenerator();
			generator.doGenerate(resource, fsa, model);
		}
		else {
			val EmfTestGenerator generator = new EmfTestGenerator();
			generator.doGenerate(resource, fsa, model);
		}
	}
		
}
