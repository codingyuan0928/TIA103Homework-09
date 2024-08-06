package hw5;

public class Question2 {
	public static void main(String[] args) {
		int[] x = new int[10];

		for (int i = 0; i < 10; i++) {
			x[i] = (int) (Math.random() * 101);
		}
		Question2 q = new Question2();
		q.randAvg(x);
	}

	public void randAvg(int[] a) {
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + a[i];
		}
		System.out.println("平均值為: " + sum / 10);
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
