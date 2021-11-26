import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 초를 입력 받아 [시, 분, 초 ] 형태로 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		/* int hour = totalSecond /3600;
		 totalSecond = totalSecond % 3600;
		 int min = totalSecond / 60;
		 int sec = totalSecond % 60;
		 System.out.println(hour + "시 " + min + "분 " + sec +"초");
		*/
		
		int hour = totalSecond / 3600;
		int minute = (totalSecond % 3600) / 60;
		int second = (totalSecond % 3600) % 60;
		// String time = hour + "시 " + minute + "분 " + second + "초" 
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		// System.out.println(time);
		
		String hour2 = totalSecond / 3600 + "시 ";
		String minute2 = totalSecond % 3600 / 60 + "분 ";
		String second2 = totalSecond % 3600 % 60 + "초";
		String time = hour2 + minute2 + second2;
		
		System.out.println(time);

	}

}
