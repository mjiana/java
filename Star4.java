package chapter05_Star;

public class Star4 {

	public static void main(String[] args) {
		/*���߹ݺ���, ���ʹ��� ����
		  ��
		  �ڡ�
		  �ڡڡ�
		  �ڡڡڡ�
		  �ڡڡڡڡ�
		*/
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	}

}
