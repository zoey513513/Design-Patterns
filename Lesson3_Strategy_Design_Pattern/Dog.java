package Lesson3_Strategy_Design_Pattern;
public class Dog extends Animal{

	public void digHole(){

		System.out.println("Dug a hole");

	}

	public Dog(){

		super();

		setSound("Bark");

		flyingType = new NoFly();

	}


}