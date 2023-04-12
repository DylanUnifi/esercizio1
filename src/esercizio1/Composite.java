package esercizio1;

import java.util.ArrayList;

public class Composite implements Component {
	private ArrayList < Component > children;
	public Composite() {
		children = new ArrayList<>();
	}

	@Override
	public Boolean test() {
		Boolean result = true;
		for (Component child : children) {
			result &= child.test();
		}
		return result;
	}
	
	public void addChild(Component c) {
		children.add(c);
	}

}
