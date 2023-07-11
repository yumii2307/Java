package ch11_api.sec08_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01_PrimitiveSort {

	public static void main(String[] args) {
		int[] scores = {87, 73, 65, 98, 79};
		Arrays.sort(scores); 			// 오름차순 정렬, 자기 파괴적(scores의 내용이 바뀜)
		System.out.println(Arrays.toString(scores));
		Arrays.stream(scores).forEach(x -> System.out.println(x));

		String[] fruits = {"참외", "수박", "토마토"};
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));

		Arrays.sort(fruits, Comparator.reverseOrder());
		System.out.println(Arrays.toString(fruits));

		// int와 같은 primitive type은 내림차순시 Boxing을 해야 함
		Integer[] descScore = Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(descScore, Comparator.reverseOrder());
		System.out.println(Arrays.toString(descScore));
	}

}
