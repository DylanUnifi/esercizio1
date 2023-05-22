package esercizio1;

public class A {
	private boolean state;
	public A(boolean state){
		this.state = state;
	}
	
	public A() {
		
	}
	public void setState(boolean s) {
		state = s;
	}
	
	public boolean getState() {
		return state;
	}
	public Boolean opA() {
		return Boolean.valueOf(state);
	}
}
