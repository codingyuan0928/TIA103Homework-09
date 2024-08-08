package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add((Integer) 100);
		list.add((Double) 3.14);
		list.add((Long) 21L);
		list.add(Short.valueOf((short) 100));
		list.add((Double) 5.1);
		list.add("Kitty");
		list.add((Integer) 100);
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		Iterator<Object> objs = list.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}
		System.out.println("===================我是分隔線===========================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===================我是分隔線===========================");

		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("===================我是分隔線===========================");
		// 移除不是java.lang.Number相關的物件
		while (objs.hasNext()) {
			Object object1 = objs.next();
			if(!(object1 instanceof Number)) {
				objs.remove();
			}
		}
		//再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		for(Object o1 : list) {
			System.out.println(o1);
		}

	}
}
