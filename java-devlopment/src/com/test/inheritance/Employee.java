package com.test.inheritance;

public  class Employee {

	public static void main(String[] args) {
		
		/*Test1 test1=new Test3();
		System.out.println(test1.s1);
		System.out.println(test1.s2);*/
		
		/*Test3 test3=new Test3();
		System.out.println(test3.s1);
		System.out.println(test3.s2);
		System.out.println(test3.s3);
		System.out.println(test3.s4);*/
		
		Test2 test2=new Test3();
		System.out.println(test2.s1);
		System.out.println(test2.s2);
		System.out.println(test2.s3);
		System.out.println(test2.s4);
	}
	
	
}
  class Test1
  {
	  String s1="Hello1";
	  String s2="Hi1";
  }
  
  class Test2 extends Test1
  {
	  String s3="Hello2";
	  String s4="hi2";
	  String s5="ok2";
  }
  
  class Test3 extends Test2{
	  
	  String s1="Hello3";
	  String s2="hi3";
	  String s3="ok3";
	  String s4="bye";
	  String s7="s7";
  }
  