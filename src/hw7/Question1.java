package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入文件路徑: ");
		String pathname = sc.next();
		File file = new File(pathname,"Sample.txt");

		if (!file.exists()) {
			System.out.println("檔案不存在!!!");
            sc.close();
            return; 
		}
		try {
			FileInputStream is = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(is);
			InputStreamReader isr = new InputStreamReader(bis);
			BufferedReader br = new BufferedReader(isr);

			// 位元
			System.out.println("檔案的位元數:" + file.length());

			// 字元
			int charCount = 0;
			char[] cbuf = new char[1024];
			int charsRead;
			while ((charsRead = br.read(cbuf)) != -1) {
				charCount += charsRead;
			}
			System.out.println("檔案字元數:" + charCount);
			br.close();
			
			// 列
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			int lineCount = 0;
			while (br.readLine() != null) {
				lineCount++;
			}
			System.out.println("檔案列數:" + lineCount);

			br.close();
			isr.close();
			bis.close();
			is.close();

		} catch (IOException e) {
			e.printStackTrace();

		}finally {
			sc.close();
		}

	}

}
