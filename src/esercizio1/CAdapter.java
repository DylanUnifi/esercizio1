package esercizio1;

public class CAdapter extends C implements Leaf {

	@Override
	public Boolean test() {
		Boolean result = opC();
		return result;
	}

}
