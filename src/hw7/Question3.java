package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入檔案1的路徑");
			String f1 = sc.next();
			System.out.println("請輸入檔案2的路徑");
			String f2 = sc.next();
			Question3 q = new Question3();
			q.copyFile(f1, f2);
			sc.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	// CopyFile will copy the file from filepath1 to filepath2
	public void copyFile(String filepath1, String filepath2) throws IOException {
		File a = new File(filepath1);
		File b = new File(filepath2);

		// Check if the source file exists and is a file
		if (!a.exists() || !a.isFile()) {
			throw new IOException("Source file does not exist or is not a file.");
		}

		// Create the destination file if it doesn't exist
		if (!b.exists()) {
			b.createNewFile();
		}

		// Input file from filepath1
		try (FileInputStream fs = new FileInputStream(filepath1);
				InputStreamReader isr = new InputStreamReader(fs);
				FileOutputStream fos = new FileOutputStream(filepath2);
				OutputStreamWriter osw = new OutputStreamWriter(fos)) {

			int ch;
			// Read from input file and write to output file
			while ((ch = isr.read()) != -1) {
				osw.write(ch);
			}

			System.out.println("Copy completed successfully.");
		}
	}

}
