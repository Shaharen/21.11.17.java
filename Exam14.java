import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		// �� ���� ������ �Է� �޾�, ū������ �������� �� ������� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�� ���� �� : ");
		System.out.println(num1 >= num2 ? num1 - num2 : num2 - num1);
		
		// int num3 = 58;
		// System.out.println(num1 >= num2 ? (num1 >= num3 ? 100 : 500) : -50);
						

	}

}
