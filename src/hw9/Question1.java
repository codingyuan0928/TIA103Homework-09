package hw9;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("-----大胃王快食比賽開始!-----");
		
		Thread1 t1 =new Thread1("饅頭人");
		Thread tm =new Thread(t1);
		Thread1 t2 =new Thread1("詹姆士");
		Thread tj =new Thread(t2);
		tm.start();
		tj.start();
		try {
			tm.join();
			tj.join();
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束!-----");

	}

	static class Thread1 implements Runnable {
		int count = 1;
		String name;
		public Thread1(String name) {
			super();
			this.name=name;
		}
		public void run() {
			while (count < 11) {
				System.out.println(name+"吃第"+count+"碗飯");
				count++;
				try {
					Thread.sleep((int) (Math.random() * (3000 - 500 + 1) + 500));
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(name+"吃完了!");
		}
	}

}
