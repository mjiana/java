package chapter03;

public class IncDec {

	public static void main(String[] args) {
		// ����������, ���ҿ�����
		int x = 1;
		int y = x++; //����������
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 1;
		int z = ++x; //����������
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
		x = 1;
		x++;
		z = x;
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
	}

}
