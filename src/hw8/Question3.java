package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出

public class Question3 {
	public static void main(String[] args) {
		List<Train> list = new ArrayList<>();

		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", (double) 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", (double) 700));
		list.add(new Train(118, "自強", "高雄", "台北", (double) 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", (double) 400));
		list.add(new Train(122, "自強", "台中", "花蓮", (double) 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", (double) 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", (double) 700));

		Collections.sort(list);

		for (Train t : list) {
			System.out.println(
					t.getNumber() + "-" + t.getType() + "-" + t.getStart() + "-" + t.getDest() + "-" + t.getPrice());
		}
	}
}
