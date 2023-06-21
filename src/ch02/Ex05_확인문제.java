package ch02;

import java.util.Scanner;

public class Ex05_확인문제 {

	public static void main(String[] args) {
		// 1.
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("이름: " + name);
		System.out.print("나이: " + age);
		System.out.printf("\n전화: " + tel1 + "-" + tel2 + "-" + tel3 + "\n");
		
		// 2.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("두번째 수: ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과: " + result);
		
		// 3.
		System.out.print("이름: ");
		String inputName = scanner.nextLine();
		
		System.out.print("주민번호 앞 6자리: ");
		String inputNum = scanner.nextLine();
		
		System.out.print("전화번호: ");
		String inputTel = scanner.nextLine();
		
		System.out.printf("%s\n%s\n%s\n", inputName, inputNum, inputTel);
	}

}
