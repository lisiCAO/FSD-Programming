package Example2;

public class OverloadingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void add(double n1, double n2) {
		double sum = n1 + n2;
		System.out.println(sum);
	}
	public static double add(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}

}
