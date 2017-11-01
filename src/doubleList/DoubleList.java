package doubleList;

public class DoubleList {
	double[] myList;
	int mySize;

	/**
	 * initializes myList and mySize
	 */
	public DoubleList() {
		myList = new double[20];
		mySize = 0;
	}
	
	/**
	 * accepts an integer, x,  and uses that value 
	 * to set its initial maximum capacity
	 * @param x
	 */
	public DoubleList(int x) {
		myList = new double[x];
		mySize = 0;
	}
	
	public DoubleList(double[] x) {
		x = new double [3];
		myList = x;
		mySize = 0;
	}
	
	public int remove() {
		if (myList.length == 0)
			throw new IndexOutOfBoundsException("No items in list.");
		else
		myList[mySize]= mySize;
		return mySize--;	
	}
	
	public int indexOf(double x) {
		for(int i = 0; i < mySize; i++) {
			if (myList[i] == x)
				return i;
			}
				return -1;
		
	}
	
	public int sum() {
		int x = 0;
		for (int i = 0; i < mySize; i++)
			myList[i] += x;
		
		return x;
	}

	public int mean() {
		int x = 0;
		for (int i = 0; i < mySize; i++) {
			myList[i] += x;
		}
		if (myList.length == 0)
			throw new IndexOutOfBoundsException("No items in list.");
		else
			return x/myList.length;
	}

	/**
	 * returns value of mySize
	 * 
	 * @return
	 */
	public int size() {
		return mySize;
	}

	/**
	 * returns the size of MyList
	 * 
	 * @return
	 */
	public int maxSize() {
		return myList.length;
	}

	
	/**
	 * Adds an item to the end of the DoubleList
	 * @param item the value to be added
	 * Precondition: list is not full
	 * Postcondition: item is added to the end of the list
	 * @throws RuntimeException if list is full
	*/
	public void add(double x) {
		if (this.maxSize() < this.mySize) {
			throw new IndexOutOfBoundsException("The DoubleList is full.");
		} 
		else {
			myList[mySize] = x;
			mySize++;
		}
	}
	
	public String toString() {
		String x = "";
		for (int i = 0; i < mySize; i++) {
			x = ("[" + i + "]" + " => " + myList[i] + "; ");
		}
		return x;
	}
	
	
}