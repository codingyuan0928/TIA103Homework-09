package hw4;

public class Question6 {

	public static void main(String[] args) {
		int[][] scoreTable = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, { 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, { 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		// 找出每次小考的最高分
		int[] highestScore = new int[scoreTable.length - 1];
		int[] countHighestScore = new int[(scoreTable[0].length)];
		for (int i = 1; i < scoreTable.length; i++) {
			for (int j = 0; j < scoreTable[i].length; j++) {
				if (highestScore[i - 1] < scoreTable[i][j]) {
					highestScore[i - 1] = scoreTable[i][j];
				}
			}
			System.out.println(i + "小考最高分為:" + highestScore[i - 1]);

		}
		// 將考取最高分的次數存進陣列
		for (int i = 1; i < scoreTable.length; i++) {
			for (int j = 0; j < scoreTable[i].length; j++) {
				if (scoreTable[i][j] == highestScore[i - 1]) {
					countHighestScore[j]++;
				}
			}
		}
		// 印出每次同學考出最高分的次數
		for (int i = 0; i < countHighestScore.length; i++) {
			System.out.println("第" + i + "位同學考最高分的次數為: " + countHighestScore[i] + "次");
		}

	}

}
