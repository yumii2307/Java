package ch11_api.sec04_string;

public class Ex06_Replace {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어이고, 자바는 풍부한 API를 지원함.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(newStr);
	}

}
