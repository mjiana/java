package chapter05_Star;

public class Star8 {

	public static void main(String[] args) {
		// ������� ����� ��  //�١�
		
		int val = 6; //������ ����� ���ϴ� ����

		/* �Ʒ��� ������ ���η� �þ�� ���ﰢ�� �����  �� */
		for(int up_i=0; up_i<=val; up_i++) { //i�� val���� ũ�ų� ���������� ����
			for(int up_j=0; up_j<=(val+up_i); up_j++) {  //j�� val�� i�� ���� ������ ũ�ų� ������������ ����
				if((up_i+up_j) >= val) { //i�� j�� ���� ����  val�� ���ų� Ŭ����  �����
					System.out.print("��"); 
				} else { //���� ó��
					System.out.print("��");
				}
			}
			System.out.println();
		}/*up for�� �ݱ�*/
		/* �Ʒ��� ������ ���η� �پ��� ���ﰢ�� �� */
		for(int down_i=(val-1); down_i>=0; down_i--) { //
			for(int down_j=0; down_j<=(val+down_i); down_j++) { //j�� val�� i�� ���� ������ ũ�ų� ������������ ����
				if((down_i+down_j) >= val) { //i�� j�� ���� ����  val�� ���ų� Ŭ����  �����
					System.out.print("��"); 
				} else { //���� ó��
					System.out.print("��");
				}
			}
			System.out.println();
		}/*down for�� �ݱ�*/
	}

}
