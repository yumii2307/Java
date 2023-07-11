package ch06_class;

public class Ex01_Interaction {

	public static void main(String[] args) {	// 메인 메소드에는 반드시 static
		int[] scores = {67, 89, 87, 92, 72};
		MyUtil myUtil = new MyUtil();			// 객체 생성
		int min = myUtil.getMinimum(scores);	// 인스턴스 메소드 호출
		int max = myUtil.getMaximum(scores);
		double average = MyUtil.getAverage(scores);		// 정적 메소드 호출
		System.out.printf("%d, %d, %.2f\n", min, max, average);

		// myUtil.privateMethod(); --> error : 접근 제한자가 parivate, 외부에서 사용 불가
	}

}
