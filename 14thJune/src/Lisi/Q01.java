package Lisi;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
