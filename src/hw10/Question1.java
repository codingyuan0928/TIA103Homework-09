package hw10;

public class Question1 {
	public boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public void getAnswer(int forloopTimes) {
		for (int i = 0; i < forloopTimes; i++) {
			int randomNum = (int) (Math.random() * (100 - 1) + 1);
			if(this.isPrime(randomNum)) {
				System.out.println(randomNum+"是質數");
			}else {
				System.out.println(randomNum+"不是質數");
			}
			
			
		}
	}

	public static void main(String[] args) {
		Question1 q = new Question1();
		q.getAnswer(5);
	}
}
