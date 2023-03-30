 package studio7;

public class Die {
	private int n;
	public Die(int numberSides) {
		n = numberSides;
	}
	public int roll() {
		n = (int) Math.random() * n;
		return n;
		
	}
}


