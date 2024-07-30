package hw5_bonus;

public class InkBrush extends Pen {

	public InkBrush() {
	}

	public InkBrush(String brand, int price) {
		super(brand, (int) (price * 0.9));
	}

	public void write() {
		System.out.println("沾墨汁再寫");
	}

	public void setPrice(int price) {
		super.setPrice((int) (price * 0.9));
	}
}
