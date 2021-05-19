package chapter14;

//�������̽� : ��� �޼��尡 �߻�޼���� �����ϰ�, ������ ����� ���·� �����Ѵ�.
//����Ŭ���� : ������ ��� �޼��带 ������
interface B{ //�������̽�
	void display(String s);
}
//���(extends)�� �ƴ� ����(implements)�̶�� ǥ���ϰ� ���������� ����
//class��� interface�� ����ϰ�, �߻������� abstractŰ���带 ������ �ʴ´�
class D1 implements B{
	String str;
	public void display(String s) {
		str = s;
		System.out.println("class D1 : "+s);
	}
}
class D2 implements B{
	String str;
	public void display(String s) {
		str = s;
		System.out.println("class D2 : "+s);
	}
}

public class IR2 {
	public static void main(String[] args) {
		//�������̽�Ŭ���� �������̽���ü���� = new ����Ŭ����������();
		B memo; //�������̽� ���� ����
		memo = new D1();  //����Ŭ���� �ν��Ͻ� ����
		memo.display("����");
		
		D1 d1 = (D1)memo;
		System.out.println(d1.str);
		
		memo = new D2();  //����Ŭ���� �ν��Ͻ� ����
		memo.display("��ȭ��");
		
		D2 d2 = (D2)memo;
		System.out.println(d2.str);
	}

}
