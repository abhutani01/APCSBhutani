package gradesArray;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rdr = new Scanner(System.in);

		double[] grades = new double[3];
		int count = 0;

		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter three test scores from 0 to 100: ");
			grades[i] = rdr.nextInt();
			System.out.println(Arrays.toString(grades));
		}
		
		System.out.println("The maximum score is: " + max(grades));
		System.out.println("The minimum score is: " + min(grades));
		System.out.println("The mean score is: " + mean(grades));
		System.out.println("The median score is: " + median(grades));
		

	}

	public static double min(double[] a) {
		if (a[0] < a[1] && a[0] < a[2])
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
		double x = min(a);
		double y = max(a);
		if (a[0] != min(a) && a[0] != max(a))
			return a[0];
		else if (a[1] != min(a) && a[1] != max(a))
			return a[1];
		else 
			return a[2];

	}

}
