package com.bridgelabz.designpattern.proxydesign.example;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("pankaj".equals(user) && "J@urnalD$v".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin user. ");

			} else {
				executor.runCommand(cmd);
			}
		}
	}
}
