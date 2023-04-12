package esercizio1;

public class A {
	private boolean state;
	A(){
		state = true;
	}
	public void setState(boolean s) {
		state = s;
	}
	
	public boolean getState() {
		return state;
	}
	public Boolean opA() {
		System.out.println("Test a A component.");
		if (state) {
			System.out.println("Success!");
		}else
			System.out.println("Failure!");
		return Boolean.valueOf(state);
	}
}
