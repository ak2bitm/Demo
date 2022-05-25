package com.designPattern.preventSingletonFromBreak;


public class SingletonClone extends Hello{

	private static SingletonClone instance = new SingletonClone();
	private SingletonClone() {}
	public static SingletonClone getInstance() {
		return instance;
	}

	@Override
	protected Object clone()throws CloneNotSupportedException{
		//throw new CloneNotSupportedException();// stop making clone by throwing exception
		return instance;// returning the same instance 
	}
}
