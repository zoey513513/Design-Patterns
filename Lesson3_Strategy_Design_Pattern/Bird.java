package Lesson3_Strategy_Design_Pattern;

public class Bird extends Animal{

	// The constructor initializes all objects

	public Bird(){

		super();

		setSound("Tweet");

		flyingType = new YesFly();

	}

}