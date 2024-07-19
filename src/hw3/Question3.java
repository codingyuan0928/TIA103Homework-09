package hw3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question3 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("阿文...請輸入你討厭哪個數字?");
//		int skipNumber = sc.nextInt();
//		
//		Question5 a = new Question5();
//		a.getAllLotteryNumber(skipNumber);
//		sc.close();
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int skipNumber = sc.nextInt();
		List<Integer> numbers = new ArrayList<>();
		// step1:雙層迴圈將數值存進陣列
		for (int i = 0; i <= 40; i += 10) {
			if (i == skipNumber * 10) {
				continue;
			}
			for (int j = 0; j <= 9; j++) {
				if (j == skipNumber || (i + j) == 0) {
					continue;
				}
				System.out.print(i + j + "\t");
				numbers.add(i + j);
			}
			System.out.println();
		}
		// step2:返回陣列長度
		int[] arrayOfAllNumbers = arrayReturn(numbers);
		System.out.println("總共有" + arrayOfAllNumbers.length + "數字可選");
		// step3:用將陣列長度之索引值依照亂數取出6個值並返回
		Set<Integer> pickedIndices = new HashSet<>();
        List<Integer> pickedNumbers = new ArrayList<>();

        while (pickedIndices.size() < 6) {
            int randomIndex = (int) (Math.random() * arrayOfAllNumbers.length);
            if (!pickedIndices.contains(randomIndex)) {
                pickedIndices.add(randomIndex);
                pickedNumbers.add(arrayOfAllNumbers[randomIndex]);
            }
        }

        System.out.print("6個數字分別是: ");
        for (int number : pickedNumbers) {
            System.out.print(number + " ");
        }
		sc.close();
	}

	public static int[] arrayReturn(List<Integer> numbers) {
		int[] array = new int[numbers.size()];
		for (int i = 0; i < numbers.size(); i++) {
			array[i] = numbers.get(i);
		}
		return array;
	}
}
