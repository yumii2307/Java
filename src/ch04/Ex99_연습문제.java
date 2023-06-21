package ch04;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex99_연습문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 알람시계
		System.out.print("기상 시간을 입력하세요.> ");
		String time = scan.nextLine();
		String hhStr = time.substring(0, 2);
		String mmStr = time.substring(2, 4);
		int hh = Integer.parseInt(hhStr);
		int mm = Integer.parseInt(mmStr);
		
		int HH = 0, MM = 0;
		if (mm >= 45) {
			HH = hh; MM = mm - 45;
		} else if (mm < 45 && hh == 0) {
			HH = 23; MM = 15 + mm;
		} else {
			HH = hh - 1; MM = 15 + mm;
		}
		System.out.printf("%02d시 %02d분 알람을 설정하였습니다.\n", HH, MM);
		
		// 만나이 계산
		System.out.print("생년월일 8자리를 입력하세요.> ");
		String birth = scan.nextLine();
		String yearStr = birth.substring(0, 4);
		String monthStr = birth.substring(4, 6);
		String dayStr = birth.substring(6, 8);
		int year = Integer.parseInt(yearStr);
		int month = Integer.parseInt(monthStr);
		int day = Integer.parseInt(dayStr);
		scan.close();
		
		LocalDate today = LocalDate.now();
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();
		
		int age;
		if (month < tMonth || (month == tMonth && day > tDay))
			age = tYear - year;
		else
			age = tYear - year - 1;
		
		System.out.println("만 " + age + "세 입니다.");
		
		// score : N+, N0, N-
		int score = 60 + (int) (40 * Math.random());

		char grade;
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		char oper;
		if (score >= 60 && score % 10 >= 7)
			oper = '+';
		else if (score >= 60 && score % 10 >= 3)
			oper = '0';
		else if (score >= 60 && score % 10 >= 0)
			oper = '-';
		else
			oper = '\0';
		
		System.out.println(score + "점은 " + grade + oper + " 학점 입니다.");
	}

}
