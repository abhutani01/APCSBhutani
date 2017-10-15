//Note: This code does not work yet - I don't know why because it looks right - but I am working on it.

package guess;

import java.util.Scanner;

public class GuessRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		Scanner rdr = new Scanner(System.in);

		System.out.println("Enter a minimum (for range): ");
		int min = rdr.nextInt();
		Value m2 = new Value(min);
		m2.min(min);

		System.out.println("Enter a maximum (for range): ");
		int max = rdr.nextInt();
		Value m1 = new Value(max);
		m1.max(max);

		Value v1 = new Value();
		System.out.println("v1 is: " + v1);

		System.out.println("Guess the computer's integer between " + min + " and " + max + ": ");
		int i = rdr.nextInt();

		Value v2 = new Value(i);
		System.out.println("v2 is: " + v2);

		if (v2.compareTo(v1) == 0) {
			count++;
			System.out.println("Congratulations - you guessed the correct number after " + count + " tries");
			System.exit(0);
		}

		while (true) {
			count++;
			
			try {
				i = rdr.nextInt();
			}

			catch (Exception e) {
				String wrong = rdr.nextLine();
				System.out.println(wrong + "" + e);
			}

			if (v2.compareTo(v1) <= 0) {
				System.out.println("Too Low");
				i = rdr.nextInt();
			}

			else if (v2.compareTo(v1) >= 0) {
				System.out.println("Too High");
				i = rdr.nextInt();
			}

			else if (i > m1.getMax() || i < m1.getMin()) {
				System.out.println("Invalid Answer.");
				i = rdr.nextInt();
			}

			else {
				System.out.println("Invalid Answer.");
				i = rdr.nextInt();
			}

		}

	}

}
