/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.preprocess.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPreprocessValidator extends at.jku.weiner.c.common.validation.CommonValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
	    result.add(at.jku.weiner.c.preprocess.preprocess.PreprocessPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.jku.at/weiner/c/common/Common"));
		return result;
	}
}
