package esercizio1;

public class C {
	private boolean state;
	public void setState(boolean s) {
		state = s;
	}
	public void opC() {
		if (state) {
			System.out.println("il test � superato");
		}else
			System.out.println("Il test � fallito ");
	}
}
