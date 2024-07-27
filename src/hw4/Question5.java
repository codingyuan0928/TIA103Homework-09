package hw4;

import java.util.Scanner;

public class Question5 {
	// 閏年與非閏年每月的天數
	private static final int[] ly_Month_to_Day_Count = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] nly_Month_to_Day_Count = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	// 預設輸入日期為合理的
	private static boolean isValid = true;

	public static void main(String[] args) {
		System.out.println("請輸入西元 年 月 日");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();
		// System.out.println(year + " " + month + " " + date); //用於檢查輸入是否異常
		// 判斷year是否為閏年(輸入年分，帶入預設)=>返回是否為閏年
		boolean leapYear = leapYearDetermination(year);
		// 檢查日期的有效性
		errorHandler(year, month, date, leapYear);
		// 數日子
		if (isValid) {
			dayCounts(leapYear, month, date);
		}

		sc.close();
	}

	public static void dayCounts(boolean ly, int m, int d) {
		int count = 0;
		// 根據閏年與否選擇相應的月份日期數數組
		if (ly) {
			for (int i = 0; i < m - 1; i++) {
				count += ly_Month_to_Day_Count[i];
			}
		} else if (!ly) {
			for (int i = 0; i < m - 1; i++) {
				count += nly_Month_to_Day_Count[i];
			}
		}
		count = count + d;
		System.out.println("輸入的日期為該年的第" + count + "天");
	}

	public static boolean leapYearDetermination(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 閏年
					return true;
				} else {
					// 平年
					return false;
				}
			} else {
				// 閏年
				return true;
			}

		} else {
			// 該年非閏年，一年是365天
			return false;
		}
	}

	public static void errorHandler(int year, int month, int date, boolean leapYear) {

		String errorMessage = "";

		// 檢察年份是否有效
		if (year < 1) {
			isValid = false;
			errorMessage += "年份應為正整数。\n";
		}

		// 檢察月份是否有效
		if (month < 1 || month > 12) {
			isValid = false;
			errorMessage += "月份應在1到12之間。\n";
		}

		// 根據閏年與否選擇日期限制數組
		int[] monthToDayCount = leapYear ? ly_Month_to_Day_Count : nly_Month_to_Day_Count;

		// 檢查日期是否有效
		if (date < 1 || date > monthToDayCount[month - 1]) {
			isValid = false;
			errorMessage += "日期應在1到" + monthToDayCount[month - 1] + "之間。\n";
		}

		if (!isValid) {
			System.out.println("錯誤: " + errorMessage);
		}
	}
}
