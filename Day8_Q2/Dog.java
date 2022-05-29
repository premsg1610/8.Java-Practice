package com.Day8_Q2;

public class Dog extends Animal {

	@Override
	public void eat() {
		
		System.out.println("Dog is eating...");
	}
	
	public void speak() {
		
		System.out.println("Dog is barking...");
	}
	
	public static void main(String[] args) {
		
//		this is parent class reference to the child class object.
		Animal a1 = new Dog();
		
		
//		using a1 , we can call all the methods of Animal class and overridden method of
//		child class Dog.
		
		a1.eat();    //child class overridden method will get priority
		a1.walk();
//		a1.speak();  // TLE: since specific method of child class
		
		
//		but we can't call specific method of child class.
//		to call specific method of child class we have to downcast the object.
//		and then we can call the specific method of child class
		
		
		Dog d1 = (Dog)a1;
		
		d1.speak();
		
		
		
//		this down-casting is possible only when we are giving parent class reference to
//		child class object.
//		But when we give parent class reference to parent class object and when we 
//		downcast it, it will not show any error but at the time of compilation it will
//		give class cast exception.
		
		Animal a2 = new Animal();
		
		Dog d2 = (Dog)a2;
		
		d2.eat();   //it will give class cast exception
		
		
//		i.e. We can downcast the parent class variable to the child class object only if
//		the Parent class variable points to the Child class object , otherwise it will
//      throw a runtime exception called ClassCastException.

	}
}
