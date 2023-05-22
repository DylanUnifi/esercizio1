package esercizio1;

public class B {
	private boolean state;
	public B(boolean state){
		this.state = state;
	}
	public B() {
		
	}
	public void setState(boolean s) {
		state = s;
	}
	
	public boolean getState() {
		return state;
	}
	public Boolean opB() {
		return Boolean.valueOf(state);
	}
}
