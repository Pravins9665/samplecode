package practice;

public class array {
	public static int a[] = new int[5];

	public static void main(String[] args) {
		a[0] = 12;
		a[1] = 13;
		a[2] = 14;
		a[3] = 15;
		a[4] = 16;

		System.out.println("normal for loop");
		System.out.println("-----------------------");
		for (int i = 0; i <= 4; i++) {

			System.out.println("value of i is " + a[i]);

		}
		System.out.println("by using for each loop");
		System.out.println("-----------------------");
		for (int i : a) {
			System.out.println("value of a is " + i);
		}

	}

}
