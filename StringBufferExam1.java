package chapter18;

public class StringBufferExam1 {
	public static void main(String[] args) {
		//StringBuffer : ���ڿ��� ���� ����� �� �޸𸮸� �����ؼ� ����Ѵ�.
		StringBuffer str1 = new StringBuffer("Hello JAVA");
		StringBuffer str2 = new StringBuffer("�ȳ��ϼ��� �ڹ�");
		
		System.out.println("str1�� ���� : "+str1);
		System.out.println("str1�� ���� : "+str1.length());
		System.out.println("str1�� �Ҵ�� �뷮 : "+str1.capacity());
		
		System.out.println("str2�� ���� : "+str2);
		System.out.println("str2�� ���� : "+str2.length());
		System.out.println("str2�� �Ҵ�� �뷮 : "+str2.capacity());
	}

}
