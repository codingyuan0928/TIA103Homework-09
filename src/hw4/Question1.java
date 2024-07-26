package hw4;

import java.util.ArrayList;

public class Question1 {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int i;
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (i = 0; i < a.length; i++) {
			sum += a[i];
			avg = sum / a.length;
		}
		printAvg(avg);
		ArrayList<Integer> greaterThanAvg = new ArrayList<>();
		for (i = 0; i < a.length; i++) {
			if (a[i] > avg) {
				greaterThanAvg.add(a[i]);
			}
		}
		printArrayList(greaterThanAvg);
	}

	// 印出平均數的功能
	public static void printAvg(int n) {
		System.out.println("平均是: " + n);
	}

	// 印出ArrayList內容的功能
	public static void printArrayList(ArrayList<Integer> list) {
		System.out.print("大於平均數的數字有: ");
		for(int num : list) {
			System.out.print(num+" ");

		}

	}

}
