package esercizio1;

public class B {
	private boolean state;
	B(){
		state = true;
	}
	public void setState(boolean s) {
		state = s;
	}
	
	public boolean getState() {
		return state;
	}
	public Boolean opB() {
		System.out.println("Test a B component.");
		if (state) {
			System.out.println("Success!");
		}else
			System.out.println("Failure!");
		return Boolean.valueOf(state);
	}
}
