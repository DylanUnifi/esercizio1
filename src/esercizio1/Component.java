package esercizio1;

public interface Component {
	public void test();
	public default void addChild(Component c) {
		System.out.println("Operazione non supportata !!!");
	}
}
