package com.test.inheritance;

public class Test {
	public static void main(String[] args) {
		Employee1 employee1=Employee1.getInstance();
		System.out.println(employee1.getInstance());
	}

}


 
final  class Employee1{
	
private String name;
private int age;

private static  Employee1 employee;



private Employee1(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}



public static Employee1 getInstance()
{
	if(employee!=null)
	{
		employee=new Employee1("A",10);
	}
	return employee;
}
	
}