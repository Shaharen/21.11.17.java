import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// ���� num�� �� �����ڸ��� 1�� �ٲٴ� �ڵ�
		// ��) 456 -> 451
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		int result = input/10; // �Ǵ� input/10*10 + 1;
		// String result = input/10 + "1";
		
		System.out.println("���Ȯ�� : " + result + "1");
		// System.out.println("���Ȯ�� : " + result);
		
	}

}
