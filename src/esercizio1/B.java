package esercizio1;

public class B {
	private boolean state;
	public void setState(boolean s) {
		state = s;
	}
	public void opB() {
		if (state) {
			System.out.println("Success");
		}else
			System.out.println("Failure");
	}
}
