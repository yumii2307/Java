package ch06_class;

public class Calculator {

	public int add(int x, int y) {
		int result = x + y;
		return result;
		// return x + y;
	}

	public int mul(int x, int y) {
		int result = x * y;
		return result;
	}

	public int sub(int x, int y) {
		int result = x - y;
		return result;
	}

	public double div(int x, int y) {
		double result = (double) x / y;
		return result;
	}
}
