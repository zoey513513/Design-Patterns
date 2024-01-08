package Lesson3_Strategy_Design_Pattern;
public interface Fly {
    String fly();
}

class YesFly implements Fly{
    public String fly() {
        return "Flying High";
    }
}

class NoFly implements Fly{
    public String fly() {
        return "No Fly";
    }
}