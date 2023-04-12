package esercizio1;

public class AAdapter extends A implements Leaf {

	@Override
	public Boolean test() {
		Boolean result = opA();
		return result;
	}

}
