package ch11_api.sec04_string;

// compareTo(): 사전순으로 나열했을때 두 객체간의 거리

public class Ex11_CompareTo {

	public static void main(String[] args) {
		String s1 = "Apple", s2 = "Banana";
		String s3 = new String("Apple");
		
		System.out.println(s1.compareTo(s2));		// -1
		System.out.println(s2.compareTo(s1));		// 1
		System.out.println(s1.compareTo(s3));		// 0
		
		Student st1 = new Student(1, "James");
		Student st2 = new Student(2, "Maria");
		Student st3 = new Student(3, "Brian");
		
		System.out.println(st1.compareTo(st2));		// -3
		System.out.println(st1.compareTo(st3));		// 8
	}

}
