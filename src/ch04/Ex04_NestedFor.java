package ch04;

public class Ex04_NestedFor {

	public static void main(String[] args) {
		// Diamond 1사분면 그리기
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i + 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// Diamond 2사분면 그리기
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 4 - i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// Diamond 3사분면 그리기
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// Diamond 4사분면 그리기
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5 - i; k++) {
				System.out.print('*');
			}
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}
			System.out.println();
		}
		
		// 완성된 Diamond 그리기
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 4 - i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print('*');
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print('*');
			}
			for (int k = 0; k < 5 - i; k++) {
				System.out.print('*');
			}
			for (int k = 0; k < i; k++) {
				System.out.print(' ');
			}
			System.out.println();
		}
		
		// 1 3 5 7 9 Diamond 그리기			유미 잘해떵!
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 4 - i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < i + 1; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 7 - 2 * i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 4 - i; k++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print('*');
			}
			if (i > 4)
				for (int k = 0; k < i - 5; k++) {
					System.out.print(' ');
				}
				for (int k = 0; k < 9 - 2 * i; k++) {
					System.out.print('*');
				}
			System.out.println();
		}
	}

}
