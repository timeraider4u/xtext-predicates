/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.kefax.dotconfig.ui;

import at.jku.weiner.kefax.dotconfig.ui.internal.DotconfigActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DotconfigExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DotconfigActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DotconfigActivator.getInstance().getInjector(DotconfigActivator.AT_JKU_WEINER_KEFAX_DOTCONFIG_DOTCONFIG);
	}
	
}
