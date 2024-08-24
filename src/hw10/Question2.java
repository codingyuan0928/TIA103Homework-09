package hw10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a = 0;
		String b = null;
		boolean inputSuccess = false;
		String bPattern = "^[1-3]$";
		while (!inputSuccess) {
			System.out.print("請輸入數字:");
			try {
				a = sc.nextDouble();
				inputSuccess = true;
			} catch (InputMismatchException e) {
				System.out.println("輸入無效，請輸入數字。");
				sc.nextLine();
			}

		}
		System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號:");
		try {
			while (true) {
				b = sc.next();
				if (b.matches(bPattern)) {
					break;
				} else {
					System.out.println("輸入無效，請輸入數字1,2,3。");
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("輸入無效，請輸入數字1,2,3。");
			sc.nextLine();
		}
		if (b.equals("1")) {
			Format dfm1 = new DecimalFormat("#,###.00");
			System.out.println("千分位數字:" + dfm1.format(a));
		} else if (b.equals("2")) {
			DecimalFormat percentFormat = new DecimalFormat("#.##%");
			System.out.println("百分比格式: " + percentFormat.format(a));
		} else if (b.equals("3")) {
			DecimalFormat scientificFormat = new DecimalFormat("0.###E0");
			String scientificNotation = scientificFormat.format(a);
			System.out.println("科學記號數字: " + scientificNotation);
		}
		sc.close();
	}
}
