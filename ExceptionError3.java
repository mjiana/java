package chapter15;

//�ǹ��� ���� ����� �ڵ�

class UserException{
	public UserException() {} //�⺻������
	public UserException(String m) {
		System.out.println("--------file error message--------");
		System.out.println(m);
		System.out.println("------------------------------");
	}
}

public class ExceptionError3 {
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
			new UserException(e.toString()); //����ڰ� ���� ����ó��Ŭ����
		} finally {
			System.out.println("============================");
			System.out.println("����ó���� ������ final ����� �����մϴ�");
		}

		System.out.println("�����۵�");
	}

}
