package chapter14;

//�߻� Ŭ���� : �߻�޼��带 �����ϴ� Ŭ����
//�߻�޼��� : ���� �ְ� ������ ���� �޼���
abstract class Sum{ //�߻� Ŭ����
	//�߻�Ŭ������ �޼��忡�� ���������� ������ abstractŰ���带 ���δ�.
	public abstract String hello(); //�߻�޼���
	//�߻�޼���� ������ �����ϰ� { }�� ����. ũ�⸦ �𸣴� ��ü�� ���� �Ҵ��� �Ұ����ϴ�.
	//�߻�Ŭ������ ��κ� ���ظ� �����ϰ� ���������� ����Ŭ�������� ����������
	//��� ����� �߻��� �ʿ�� ����.
	public String sum(int i, int k) {
		int sum = i+k;
		return " "+sum;
	}
}
//��ũ��Ʈ Ŭ������ �߻�Ŭ������ ��� �ް�, �߻�޼��带 ���� �� �������̵� �ؼ� ����Ѵ�
class Sum1 extends Sum{ //��ũ��Ʈ Ŭ����
	public String hello() { //�߻�޼����� �������̵�
		return "class Sum1 extends Sum";
	}
}
class Sum2 extends Sum{ //��ũ��Ʈ Ŭ����
	public String hello() { //�߻�޼����� �������̵�
		return "class Sum2 extends Sum";
	}
}

public class SumMain {
	public static void main(String[] args) {
		//��ũ��Ʈ Ŭ������ �Ʒ��� ������ �ַ� ����Ѵ�.
		//��ũ��Ʈ Ŭ���� ��ũ��Ʈ��ü���� = new ��ũ��Ʈ������();
		Sum1 s1 = new Sum1();
		System.out.println(s1.sum(10, 20));
		System.out.println(s1.hello());
		
		Sum2 s2 = new Sum2();
		System.out.println(s2.sum(20, 30));
		System.out.println(s2.hello());
	}

}
