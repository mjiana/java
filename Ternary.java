package chapter03;

public class Ternary {

	public static void main(String[] args) {
		// 삼항연산자
		int x = 10;
		int y;
		String s;
		
	// 변수 = 조건문 ? 참값 : 거짓값
		y = x<9 ? 3 : 5;
		s = x<9 ? "true" : "false";
		System.out.println("결과는 "+ y);
		System.out.println("결과는 "+ s);

	}

}
