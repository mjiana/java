package chapter12;

class OverB{
	void show() {  //�������̵� = ����Ŭ���� �޼ҵ� ������
		System.out.println("����Ŭ���� �޼ҵ� show()");
	}
}
class SubOverB extends OverB{
	void show() { // ����Ŭ������ ����(��ȯ��, �Լ���, ����) ����, ���븸 ����
		System.out.println("����Ŭ���� �޼ҵ� show()");
	}
}

public class OverrideExam2 {
	public static void main(String[] args) {
		//�������̵�
		OverB b = new OverB();
		b.show();
		
		SubOverB sb = new SubOverB();
		sb.show();

	}

}
