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
		if (maxSize() > mySize) {
			myList[mySize] = x;
			mySize++;
		} else {
			throw new IndexOutOfBoundsException("The DoubleList is full.");
		}
	}
	
	public String toString() {
		for (int i = 0; i < mySize; i++) {
			return ("[" + i + "]" + " => " + myList);
		}
		return "";
	}
	
	
	
}