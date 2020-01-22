package com.bridgelabz.designpattern.proxydesign.example;

public class ProxyPatternTest {
	public static void main(String[] args) {
		// pass valid user
		CommandExecutor executor = new CommandExecutorProxy("pankaj", "wrong-pa");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Massage::" + e.getMessage());
			e.printStackTrace();
		}
	}
}
