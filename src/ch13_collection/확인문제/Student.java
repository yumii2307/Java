package ch13_collection.확인문제;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student))
			return false;
		Student student = (Student) obj;
		return this.studentNum == student.studentNum;
	}
}
