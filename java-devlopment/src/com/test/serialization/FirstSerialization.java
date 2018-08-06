package com.test.serialization;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FirstSerialization {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	File file=new File("test.properties");
	FirstSerialization  firstSerialization= new FirstSerialization();
	Test1 test1=new Test1();
	firstSerialization.serialtion(test1, file);
	firstSerialization.deserialization(test1, file);
}
public boolean serialtion(Test1 object,File file) throws IOException
{
	if(object!=null)
	{
	FileOutputStream fileOutputStream= new FileOutputStream(new File("test.properties"));
	@SuppressWarnings("resource")
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(object);
	System.out.println("Object has been serialize");
	return true;
	}
	else
	{
	System.out.println("Not serialize");
	return false;
	}
	
}

public boolean deserialization(Object object,File file) throws IOException, ClassNotFoundException {
	
	if(object!=null && file.exists())
	{
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
		Test1 test = (Test1)inputStream.readObject();
		System.out.println(test.x+"--"+test.y+"--"+test.z+"---"+test.p+"----"+test.d);
		System.out.println("Object has been deserializa");
		file.delete();
		return true;
		
	}
	else{
	return false;
	}
}
}

class Test1 implements Serializable{
	
	
	 int x=10;
	 int y=20;
	 transient int z=30;
	 transient static String p="hahahah";
	 transient final int d=50;
	
	
}