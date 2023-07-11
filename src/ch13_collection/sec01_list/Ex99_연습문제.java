package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex99_연습문제 {

	public static void main(String[] args) {
		// Q1_CommonDivisors
		// 두개의 정수를 입력으로 받아서, 두 수의 공약수를 찾으세요.
		// 단, 두 수의 공약수를 리스트로 반환하는 메소드 getCommonDivisors()를 만들어 해결하세요.

		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수 2개를 입력해 주세요: ");
		String[] nums = scan.nextLine().split(" ");
		int x = Integer.parseInt(nums[0]);
		int y = Integer.parseInt(nums[1]);
		scan.close();

		List<Integer> CommonDivisors = getCommonDivisors(x, y);
		System.out.println(CommonDivisors);

	}

	private static List<Integer> getCommonDivisors(int x, int y) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= Math.min(x, y); i++) {
			if (x % i == 0 && y % i == 0) {
				list.add(i);
			}
		}
		return list;
	}

}
