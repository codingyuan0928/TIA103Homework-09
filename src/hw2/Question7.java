package hw2;

public class Question7 {
//	public static void main(String[] args) {
//		String a = "ABCDEF";
//
//
//		for (int i = 0; i <6 ; i++) {
//			for (int j=0;j<=i;j++) {
//				System.out.print(a.charAt(i));
//			}
//			System.out.println();
//		}
//
//	}

	public static void main(String[] args) {
		String[] A = { "A", "B", "C", "D", "E", "F" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(A[i]);
			}
			System.out.println();
		}
	}
}
