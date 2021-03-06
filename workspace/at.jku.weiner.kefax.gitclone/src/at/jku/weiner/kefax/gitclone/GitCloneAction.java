package at.jku.weiner.kefax.gitclone;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;

import at.jku.weiner.kefax.shared.KefaxUtils;
import at.jku.weiner.kefax.shared.MyActionHandler;
import at.jku.weiner.kefax.shared.MyNotification;
import at.jku.weiner.kefax.shared.MySettings;
import at.jku.weiner.log.MyLog;

public class GitCloneAction extends MyActionHandler {
	
	public GitCloneAction() {
		super("at.jku.weiner.kefax.gitclone.job");
	}
	
	@Override
	protected void myRun() throws Exception {
		final IProject project = this.setUpProject();
		
		final IFolder src = project.getFolder(MySettings.LINUX_CHECKOUT_DIR);
		if (src.exists()) {
			src.delete(true, this.getMonitor());
		}
		src.create(true, true, this.getMonitor());
		project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		if (ReUseExistingLinuxSrc.reUseExistingLinuxSrc()) {
			this.runReUseExistingLinuxSrc(src);
		} else {
			this.runClone(src);
		}
		project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
	}

	private IProject setUpProject() throws CoreException {
		final IProject project = KefaxUtils.getLinuxProject();
		if (project.exists()) {
			// TODO maybe ask for confirmation before re-creating
			project.delete(true, this.getMonitor());
			project.create(this.getMonitor());
		} else {
			project.create(this.getMonitor());
		}
		project.open(this.getMonitor());
		project.refreshLocal(IResource.DEPTH_INFINITE, this.getMonitor());
		return project;
	}
	
	private void runClone(final IFolder src) throws Exception {
		final String target = KefaxUtils.getLinuxSrcFolderAsFilePath();
		MyLog.debug(GitCloneAction.class, "target='" + target + "'");
		final File targetDir = new File(target);
		
		MyNotification.run("at.jku.weiner.kefax.gitclone actions started",
				"git clone " + MySettings.LINUX_CHECKOUT_URL
				+ " can take several minutes!");
		
		final String format = "yyyy-MM-dd:HH:mm:ss";
		final Date start = new Date();
		final DateFormat dateFormat = new SimpleDateFormat(format);
		final String startString = dateFormat.format(start);
		MyLog.debug(GitCloneAction.class, startString);
		
		// this.runGitCloneCommand1(targetDir);
		this.runGitCloneCommand2(targetDir);
		
		final Date end = new Date();
		final String endString = dateFormat.format(end);
		MyLog.debug(GitCloneAction.class, endString);
		final long durationInMs = end.getTime() - start.getTime();
		final long durationInSec = durationInMs / 1000;
		final long minutes = durationInSec / 60;
		final long seconds = durationInSec % 60;
		MyLog.log(GitCloneAction.class, "git clone "
				+ MySettings.LINUX_CHECKOUT_BRANCH + " took '" + minutes
				+ "' minutes '" + seconds + "' seconds");
	}
	
	private void runGitCloneCommand2(final File targetDir) {
		final List<String> cmds = new ArrayList<String>();
		cmds.add("git");
		cmds.add("clone");
		// cmds.add("--no-tags");
		cmds.add("--depth");
		cmds.add("1");
		cmds.add("--progress");
		cmds.add("--branch");
		cmds.add(MySettings.LINUX_CHECKOUT_BRANCH);
		cmds.add(MySettings.LINUX_CHECKOUT_URL);
		cmds.add(".");
		KefaxUtils.executeCommand(cmds, targetDir, this.getMonitor(), true);
	}
	
	@SuppressWarnings("unused")
	/**
	 * runGitCloneCommand1
	 * not used as JGit clone command does not support
	 * --depth argument,
	 * see https://bugs.eclipse.org/bugs/show_bug.cgi?id=475615
	 */
	private void runGitCloneCommand1(final File targetDir) throws Exception {
		final CloneCommand clone = Git.cloneRepository();
		clone.setURI(MySettings.LINUX_CHECKOUT_URL);
		clone.setDirectory(targetDir);
		clone.setBare(false);
		clone.setCloneAllBranches(false);
		// clone.setNoTags(true);
		// clone.setNoTags(false);
		clone.setCloneSubmodules(false);
		final List<String> branchesToClone = GitCloneAction
				.singleton("refs/heads/" + MySettings.LINUX_CHECKOUT_BRANCH);
		clone.setBranchesToClone(branchesToClone);
		
		clone.setBranch(MySettings.LINUX_CHECKOUT_BRANCH);
		clone.call();
	}
	
	private static List<String> singleton(final String item) {
		final List<String> result = new ArrayList<String>();
		result.add(item);
		return Collections.unmodifiableList(result);
	}
	
	private void runReUseExistingLinuxSrc(final IFolder src) throws Exception {
		MyLog.debug(GitCloneAction.class, "reUseExistingLinuxSrc!");
		final String target = KefaxUtils.getLinuxSrcFolderAsFilePath();
		MyLog.debug(GitCloneAction.class, "target='" + target + "'");
		final String userHome = System.getProperty("user.home");

		final File srcFile = new File(userHome + "/Private/linux/");
		final File dstFile = new File(target);
		FileUtils.copyDirectory(srcFile, dstFile);
	}
}
