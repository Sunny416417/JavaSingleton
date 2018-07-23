package com.javasampleapproach.singleton;

public class Singleton {
	private String message;
	
	/*
	 * Singleton Instance
	 */
	private static final Singleton instance = new Singleton();
	
	/*
	 * private Constructor for Singleton Pattern
	 * so the class can Not be instantiate
	 */
	private Singleton(){
		message = "Hello World!";
	}
	
	public static Singleton getInstance(){
		return instance;
	}

	public void showMessage() {
		System.out.println(message);
	}

	public void setMessage(String message) {
		this.message = message;
	} 
}
