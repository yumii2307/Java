package ch02;

public class Ex02_Primitive {

	public static void main(String[] args) {
		// Literal
		int intLiteral = 30;
		int bitLiteral = 0b1001;		// 9	- 2진수
		int octal = 0377;				// 255  - 8진수
		int hexa = 0xff;				// 255  - 16진수
		long longVal = 256L;			// long literal
		System.out.printf("%d, %d, %d, %d, %d\n", intLiteral, bitLiteral, octal, hexa, longVal);

		char ga = '가';					// 더블코트("")와 싱글코트('')는 다르다
		System.out.println(ga);
		char capitalA = 0x41;			// A
		System.out.printf("%c, %c\n", ga, capitalA);

		// 기본(primitive) 타입은 아니지만 기본처럼 사용되는 String
		String hello = "Hello World!";
		System.out.printf("%s\n", hello);

		// 실수: float, double
		double pi = 3.14;
		double mega = 1e6;
		float exp = 2.728f;				// float literal
		System.out.printf("%.2f, %.1f, %.3f\n", pi, mega, exp);	// .n - 소숫점 n자리까지 출력

		// boolean
		boolean start = true, stop = false;
		System.out.printf("%s, %s\n", start, stop);				// 정수타입으로는 찍히지 않음
	}

}
