package pargol;

public class MyProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my test statement");
		String mypara = "this is my test statement to teach";
		System.out.println(mypara.charAt(16));
		System.out.println(mypara.substring((int) 5.17));
		String mystat = "Welcome to [pargol's class] whatever";
		int startChar = mystat.indexOf("[");
		int endChar = mystat.indexOf("]");
		System.out.println(startChar);
		System.out.println(endChar);
		String myNewStat = mystat.substring(startChar + 1, endChar);
		System.out.println(myNewStat);
		String test = "Pargol";
		System.out.println(test.length());
	}

}
