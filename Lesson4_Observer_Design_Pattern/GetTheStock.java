package Lesson4_Observer_Design_Pattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{
    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    public void run(){

		for(int i = 1; i <= 20; i++){

			try{

				Thread.sleep(startTime * 1000);
			}
			catch(InterruptedException e)
			{}

			// Generates a random number between -.03 and .03

			double randNum = (Math.random() * (.06)) - .03;

			// Formats decimals to 2 places

			DecimalFormat df = new DecimalFormat("#.##");

			// Change the price and then convert it back into a double

	        price = Double.valueOf(df.format((price + randNum)));

			if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMPrice(price);
			if(stock == "Apple") ((StockGrabber) stockGrabber).setApplePrice(price);
			if(stock == "Google") ((StockGrabber) stockGrabber).setGooglePrice(price);

			System.out.println(stock + ": " + df.format((price + randNum)));

		}
	}

}
