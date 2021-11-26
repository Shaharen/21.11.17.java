import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		// 두 개의 정수를 입력 받아, 큰수에서 작은수를 뺀 결과값을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("두 수의 차 : ");
		System.out.println(num1 >= num2 ? num1 - num2 : num2 - num1);
		
		// int num3 = 58;
		// System.out.println(num1 >= num2 ? (num1 >= num3 ? 100 : 500) : -50);
						

	}

}
