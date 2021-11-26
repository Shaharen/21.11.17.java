import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// 키보드로부터 데이터 입력받기 - ctrl shift o
		// 자동 정렬 - ctrl shift f
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >> ");
		int input = sc.nextInt();

		// System.out.println("결과 : " + input);

		// 어떠한 값을 입력하든지 백의자리 아래 값을 버리고 출력하시오
		// 예) 456 입력 -> 결과 : 400
		// 1) System.out.println("결과 : " + (input / 100) * 100);
		// 2) System.out.println("결과 : " + (input2/100) + "00");
		// 3) int result = input / 100 * 100;
		String result = input / 100 + "00";
		// String result2 = "결과 : " + input / 100 + "00";
		System.out.println("결과 : " + result);
		// System.out.println(result2);

	}

}
