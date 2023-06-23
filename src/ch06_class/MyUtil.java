package ch06_class;

public class MyUtil {
	public MyUtil() { }		// Java가 알아서 만들어 줌, 생략 가능
	
	public int getMinimum(int[] array) {
		int min = Integer.MAX_VALUE;
		for (int element: array) {
			if (min > element)
				min = element;
		}
		return min;
	}
	
	public int getMaximum(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int element: array) {
			if (max < element)
				max = element;
		}
		return max;
	}
	
	public static double getAverage(int[] array) {		// static : 객체를 부르지 않고 사용
		int sum = 0;
		for (int element: array)
			sum += element;
		return (double) sum / array.length;
	}
	
	// private void privateMethod() {
	//		
	// }
}
