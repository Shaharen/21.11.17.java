import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// �ʸ� �Է� �޾� [��, ��, �� ] ���·� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
		/* int hour = totalSecond /3600;
		 totalSecond = totalSecond % 3600;
		 int min = totalSecond / 60;
		 int sec = totalSecond % 60;
		 System.out.println(hour + "�� " + min + "�� " + sec +"��");
		*/
		
		int hour = totalSecond / 3600;
		int minute = (totalSecond % 3600) / 60;
		int second = (totalSecond % 3600) % 60;
		// String time = hour + "�� " + minute + "�� " + second + "��" 
		
		System.out.println(hour + "�� " + minute + "�� " + second + "��");
		// System.out.println(time);
		
		String hour2 = totalSecond / 3600 + "�� ";
		String minute2 = totalSecond % 3600 / 60 + "�� ";
		String second2 = totalSecond % 3600 % 60 + "��";
		String time = hour2 + minute2 + second2;
		
		System.out.println(time);

	}

}
