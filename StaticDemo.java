package chapter09;
//ó��Ŭ����
class Box{
	int cnt = 0; //��ü�� �����ɶ� ���� �ʱ�ȭ �ȴ�.
	static long boxID = 0; // static ������ �ʱ�ȭ ���� �ʰ� �����ȴ�.

	public Box() {
		cnt++;   // ��� :  1 1 1 1
		boxID++; // ��� :  1 2 3 4
		System.out.println("cnt = "+cnt);
		System.out.println("boxID = "+boxID);
	}
}
//�̿�Ŭ����
public class StaticDemo {
	public static void main(String[] args) {
		//�⺻������ ȣ��
		//���� �Լ����� ������ �ʴ� ������ �ǹ̰� ���⿡ ��ü�� �����ϰ� ���� ���� ����
		new Box();
		new Box();
		new Box();
		new Box();
		
		/* ȣ����� ���� �Ŷ�� ���� ������ ���� �ʿ� ����
		Box mb1 = new Box();
		Box mb2 = new Box();
		Box mb3 = new Box();
		Box mb4 = new Box();
		*/
		
	}
}
