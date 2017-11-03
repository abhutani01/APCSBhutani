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
	 * accepts an integer, x, and uses that value to set its initial maximum
	 * capacity
	 * 
	 * @param x
	 */
	public DoubleList(int x) {
		myList = new double[x];
		mySize = 0;
	}

	/**
	 * accepts a double array and initializes myList to a copy of the passed array
	 * 
	 * @param x
	 */
	public DoubleList(double[] x) {
		DoubleList myList = new DoubleList(x.length + 20);
		for (double arrVal : x)
			myList.add(arrVal);
	}

	/**
	 * removes the last item from the list and returns it
	 * 
	 * @return
	 */
	public double remove() {
		if (maxSize() == 0)
			throw new IndexOutOfBoundsException("No items in list.");
		else
			mySize--;
		return myList[mySize];
	}

	/**
	 * accepts a double value, searches through the DoubleList, and returns the
	 * position of first occurrence of that value in the DoubleList (0 through
	 * mySize - 1)
	 * 
	 * @param x
	 * @return
	 */
	public int indexOf(double x) {
		int index = -1;
		for (int i = 0; i < maxSize(); i++) {
			if (myList[i] == x) {
				index = i;
				return index;
			}
		}
		return index;

	}

	/**
	 * adds up all the values in a list
	 * 
	 * @return
	 */
	public double sum() {
		int x = 0;
		for (int i = 0; i < maxSize(); i++) {
			x += myList[i];
		}
		return x;
	}

	/**
	 * calculates the average value in the list
	 * 
	 * @return
	 */
	public double mean() {
		int x = 0;
		for (int i = 0; i < maxSize(); i++) {
			x += myList[i];
		}
		double y = mySize;
		return x / y;
	}

	/**
	 * returns the largest item in the effective list
	 * 
	 * @return
	 */
	public double maximum() {
		double max = 0;
		for (int i = 1; i < maxSize(); i++) {
			if (myList[i] > max) {
				max = myList[i];
			}
		}
		return max;
	}

	/**
	 * returns the smallest item in the effective list
	 * 
	 * @return
	 */
	public double minimum() {
		double min = 0;
		for (int i = 1; i < maxSize(); i++) {
			if (myList[i] < min) {
				min = myList[i];
			}
		}
		return min;
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
	 * gets the index and returns the value
	 * 
	 * @param x
	 * @return
	 */
	public double get(int x) {
		if (maxSize() < x)
			throw new IndexOutOfBoundsException("Requested index is out of bounds.");
		else
			return myList[x];
	}

	public double set(int x, double y) {
		if (maxSize() < x)
			throw new IndexOutOfBoundsException("Requested index is out of bounds.");
		else
			return myList[x] = y;
	}

	/**
	 * Adds an item to the end of the DoubleList
	 * 
	 * @param item
	 *            the value to be added Precondition: list is not full
	 *            Postcondition: item is added to the end of the list
	 * @throws RuntimeException
	 *             if list is full
	 */
	public void add(double x) {
		if (this.maxSize() < this.mySize) {
			throw new IndexOutOfBoundsException("The DoubleList is full.");
		} else {
			myList[mySize] = x;
			mySize++;
		}
	}

	/**
	 * Adds an item to a specific index of the DoubleList
	 * 
	 * @param item
	 *            the value to be added Precondition: list is not out of bounds
	 *            Postcondition: item is added to the index specified of the list
	 * @throws RuntimeException
	 *             if list is full
	 */
	public void add(int index, double val) {
		if (maxSize() < index)
			throw new IndexOutOfBoundsException("Requested index is out of bounds.");
		else if (this.maxSize() < this.mySize) {
			throw new IndexOutOfBoundsException("The DoubleList is full.");
		} else {
			double[] arr = new double[myList.length + 1];
			for (int i = 0; i < myList.length; i++) {
				if (i < index) {
					arr[i] = myList[i];
				} else if (i == index) {
					arr[i] = val;
				} else {
					arr[i + 1] = myList[i];
				}
			}
			myList = arr;
		}
	}

	public String toString() {
		String x = "";
		for (int i = 0; i < mySize; i++) {
			x += ("[" + i + "]" + " => " + myList[i] + "; ");
		}
		return x;
	}

}