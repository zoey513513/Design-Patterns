package Lesson2_Design_Pattern.section1_polymorphism;

public class WorkwithAnimal {
    static int justAnum = 10;
    public static void main(String[] args){
        Animal figo = new Dog();
        System.out.println(figo.getSound());
        Animal hickory = new Cat();
        System.out.println(hickory.getSound());

        ((Dog)figo).digHole(); // Cast to Dog class

        // to demostrate that you can not non-static method or variable in static method
        System.out.println(justAnum);
        speakAnimal(figo);
        speakAnimal(hickory);

        // can not access private method but can access public method
        // ((Dog)figo).accessPrivate(); // not working
        ((Dog)figo).accessPublic();

    }

    // static method
    public static void speakAnimal(Animal randomAnimal){
        System.out.println("This animal says: " + randomAnimal.getSound());
    }

}
