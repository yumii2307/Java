package ch05;

import java.util.Scanner;

public class Ex01_Reference {

	public static void main(String[] args) {
		int a = 10, b = 10;
		System.out.println(a == b);
		String ref1 = "자바";
		String ref2 = "자바";
		System.out.println(ref1 == ref2);		// true, 참조하는 기억장소가 같은지를 물어보는 것

		String ref3 = new String("자바");
		System.out.println(ref1 == ref3);		// false, 다른 주소
		System.out.println(ref1.equals(ref3));	// true, 같은 글자 (문자열 비교)

		// 참조 타입 변수는 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있음
		String s = null;
		String[] strArr = null;
		Scanner scan = null;
		System.out.println(s == null);

		String t = "";		// length 가 zero 인 String
		System.out.println(t.length());			// 0
		// System.out.println(s.length());		// NullPointerException
	}

}
