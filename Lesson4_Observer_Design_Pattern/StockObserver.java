package Lesson4_Observer_Design_Pattern;

public class StockObserver implements Observer{
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private static int observerIDTracker = 0;

    private int observerID;

    public StockObserver(Subject stockGrabber){
        this.observerID = ++observerIDTracker;
        System.out.println("New obeserver" + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;
        printPrices();
    }

    private void printPrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice +
        "\nApple: " + applePrice + "\nGoogle: " + googlePrice +"\n");
    }

}
