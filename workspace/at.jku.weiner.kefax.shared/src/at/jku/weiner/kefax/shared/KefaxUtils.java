package at.jku.weiner.kefax.shared;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;

import at.jku.weiner.log.MyLog;

public final class KefaxUtils {
	private static final String OS_NAME = "os.name";
	public static final int STATE_OKAY = 0;
	public static final int STATE_ERROR = 1;

	private KefaxUtils() {

	}

	public static boolean isLinuxOS() {
		final String osName = System.getProperty(KefaxUtils.OS_NAME);
		if (osName.contains(MySettings.LINUX_OS_NAME_1)) {
			return true;
		} else if (osName.contains(MySettings.LINUX_OS_NAME_2)) {
			return true;
		}
		return false;
	}

	public static File getPluginResource(final AbstractUIPlugin plugin,
			final String path) {
		final Bundle bundle = plugin.getBundle();
		final URL url = bundle.getEntry(path);
		File file = null;
		try {
			final URL fileURL = FileLocator.resolve(url);
			final URI uri = fileURL.toURI();
			file = new File(uri);
			return file;
		} catch (final Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public static List<String> singleton(final String item) {
		final List<String> result = new ArrayList<String>();
		result.add(item);
		return Collections.unmodifiableList(result);
	}

	public static String getURIasString(final IResource res) {
		final String result = res.getLocationURI().toString();
		return result;
	}

	public static String getURIasFileString(final IResource res) {
		final IPath path = res.getLocation();
		final String result = path.toOSString();
		return result;
	}

	public static IProject getLinuxProject() {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot root = workspace.getRoot();
		final IProject project = root.getProject(MySettings.LINUX_CHECKOUT_PRJ);
		return project;
	}

	public static IFolder getLinuxSrcFolder() {
		final IProject project = KefaxUtils.getLinuxProject();
		final IFolder src = project.getFolder(MySettings.LINUX_CHECKOUT_DIR);
		return src;
	}

	public static String getLinuxSrcFolderAsFilePath() {
		final IFolder src = KefaxUtils.getLinuxSrcFolder();
		final IPath path = src.getLocation();
		final String result = path.toOSString();
		return result;
	}

	public static IFile getLinuxConfigFile() {
		final IFolder src = KefaxUtils.getLinuxSrcFolder();
		final IFile file = src.getFile(MySettings.LINUX_CHECKOUT_CONFIG);
		return file;
	}

	public static IProject getLinuxDiscoverProject() {
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot root = workspace.getRoot();
		final IProject project = root.getProject(MySettings.LINUX_DISCOVER_PRJ);
		return project;
	}

	public static IFolder getLinuxDiscoverSrcFolder() {
		final IProject project = KefaxUtils.getLinuxDiscoverProject();
		final IFolder src = project.getFolder(MySettings.LINUX_DISCOVER_DIR);
		return src;
	}

	public static IFolder getLinuxDiscoverTmpWorkingFolder() {
		final IProject project = KefaxUtils.getLinuxDiscoverProject();
		final IFolder src = project
				.getFolder(MySettings.LINUX_DISCOVER_TMP_WORK_DIR);
		return src;
	}

	public static IFile getCommandsFile() {
		final IFolder dstFolder = KefaxUtils.getLinuxDiscoverSrcFolder();
		final IFile cmdOutFile = dstFolder
				.getFile(MySettings.LINUX_DISCOVER_CMD_OUT);
		return cmdOutFile;
	}

	public static boolean executeCommand(final List<String> command,
			final File workingDirectory, final IProgressMonitor monitor,
			final boolean redirectStdError) {
		final String cmd = command.toString();
		MyLog.log(KefaxUtils.class, "Executing cmd='" + cmd + "'");
		boolean result = false;
		final int returnValue = KefaxUtils
				.executeCommandInternalWithExceptionHandling(command,
						workingDirectory, monitor, redirectStdError);
		if (returnValue != KefaxUtils.STATE_OKAY) {
			final String msg = "Executing '" + cmd
					+ "' failed with exit-code='" + returnValue + "'!";
			MyLog.error(KefaxUtils.class, msg);
			MyNotification.run("Command execution has failed", msg);
		} else {
			final String msg = "Executing '" + cmd + "' has been successful!";
			MyLog.log(KefaxUtils.class, msg);
			MyNotification.run("Command execution has finished", cmd);
			result = true;
		}
		return result;
	}

	private static int executeCommandInternalWithExceptionHandling(
			final List<String> command, final File workingDirectory,
			final IProgressMonitor monitor, final boolean redirectStdError) {
		try {
			final int result = KefaxUtils.executeCommandInternal(command,
					workingDirectory, monitor, redirectStdError);
			return result;
		} catch (final OperationCanceledException ex) {
			throw ex;
		} catch (final Exception ex) {
			ex.printStackTrace();
		}
		return KefaxUtils.STATE_ERROR;
	}

	private static int executeCommandInternal(final List<String> command,
			final File workingDirectory, final IProgressMonitor monitor,
			final boolean redirectStdError) throws Exception {

		ProcessBuilder processBuilder = new ProcessBuilder(command);
		processBuilder = processBuilder.directory(workingDirectory);

		processBuilder = processBuilder.redirectErrorStream(redirectStdError);
		final Process process = processBuilder.start();
		final InputStream inputStream = process.getInputStream();
		/**
		 * for some strange reason reading from stdError can lead to a
		 * pipe-broken IO error for the yes command (invoked by e.g., make)
		 */
		// final InputStream errorStream = process.getErrorStream();
		// final StreamReader errorReader = new StreamReader(errorStream);
		final MyStreamReader inputReader = new MyStreamReader(inputStream);

		// errorReader.start();
		inputReader.start();

		final int result = process.waitFor();
		inputReader.close();
		// errorReader.close();

		return result;
	}

	public static IFolder getLinuxTTYSrcFolder() {
		final IFolder src = KefaxUtils.getLinuxSrcFolder();
		final IFolder result = src.getFolder(MySettings.LINUX_DISCOVERER_ROOT_SRC_FOLDER);
		return result;
	}

	// public static IFolder getLinuxExt4SrcFolder() {
	// final IFolder src = KefaxUtils.getLinuxSrcFolder();
	// final IFolder result = src.getFolder(MySettings.LINUX_EXT4_SRC);
	// return result;
	// }

	public static void mkParentDirsFor(final IResource resource,
			final IProgressMonitor monitor) throws Exception {
		if (resource.exists() || resource.isAccessible()) {
			// nothing to do here
			return;
		}
		KefaxUtils.workOn(resource.getParent(), monitor);
	}

	private static void workOn(final IContainer resource,
			final IProgressMonitor monitor) throws Exception {
		if (resource.exists() || resource.isAccessible()) {
			// nothing to do here
			return;
		}
		final IContainer parent = resource.getParent();
		if (KefaxUtils.checkParent(parent)) {
			KefaxUtils.workOn(parent, monitor);
		}
		if (resource instanceof IFolder) {
			((IFolder) resource).create(true, true, monitor);
		}
	}

	private static boolean checkParent(final IContainer parent) {
		if (parent == null) {
			return false;
		} else if (parent instanceof IProject) {
			return false;
		} else if (parent instanceof IWorkspaceRoot) {
			return false;
		} else if (parent.exists()) {
			return false;
		}
		return true;
	}
	
	public static IProject setUpProject(final IProject project, final IProgressMonitor monitor, 
			final boolean forceDeleteBeforeCreate) throws Exception {
		if (project.exists()) {
			if (forceDeleteBeforeCreate) {
				// TODO maybe ask for confirmation before re-creating
				project.delete(true, monitor);
				project.create(monitor);
			}
		} else {
			project.create(monitor);
		}
		project.open(monitor);
		project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return project;
	}
	
}
