package ch05;

public class Ex08_연습문제 {

	public static void main(String[] args) {
		
		// 3.
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		// 4.
		int max = 0;
		int[] array2 = {1, 5, 3, 8, 2};
		for (int element: array2) {
			if (element > max) {
				max = element;
			}
		}
		System.out.println("max: " + max);
		
		// 5.
		int[][] array3 = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// 작성 위치
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
