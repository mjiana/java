package chapter14;

//�������̽� : ��� �޼��尡 �߻�޼���� �����ϰ�, ������ ����� ���·� �����Ѵ�.
//����Ŭ���� : ������ ��� �޼��带 ������
interface A{ //�������̽�
	void display(String s);
}
//���(extends)�� �ƴ� ����(implements)�̶�� ǥ���ϰ� ���������� ����
//class��� interface�� ����ϰ�, �߻������� abstractŰ���带 ������ �ʴ´�
class C1 implements A{ //����Ŭ����
	public void display(String s) {
		System.out.println("class ��ü C1 �̿� "+s);
	}
}
class C2 implements A{ //����Ŭ����
	public void display(String s) {
		System.out.println("class ��ü C2 �̿� "+s);
	}
}
class C3 implements A{ //����Ŭ����
	public void display(String s) {
		System.out.println("class ��ü C3 �̿� "+s);
	}
	public int getInt() { //���ȿ� �����ִٰ� �� ���Ǵ°� �ƴϴ�
		return 1000;
	}
}

public class IR1 {
	public static void main(String[] args) {
		//�������̽�Ŭ���� �������̽���ü���� = new ����Ŭ����������();
		A memo; //�������̽� ���� ����
		memo = new C1();  //����Ŭ���� �ν��Ͻ� ����
		memo.display("���ѻ�");
		
		memo = new C2();  //����Ŭ���� �ν��Ͻ� ����
		memo.display("������");
		
		memo = new C3();  //����Ŭ���� �ν��Ͻ� ����
		memo.display("������");
		
	}

}
