public class Exam02 {

	public static void main(String[] args) {
		// ����ȯ - �ڷ��� ��ȯ

		// �ڵ� ����ȯ
		int num1 = 30;
		long num2 = num1;
		System.out.println(num2);

		// ���� ����ȯ - ū ������ Ÿ���� ���� ������Ÿ�Կ� ���� ( ���� �߻� )
		int num3 = 200;
		byte num4 = (byte) num3;
		// System.out.println(num4);  // -56 ��� -> ����

		// ������ �Ǽ� ( int < float // long < double )
		int num5 = 50;
		float num6 = num5;
		int num7 = (int) num6; // ���� Ÿ���̿��� �Ǽ��� �� ũ�� �ν�
		System.out.println(num5); // 50
		System.out.println(num6); // 50.0
		System.out.println(num7); // 50

	}

}
