package Lesson4_Observer_Design_Pattern;
public class GrabStock {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        // stockGrabber.register(observer1);
        stockGrabber.setIBMPrice(112);
        stockGrabber.setApplePrice(230);
        stockGrabber.setGoogleMPrice(130);
        StockObserver observer2 = new StockObserver(stockGrabber);
        // stockGrabber.register(observer1);
        stockGrabber.setIBMPrice(2);
        stockGrabber.setApplePrice(30);
        stockGrabber.setGoogleMPrice(10);
        stockGrabber.unregister(observer2);
        stockGrabber.setIBMPrice(4);
        stockGrabber.setApplePrice(30);
        stockGrabber.setGoogleMPrice(10);
        stockGrabber.unregister(observer1);
    }

}
