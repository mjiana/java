package chapter18;

//import java.lang.*; //�ڹ��� �⺻��Ű���̹Ƿ� ���� �ۼ����� �ʾƵ� ȣ���� �����ϴ�.

public class Test {
	public static void main(String[] args) {
		//wrapper Ŭ���� : �⺻������ ��ü������ ����ȯ�ϴ� Ŭ����
		
		String bin = Integer.toBinaryString(100); //����100�� 2������
		System.out.println("100�� 2������ "+bin);
		
		Integer it = new Integer("100"); //���ڿ� 100�� ����������
		it += 10;
		//�ֱٹ������ jdk������ ���� ���ɿ��ΰ� �޶�����.
		Integer it2 = 10; //���������� ���� : auto boxing(�⺻��->��ü��)
		
		 //intValue() : ���ڿ��� ����� ���� �ٽ� int������ ����, �ֱٿ��� �Ƚᵵ ����
		System.out.println("it : "+it.intValue());
		System.out.println("it2 : "+it2.intValue());
		
		int k = Integer.parseInt("100"); //���ڿ� 100�� ����������
		System.out.println("k : "+ k);
	}

}
