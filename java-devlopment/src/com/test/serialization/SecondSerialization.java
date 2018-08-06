package com.test.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SecondSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat cat=new Cat();
		Dog dog=new Dog();
		Rat rat=new Rat();
		//Serialization Maintains order
		File file=new File("secondSer");
		
		FileOutputStream fileOutputStream= new FileOutputStream(file);
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
		// Start Serialization
		objectOutputStream.writeObject(rat);
		objectOutputStream.writeObject(dog);
		objectOutputStream.writeObject(cat);
		
		FileInputStream fileInputStream =new FileInputStream(file);
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		Rat r=(Rat)inputStream.readObject();
		Dog d=(Dog)inputStream.readObject();
		Cat c=(Cat)inputStream.readObject();
		System.out.println(c.dog.r.x);
		
		
		
	}

}


class Cat implements Serializable{
	String x="Cat";
	Dog dog=new Dog();
}
class Dog implements Serializable{
	Rat r=new Rat();
	String x="Dog";
}
class Rat implements Serializable{
	String x="Rat";
}

