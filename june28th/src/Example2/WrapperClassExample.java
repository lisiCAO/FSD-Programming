package Example2;

public class WrapperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(num2.compareTo(num1));
		
		char mychar = 'c';
		//Character char1 = new Character(mychar);
		Character.toLowerCase(mychar);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Double.compare(12.4, 8.3));
		System.out.println(Float.max(4f,6f));
	}

}
