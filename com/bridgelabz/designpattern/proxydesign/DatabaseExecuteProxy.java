package com.bridgelabz.designpattern.proxydesign;

public class DatabaseExecuteProxy implements DatabaseExecuter {
	boolean ifAdmin;
	DatabaseImplements object;
	//this controller the access for both admin and non admin
	public DatabaseExecuteProxy(String username,String password){
		if(username=="Admin" && password=="Admin@123"){
			ifAdmin=true;
			object=new DatabaseImplements();
		}
	}
	
	public void exexuteDatabase(String query) throws Exception {
		if(ifAdmin){
			object.exexuteDatabase(query);
		}else{
			if(query.equals("Delet")){
				throw new Exception("delet is not allowed for nonUser Admin");
			}else{
				object.exexuteDatabase(query);
			}
		}
	}
}
