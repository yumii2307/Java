package ch11_api.sec05_wrapper;

public class Ex01_BoxingUnboxing {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Boxing
		Integer obj1 = Integer.valueOf(100);
		int obj2 = 200;			// Deprecated
		int obj3 = 300;							// 자동 Boxing

		// UnBoxing
		int val1 = obj1.intValue();
		int val2 = obj2;
		int val3 = obj3;							// 자동 Unboxing

		System.out.printf("%d, %d, %d\n", val1, val2, val3);
		System.out.println(obj1.toString());

		System.out.println(val1 == 100); 			// true
		System.out.println(obj1 == 100);   			// true
		System.out.println(obj1.equals(100));		// true
	}

}
