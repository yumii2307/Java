package ch06_class;

public class Tmoney {
	
	// 필드
	private int age;
	private int cash;
	public static final int CHILD_FARE = 730;
	public static final int YOUTH_FARE = 1010;
	public static final int ADULT_FARE = 1450;
	
	// 생성자
	public Tmoney(int age) {
		this.age = age;
	}
	
	public Tmoney(int age, int cash) {
		this.age = age;
		this.cash = cash;
	}

	// 메소드
	public int getCash() {
		return this.cash;
	}

	public void charge(int cash) {
		this.cash += cash;
	}
	
	public boolean ride() {
		if (age >= 7 && age <= 12) {
			if (this.cash >= CHILD_FARE) {
				this.cash -= CHILD_FARE;
				return true;
			}
			return false;
		} else if (age >= 13 && age <= 18) {
			if (this.cash >= YOUTH_FARE) {
				this.cash -= YOUTH_FARE;
				return true;
			}
			return false;
		} else if (age >= 19) {
			if (this.cash >= ADULT_FARE) {
				this.cash -= ADULT_FARE;
				return true;
			}
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Tmoney [age=" + age + ", cash=" + cash + "]";
	}
	
	
}
