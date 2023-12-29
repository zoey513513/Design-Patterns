package Lesson2_Design_Pattern;
public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dig a hole.");
    }

    public Dog(){
        super();
        setSound("Bark");
    }
}
