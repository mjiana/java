package chapter15;

public class ThrowsTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0; //0�� ��� ���� �߻�
		
		ThrowTest t = new ThrowTest();
		
		try {
			//t.add(a, b);
			//t.sub(a, b);
			t.mul(a, b);
			//t.mul(a, b)�� catch������ throw e;�� �������� ������ 
			//throws�� ���õǾ� �����Լ��� catch�� ���������ʴ´�.
		} catch (Exception e) {
			System.out.println("����Ŭ���� catch ����ó��");
			System.out.println(e.toString());
		}
	}

}
