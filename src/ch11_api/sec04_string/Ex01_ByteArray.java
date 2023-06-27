package ch11_api.sec04_string;

import java.io.IOException;
import java.util.Arrays;

/**
 * byte array를 String으로 만들어주는 방법, 파일 I/O
 */
public class Ex01_ByteArray {

	public static void main(String[] args) throws IOException {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);				// Hello Java
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);				// Java
		
		byte[] inputBytes = new byte[10];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(inputBytes);		// 맨 끝에 \r\n이 따라붙음
		
		String str = new String(inputBytes, 0, readByteNo-2);		// \r\n을 제거하고 String으로 만듦
		System.out.printf("%d, %s\n", readByteNo, str);				// 7, Hello
		System.out.println(Arrays.toString(inputBytes));			// [72, 101, 108, 108, 111, 13, 10, 0, 0, 0] --> 13(\r), 10(\n)
		
	}

}
