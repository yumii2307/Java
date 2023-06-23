package ch03;

import java.util.Scanner;

public class Ex02_확인문제 {

	public static void main(String[] args) {
		// 1.
		byte b = 5;
		// b = -b;
		int result = 10 / b;
		System.out.println(result);
		
		// '-' 는 int 타입이기 때문에 int 에 저장하여야 함
		
		// 2.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		// 31 : ++x -> 11, y-- -> 20
		
		// 3.
		
		// !stop
		
		// 4.
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
		
		// 나눠준 갯수 : 17, 나눠주고 남은 갯수 : 24
		
		// 5.
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / (double) var2;
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		// 나누기 연산자는 몫만 출력되므로 (double)을 붙여 소숫점 이하 자리를 꺼내와야한다.
		
		// 6.
		int value = 356;
		System.out.println(value - value % 100);
		
		// 7.
		float var5 = 10f;
		float var6 = var5 / 100;
		if(var6 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		System.out.println(var6);
		
		// float 타입 0.1은 정확히 0.1이 아니다.
		
		// 8.
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println(area);
		
		// 9.
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double firstNum = scan.nextDouble();
		System.out.print("두 번째 수: ");
		double secondNum = scan.nextDouble();
		if (secondNum == 0 || secondNum == 0.0) {
			System.out.println("결과: 무한대");
		} else {
			System.out.println("결과: " + firstNum / secondNum);
		}
		
		// 11.
		System.out.print("아이디: ");
		String name = scan.nextLine();
		
		System.out.print("패스워드: ");
		String strPassword = scan.nextLine();
		scan.close();
		int password = Integer.parseInt(strPassword);
		
		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드 오류");
			}
		} else {
			System.out.println("로그인 실패: 아이디 오류");
		}
	}

}
