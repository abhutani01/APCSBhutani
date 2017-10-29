package gradesArray;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rdr = new Scanner(System.in);

		double[] grades = new double[3];

		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter a test score from 0 to 100: ");

			try {
				grades[i] = rdr.nextDouble();
			}

			catch (Exception e) {
				System.out.println("Invalid - Enter a test score from 0 to 100: ");
				rdr.next();
				grades[i] = rdr.nextDouble();
			}

			while (grades[i] <= 0 || grades[i] >= 100) {
				System.out.println("Out of Range - Enter a test score from 0 to 100: ");
				grades[i] = rdr.nextDouble();
			}

		}
		
		System.out.println("The scores you input are: " + grades[0] + ", " + grades[1] + ", " + grades[2]);
		System.out.println("The maximum score is: " + max(grades));
		System.out.println("The minimum score is: " + min(grades));
		System.out.println("The mean score is: " + mean(grades));
		System.out.println("The median score is: " + median(grades));
		System.out.println("The mode score is: " + mode(grades));

	}

	public static double min(double[] a) {
		if (a[0] < a[1] && a[0] < a[2] || (a[0] == a[1] && a[1] < a[2]))
			return a[0];
		else if (a[1] < a[2] && a[1] < a[0])
			return a[1];
		else
			return a[2];

	}

	public static double max(double[] a) {
		if (a[0] > a[1] && a[0] > a[2])
			return a[0];
		else if (a[1] > a[2] && a[1] > a[0])
			return a[1];
		else
			return a[2];

	}

	public static double mean(double[] a) {
		double x = (a[0] + a[1] + a[2]) / 3;
		return x;

	}

	public static double median(double[] a) {
		if (a[0] != min(a) && a[0] != max(a))
			return a[0];
		else if (a[1] != min(a) && a[1] != max(a))
			return a[1];
		else
			return a[2];

	}

	public static double mode(double[] a) {
		double count = 0;
		double count2 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int x = i; x < a.length; x++) {
				if (i != x && a[i] == a[x]) {
					count++;
					if (count >= count2) {
						count = a[i];
					}
				}
				count2 = 0;
			}
		}
		return count;
	}

}
