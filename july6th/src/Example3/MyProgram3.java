package Example3;

class A {
	protected int v;

	public A() {
		v = 10;
	}

	public void greeting() {
		System.out.println("Hello from Class A!");
	}

}

class GenClass<T> extends A {
	private T x;

	public GenClass(T y) {
		x = y;
	}

	public static void fun1() {
		System.out.println("I am  GenClass! Is it the case!");
	}

	public void fun2() {
		System.out.println("Calling fun2 from GenClass. My Value is: " + v);
		v = 20;
		System.out.println("GenClass: I have just changed my value to: " + v);
	}
}

public class MyProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenClass<String> gc1 = new GenClass<String>("test1");
		gc1.fun1();
		gc1.greeting();
		gc1.fun2();
		
		System.out.println("========");
		
		GenClass.fun1();
	}

}