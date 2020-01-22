package com.bridgelabz.designpattern.main;

import com.bridgelabz.designpattern.singletone.BillPughSingleztone;
import com.bridgelabz.designpattern.singletone.Eager;
import com.bridgelabz.designpattern.singletone.EnumsSingleton;
import com.bridgelabz.designpattern.singletone.LazyInitialization;
import com.bridgelabz.designpattern.singletone.StaticBlockSingletone;
import com.bridgelabz.designpattern.singletone.ThreadSafeSingleton;

public class MainMethod {
	public static void main(String[] args) {
		// call eager class method
		Eager.getObject();
		System.out.println(Eager.getObject().hashCode());
		System.out.println(Eager.getObject().hashCode());
		// call static class method 
		StaticBlockSingletone.getObject();
		// call lazy class method
		LazyInitialization.getObject();
		// call Thread class method
		ThreadSafeSingleton.getObject();
		// call thread safe class method 
		ThreadSafeSingleton.getobjectByDoubleLock();
		// call bill pugh class method
		BillPughSingleztone.getObject();
		// call enum singleton class method
		System.out.println(EnumsSingleton.colour.INSTANCE.hashCode());
		System.out.println(EnumsSingleton.colour.print().hashCode());
		System.out.println(EnumsSingleton.colour.print().hashCode());
	}
}
