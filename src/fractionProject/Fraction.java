package fractionProject;

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
	public int add(Fraction other) {
		int x = (num*other.den) + (other.num*den);
		int y = (den * other.den);
		return x;
	
	}
}
