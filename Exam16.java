import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// 기본시급 5천 / 8시간이 넘을경우 1.5배 책정
		Scanner sc = new Scanner(System.in);
		// 1)
		System.out.print("노동시간을 입력하세요 : ");
		int wh = sc.nextInt();   // wh = work hour
		int pay = wh <= 8 ? wh * 5000 : (wh-8) * 7500 + 40000;
		// int pay = wh <= 8 ? wh * 5000 : (int)(wh-8)*5000*1.5 + 8*5000;
		System.out.println("총 임금은 " + pay +"입니다" );
		
		// 2)
		double pay2 = wh <= 8 ? wh*5 : (40 + (wh-8)*7.5);
		double pay3 = pay2*1000;
		System.out.println("총 임금은 "+ (int)pay3 + "입니다");
		
		// 3)
		int pay4 = wh*5000;
		int pay5 = (wh-8)*7500 + 40000;
		int pay6 = wh <= 8 ? pay4 : pay5 ;
		System.out.println("총 임금은 "+ pay6 + "입니다");
		
		// if - else 문으로 변환 1)
		System.out.print("총 임금은 ");
		if(wh <= 8) {
			System.out.print(wh*5000);
		}else {
			System.out.print((wh-8)*7500 + 40000);
		}
		System.out.println("입니다");
		// 변환 2)
		int money = 0;
		if(wh <= 8 ) {
			money = wh*5000;
		}else {
			money = (wh-8)*7500 + 40000;
		}
		System.out.println("총 임금은 "+ money + "입니다");
		
		// 연산자의 우선순위 : (높음) 증감 - 산술 - 비교 - 논리 - 삼항 - 대입 (낮음)

	}

}
