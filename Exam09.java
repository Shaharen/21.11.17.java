
public class Exam09 {

	public static void main(String[] args) {
		// 복합대입 연산자
		int num = 10;
		
		num += 2;   //  num = num + 2;  -> 12
		num -= 5;   //  num = num - 5;  -> 5
		num *= 2;   //  num = num * 2;  -> 20 
		num /= 3;   //  num = num / 3;  -> 3
		
		num -= 2 + 3 *4; //  num = num - (2 + 3 * 4) ; -> -4 출력
		
		System.out.println(num);
		

	}

}
