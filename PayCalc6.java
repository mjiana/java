package chapter07;

import java.util.Scanner; //�ֿܼ� Ű����� ���� �Է¹������� �ܺ�����

public class PayCalc6 {
	//PatCalc5���� �ܼ�â���� ���� �Է� �޴� ��� �߰�
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//Pay6���� �Լ�ȭ ���Ѽ� �ҷ�����
		Pay6[] p = new Pay6[2]; //���� ����
		p[0] = new Pay6(); //�ν��Ͻ�ȭ
		p[1] = new Pay6(); //�ν��Ͻ�ȭ

		System.out.println("������ �̸��� ������ �Է��ϸ� ���ݰ� �Ǽ��ɾ��� ����ص帳�ϴ�.");
		for(int i=0; i< p.length; i++) {

			System.out.print((i+1)+"�� ������ �̸� : ");
			p[i].name = s.next();

			System.out.print((i+1)+"�� ������ ���� : ");
			p[i].bonbong = Integer.parseInt(s.next()); //���ڿ��� �ԷµǾ����� ����ǥ�� ��� �Է��ϰ� ������ �ذ��� �ȵȴ�.
			//System.out.println(s.hasNextInt());
			

			if(i >=1) {
				for(int j = i-1; j<=i; j++) {
					System.out.println("--------------------");
					p[j].setTex();
					p[j].setSil();
					p[j].prnPay();
					
				}
				
			}
		}

	}

}
