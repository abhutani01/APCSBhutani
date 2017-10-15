import java.util.Scanner;

public class FractionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1();
		Method2();
	}

	public static void Method1() {
		Fraction f1 = new Fraction(1, 2); // represents one-half
		System.out.print("One Half = ");
		System.out.println(f1); // should output 1 / 2
		f1.setNumerator(3); // change numerator to 3
		f1.setDenominator(4); // change denominator to 4
		int num = f1.getNumerator(); // get the numerator
		int den = f1.getDenominator(); // get the denominator
		System.out.print("Three Quarters = ");
		System.out.println(num + "/" + den); // should output 3 / 4
		Fraction f2 = new Fraction(2, 3);
		System.out.print("Two Thirds = ");
		System.out.println(f2);
		Fraction sum = f1.add(f2);
		System.out.println(f1 + "+" + f2 + "=" + sum);
		f2 = new Fraction(1, 2);
		sum = f1.add(f2);
		Fraction difference = f1.subtract(f2);
		Fraction product = f1.multiply(f2);
		Fraction quotient = f1.divide(f2);

		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("sum: " + sum);
		System.out.println("difference: " + difference);
		System.out.println("product: " + product);
		System.out.println("quotient: " + quotient);

		f1 = new Fraction(1, 2);
		f2 = new Fraction(1, 2);
		System.out.println(f1 + "==" + f2 + " = " + f1.equals(f2));
		System.out.println(f2 + "==" + f1 + " = " + f2.equals(f1));

		f2 = new Fraction(1, 3);
		System.out.println(f1 + "==" + f2 + " = " + f1.equals(f2));
		System.out.println(f2 + "==" + f1 + " = " + f2.equals(f1));

		f2 = new Fraction(2, 4);
		System.out.println(f1 + "==" + f2 + " = " + f1.equals(f2));
		System.out.println(f2 + "==" + f1 + " = " + f2.equals(f1));

	}

	public static void Method2() {
		System.out.println();
		System.out.println("Enter numerator for fraction 1");
		Scanner reader = new Scanner(System.in);
		int val1 = reader.nextInt();
		System.out.println("Enter denominator for fraction 1");
		Scanner reader1 = new Scanner(System.in);
		int val2 = reader1.nextInt();
		Fraction f4 = new Fraction(val1, val2);
		f4.setNumerator(val1);
		f4.setDenominator(val2);

		System.out.println("Enter an operation (add, sub, mult, div)");
		Scanner reader6 = new Scanner(System.in);
		String c = reader6.next();
		System.out.println("Enter numerator for fraction 2");
		Scanner reader4 = new Scanner(System.in);
		int val4 = reader4.nextInt();
		System.out.println("Enter denominator for fraction 2");
		Scanner reader5 = new Scanner(System.in);
		int val5 = reader5.nextInt();
		Fraction f5 = new Fraction(val4, val5);
		f5.setNumerator(val4);
		f5.setDenominator(val5);

		if (c.equals("add")) {
			Fraction sum = f4.add(f5);
			System.out.println("sum: " + sum);
			System.exit(0);
		}
		if (c.equals("sub")) {
			Fraction difference = f4.subtract(f5);
			System.out.println("difference: " + difference);
			System.exit(0);
		}
		if (c.equals("mult")) {
			Fraction product = f4.multiply(f5);
			System.out.println("product: " + product);
			System.exit(0);
		}
		if (c.equals("div")) {
			Fraction quotient = f4.divide(f5);
			System.out.println("quotient: " + quotient);
			System.exit(0);
		}
		while (c.equals("add") == false || c.equals("sub") == false || c.equals("mult") == false
				|| c.equals("div") == false) {
			Method2();
			System.exit(0);
		}
	}

}
