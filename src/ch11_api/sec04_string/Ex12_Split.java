package ch11_api.sec04_string;

import java.util.Arrays;

public class Ex12_Split {

	public static void main(String[] args) {
		String fruits = "감, 배, 귤, 밤";
		String[] fruitsArray = fruits.split(", ");
		System.out.println(Arrays.toString(fruitsArray));	// [감, 배, 귤, 밤]
		
		fruits = "감, 배. 귤; 밤";
		fruitsArray = fruits.split("[,|.|;] ");				// 정규 표현식 사용 가능
		System.out.println(Arrays.toString(fruitsArray));	// [감, 배, 귤, 밤]
		
		// PATH
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArray = paths.split(";");
		for (String path: pathArray)
			System.out.println(path);
		
	}

}
