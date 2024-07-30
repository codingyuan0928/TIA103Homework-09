package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle r = new MyRectangle();
		r.setWidth(10);
		r.setDepth(20);
		System.out.println("矩形面積為: " + r.getArea());
		MyRectangle r1 = new MyRectangle(10, 20);
		System.out.println("矩行面積為: " + r1.getArea());

	}

}
