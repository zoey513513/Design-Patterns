package Lesson5_Factory_Design_Pattern;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args){


		EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;


		System.out.print("What type of ship? (U / R / B)");
        Scanner userInput = new Scanner(System.in);


		if (userInput.hasNextLine()){

			String typeOfShip = userInput.nextLine();

			theEnemy = shipFactory.makeEnemyShip(typeOfShip);

			if(theEnemy != null){

				doStuffEnemy(theEnemy);

			} else
            {
                System.out.print("Please enter U, R, or B next time");
            }


		}
		userInput.close();
    }


	public static void doStuffEnemy(EnemyShip anEnemyShip){

		anEnemyShip.displayEnemyShip();

		anEnemyShip.followHeroShip();

		anEnemyShip.enemyShipShoots();

	}

}