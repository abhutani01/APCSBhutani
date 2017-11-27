package pennyPitch;

import java.util.Scanner;

public class PennyPitchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square[][] board = new Square[5][5];

		board = new Square[][] { { new Square(1), new Square(1), new Square(1), new Square(1), new Square(1) },
				{ new Square(1), new Square(2), new Square(2), new Square(2), new Square(1) },
				{ new Square(1), new Square(2), new Square(3), new Square(2), new Square(1) },
				{ new Square(1), new Square(2), new Square(2), new Square(2), new Square(1) },
				{ new Square(1), new Square(1), new Square(1), new Square(1), new Square(1) }, };

		int total = 0;
		int turns = 0;
		int count = 0;

		Scanner rdr = new Scanner(System.in);
		System.out.println("Welcome to Penny Pitch! Press enter to play.");

		while (turns < 5) {
			String s = rdr.nextLine();

			int r = (int) (Math.random() * 4.0 + 0);
			int c = (int) (Math.random() * 4.0 + 0);

			if (board[r][c].getOccupied()) {
				count = board[r][c].getScore() * 2;
				total += count;
				System.out.println("You threw: (" + r + ", " + c + ")");
				System.out.println("Score (doubled): " + count);
			} else {
				total += board[r][c].getScore();
				System.out.println("You threw: (" + r + ", " + c + ")");
				System.out.println("Score: " + board[r][c].getScore());
				board[r][c].setOccupied(true);
			}

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}

			turns++;
		}

		System.out.println();
		System.out.println("Total Score: " + total);
		if (total > 9) {
			System.out.println("You scored higher than 9: you're a winner!");

		}
	}

}
