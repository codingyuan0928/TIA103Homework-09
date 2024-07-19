package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("=========================我是分隔線==================================");
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {

				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
		System.out.println("=========================我是分隔線==================================");
		int a = 1;
		while (a <= 9) {
			int b = 1;
			do {
				System.out.print(a + "*" + b + "=" + a * b + "\t");
				b++;
			} while (b <= 9);
			a++;
			System.out.println();
		}
	}
}
