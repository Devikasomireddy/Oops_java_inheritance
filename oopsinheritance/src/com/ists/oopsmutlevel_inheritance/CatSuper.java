package com.ists.oopsmutlevel_inheritance;

public class CatSuper extends AnimalSuper {
	
	
	public CatSuper() 
	{
		super(3,4);
		System.out.println("The child class Constructor");
	}
	
	public void meow()
	{
	
		System.out.println("The cat is Meowing....");
	}

}
