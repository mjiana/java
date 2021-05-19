package chapter04;

public class IfApp1 {

	public static void main(String[] args) {
		// 논리연산자 ||
		int k = 90;
		if( k%3 == 0 || k%5 == 0) {
			System.out.println("k = "+ k +", 3이나 5의 배수다");
		} else {
			System.out.println("3이나 5의 배수가 아니다");
		}

	}

}
