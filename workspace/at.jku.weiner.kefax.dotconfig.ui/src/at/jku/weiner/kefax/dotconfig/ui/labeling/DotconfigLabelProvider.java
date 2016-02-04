/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.kefax.dotconfig.ui.labeling;

import com.google.inject.Inject;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
public class DotconfigLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {

	@Inject
	public DotconfigLabelProvider(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
//	String text(Greeting ele) {
//		return "A greeting to " + ele.getName();
//	}
//
//	String image(Greeting ele) {
//		return "Greeting.gif";
//	}
}