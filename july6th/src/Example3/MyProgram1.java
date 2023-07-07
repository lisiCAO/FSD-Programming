package Example3;
class Gen<T> {
	
	private T x;
	
	public Gen(T y) {
		x = y;
	}

	public T getX() {
		return x;
	}

	public void setX(T y) {
		x = y;
	}
	
	public void info() {
		System.out.println("here is the data object from gen class"  +  x);
	}
	
}


public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This is intro to generic class";
		Integer i1 = 10;
		Double d1 = 12.6;
		
		Gen<String> gc1 = new Gen<String>(s1);
		Gen<Integer> gc2 = new Gen<Integer>(i1);
		Gen<Double> gc3 = new Gen<Double>(d1);
		
		gc1.info();
		gc2.info();
		gc3.info();
		
		gc1.setX("this is new string");
		gc1.info();
	}

}