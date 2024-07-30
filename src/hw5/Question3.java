package hw5;

public class Question3 {
	public class Work03 {
		public int maxElement(int[][] intArr) {
			int biggestNumber = 0;
			for (int i = 0; i < intArr.length; i++) {
				for (int j = 0; j < intArr[i].length; j++) {
					if (intArr[i][j] > biggestNumber) {
						biggestNumber = intArr[i][j];
					}

				}
			}
			return biggestNumber;
		}

		public double maxElement(double[][] doubleArr) {
			double biggestNumber = 0;
			for (int i = 0; i < doubleArr.length; i++) {
				for (int j = 0; j < doubleArr[i].length; j++) {
					if (doubleArr[i][j] > biggestNumber) {
						biggestNumber = doubleArr[i][j];
					}

				}
			}
			return biggestNumber;
		}
	}

	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Question3 q = new Question3();
		Work03 w = q.new Work03();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

}
