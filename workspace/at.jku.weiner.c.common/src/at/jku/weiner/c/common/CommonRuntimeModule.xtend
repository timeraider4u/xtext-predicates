/*
 * generated by Xtext 2.9.0-SNAPSHOT
 */
package at.jku.weiner.c.common

import org.eclipse.xtext.conversion.IValueConverterService
import at.jku.weiner.c.common.utils.MyValueConverterCommon

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class CommonRuntimeModule extends AbstractCommonRuntimeModule {
	override Class<? extends IValueConverterService> bindIValueConverterService() {
        return MyValueConverterCommon;
    }
}
