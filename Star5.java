package chapter05_Star;

public class Star5 {

	public static void main(String[] args) {
		/* ���߹ݺ���, ���ʹ��� ����
		  �ڡڡڡڡ�
		  �ڡڡڡ�
		  �ڡڡ�
		  �ڡ�
		  ��
		 */
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}

}
