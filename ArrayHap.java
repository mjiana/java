package chapter06;

public class ArrayHap {

	public static void main(String[] args) {
		// �迭���� �ձ��ϱ�
		int[] su = {1,2,3,4,5,6,7,8,9,10}; //���� ����+�޸� �Ҵ�+�� �ʱ�ȭ ���� ����
		int i, hap = 0;
		
		//System.out.println(i);
		for(i=0; i<10; i++) {
			hap += su[i];
		}
		System.out.println("1���� 10������ �� = "+hap);
		System.out.println(i);
	}

}
