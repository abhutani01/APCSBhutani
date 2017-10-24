package guess;

import java.util.Scanner;

public class GuessRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1();
		Method2();
	}
public static void Method1() {
		Scanner rdr = new Scanner(System.in);

		System.out.println("Enter a minimum (for range): ");
		int min = rdr.nextInt();

		System.out.println("Enter a maximum (for range): ");
		int max = rdr.nextInt();

		Value minMax = new Value(min, max);
		min = minMax.getMin();
		max = minMax.getMax();

		System.out.println("Guess the computer's integer between " + min + " and " + max);
		Value val = new Value();
		Value guess = new Value(0);
		int count = 0;

		do {
			count++;

			try {
				guess = new Value(rdr.nextInt());
			}

			catch (Exception e) {
				String str = rdr.nextLine();
				System.out.println("Invalid - enter an integer between " + min + " and " + max);
			}

			if ((guess.getVal() < min) || (guess.getVal() > max)) {
				System.out.println("Out of Range - enter an integer between " + min + " and " + max);
			}

			else {
				if (val.compareTo(guess) > 0) {
					System.out.println("Too Low");
				}

				if (val.compareTo(guess) < 0) {
					System.out.println("Too High");
				}
			}
		}


		while (!val.equals(guess));
		System.out.println("Congratulations! You guessed the correct number after " + count + " tries.");
		
	}
	public static void Method2() {
		Scanner rdr = new Scanner(System.in);
		System.out.println("Would you like to play again? Type 1 for yes and 0 for no: ");
		int x = rdr.nextInt();
		if (x == 1) {
			Method1();
		}
		else if (x == 0) {
			System.out.println("Okay, thanks for playing.");
		}
	}
}

