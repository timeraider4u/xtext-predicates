package at.jku.weiner.c.modisco.discoverer.actions;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

import at.jku.weiner.c.modisco.discoverer.utils.Messages;
import at.jku.weiner.log.MyLog;

public final class DiscovererUtils {
	private static List<String> extensionList = null;
	
	private DiscovererUtils() {
		
	}
	
	protected static final void handleException(final Exception ex)
			throws DiscoveryException {
		if (ex instanceof DiscoveryException) {
			MyLog.errorNoThrows(DiscovererUtils.class, ex);
			throw (DiscoveryException) ex;
		}
		final DiscoveryException newEx = new DiscoveryException("'"
				+ ex.getClass() + "':" + ex.getMessage());
		MyLog.errorNoThrows(DiscovererUtils.class, ex);
		throw newEx;
	}
	
	protected static boolean isApplicableOn(final IResource resource) {
		MyLog.trace(DiscovererUtils.class, "isApplicableOn='" + resource + "'");
		MyLog.trace(DiscovererUtils.class,
				"isApplicableOn='" + resource.getClass() + "'");
		
		if (resource instanceof IFile) {
			return DiscovererUtils.checkFile((IFile) resource);
		} else if (resource instanceof IContainer) {
			final IContainer container = (IContainer) resource;
			MyLog.trace(DiscovererUtils.class, "isContainer");
			final boolean result = container.isAccessible();
			MyLog.trace(AbstractDiscovererWithLogic.class,
					"isContainer.isAccessible='" + result + "'");
			return result;
		} else if (resource instanceof IFolder) {
			final IFolder folder = (IFolder) resource;
			MyLog.trace(AbstractDiscovererWithLogic.class, "isFolder");
			final boolean result = folder.isAccessible();
			return result;
		}
		return false;
	}
	
	protected static boolean isCdtExtension(final String fileExtension) {
		final boolean result = DiscovererUtils.getExtensionList().contains(
				fileExtension);
		MyLog.trace(DiscovererUtils.class, "isCdtExtension='" + fileExtension
				+ "'=" + result);
		return result;
	}
	
	protected static List<String> getExtensionList() {
		if (DiscovererUtils.extensionList == null) {
			final String[] list = Messages.extensionList.split(",");
			DiscovererUtils.extensionList = Arrays.asList(list);
		}
		return DiscovererUtils.extensionList;
	}
	
	protected static boolean checkFile(final IFile file) {
		if (!file.exists()) {
			return false;
		}
		final String ext = file.getFileExtension();
		if (ext == null) {
			return false;
		}
		MyLog.trace(DiscovererUtils.class, "ext=" + ext);
		final boolean result = DiscovererUtils.isCdtExtension(file
				.getFileExtension());
		MyLog.trace(DiscovererUtils.class, "result=" + result);
		return result;
	}
	
	public static IFile getFileFor(final File file) throws DiscoveryException {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IPath location = Path.fromOSString(file.getAbsolutePath());
		final IFile result = workspace.getRoot().getFileForLocation(location);
		if ((file == null) || !file.exists() || !file.canRead()) {
			throw new DiscoveryException("file cannot be accessed="
					+ file.getAbsolutePath());
		}
		final IPath path = result.getFullPath();
		if ((path == null) || path.isEmpty()) {
			throw new DiscoveryException("file cannot be accessed="
					+ file.getAbsolutePath());
		}
		MyLog.trace(DiscovererUtils.class, "filename="
				+ result.getFullPath().toOSString());
		return result;
	}
	
	public static String getTargetDirectory(final IResource res,
			final IProgressMonitor monitor) throws DiscoveryException {
		final IProject project = res.getProject();
		final IFolder folder = project.getFolder("tmp-discover");
		if (!folder.exists()) {
			try {
				folder.create(true, true, monitor);
			} catch (final CoreException ex) {
				throw new DiscoveryException(ex);
			}
		}
		final String tmpStr = folder.getLocationURI().toString();
		final String result = tmpStr.replaceAll("file[:]", "");
		return result;
	}
	
}
