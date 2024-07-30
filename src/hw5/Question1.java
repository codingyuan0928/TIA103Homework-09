package hw5;

import java.util.Scanner;

public class Question1 {

	public void starSquare(int width, int height)  {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

			System.out.println("請輸入矩形的 寬 x 高 :");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			Question1 a = new Question1();
			a.starSquare(num1, num2);
			sc.close();

	}

}
