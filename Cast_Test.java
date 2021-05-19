package chapter03;

public class Cast_Test {
	public static void main(String[] args) {
		// 형변환
		int i = 1234; //4byte, 정수
		int k ; //4byte, 정수
		float f = 10.5f; //4byte, 실수
		double d = 100.55; //8byte, 실수
		
		k = (int)f; //작은타입 =(작은타입)큰타입
		System.out.println(k);
		
		f = i; //실수형 = 정수형
		System.out.println(f);
		
		f = (float)d;
		System.out.println(f);
	}
}
