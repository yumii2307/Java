package ch06_class;

import java.util.Scanner;

public class Ex05_TmoneyExample {

	public static void main(String[] args) {
		
		// 15세 청소년 사례
		Tmoney tm1 = new Tmoney(15, 10000);
		System.out.println(tm1);
		while (true) {
			if (tm1.ride())
				System.out.println(tm1);
			else
				break;
		}
		// 25세 청년 사례
		Tmoney tm2 = new Tmoney(25, 10000);
		System.out.println(tm2);
		while (true) {
			if (tm2.ride())
				System.out.println(tm2);
			else
				break;
		}
		
		tm1.charge(10000);
		System.out.println(tm1);
		
		// 입력 받아서 사용
		Scanner scan = new Scanner(System.in);
		System.out.print("나이> ");
		int age = scan.nextInt();
		System.out.print("금액> ");
		int cash = scan.nextInt();
		scan.close();
		
		Tmoney tm = new Tmoney(age, cash);
		System.out.println(tm);
		
		for (int i = 1; i < Integer.MAX_VALUE; i++) {		// 무한 루프
			if (tm.ride()) {
				System.out.println(i + "회 탑승 후 ");
				System.out.println(tm);
			} else
				break;
		}
	}
}
