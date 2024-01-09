package Lesson4_Observer_Design_Pattern;
public class GrabStock {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        // stockGrabber.register(observer1);
        stockGrabber.setIBMPrice(112);
        stockGrabber.setApplePrice(230);
        stockGrabber.setGooglePrice(130);
        StockObserver observer2 = new StockObserver(stockGrabber);
        // stockGrabber.register(observer1);
        stockGrabber.setIBMPrice(2);
        stockGrabber.setApplePrice(30);
        stockGrabber.setGooglePrice(10);
        stockGrabber.unregister(observer2);
        stockGrabber.setIBMPrice(4);
        stockGrabber.setApplePrice(30);
        stockGrabber.setGooglePrice(10);
        observer1.update(0, 0, 0);


        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 120);
        Runnable getApple = new GetTheStock(stockGrabber, 2, "Apple", 198);
        Runnable getGoogle = new GetTheStock(stockGrabber, 2, "Google", 140);
        new Thread(getIBM).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();

    }

}
