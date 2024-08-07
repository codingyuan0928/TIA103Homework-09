package hw7;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入檔案路徑:");
			String pathname=sc.next();
			String fullPath = pathname + "\\Data.txt";
			FileOutputStream fs = new FileOutputStream(fullPath, true);
			BufferedOutputStream bs = new BufferedOutputStream(fs);
			for (int i = 0; i < 10; i++) {
				String randomNumber = String.valueOf((int) (Math.random() * 1000) + 1) + "\n";
				bs.write(randomNumber.getBytes());
				System.out.println();
			}
			bs.close();
			fs.close();
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
