package chapter07;

public class PayCalc3 {

	public static void main(String[] args) {
		//�ڹ��� �ֿ������� ��ü������ ���� ���� ǥ���� ���
		// �̷� �������� �ۼ��� �� �ֵ��� ���� �����ϱ�
		//�ҷ��� �����Ͱ� ���ٸ� ��ü���� ����ϱ�
		
		//Pay3���� �Լ�ȭ ���Ѽ� �ҷ�����
		Pay3 p1 = new Pay3();
		Pay3 p2 = new Pay3();
		
		p1.name = "�մ���";
		p1.bonbong = 2000000;
		p1.setTex();
		p1.setSil();
		p1.prnPay();
		
		p2.name = "�Ʒ���";
		p2.bonbong = 2500000;
		p2.setTex();
		p2.setSil();
		p2.prnPay();
	}

}
