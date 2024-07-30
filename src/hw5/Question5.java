package hw5;

public class Question5 {
	private void getAuthCode() {
		final String randomChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < 8; i++) {
			int index = (int) (Math.random() * 62) + 1;
			System.out.print(randomChar.charAt(index));
		}

	}

	public static void main(String[] args) {
		Question5 q = new Question5();
		q.getAuthCode();
	}
}
