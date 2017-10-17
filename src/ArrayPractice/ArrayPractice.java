package ArrayPractice;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String school[] = new String[3];
		school[0] = "Peak";
		school[1] = "to";
		school[2] = "Peak";

		for (int i = 0; i < 3; i++) {
			System.out.print(school[i] + " ");
		}

		System.out.println();
		// Another way to do this

		String school1[] = { "Peak", "to", "Peak" };
		for (int i = 0; i < school1.length; i++) {
			System.out.print(school1[i] + " ");
		}

		System.out.println();

		String x = concat(school1);
		System.out.println(x);
	}

	public static String concat(String[] arr) {
		String x = null;
		for (int i = 0; i < arr.length; i++) {
			x = (arr[i] + " ");
		}
		return x;
	}
}
