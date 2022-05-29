package com.Day8_Q4;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animals = {new Dog(), new Cat(), new Tiger()};
		
		for(Animal animal:animals)
		{
			animal.eat();
			animal.walk();
			animal.makeNoise();
			System.out.println("=================");
		}
	}
}
