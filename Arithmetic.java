package chapter03;

public class Arithmetic {

	public static void main(String[] args) {
		// 산술연산자
		int i = 20;
		int j = 12;
		
		int a = i+j;
		int b = i-j;
		int c = i*j;
		int d = i/j; //자바에서 정수/정수 = 정수
		int e = i%j; //나머지값
		float n = 0.0f;
		
		System.out.println("i= "+i+" j= "+j);
		System.out.println("덧셈결과: "+a);
		System.out.println("뺄셈결과: "+b);
		System.out.println("곱셈결과: "+c);
		System.out.println("나눗셈결과: "+d);
		System.out.println("나머지결과: "+e);
		
		n = (float)i/j;
		System.out.println("정수/정수 결과: "+n);
	}

}
