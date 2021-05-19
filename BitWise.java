package chapter03;

public class BitWise {

	public static void main(String[] args) {
		// 비트연산자
		int a = 2; 
		int b = 5; 
		
		int c = a|b; 
		/* 2진수 bit or
		 * 000010
		 * 000101
		 * -------
		 * 000111 = 7
		 *    4(2^2)+2(2^1)+1(2^0)
		 * */
		int d = a&b;
		/* 2진수 bit and
		 * 000010
		 * 000101
		 * -------
		 * 000000 = 0
		 * */
		int e = a^b;
		/* 2진수 bit xor(Exclusive or)
		 * 000010
		 * 000101
		 * -------
		 * 000111 = 7
		 * */
		
		int i; int j;
		i = a << 2;
		/* 좌 shift 연산
		 * 000010 <<2자리 이동
		 * 001000 = 8
		 * */
		j = b >> 2;
		/* 우 shift 연산
		 * 000010 >>2자리 이동
		 * 000001 = 1
		 * */
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a|b = " + c);
		System.out.println("a&b = " + d);
		System.out.println("a^b = " + e);
		System.out.println("a << 2 = " + i);
		System.out.println("b >> 2 = " + j);
	}

}
