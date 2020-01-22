package com.bridgelabz.designpattern.proxydesign;

public class ClientServer {
	public static void main(String[] args) throws Exception {
		// restrict non admin user
		DatabaseExecuter object = new DatabaseExecuteProxy("nonAdmin", "nonAdmin@gmail.com");
		object.exexuteDatabase("Delet");
		// allow admin user
		DatabaseExecuter objectAdmin = new DatabaseExecuteProxy("Admin", "Admin@123");
		objectAdmin.exexuteDatabase("Delet");
	}
}
