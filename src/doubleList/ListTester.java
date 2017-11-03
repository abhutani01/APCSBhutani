package doubleList;

public class ListTester {
	
	//Null pointer exception for third constructor.
	//Second add method problem at one index.
	//Need more extensive Java Docs
	//Add exceptions to a lot of part 4
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing Constructor");
		DoubleList aList = new DoubleList();
		System.out.println("size: " + aList.size());
		System.out.println("max size: " + aList.maxSize());
		System.out.println();

		System.out.println("Testing add and toString");
		System.out.println("List is: " + aList);
		aList.add(12.0);
		aList.add(-1.0E305);
		System.out.println("List is: " + aList);
		for (int i = 0; i < 18; i++)
			aList.add((double) i);
		try {
			aList.add(100.0); // generates an Exception
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.println("List is: " + aList);
		System.out.println();

		System.out.println("Testing Second Constructor");
		DoubleList List = new DoubleList(25);
		System.out.println("size: " + List.size());
		System.out.println("max size: " + List.maxSize());
		System.out.println();

		System.out.println("Testing Third Constructor");
		DoubleList List1 = new DoubleList(new double[3]);
		System.out.println("List is: " + List1);
		System.out.println();

		System.out.println("Testing Remove Method");
		System.out.println("Removed Value: " + aList.remove());
		System.out.println();

		System.out.println("Testing indexOf Method");
		System.out.println("Index Value of 0.0: " + aList.indexOf(0.0));
		System.out.println("Index Value of 15.0: " + aList.indexOf(15.0));
		System.out.println("Index Value of 30.0: " + aList.indexOf(30.0));
		System.out.println();

		System.out.println("Testing Sum Method");
		System.out.println("Sum of array: " + aList.sum());
		System.out.println();

		System.out.println("Testing Mean Method");
		System.out.println("Mean of array: " + aList.mean());
		System.out.println();

		System.out.println("Testing Maximum Method");
		System.out.println("Maximum of array: " + aList.maximum());
		System.out.println();

		System.out.println("Testing Minimum Method");
		System.out.println("Minimum of array: " + aList.minimum());
		System.out.println();

		System.out.println("Testing Get Method");
		try {
			aList.get(45);
		} catch (Exception e) {
			System.out.println("Value at index 45: " + e);
		}
		System.out.println("Value at index 5: " + aList.get(5));
		System.out.println();

		System.out.println("Testing Set Method");
		try {
			aList.set(45, 5.0);
		} catch (Exception e) {
			System.out.println("Set value at index 45: " + e);
		}
		System.out.println("Set value at index 5: " + aList.set(5, 8.0));
		System.out.println();

		System.out.println("Testing Second Add Method");
		System.out.println("List is: " + aList);
		aList.add(4, 12.0);
		System.out.println("List is: " + aList);
		System.out.println();
		
		
	}

}
