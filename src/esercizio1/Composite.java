package esercizio1;

import java.util.ArrayList;

public class Composite implements Component {
	private ArrayList < Component > children;
	public Composite() {
		children = new ArrayList<>();
	}

	@Override
	public void test() {
		for (Component child : children) {
			child.test();
		}
	}
	
	public void addChild(Component c) {
		children.add(c);
	}

}
