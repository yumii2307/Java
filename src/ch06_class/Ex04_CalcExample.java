package ch06_class;

public class Ex04_CalcExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		int x = 1, y = 3;
		System.out.println(cal.add(x, y));
		System.out.println(cal.mul(x, y));
		System.out.println(cal.sub(x, y));
		System.out.printf("%.2f\n", cal.div(x, y));
		System.out.printf("%.2f\n", x * y * Math.PI);

	}

}
