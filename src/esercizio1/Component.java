package esercizio1;

import java.util.ArrayList;

public abstract class Component {
	protected int level = 0;
	protected static ArrayList<Integer> failLevel = new ArrayList<>();
	public void addChild(Component c) throws Exception {
		throw new Exception("Operazione non supportata !!!");
	}
	public ArrayList<Integer> getFailLevel(){
		return failLevel;
	}
	public abstract Boolean test();
	public abstract int getLevel();
	public abstract void setLevel(int level);
}
