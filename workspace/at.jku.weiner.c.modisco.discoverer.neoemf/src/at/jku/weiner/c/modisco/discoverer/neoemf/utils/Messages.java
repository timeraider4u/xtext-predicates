package at.jku.weiner.c.modisco.discoverer.neoemf.utils;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
	private static final String BUNDLE_NAME = Messages.class.getCanonicalName(); //$NON-NLS-1$
	public static String modelNeoEMFSuffix;
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}