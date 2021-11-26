import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		// 농구공을 담기 위해 필요한 상자의 개수
		// 상자 하나에는 농구공 5개까지만 들어갈 수 있다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수 : ");
		int ball = sc.nextInt();
		System.out.print("필요한 상자의 개수 : ");
		System.out.println(ball % 5 == 0 ? ball / 5 : ball / 5 + 1);
		
		// int box = ball%5 == 0 ? ball/5 : ball/5 + 1;
		// System.out.println(box);

	}

}
