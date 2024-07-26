package hw4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int[][] colleagueTable = { { 25, 32, 8, 19, 17 }, { 2500, 800, 500, 1000, 1200 }};
        System.out.println("請輸入數字");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        System.out.print("一共有id ");
        for (int j = 0; j < 5; j++) {
            if (colleagueTable[1][j] >= input) {
                System.out.print(colleagueTable[0][j] + " ");
                count++;
            }
        }
        System.out.print("共 " + count + " 人!");
        sc.close();
    }
}

