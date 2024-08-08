package hw8;

import java.util.HashSet;
import java.util.Set;

//請寫一隻程式,能印出不重複的Train物件
public class Question2 {
	public static void main(String[] args) {
		Set<Train> set = new HashSet<>();

		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", (double) 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", (double) 700));
		set.add(new Train(118, "自強", "高雄", "台北", (double) 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", (double) 400));
		set.add(new Train(122, "自強", "台中", "花蓮", (double) 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", (double) 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", (double) 700));

		for (Train t : set) {
			System.out.println(t.hashCode());
			System.out.println(
					t.getNumber() + "-" + t.getType() + "-" + t.getStart() + "-" + t.getDest() + "-" + t.getPrice());
		}
	}
}
