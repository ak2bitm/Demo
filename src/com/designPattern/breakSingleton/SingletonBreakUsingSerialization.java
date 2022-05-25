package com.designPattern.breakSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class SingletonBreakUsingSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		EagarSingleton instanceOne = EagarSingleton.getInstance();
		EagarSingleton instanceTwo = null;
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("abc.txt"));
		out.writeObject(instanceOne);
		out.close();
		ObjectInput in = new ObjectInputStream(new FileInputStream("abc.txt"));
		instanceTwo=(EagarSingleton)in.readObject();
		
		System.out.println(instanceOne.hashCode());// Instance one hash code
		System.out.println(instanceTwo.hashCode());// Instance two hash code
	}
}
