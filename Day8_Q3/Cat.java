package com.Day8_Q3;

import com.Day8_Q4.Animal;

public class Cat extends Dynamic_Polymorphism_Animal {

	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public static void main(String[] args) {
		
		Dynamic_Polymorphism_Animal a1 = new Dynamic_Polymorphism_Animal();
		
		a1.eat();
		
		
//		animal class reference to child Dog class object.
		Dynamic_Polymorphism_Animal a2 = new Dog();
		
		a2.eat();
		
//		animal class reference to child Cat class object.
		Dynamic_Polymorphism_Animal a3 = new Cat();
		
		a3.eat();
		
		
		
	}
}
