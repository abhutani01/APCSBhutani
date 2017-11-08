package pennyPitch;

import java.util.Scanner;

public class PennyPitchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rdr = new Scanner(System.in);
		System.out.println("Welcome to the Penny Pitch game! Press enter to play.");
		String str = rdr.nextLine();
		int row = (int) ((Math.random() * 5) + 1);
		int col = (int) ((Math.random() + 5) + 1);
		int score = 0;

		System.out.println("Throw Location: (" + row + ", " + col + ")");
		System.out.println("Score: " + score);

		Square[][] board = new Square[5][5];
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board.length; c++) {

			}
		}
		System.out.println("Total Score: " + score);
		if (score > 9) {
			System.out.println("Your score was greater than 9: You Win!");
		}
	}
}
