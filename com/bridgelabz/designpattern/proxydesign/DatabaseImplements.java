package com.bridgelabz.designpattern.proxydesign;

public class DatabaseImplements implements DatabaseExecuter {
	// this class can execute any query for both client and admin server
	public void exexuteDatabase(String query) throws Exception {
		System.out.println("going to execute query: " + query);
	}
}
