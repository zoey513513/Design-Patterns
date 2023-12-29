package Lesson1_Design_Pattern;

import Lesson1_Design_Pattern.Dog;

public class WorkwithAnimal {
    public static void main(String[] args){
        Dog figo = new Dog();
        figo.setName("Figo");
        figo.digHole();
        System.out.println(figo.getSound());
        figo.setWeight((-1));
        System.out.println("Before change: " + figo.getName());
        changeObjectName(figo);
        System.out.println("After change: " + figo.getName());

        Cat hickory = new Cat();
        hickory.setName("Hickory");
        System.out.println(hickory.getSound());

    }

    public static void changeObjectName(Dog figo){
        figo.setName("Marcus");
    }

}
