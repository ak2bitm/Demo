package com.designPattern.preventSingletonFromBreak;

import java.lang.reflect.Constructor;


public class EagarSingletonBreakUsingReflection {

	public static void main(String[] args) {
		EnumSingleton instanceOne = EnumSingleton.INSTANCE;
		EnumSingleton instanceTwo = null;
		try {
			Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
			for(Constructor constructor: constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EnumSingleton)constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Instance one : "+instanceOne.hashCode());// Instance one HashCode
		System.out.println("Instance two :"+instanceTwo.hashCode());// Instance two Hash code
	}
}
