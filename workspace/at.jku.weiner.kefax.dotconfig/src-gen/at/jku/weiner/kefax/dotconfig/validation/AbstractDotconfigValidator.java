/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.kefax.dotconfig.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractDotconfigValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(at.jku.weiner.kefax.dotconfig.dotconfig.DotconfigPackage.eINSTANCE);
		return result;
	}
}
