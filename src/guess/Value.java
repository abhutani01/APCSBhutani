package guess;

public class Value {
	private int value;
	private int min;
	private int max;

	/**
	 * sets the Value to an integer
	 * 
	 * @param num
	 */
	public Value(int num) {
		value = num;

	}


	/**
	 * gets the max range value
	 * 
	 * @param m
	 */
	public void max(int m) {
		max = m;

	}

	/**
	 * gets the min range value
	 * 
	 * @param n
	 */
	public void min(int n) {
		min = n;

	}

	/**
	 * gets the max range value
	 * @return
	 */
	public int getMax() {
		return max;
	}
	
	/**
	 * gets the min range value
	 * @return
	 */
	public int getMin() {
		return min;
	}
	
	/**
	 * sets the Value to a random number in a given range
	 */
	public Value() {
		value = (int) (Math.random() * getMax()) + getMin();

	}

	/**
	 * gets the value
	 * 
	 * @return
	 */
	public int getValue() {
		return value;
	}
	

	public int compareTo(Value o) {
		if (this.value == o.getValue()) {
			return 0;
		} else if (this.value < o.getValue()) {
			return -1;
		} else {
			return 1;
		}
	}

	public String toString() {
		return ("" + value);
	}
}

