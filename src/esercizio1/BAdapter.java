package esercizio1;

public class BAdapter extends B implements Leaf {

	@Override
	public Boolean test() {
		Boolean result = opB();
		return result;
	}

}
