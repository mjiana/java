package chapter03;

public class Arithmetic {

	public static void main(String[] args) {
		// ���������
		int i = 20;
		int j = 12;
		
		int a = i+j;
		int b = i-j;
		int c = i*j;
		int d = i/j; //�ڹٿ��� ����/���� = ����
		int e = i%j; //��������
		float n = 0.0f;
		
		System.out.println("i= "+i+" j= "+j);
		System.out.println("�������: "+a);
		System.out.println("�������: "+b);
		System.out.println("�������: "+c);
		System.out.println("���������: "+d);
		System.out.println("���������: "+e);
		
		n = (float)i/j;
		System.out.println("����/���� ���: "+n);
	}

}
