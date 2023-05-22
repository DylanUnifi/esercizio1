package esercizio1;

public class AAdapter extends Leaf {
	
	private A a;
	
	public AAdapter() {
		a = new A();
	}
	
	@Override
	public Boolean test() {
		return a.opA();
	}
	
	public void setA(A a) {
		this.a = a;
	}
	
	public void setAState(Boolean s) {
		a.setState(s);
	}
}
