package chapter15;

public class EX1 {
	public static void main(String[] args) {
		//args[]�Ű����� �Է� ���
		//Run��ư �Ʒ� �ﰢ��-Run Confi---Argu---ù��° ��(����� �� ����)
		System.out.println("�Ű������� ���� �� ���� ��");
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		if(b==0) {
			System.out.println("0���� ���� �� �����ϴ�");
			System.exit(0);
		}
		System.out.println("a="+a+", b="+b);
		System.out.println("a/b= "+(a/b));
		System.out.println("�������� ��Ȱ�� ����Ǿ����ϴ�");
	}

}
