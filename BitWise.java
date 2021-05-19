package chapter03;

public class BitWise {

	public static void main(String[] args) {
		// ��Ʈ������
		int a = 2; 
		int b = 5; 
		
		int c = a|b; 
		/* 2���� bit or
		 * 000010
		 * 000101
		 * -------
		 * 000111 = 7
		 *    4(2^2)+2(2^1)+1(2^0)
		 * */
		int d = a&b;
		/* 2���� bit and
		 * 000010
		 * 000101
		 * -------
		 * 000000 = 0
		 * */
		int e = a^b;
		/* 2���� bit xor(Exclusive or)
		 * 000010
		 * 000101
		 * -------
		 * 000111 = 7
		 * */
		
		int i; int j;
		i = a << 2;
		/* �� shift ����
		 * 000010 <<2�ڸ� �̵�
		 * 001000 = 8
		 * */
		j = b >> 2;
		/* �� shift ����
		 * 000010 >>2�ڸ� �̵�
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
