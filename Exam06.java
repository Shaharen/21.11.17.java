import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// Ű����κ��� ������ �Է¹ޱ� - ctrl shift o
		// �ڵ� ���� - ctrl shift f
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� >> ");
		int input = sc.nextInt();

		// System.out.println("��� : " + input);

		// ��� ���� �Է��ϵ��� �����ڸ� �Ʒ� ���� ������ ����Ͻÿ�
		// ��) 456 �Է� -> ��� : 400
		// 1) System.out.println("��� : " + (input / 100) * 100);
		// 2) System.out.println("��� : " + (input2/100) + "00");
		// 3) int result = input / 100 * 100;
		String result = input / 100 + "00";
		// String result2 = "��� : " + input / 100 + "00";
		System.out.println("��� : " + result);
		// System.out.println(result2);

	}

}
