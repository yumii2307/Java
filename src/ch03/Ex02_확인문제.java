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
		
		int pencilsPerStudent = (int) pencils / students;
		
	}

}
