package chapter18;

public class StringBufferExam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("aa�ڹ�");
		
		System.out.println("���� ���� : "+str);
		System.out.println("���ڿ� �����ֱ� : "+str.insert(2, "GOOD"));
		System.out.println("������ 5��° ���� : "+str.charAt(4));
		
		str.setCharAt(0, 'A');
		System.out.println("0��° ���� 'A'�� ���� : "+str);
		
		str.setLength(6);
		System.out.println("str.setLength(6) ���� ��");
		
		System.out.println("������ ���ο� ���� : "+str);
		System.out.println("���ڿ����� ���� ��� : "+str.reverse());
		System.out.println("������ ���� : "+str.length());
		System.out.println("�Ҵ�� �뷮 : "+str.capacity());
		
		/*length ����
capacity �Ҵ�� �뷮
insert(����, �����ڿ���) 
charAt(����) �ڸ��� ���
setCharAt(����, ���ٲܳ��롯)
setLength() ���� ���� �°� �ڸ���
reverse() */
		
	}

}
