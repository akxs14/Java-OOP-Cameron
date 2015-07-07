package counting;

public class Counter {
	private int count = 0;
	
	public int getNextValue() {
		count += 1;
		return count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
