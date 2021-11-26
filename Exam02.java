public class Exam02 {

	public static void main(String[] args) {
		// 형변환 - 자료형 변환

		// 자동 형변환
		int num1 = 30;
		long num2 = num1;
		System.out.println(num2);

		// 강제 형변환 - 큰 데이터 타입을 작은 데이터타입에 넣음 ( 누실 발생 )
		int num3 = 200;
		byte num4 = (byte) num3;
		// System.out.println(num4);  // -56 출력 -> 누실

		// 정수와 실수 ( int < float // long < double )
		int num5 = 50;
		float num6 = num5;
		int num7 = (int) num6; // 같은 타입이여도 실수를 더 크게 인식
		System.out.println(num5); // 50
		System.out.println(num6); // 50.0
		System.out.println(num7); // 50

	}

}
