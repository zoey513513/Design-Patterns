package Lesson4_Observer_Design_Pattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int objectIndext = observers.indexOf(deleteObserver);
        System.out.println("Observer: observer" + (objectIndext + 1) + " deleted.");
        observers.remove(objectIndext);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }

    public void setApplePrice(double newApplePrice){
        this.applePrice = newApplePrice;
        notifyObserver();
    }

    public void setGooglePrice(double newGooglePrice){
        this.googlePrice = newGooglePrice;
        notifyObserver();
    }
}
