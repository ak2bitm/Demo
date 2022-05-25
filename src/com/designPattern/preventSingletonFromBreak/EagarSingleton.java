package com.designPattern.preventSingletonFromBreak;

import java.io.Serializable;

public class EagarSingleton implements Serializable{

	private static EagarSingleton instance = new EagarSingleton();
	private EagarSingleton() {}
	public static EagarSingleton getInstance() {
		return instance;
	}
	
	public Object readResolve() {
		return instance;
	}
}
