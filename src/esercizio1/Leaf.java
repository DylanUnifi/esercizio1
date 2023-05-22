package esercizio1;

public abstract class Leaf extends Component {
	@Override
	public int getLevel() {
		return this.level;
	}
	
	@Override
	public void setLevel(int level) {
		this.level = level;
	}
}
