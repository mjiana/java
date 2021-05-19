package chapter15;

public class ThrowTest {
	//1. throws�� �ִ� ���
	//ȣ���� �ʿ� ����ó���� ��Ų��.
	public void add(int a, int b) throws Exception{
		if(b==0) throw new Exception("throws�� ������ add() �װ� ó����");
		System.out.println(a+b);
	}
	//2. try-catch�� �ִ°��
	//������ ���ܸ� ó���Ѵ�
	public void sub(int a, int b) {
		try {
			if(b==0) throw new Exception();
			System.out.println(a-b);
		} catch (Exception e) {
			System.out.println("���� try-catch�ϱ� ����ó���Ұ�");
		}
	}
	//3. throw�� try catch�� ���� �ִ� ��� 
	//try�� �켱���� ���� throws�� ���õȴ�.
	//�Ѵ� ó���Ϸ��� catch ��Ͽ��� throw�� �����ϸ� ȣ���ʿ����� ���ܸ� ������.
	public void mul(int a, int b) throws Exception{
		try {
			if(b==0) throw new Exception("mul() ���ܹ߻�");
			System.out.println(a-b);
		} catch (Exception e) {
			System.out.println("try �켱�� "+e.toString());
			//ȣ�⿡�� ���ܸ� ������.
			throw e;
		}
	}

}
