package fractionProject;

public class Fraction {
	private int num;
	private int den;

	public Fraction(int n, int d) {
		num = n;
		den = d;

	}

	/**
	 * Gets the numerator
	 * 
	 * @return numerator
	 */
	public int getNumerator() {
		return num;
	}

	/**
	 * Gets the denominator
	 * 
	 * @return denominator
	 */
	public int getDenominator() {
		return den;
	}

	/**
	 * Sets the numerator
	 * 
	 * @param n
	 *            numerator
	 */
	public void setNumerator(int n) {
		num = n;
	}

	/**
	 * Sets the denominator
	 * 
	 * @param d
	 *            denominator
	 */
	public void setDenominator(int d) {
		den = d;
	}

	public String toString() {
		if (den == 0) {
			return ("infinity");
		} else {
			return (num + "/" + den);
		}
	}

	/**
	 * Adds two fractions
	 * 
	 * @param other
	 * @return The added fraction
	 */
	public Fraction add(Fraction other) {
		int x = (num * other.den) + (other.num * den);
		int y = (den * other.den);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;

	}

	/**
	 * Subtracts two fractions
	 * 
	 * @param other
	 * @return The subtracted fraction
	 */
	public Fraction subtract(Fraction other) {
		int x = (num * other.den) - (other.num * den);
		int y = (den * other.den);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;

	}

	/**
	 * Multiplies two fractions
	 * 
	 * @param other
	 * @return The multiplied fraction
	 */
	public Fraction multiply(Fraction other) {
		int x = (num * other.num);
		int y = (den * other.den);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;

	}

	/**
	 * Divides two fractions
	 * 
	 * @param other
	 * @return The divided fraction
	 */
	public Fraction divide(Fraction other) {
		int x = (num * other.den);
		int y = (den * other.num);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;

	}

	public boolean equals(Fraction o) {
		if (num * o.den == den * o.num) {
			return true;
		} else
			return false;
	}
}
