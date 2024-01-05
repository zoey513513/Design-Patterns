package Lesson2_Design_Pattern.section2_abstract_class;
abstract public class Creature {
    protected String name;
    protected double weight;
    protected String sound;

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();

}
