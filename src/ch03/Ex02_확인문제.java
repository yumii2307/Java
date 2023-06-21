package ch03;

public class Ex02_확인문제 {

	public static void main(String[] args) {
		// 1.
//		byte b = 5;
//		b = -b;
//		int result = 10 / b;
//		System.out.println(result);
		
		// '-' 는 int 타입이기 때문에 int 에 저장하여야 함
		
		// 2.
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(z);
		
		// 31 : ++x -> 11, y-- -> 20
		
		// 3.
		
		// !stop
		
		// 4.
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = pencils / students;
//		System.out.println(pencilsPerStudent);
//		
//		int pencilsLeft = pencils % students;
//		System.out.println(pencilsLeft);
		
		// 나눠준 갯수 : 17, 나눠주고 남은 갯수 : 24
		
		// 5.
//		int var1 = 5;
//		int var2 = 2;
//		double var3 = var1 / (double) var2;
//		int var4 = (int)(var3 * var2);
//		System.out.println(var4);
		
		// 나누기 연산자는 몫만 출력되므로 (double)을 붙여 소숫점 이하 자리를 꺼내와야한다.
		
		// 6.
//		int value = 356;
//		System.out.println(value - value % 100);
		
		// value - value % 100
		
		// 7.
		float var1 = 10f;
		float var2 = var1 / 100;
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		System.out.println(var2);
		
		// float 타입 0.1은 정확히 0.1이 아니다.
	}

}
