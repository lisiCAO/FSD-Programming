package pargol;

import java.util.Scanner;

public class MyProgram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int montNum;
		String monthName;
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me number of any month");
		montNum = kb.nextInt();

		switch (montNum) {
		case 1:
			monthName = "jan";
			break;
		case 2:
			monthName = "Feb";
			break;
		case 3:
			monthName = "mar";
			break;
		case 4:
			monthName = "apr";
			break;
		case 5:
			monthName = "may";
			break;
		case 6:
			monthName = "jun";
			break;
		case 7:
			monthName = "jul";
			break;
		case 8:
			monthName = "aug";
			break;
		case 9:
			monthName = "sep";
			break;
		case 10:
			monthName = "oct";
			break;
		case 11:
			monthName = "nov";
			break;
		case 12:
			monthName = "dec";
			break;
		default:
			monthName = "there is no such a thing";
			break;

		}
		System.out.println("you enterd " + monthName);

	}

}
