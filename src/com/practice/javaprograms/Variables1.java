package com.practice.javaprograms;

public class Variables1 {
	
	int value1=20;
	
	int value2=40;
	
	static int value3=60;
	
	
	void m1() {
		System.out.println("method 1");
	}
	
	void m2() {
		System.out.println("method 2");
	}
	
	void m3() {
		System.out.println("method 3");
	}
	
	static void m4() {
		System.out.println("method 4");
	}
	
	public static void main(String[] args) {
		
		Variables1 obj=new Variables1();   //creation  of object==>instance
		
										//new Variables() is a Object
		
										//obj=====Reference 
		
		System.out.println(obj.value1);
		System.out.println(obj.value2);
		System.out.println(obj.value3);
		System.out.println(value3);
		
		obj.m1();
		obj.m2();
		obj.m4();
		m4();
		
		System.out.println(Variables1.value3);
		
		Variables1.m4();
	}

}
