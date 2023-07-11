package ch05;

import java.util.Arrays;

public class Ex04_ArrayCopy {

	public static void main(String[] args) {
		int src[] = {1, 3, 4, 8};
		int[] dst = src;
		System.out.println(Arrays.toString(dst));	// [1, 3, 4, 8]

		dst[3] = 99;
		System.out.println(Arrays.toString(src));	// [1, 3, 4, 99]

		int[] realDst = new int[4];
		for (int i = 0; i < src.length; i++)
			realDst[i] = src[i];
		System.out.println(Arrays.toString(realDst));

		realDst[0] = 11;
		System.out.println(Arrays.toString(src));

		int[] newSrc = {3, 4, 7, 9};
		int[] newDst = new int[4];

		// Method 사용
		System.arraycopy(newSrc, 0, newDst, 0, newSrc.length);

		System.out.println(Arrays.toString(newDst));
		newDst[newDst.length - 1] = 88;
		System.out.println(Arrays.toString(newSrc));

		// 2차원 배열 복사
		int[][] newA = {{3, 4, 7, 9}, {1, 2, 3, 4}};
		int[][] newB = new int[4][4];

		System.arraycopy(newA, 0, newB, 0, newA.length);
		System.out.println(Arrays.toString(newB[0]));
		System.out.println(Arrays.toString(newB[1]));

	}

}
