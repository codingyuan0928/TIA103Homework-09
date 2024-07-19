package hw3;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Question1 q = new Question1();
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入三邊長: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (q.isTriangle(a, b, c)) {
			q.whichTriangle(a, b, c);

		} else {
			System.out.println("這不是三角形");
		}

		sc.close();
	}

	// 判斷輸入邊長是否為三角形
	public boolean isTriangle(int a, int b, int c) {
		return (a + b > c && Math.abs(a - b) < c) && (a + c > b && Math.abs(a - c) < b)
				&& (b + c > a && Math.abs(b - c) < a);
	}

	// 判斷輸入邊長為正三角形、等腰三角形、其他三角形
	public void whichTriangle(int a, int b, int c) {
		if (a == b && b == c) {
			System.out.println("此三角形為正三角形");
		} else if (a == b || b == c || c == a) {
			System.out.println("此三角形為等腰三角形");
		} else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
			System.out.println("此三角形為直角三角形");
		} else {
			System.out.println("此三角形為其他三角形");
		}
	}

}
