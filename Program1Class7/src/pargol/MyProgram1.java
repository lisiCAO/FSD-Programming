package pargol;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 0;
		boolean result = is_leapYear(year);
		if(result) {
			System.out.println("yes this is leapyear");
		}
	}
public static boolean is_leapYear(int y) {
	boolean a = (y % 4) == 0;
	boolean b =(y % 100) == 0;
	boolean c = (y % 100 == 0 && (y % 400 == 0));
	return a && (b|| c);
}
}
