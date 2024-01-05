package Lesson2_Design_Pattern.section1;
public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dig a hole.");
    }

    public Dog(){
        super();
        setSound("Bark");
    }

    private void accessPrivate(){
        System.out.println("In a private method.");
    }

    public void accessPublic(){
        accessPrivate();
    }
}
