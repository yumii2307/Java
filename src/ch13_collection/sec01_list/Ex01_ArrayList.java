package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JSP");
		list.add("Servlet");

		System.out.println(list.get(0));	// Java
		System.out.println(list.get(2));	// Servlet
		System.out.println(list.size());	// 3

		// 전통적인 For-loop
		for (String element : list) {
			System.out.print(element + " ");
		}
		System.out.println();

		// Enhanced For-loop
		for (String element: list) {
			System.out.print(element + " ");
		}
		System.out.println();

		// Stream과 lambda 함수로 처리
		list.forEach(x -> System.out.println(x));		// lambda x: print(x)

		list.remove(1);
		list.add("JDBC");
		list.add("Spring");

		list.forEach(x -> System.out.println(x));
		System.out.println(list.get(1));

		System.out.println(list.isEmpty());
		System.out.println(list.contains("Spring"));

		list.clear();
		System.out.println(list.isEmpty());
	}

}

