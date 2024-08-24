package hw10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String datePattern = "\\d{8}";
		String input = null;
		String inputOption = null;
		String optionPattern = "^[1-3]$";

		// 確保輸入的日期格式正確
		while (true) {
			System.out.print("請輸入日期(年月日，例如:20110131):");
			input = sc.next();
			if (input.matches(datePattern)) {
				break;
			} else {
				System.out.println("日期格式不正確，請再輸入一次");
			}
		}

		// 確保輸入的選項格式正確
		while (true) {
			System.out.println("欲格式化成(1)年/月/日 (2)月/日/年 (3)日/月/年");
			inputOption = sc.next();
			if (inputOption.matches(optionPattern)) {
				break;
			} else {
				System.out.println("選項格式不正確，請再輸入一次");
			}
		}

		// 將字串轉換為 Date 物件
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyyMMdd").parse(input);
		} catch (ParseException e) {
			System.out.println("日期解析失敗: " + e.getMessage());
			sc.close();
			return;     // 離開main方法
		}

		// 根據選項格式化並輸出日期
		SimpleDateFormat formatter;
		switch (inputOption) {
		case "1":
			formatter = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println("年/月/日: " + formatter.format(date)); // 使用 format 方法
			break;
		case "2":
			formatter = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println("月/日/年: " + formatter.format(date)); // 使用 format 方法
			break;
		case "3":
			formatter = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println("日/月/年: " + formatter.format(date)); // 使用 format 方法
			break;
		}

		sc.close();
	}
}
