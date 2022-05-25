package com.designPattern.breakSingleton;

import java.lang.reflect.Constructor;

import com.designPattern.EagarInItializationSingleton;

public class EagarSingletonBreakUsingReflection {

	public static void main(String[] args) {
		EagarInItializationSingleton instanceOne = EagarInItializationSingleton.getInstance();
		EagarInItializationSingleton instanceTwo = null;
		try {
			Constructor[] constructors = EagarInItializationSingleton.class.getDeclaredConstructors();
			for(Constructor constructor: constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EagarInItializationSingleton)constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());// Instance one HashCode
		System.out.println(instanceTwo.hashCode());// Instance two Hash code
	}
}
