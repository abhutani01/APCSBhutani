public class Fraction {
	private int num;
	private int den;

	public Fraction(int n, int d) {
		num = n;
		den = d;

	}
	 public int getNumerator() {
		 return num;
	 }
	 public int getDenominator() {
		 return den;
	 }
	public void setNumerator(int n) {
		num = n;
	}
	public void setDenominator(int d) {
		den = d;
	}
	public String toString() {
		return (num + "/" + den);

	}
	public Fraction add(Fraction other) {
		int x = (num*other.den) + (other.num*den);
		int y = (den * other.den);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;
	
	}
	
	public Fraction subtract(Fraction other) {
		int x = (num*other.den) - (other.num*den);
		int y = (den * other.den);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;
	
	}
	
	public Fraction multiply(Fraction other) {
		int x = (num*other.num);
		int y = (den * other.den);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;
	
	}
	
	public Fraction divide(Fraction other) {
		int x = (num*other.den);
		int y = (den * other.num);
		Fraction newFraction = new Fraction(x, y);
		return newFraction;
	
	}
}
