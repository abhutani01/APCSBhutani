package pennyPitch;

import java.util.Scanner;

public class PennyPitchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// toString method not working???!¡
		
		Square[][] board = new Square[][] {
				{ new Square(1), new Square(1), new Square(1), new Square(1), new Square(1) },
				{ new Square(1), new Square(2), new Square(2), new Square(2), new Square(1) },
				{ new Square(1), new Square(2), new Square(3), new Square(2), new Square(1) },
				{ new Square(1), new Square(2), new Square(2), new Square(2), new Square(1) },
				{ new Square(1), new Square(1), new Square(1), new Square(1), new Square(1) }, };
		System.out.println(board);

		Scanner rdr = new Scanner(System.in);
		System.out.println("Welcome to Penny Pitch! Press enter to play.");
		String s = rdr.nextLine();
		int count = 0;
		int total = 0;
		for (int i = 0; i < 10; i++) {
			i++;
			int r = (int) (Math.random() * 4.0 + 0);
			int c = (int) (Math.random() * 4.0 + 0);
			
			if (board[r][c].getOccupied() == false) {
			System.out.println("You threw: (" + c + ", " + r + ")");
			System.out.println("Score: " + board[r][c].getScore());
		    count = board[r][c].getScore();
		    total += count;
			}
			
			else if (board[r][c].getOccupied() != false) {
		     board = new Square[][] {
					{ new Square(1), new Square(1), new Square(1), new Square(1), new Square(1) },
					{ new Square(1), new Square(2), new Square(2), new Square(2), new Square(1) },
					{ new Square(1), new Square(2), new Square(3), new Square(2), new Square(1) },
					{ new Square(1), new Square(2), new Square(2), new Square(2), new Square(1) },
					{ new Square(1), new Square(1), new Square(1), new Square(1), new Square(1) }, };
		    	System.out.println(board);
		 
		      	System.out.println("You threw: (" + c + ", " + r + ")");
				System.out.println("Score (doubled): " + board[r][c].getScore() * 2);
				count = board[r][c].getScore() * 2;
				total += count;
				
		    }
		    
		    
		}
		
		System.out.println("Total Score: " + total);
		if (total > 9) {
			System.out.println("You scored higher than 9: you're a winner!");
		}
		

	}

}
