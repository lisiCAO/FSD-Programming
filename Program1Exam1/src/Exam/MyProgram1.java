package Exam;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int PRICEAPP = 3, PRICESONG = 7;
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to our store! \n How much money do you wish to prepay?");
		int amount = kb.nextInt(); // the amount that customer enter.

		int maxApp = amount / PRICEAPP; // the maximum applications that customer could purchases if application only.
		int maxSong = amount / PRICESONG;// the maximum song that customer could purchases if songs only.

		int rest1 = amount % PRICEAPP; // the amount left after purchasing maximum applications
		int temp = amount % PRICESONG; // the amount left after purchasing maximum songs
		int numApp = temp / PRICEAPP;// the number of applications that customer could purchase with changes.
		int rest2 = temp % PRICEAPP;// the amount left when customer purchase applications and songs as much as
									// possible.
		System.out.printf(
				"With this amount, you will be able to purchase %d apps.\n You will then hava %d$ left as a credit on your account.\n",
				maxApp, rest1);
		System.out.printf(
				"Alternatively, for this amount, you will be able to purchase %d songs and %d app(s).\n You will then have %d$ left as a credit on your account.\n",
				maxSong, numApp, rest2);
		System.out.println("Thanks for Shopping at Best Music Store!");
		kb.close();
		System.exit(0);

	}

}
