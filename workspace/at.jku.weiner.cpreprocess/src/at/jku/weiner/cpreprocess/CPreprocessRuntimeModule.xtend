/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.cpreprocess

import org.eclipse.xtext.conversion.IValueConverterService
import at.jku.weiner.cpreprocess.utils.MyCodeLineValueConverter

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class CPreprocessRuntimeModule extends AbstractCPreprocessRuntimeModule {
	
    override Class<? extends IValueConverterService> bindIValueConverterService() {
        return MyCodeLineValueConverter;
    }
    
}