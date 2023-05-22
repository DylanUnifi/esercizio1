package esercizio1;

public class BAdapter extends Leaf {
	private B b;
	
	public BAdapter() {
		b = new B();
	}
	
	@Override
	public Boolean test() {
		return b.opB();
	}
	
	public void setB(B b) {
		this.b = b;
	}
	
	public void setBState(Boolean s) {
		b.setState(s);
	}
}
