package ch05;

import java.util.Arrays;

public class Ex02_Array {

	public static void main(String[] args) {
		int[] score = {80, 70, 78, 92, 96};
		System.out.printf("%d, %d\n", score[0], score[4]);
		// 성적 평균
		int sum = 0;
		for (int element : score)
			sum += element;
		System.out.printf("합계: %d, 평균: %.2f\n", sum, (double)sum / score.length);

		// 배열 생성
		// 생성하면서 값을 지정하는 경우
		int[] intArray = {4, 67, 8, 91, 23};
		double[] doubleArray = {3., 4.6, 2.4};
		String[] fruits = {"사과", "배", "딸기", "수박"};
		// 크기를 주고 배열을 생성만 하는 경우
		int[] newArray = new int[10];		// 초기값 0
		int dice[] = new int[5];
		for (int i = 0; i < dice.length; i ++) {
			dice[i] = 1 + (int) (Math.random() * 6);
		}
		System.out.println(dice); 			// == dice.toString
		System.out.println(Arrays.toString(dice));
		System.out.println(Arrays.toString(fruits));

		System.out.println(args.length);	// 0
		for (String arg : args)
			System.out.println(arg);
		String[] myArgs = "10 20 30".split(" ");
		System.out.println(Arrays.toString(myArgs));
 	}

}
