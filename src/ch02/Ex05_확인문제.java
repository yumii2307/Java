package ch02;

import java.util.Scanner;

public class Ex05_확인문제 {

	public static void main(String[] args) {
		
		// 3-8.
		double var1 = 3.5;
		double var2 = 2.7;
		int result1 = (int) (var1 + var2);
		System.out.println(result1);
		
		// 3-9.
		long var3 = 2L;
		float var4 = 1.8f;
		double var5 = 2.5;
		String var6 = "3.9";
		int result2 = (int) (var4 + (float) var5 + var3 + (int) Double.parseDouble(var6));
		System.out.println(result2);
		
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
		
		scanner.close();
	}

}
