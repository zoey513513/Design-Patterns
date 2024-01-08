package Lesson3_Strategy_Design_Pattern;

public class WorkwithAnimal {
    public static void main(String[] args){
        Dog doggy = new Dog();
        Bird birddy = new Bird();
        System.out.println("Dog: " + doggy.tryToFly());
        System.out.println("Bird: " + birddy.tryToFly());

        doggy.setFlyingAbility(new YesFly());
        System.out.println("After change, Dog: " + doggy.tryToFly());

    }

}
