package chapter07;

public class PayCalc5 {

	public static void main(String[] args) {
		//PatCalc3���� ��ü����ȭ ��Ų ��
				
		//Pay5���� �Լ�ȭ ���Ѽ� �ҷ�����
		Pay5[] p = new Pay5[2]; //���� ����
		p[0] = new Pay5(); //�ν��Ͻ�ȭ
		p[1] = new Pay5(); //�ν��Ͻ�ȭ
		
		p[0].name = "�մ���";
		p[0].bonbong = 2416891;
		p[1].name = "�Ʒ���";
		p[1].bonbong = 2598732;
		
		for(int i=0; i<p.length; i++) {
			p[i].setTex();
			p[i].setSil();
			p[i].prnPay();
		}
	}

}
