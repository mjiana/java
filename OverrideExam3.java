package chapter12;

class OverC{
	int show(int a) { //�������̵� �� ����(��ȯ��, �Լ���, ����)�� ������ �� ����.
		return a;
	}
}
class SubOverC extends OverC{
	//�������̵� �� ������ ��ȯ���� ������ �� ����.
	int show(int a) { // �������̵�
		return a*10; //���븸 ����ȴ�
	}
}

public class OverrideExam3 {
	public static void main(String[] args) {
		
		OverC c = new OverC();
		int i = c.show(10);
		
		SubOverC sc = new SubOverC();
		float j = sc.show(10); //����ĳ���� int���� float�� �ִ� ���̱⿡ ����
		
		System.out.println("i="+i);
		System.out.println("j="+j);
	}

}
