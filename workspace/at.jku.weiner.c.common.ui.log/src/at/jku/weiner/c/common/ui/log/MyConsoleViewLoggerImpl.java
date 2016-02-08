package at.jku.weiner.c.common.ui.log;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import at.jku.weiner.c.common.ui.log.service.MyConsoleViewLogger;

public final class MyConsoleViewLoggerImpl implements MyConsoleViewLogger {
	private static final String CONSOLE_NAME = "at.jku.weiner.common.ui.log";
	private MessageConsole messageConsole = null;

	@Override
	public void log(final String msg) {
		if (this.messageConsole == null) {
			this.messageConsole = this
					.findConsole(MyConsoleViewLoggerImpl.CONSOLE_NAME);
		}
		final MessageConsoleStream out = this.messageConsole.newMessageStream();
		System.out.println("writing to console...");
		out.println(msg);
		this.messageConsole.activate();
	}

	private MessageConsole findConsole(final String name) {
		final ConsolePlugin plugin = ConsolePlugin.getDefault();
		if (plugin == null) {
			throw new RuntimeException("ConsolePlugin is null!");
		}
		final IConsoleManager conMan = plugin.getConsoleManager();
		final IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName())) {
				return (MessageConsole) existing[i];
			}
		}
		// no console found, so create a new one
		final MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

}