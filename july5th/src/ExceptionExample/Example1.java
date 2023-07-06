package ExceptionExample;


public class Example1 {
	
	public static double div1(double x , double y) {
		double result =  x / y;
		System.out.println("this is div1");
		System.out.println("the result is " + result);
		return result;
	}
	
	public static double div2(double x, double y) {
		System.out.println("this is div2");
		double result;
		if(y != 0) {
			result  = x / y;
			System.out.println("the result is " + result);
			return result;
		}else {
			System.out.println("Will I cant divided");
			return -0;
		}	
	}
	public static double div3(double x, double y) {
		double result;
		System.out.println("this is div3");
		result = x / y;
		System.out.println("");
		return result;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		div1(4, 0);
		
		

	}

}
