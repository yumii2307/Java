package ch11_api.sec04_string;

public class Ex99_연습문제 {

	public static void main(String[] args) {

		// Q1_NumberCount
		String numStr = "";

		for (int i = 1; i <= 1000; i++) {
			numStr += i;
		}

		for (int i = 0; i <= 9; i++) {
			int count = Strings.count(numStr, "" + i);
			System.out.println(i + " : " + count);
		}

		// Q2_Palindrome
		System.out.println(Strings.isPalindrome("우영우"));

		int maxPal = 0, x = 0, y = 0;
		for (int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				int mul = i * k;
				if (Strings.isPalindrome(String.valueOf(mul))) {
					if (mul > maxPal) {
						maxPal = mul;
						x = i;
						y = k;
					}
				}
			}
		}
		System.out.printf("%d x %d = %d\n", x, y, maxPal);
	}
}






