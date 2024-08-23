package hw9;

class Account {
	int account_balance = 0;
	private String message;
	private boolean stopThreads = false;//旗標變數:避免迴圈無限等待

	public void showMessageIfExists() {
		if (message != null) {
			System.out.println(message);
		}
	}

	public void setMessage(String message) {
		this.message = message;
	}

	synchronized public void deposit(int amount) {
		while (account_balance > 3000 && !stopThreads) {
			System.out.println("媽媽看到了餘額在3000以上，暫停匯款");
			try {
				if ("媽媽被熊大要求匯款!".equals(this.message)) {
					this.setMessage("熊大被老媽告知帳戶已經有錢!");
				}
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (stopThreads)
			return;
		if (account_balance == 0) {
			this.showMessageIfExists();
		}
		account_balance += amount;
		System.out.println("媽媽存了:" + amount + " 帳戶共有:" + account_balance);
		notifyAll();
	}

	synchronized public void withdraw(int amount) {
		while (account_balance < amount && !stopThreads) {
			try {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				if (account_balance == 0) {
					this.setMessage("媽媽被熊大要求匯款!");
				}
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (stopThreads)
			return;
		if ("熊大被老媽告知帳戶已經有錢!".equals(this.message)) {
			this.showMessageIfExists();
			this.message = null;
		}
		account_balance -= amount;
		System.out.println("熊大領了:" + amount + " 帳戶共有:" + account_balance);
		if (account_balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notifyAll();
		}
	}

	public void stopThreads() {
		this.stopThreads = true;
	}
}

class BigBearThread extends Thread {
	Account account;

	// 建構子
	public BigBearThread(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000);
		}
		account.stopThreads();
	}
}

class BigBearMomThread extends Thread {
	Account account;

	// 建構子
	public BigBearMomThread(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(2000);
		}
		account.stopThreads();
	}
}

public class Question2 {
	public static void main(String[] args) {
		Account account = new Account();
		BigBearMomThread bigBearMomThread = new BigBearMomThread(account);
		BigBearThread bigBearThread = new BigBearThread(account);
		bigBearMomThread.start();
		bigBearThread.start();

		try {
			bigBearMomThread.join();
			bigBearThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("所有的交易操作已完成!!");
	}
}