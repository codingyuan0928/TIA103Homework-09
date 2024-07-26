package hw4;

public class Question2 {
	public static void main(String[] args) {
		String s = "Hello World";
		String[] s1 = s.split("");
		String[] reversed = new String[s1.length];
		for (int i = 0; i < s1.length; i++) {
			reversed[i] = s1[s1.length - 1 - i];
		}
		for (String c : reversed) {
			System.out.print(c);
		}
	}
}
