package hw3;

import java.util.Scanner;

public class Question2 {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("開始猜數字吧!");
//
//		int randomValue = (int) (Math.random() * 10) + 1;
//
//		while (true) {
//			int guess = sc.nextInt();
//			if (guess != randomValue) {
//				System.out.println("猜錯囉");
//			} else {
//				System.out.println("答對了!答案就是" + randomValue);
//				break;
//			}
//		}
//
//		sc.close();
//	}
	// 進階版
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int randomValue = (int) (Math.random() * 101) + 1;
		while (true) {
			int guess = sc.nextInt();
			if (guess > randomValue) {
				System.out.println("答錯了，您的回答大於正確答案喔");
			} else if (guess < randomValue) {
				System.out.println("答錯了，您的回答小於正確答案喔");
			} else {
				System.out.println("答對了!答案就是" + randomValue);
				break;
			}
		}
		sc.close();
	}
}
