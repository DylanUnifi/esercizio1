package esercizio1;

public class C {
	private boolean state;
	public C(boolean state){
		this.state = state;
	}
	public C() {
		
	}
	public void setState(boolean s) {
		state = s;
	}
	
	public boolean getState() {
		return state;
	}
	public Boolean opC() {
		return Boolean.valueOf(state);
	}
}
