package hw1;

public class Question6 {
	public static void main(String[] args) {
		//未宣告數字5，則預設型別為int，故兩正整數相加5+5=10。
		System.out.println(5+5);
		//未宣告數字5，則預設型別為int，字元如與數字相加，則會先將字元轉成Unicode編碼，在與數字相加
		//System.out.println(0+'5');求得53，可知'5'Unicode為53。
		System.out.println(5+'5');
		//未宣告數字5，預設型別為int，正整數遇到string，則+不當作數字相加，當作自串串接。
		System.out.println(5+"5");
	
	}
}
