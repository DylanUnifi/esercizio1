package esercizio1;

public interface Component {
	public Boolean test();
	public default void addChild(Component c) throws Exception {
		throw new Exception("Operazione non supportata !!!");
	}
}
