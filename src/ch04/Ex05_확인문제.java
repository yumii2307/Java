package ch04;

import java.util.Scanner;

public class Ex05_확인문제 {

	public static void main(String[] args) {
		
		// 1.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// 2.
		while (true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			if (dice1 + dice2 == 5) {
				System.out.printf("%d, %d\n", dice1, dice2);
				break;
			}
		} 
		
		// 3.
		for (int x = 1; x <= 60; x++) {
			for (int y = 1; y <=60; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
		// 4.
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			} System.out.println();
		}
		
		// 5.
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 3 - i; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			} System.out.println();
		}
		
		// 6.
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());
			
			if (menuNum == 1) {
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				continue;
			} else if (menuNum == 2) {
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				continue;
			} else if (menuNum == 3) {
				System.out.println("잔고: " + balance);
				continue;
			} else
				System.out.println("프로그램 종료");
				break;
		}
		scanner.close();
	}

}
