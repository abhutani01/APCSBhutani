package guess;

public class Value {
	private static int min;
	private static int max;
	private int value;

	public Value(int n, int m) {
		min = n;
		max = m;
	}

	/**
	 * gets the max range value
	 * 
	 * @param m
	 */
	public static int getMax() {
		return max;

	}

	/**
	 * gets the min range value
	 * 
	 * @param n
	 */
	public static int getMin() {
		return min;

	}

	/**
	 * sets Value to random int between a given min and max
	 * 
	 * @param
	 **/
	public Value() {
		max = Value.getMax();
		min = Value.getMin();
		value = (int) (Math.random() * max) + min;
	}

	/**
	 * sets Value to an integer object
	 * 
	 * @param int
	 **/
	public Value(int num) {
		value = num;
	}

	/**
	 * Returns value of Value
	 * 
	 * @param
	 * @return int
	 **/
	public int getVal() {
		return value;
	}

	/**
	 * Checks if values are equal
	 * 
	 * @param value
	 * @return boolean
	 **/
	public boolean equals(Value o) {
		if (value == o.value) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
 	* Checks if other value and value are equal, if other value is less than, or if other value is greater than
 	* @param o
 	* @return
 	*/
	public int compareTo(Value o) {
		if (value == o.value) {
			return 0;
		} else if (value < o.value) {
			return -1;
		} else {
			return 1;
		}
	}

	/**
	 * returns value as a string
	 */
	public String toString() {
		return ("" + value);
	}
}
