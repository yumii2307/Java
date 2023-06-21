package ch03;

public class Ex01_Operand {

	public static void main(String[] args) {
		int i = 20;
		System.out.printf("%d, %d\n", i++, ++i);		// i++ : i 먼저, ++i : ++ 먼저(+1) -> 20, 22
		
		int x = -100;
		System.out.println(x);
		
		int sum = 0;
		for (int k = 1; k <= 100; k++) {
			sum += k;
		}
		System.out.println(sum);
		
		System.out.printf("%s, %s\n", 3+3.0+"JDK", "JDK"+3+3.0);	// 6.0JDK, JDK33.0
		
		char capitalA = 'A', capitalB = 'B';
		if (capitalA < capitalB) {									// 문자도 순서 존재
			System.out.println("capitalA 가 capitalB 보다 작다.");
		}
		
		boolean m = false, n = true;
		System.out.println(m || n); 			// false or true --> true
		System.out.println(m && n); 			// false and true --> false
		System.out.println(!(m && n)); 			// not (false and true) --> true
		
		int score = 80 + (int) (20 * Math.random());
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.printf("%d, %c\n", score, grade);
	}

}
