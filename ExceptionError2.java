package chapter15;

public class ExceptionError2 {

	public static void main(String[] args) {
		//args[]�Ű����� �Է� ���
		//Run��ư �Ʒ� �ﰢ��-Run Confi---Argu---ù��° ��(����� �� ����)
		
		try {
			System.out.println("�Ű������� ���� �� ���� ��");
			int a = Integer.parseInt(args[0]); //
			int b = Integer.parseInt(args[1]); //args[1]

			System.out.println("a="+a+", b="+b);
			System.out.println("a/b= "+(a/b));
			System.out.println("�������� ��Ȱ�� ����Ǿ����ϴ�");
		} catch (Exception e) {
			System.out.println("============================");
			System.out.println("[���]���ܹ߻� : "+e.toString());
		} finally {
			System.out.println("����ó���� ������ final ����� �����մϴ�");
		}

		System.out.println("�����۵�");
	}

}
