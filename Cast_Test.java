package chapter03;

public class Cast_Test {
	public static void main(String[] args) {
		// ����ȯ
		int i = 1234; //4byte, ����
		int k ; //4byte, ����
		float f = 10.5f; //4byte, �Ǽ�
		double d = 100.55; //8byte, �Ǽ�
		
		k = (int)f; //����Ÿ�� =(����Ÿ��)ūŸ��
		System.out.println(k);
		
		f = i; //�Ǽ��� = ������
		System.out.println(f);
		
		f = (float)d;
		System.out.println(f);
	}
}
