package hw4;

public class Question6 {

	public static void main(String[] args) {
		int[][] scoreTable = { 
				{ 1, 2, 3, 4, 5, 6, 7, 8 },
				{ 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 }
		};
		
		for (int a = 0; a < scoreTable[0].length; a++) {
			int highestScore = scoreTable[1][a];
			for (int i = 1; i < scoreTable.length; i++) {
				if (scoreTable[i][a] > highestScore) {
					highestScore = scoreTable[i][a];
				}
			}
			System.out.println((a + 1) + "號同學最高分為: " + highestScore);
		}
	}

}
