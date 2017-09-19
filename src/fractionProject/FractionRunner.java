package fractionProject;

public class FractionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction (1, 2);         // represents one-half
		System.out.print ("One Half = ");
		System.out.println (f1);                   // should output   1 / 2
		f1.setNumerator (3);                       // change numerator to 3
		f1.setDenominator (4);                     // change denominator to 4
		int num = f1.getNumerator ();              // get the numerator
		int den = f1.getDenominator ();            // get the denominator
		System.out.print ("Three Quarters = ");
		System.out.println (num + "/" + den);      // should output 3 / 4

	}

}


