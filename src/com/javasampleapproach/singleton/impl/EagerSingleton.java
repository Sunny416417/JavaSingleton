package com.javasampleapproach.singleton.impl;

public class EagerSingleton {
	private static EagerSingleton instance = new EagerSingleton();
	
	public static EagerSingleton getInstance(){
		return instance;
	}	
}