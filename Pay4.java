package chapter07;

import java.text.DecimalFormat; //õ���� ,���� �ܺ�����

//PayCalc4 ����� ���� ����, �Լ� ����
//����, �ʱ�ȭ ���� �ڵ�� �Լ��� ���μ� ����ؾ� �Ѵ�.
public class Pay4 {
	
	DecimalFormat df = new DecimalFormat("###,##0");
	String name;
	int bonbong;
	int tex;
	int sil;
	
	
	public void setTex() {
		tex = (int)(bonbong*0.05 + 0.5);
	}
	public void setSil() {
		float f;
		sil = bonbong - tex;
		f = sil/100f;
		sil = ((int)f)*100;
	}
	public void prnPay() {
		System.out.println("���� : "+name);
		System.out.println("���� : "+df.format(bonbong)+"��");
		System.out.println("���� : "+df.format(tex)+"��");
		System.out.println("�� ���ɾ� : "+df.format(sil)+"��");
		
	}
	
}
