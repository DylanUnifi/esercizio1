package esercizio1;

public class A {
	private boolean state;
	public void setState(boolean s) {
		state = s;
	}
	public void opA() {
		if (state) {
			System.out.println("il test � superato");
		}else
			System.out.println("Il test � fallito ");
	}
}
