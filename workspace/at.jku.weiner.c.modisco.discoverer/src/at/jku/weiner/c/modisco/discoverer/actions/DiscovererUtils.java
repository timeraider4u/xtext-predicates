package at.jku.weiner.c.modisco.discoverer.actions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.eclipse.cdt.core.model.CoreModel;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;

import at.jku.weiner.c.common.log.MyLog;
import at.jku.weiner.c.modisco.discoverer.utils.Messages;

final class DiscovererUtils {
	private static List<String> extensionList = null;

	private DiscovererUtils() {

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

	protected static CoreModel getCoreModel() throws DiscoveryException {
		final CoreModel coreModel = CoreModel.getDefault();
		if (coreModel == null) {
			throw new DiscoveryException("coremodel is null!");
		}
		return coreModel;
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

	public static URI getTargetModel(final IResource res,
			final IProgressMonitor monitor) throws DiscoveryException {
		final String path = DiscovererUtils.getTargetDirectory(res, monitor);
		MyLog.trace(DiscovererUtils.class, "targetPath='" + path + "'");
		final Date dNow = new Date();
		final SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd-hhmmss");
		final String prefix = ft.format(dNow);
		MyLog.trace(DiscovererUtils.class, "prefix='" + prefix + "'");
		final String model = path + IPath.SEPARATOR + "discover-" + prefix
				+ Messages.modelFileSuffix;
		MyLog.trace(DiscovererUtils.class, "modelURI='" + model + "'");
		final URI uri = URI.createFileURI(model);
		return uri;
	}
}