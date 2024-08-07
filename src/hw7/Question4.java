package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Question4 {

	public static void main(String[] args)  {

		
		try {		
			File file = new File("C:\\data\\Object.ser");
			File parentDir = file.getParentFile();
			if (!parentDir.exists()) {
				parentDir.mkdirs();
				System.out.println("已為您建立目錄及檔案!!");
			}
			Dog doggo = new Dog("獨孤");
			Dog doggy = new Dog("求敗");
			Cat catto = new Cat("蘋果");
			Cat kitty = new Cat("西打");
			Object[] Animal = new Object[4];
			Animal[0]=doggo;
			Animal[1]=doggy;
			Animal[2]=catto;
			Animal[3]=kitty;
			//輸出
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(int i=0;i<Animal.length;i++) {
				oos.writeObject(Animal[i]);
			}
			
			oos.close();
			fos.close();
			System.out.println("檔案輸出完成!!");
			}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
