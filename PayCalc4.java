package chapter07;

public class PayCalc4 {

	public static void main(String[] args) {
		//�ҷ��� �����Ͱ� ���ٸ� ��ü���� ����ϱ�
		//PayCalc3���� �� ���ɾ� �κ� ���� ��� �߰�
		
		//Pay4���� �Լ�ȭ ���Ѽ� �ҷ�����
		Pay4 p1 = new Pay4();
		Pay4 p2 = new Pay4();
		
		p1.name = "�մ���";
		p1.bonbong = 2194513;
		p1.setTex();
		p1.setSil();
		p1.prnPay();
		
		p2.name = "�Ʒ���";
		p2.bonbong = 2573417;
		p2.setTex();
		p2.setSil();
		p2.prnPay();
	}

}
