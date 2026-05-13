package com.ists.oopsmutlevel_inheritance;


// Using super() - it is used to call parent class constructor implicitly by JVM , 
// Explicit by using super() keyword
public class AnimalSuper {
	 public AnimalSuper()
	 {
		 System.out.println("The parent class default Constructor");
	 }
	 public AnimalSuper(int a, int b)
	 {
		 System.out.println("In parent class parameterized constructor ..The sum of numbers is :"+ (a+b));
	 }
	 
	 
	 public void eat()
	 {
		 System.out.println("The animal is eating...");
	 }

}
