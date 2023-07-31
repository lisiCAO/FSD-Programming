package Example;

public class Bus extends Vehicle implements Drivable{
	private int pasncapa;
	
	public Bus(String br, int nd ,int pc) {
		super(br,nd);
		pasncapa = pc;
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate from Bus class");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Brake from Bus class");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start from Bus class");
	}

	public void testBus() {
		System.out.println("testing from Bus class");
	}
}