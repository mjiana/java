package chapter05;

public class DoWhileTest {

	public static void main(String[] args) {
		// ������ �����̿��� ���� 1ȸ�� ����ȴ�
		int j = 1; // �ʱⰪ���� ���ǿ� ��������� 1ȸ�� ����
		
		do {
			System.out.println("num: "+j);
			j++;
			if(j==5) break;
		} while(j<0);
		
		System.out.println("END");
		System.out.println("j = "+ j);
	}

}
