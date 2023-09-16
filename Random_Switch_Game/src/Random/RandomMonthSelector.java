package Random;

public class RandomMonthSelector {

	public static void main(String[] args) {

		
		int num = (int) (Math.random() * 12) + 1;
		
		
		/*
		         
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };

        System.out.println(months[num - 1]);
        
		 */
		/**
		 * Switches integer number to string Month name
		 * @param num
		 * @return month 
		 */
		switch (num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("Septemper");
			break;
		case 10:
			System.out.println("Octorber");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		}
		System.exit(0);
	}

}
