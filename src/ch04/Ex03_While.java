package ch04;

public class Ex03_While {

	public static void main(String[] args) {
		int diceSum = 0;
		while (diceSum <= 21) {
			int dice = 1 + (int) (Math.random() * 6);
			System.out.print(dice + " ");
			diceSum += dice;
		}
		System.out.println(); System.out.println(diceSum);
		
		diceSum = 0;
		while (true) {							// 횟수가 정해지지 않았을 때 사용
			int dice = 1 + (int) (Math.random() * 6);
			System.out.print(dice + " ");
			diceSum += dice;
			if (diceSum > 21)
				break;
		}
		System.out.println(); System.out.println(diceSum);
		
		diceSum = 0;
		do {									// 무조건 한번은 실행
			int dice = 1 + (int) (Math.random() * 6);
			System.out.print(dice + " ");
			diceSum += dice;
		} while (diceSum <= 21);
		System.out.println(); System.out.println(diceSum);
	}

}
