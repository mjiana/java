package chapter15;

public class EX2 {
	public static void main(String[] args) {
		//args[]�Ű����� �Է� ���
		//Run��ư �Ʒ� �ﰢ��-Run Confi---Argu---ù��° ��(����� �� ����)
		System.out.println("�Ű������� ���� �� ���� ��");
		int a = Integer.parseInt("10"); //args[0]
		int b = Integer.parseInt("2"); //args[1]
		
		System.out.println("a="+a+", b="+b);
		
		try {
			System.out.println("a/b= "+(a/b));
		} catch (Exception e) {
			System.out.println("[���]���ܹ߻� : "+e.toString());
		} finally {
			System.out.println("������������ ����Ǿ����ϴ�");
		}
		
		System.out.println("���� ��ƾ�� �����մϴ�");
	}

}
