package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入x的值:");
			int x = sc.nextInt();
			System.out.println("請輸入y的值:");
			int y = sc.nextInt();
			Calculator c = new Calculator();
			c.powerXY(x, y);
			sc.close();
		}catch(CalException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}
		
	}
}
