import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// �⺻�ñ� 5õ / 8�ð��� ������� 1.5�� å��
		Scanner sc = new Scanner(System.in);
		// 1)
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int wh = sc.nextInt();   // wh = work hour
		int pay = wh <= 8 ? wh * 5000 : (wh-8) * 7500 + 40000;
		// int pay = wh <= 8 ? wh * 5000 : (int)(wh-8)*5000*1.5 + 8*5000;
		System.out.println("�� �ӱ��� " + pay +"�Դϴ�" );
		
		// 2)
		double pay2 = wh <= 8 ? wh*5 : (40 + (wh-8)*7.5);
		double pay3 = pay2*1000;
		System.out.println("�� �ӱ��� "+ (int)pay3 + "�Դϴ�");
		
		// 3)
		int pay4 = wh*5000;
		int pay5 = (wh-8)*7500 + 40000;
		int pay6 = wh <= 8 ? pay4 : pay5 ;
		System.out.println("�� �ӱ��� "+ pay6 + "�Դϴ�");
		
		// if - else ������ ��ȯ 1)
		System.out.print("�� �ӱ��� ");
		if(wh <= 8) {
			System.out.print(wh*5000);
		}else {
			System.out.print((wh-8)*7500 + 40000);
		}
		System.out.println("�Դϴ�");
		// ��ȯ 2)
		int money = 0;
		if(wh <= 8 ) {
			money = wh*5000;
		}else {
			money = (wh-8)*7500 + 40000;
		}
		System.out.println("�� �ӱ��� "+ money + "�Դϴ�");
		
		// �������� �켱���� : (����) ���� - ��� - �� - �� - ���� - ���� (����)

	}

}
