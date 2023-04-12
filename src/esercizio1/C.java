package esercizio1;

public class C {
	private boolean state;
	C(){
		state = true;
	}
	public void setState(boolean s) {
		state = s;
	}
	
	public boolean getState() {
		return state;
	}
	public Boolean opC() {
		System.out.println("Test a C component.");
		if (state) {
			System.out.println("Success!");
		}else
			System.out.println("Failure!");
		return Boolean.valueOf(state);
	}
}
