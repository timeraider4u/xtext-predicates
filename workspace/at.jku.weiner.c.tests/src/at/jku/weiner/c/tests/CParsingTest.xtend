/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.tests

import at.jku.weiner.c.c.Model
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(CInjectorProvider)
class CParsingTest{

	@Inject
	ParseHelper<Model> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
