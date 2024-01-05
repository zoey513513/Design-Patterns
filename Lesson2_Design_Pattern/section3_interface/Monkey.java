package Lesson2_Design_Pattern.section3_interface;

public class Monkey implements Living{
    private String name;

    @Override
    public void setName(String newName) {
        name = newName;
       }

    @Override
    public String getName() {
       return name;
       }

    @Override
    public void setWeight(double newWeight) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setWeight'");
    }

    @Override
    public double getWeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWeight'");
    }

    @Override
    public void setHeight(double newHeight) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHeight'");
    }

    @Override
    public double getHeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHeight'");
    }

    @Override
    public void setFavFood(String newFood) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFavFood'");
    }

    @Override
    public String getFavFood() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFavFood'");
    }

    @Override
    public void setSpeed(double newSpeed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSpeed'");
    }

    @Override
    public double getSpeed() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSpeed'");
    }

    @Override
    public void setSound(String newSound) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setSound'");
    }

    @Override
    public String getSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSound'");
    }


}
