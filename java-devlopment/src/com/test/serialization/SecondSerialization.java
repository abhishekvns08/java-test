package com.test.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SecondSerialization {
	public static void main(String[] args) throws IOException {
		Cat cat=new Cat();
		Dog dog=new Dog();
		Rat rat=new Rat();
		File file=new File("secondSer");
		
		FileOutputStream fileOutputStream= new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(rat);
		objectOutputStream.writeObject(dog);
		objectOutputStream.writeObject(cat);
		
		
		
	}

}


class Cat implements Serializable{
	String x="Cat";
}
class Dog implements Serializable{
	String x="Dog";
}
class Rat implements Serializable{
	String x="Rat";
}