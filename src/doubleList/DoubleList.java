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
		DoubleList myList1 = new DoubleList(x.length + 20);
		myList = new double[x.length + 20];
		for (double arrVal : x)
			myList1.add(arrVal);
	}

	/**
	 * removes the last item from the list and returns it
	 * 
	 * @param item
	 *            the index to be set Precondition: list size is greater than 0
	 *            Postcondition: last value is removed from list
	 * @throws RuntimeException
	 *             if index is 0
	 */
	public double remove() {
		if (maxSize() == 0)
			throw new IndexOutOfBoundsException("No items in list.");
		else
			mySize--;
		return myList[mySize];
	}

	/**
	 * Subtracts an item of a specific index of the DoubleList
	 * 
	 * @param item
	 *            the value to be subtracted Precondition: index is not out of
	 *            bounds Postcondition: item is subtracted from the index specified
	 *            of the list
	 */
	public void remove(int index) {
		if (maxSize() < index)
			throw new IndexOutOfBoundsException("Requested index is out of bounds.");

		else {
			double[] arr = new double[myList.length - 1];
			for (int i = 0; i < myList.length; i++) {
				if (i < index) {
					arr[i] = myList[i];
				} else if (i == index) {
					arr[i] = arr[i - index];
				} else {
					arr[i - 1] = myList[i];
				}
			}
			myList = arr;
		}

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
	 * @param item
	 *            the index to be set Precondition: list size is greater than 0
	 *            Postcondition: average is calculated
	 * @throws RuntimeException
	 *             if index is 0
	 */
	public double mean() {
		if (maxSize() == 0)
			throw new IndexOutOfBoundsException("No items in list.");
		else {
			int x = 0;
			for (int i = 0; i < maxSize(); i++) {
				x += myList[i];
			}
			double y = mySize;
			return x / y;
		}
	}

	/**
	 * returns the largest item in the effective list
	 * 
	 * @param item
	 *            the index to be set Precondition: list size is greater than 0
	 *            Postcondition: maximum is calculated
	 * @throws RuntimeException
	 *             if index is 0
	 */
	public double maximum() {
		if (maxSize() == 0)
			throw new IndexOutOfBoundsException("No items in list.");
		else {
			double max = 0;
			for (int i = 0; i < maxSize(); i++) {
				if (myList[i] > max) {
					max = myList[i];
				}
			}
			return max;
		}
	}

	/**
	 * returns the smallest item in the effective list
	 * 
	 * @param item
	 *            the index to be set Precondition: list size is greater than 0
	 *            Postcondition: minimum is calculated
	 * @throws RuntimeException
	 *             if index is 0
	 */
	public double minimum() {
		if (maxSize() == 0)
			throw new IndexOutOfBoundsException("No items in list.");
		else {
			double min = myList[0];
			for (int i = 1; i < mySize; i++) {
				if (myList[i] < min) {
					min = myList[i];
				}
			}
			return min;
		}
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
	 * gets the given index
	 * 
	 * @param item
	 *            the index to be set Precondition: index is in range Postcondition:
	 *            index is retrieved
	 * @throws RuntimeException
	 *             if index is out of bounds
	 */
	public double get(int x) {
		if (maxSize() < x)
			throw new IndexOutOfBoundsException("Requested index is out of bounds.");
		else
			return myList[x];
	}

	/**
	 * sets the given index to the given value
	 * 
	 * @param item
	 *            the index to be set Precondition: index is in range Postcondition:
	 *            value is changed at index
	 * @throws RuntimeException
	 *             if index is out of bounds
	 */
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
					arr[index + 1] = myList[index];
				}
			}
			myList = arr;
		}
	}

	/**
	 * clears myList
	 */
	public void clear() {
		mySize = 0;
	}

	/**
	 * returns true only if the passed DoubleList contains identical item to "this"
	 * DoubleList
	 * 
	 * @param o
	 * @return
	 */
	public boolean equals(DoubleList o) {
		if (myList.length == o.myList.length) {
			for (int i = 0; i < myList.length; i++) {
				if (myList[i] != o.myList[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isEmpty() {
		if (mySize == 0)
			return true;
		else
			return false;
	}

	public String toString() {
		String x = "";
		for (int i = 0; i < mySize; i++) {
			x += ("[" + i + "]" + " => " + myList[i] + "; ");
		}
		return x;
	}

	// extensions

	/**
	 * accepts a double and returns true or false depending on whether or not that
	 * double is in the DoubleList
	 * 
	 * @param x
	 * @return
	 */
	public boolean contains(double x) {
		for (int i = 0; i < maxSize(); i++) {
			if (x == myList[i])
				return true;
		}
		return false;
	}

	public DoubleList clone1(DoubleList original) {
		DoubleList copy = new DoubleList(original.myList.length);
		for (int i = 0; i < original.myList.length; i++) {
			copy.myList[i] = original.myList[i];
		}
		return original;
	}

	/**
	 * returns a new DoubleList object that contains copies of the values contained
	 * in "this" list
	 * 
	 */
	public DoubleList clone() {
		DoubleList copy = new DoubleList(mySize);
		for (int i = 0; i < mySize; i++) {
			copy.add(i);
			copy.set(i, myList[i]);
		}
		return copy;
	}

}