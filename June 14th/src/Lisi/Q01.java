package Lisi;
/*
 * Question 1:
 * Write the program, which is calculate the profit of investment , given an amount of investment, interest rate and number of investment year.
 * principle = 1000; // notice that this is a valid double value interestRate = 0.0625; // that is 6.25%
 * numOfYears = 8;//also calculate for 8 years
 */
public class Q01 {

	public static void main(String[] args) {
		double principle = 1000;
		double interestRate = 0.0625;
		double totalProfit;
		for (int i = 0; i < 8; i++) {
			double profit = principle * interestRate;
			principle = profit + principle;
			totalProfit = principle - 1000;
			if (i == 4) {
				System.out.println("the fifth year, profit = " + totalProfit);
				continue;
			}
			if (i == 7) {
				System.out.println("the eighth year, profit = " + totalProfit);
				break;
			}

		}
	}
}
