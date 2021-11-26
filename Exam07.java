import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// 변수 num값 중 일의자리를 1로 바꾸는 코드
		// 예) 456 -> 451
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		int result = input/10; // 또는 input/10*10 + 1;
		// String result = input/10 + "1";
		
		System.out.println("결과확인 : " + result + "1");
		// System.out.println("결과확인 : " + result);
		
	}

}
