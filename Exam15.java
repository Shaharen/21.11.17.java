import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// �󱸰��� ��� ���� �ʿ��� ������ ����
		// ���� �ϳ����� �󱸰� 5�������� �� �� �ִ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�󱸰��� ���� : ");
		int ball = sc.nextInt();
		System.out.print("�ʿ��� ������ ���� : ");
		System.out.println(ball % 5 == 0 ? ball / 5 : ball / 5 + 1);
		
		// int box = ball%5 == 0 ? ball/5 : ball/5 + 1;
		// System.out.println(box);

	}

}
