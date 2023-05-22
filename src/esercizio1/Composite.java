package esercizio1;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList < Component > children;
	public Composite() {
		children = new ArrayList<>();
	}

	@Override
	public Boolean test(){
		Boolean result = true;
		boolean childResult;
		for (Component child : children) {
			childResult = child.test();
			if (!childResult) {
				failLevel.add(child.getLevel());
				result &= childResult;
			}
		}
		return result;
	}
	
	@Override
	public void addChild(Component c) {
		c.setLevel(this.level + 1);
		children.add(c);
	}
	
	public int getChildNumber() throws Exception {
		return children.size();
	}
	
	@Override
	public int getLevel() {
		return this.level;
	}
	
	@Override
	public void setLevel(int level) {
		this.level = level;
		for (Component child : children) {
			child.setLevel(level + 1);
		}
	}
}
