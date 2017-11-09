package pennyPitch;

public class Square {
	private int score;
	private boolean occupied;

	public Square(int x) {
		score = x;
		occupied = false;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int x) {
		score = x;
	}

	public boolean getOccupied() {
		return occupied;
	}

	public void setOccupied(boolean x) {
		occupied = x;
	}

	public String toString() {
		if (occupied != false)
			return " P ";
		else
			return " " + score + " ";

	}
}
