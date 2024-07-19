package hw1;

public class Question3 {

	public static void main(String[] args) {
		int day = 24*60*60;
		int hour = 60*60;
		int minute = 60;
		System.out.println(256559/day+"天"+(256559%day/hour)+"小時"+(256559%day%hour/minute)+"分"+(256559%day%hour%minute)+"秒");
	}
}
