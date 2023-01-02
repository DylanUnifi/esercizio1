package esercizio1;

public class C {
	private boolean state;
	public void setState(boolean s) {
		state = s;
	}
	public void opC() {
		if (state) {
			System.out.println("Success");
		}else
			System.out.println("Failure ");
	}
}
