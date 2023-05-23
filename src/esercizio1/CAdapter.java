package esercizio1;

public class CAdapter extends Leaf {
	
	private C c;
	
	public CAdapter() {
		c = new C();
	}
	
	@Override
	public Boolean test() {
		return c.opC();
	}
	
	public void setC(C c) {
		this.c = c;
	}
	
	public void setCState(Boolean s) {
		c.setState(s);
	}
}
