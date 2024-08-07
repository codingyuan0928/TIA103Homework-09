package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Question5 {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\data\\Object.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
				while (true) {
					Object obj = ois.readObject();
					if (obj instanceof Dog) {
						((Dog) obj).speak();
					} else if (obj instanceof Cat) {
						((Cat) obj).speak();
					}
				}
			} catch (EOFException e) {
				System.out.println("物件傳輸完畢!!");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
