package chapter08;

//������Ʈ Ŭ������ ����Ŭ���� �и�
//������Ʈ Ŭ���� = ��ǰ = ó��Ŭ����
public class MethodTest5 {

	//��������
	String name = "";
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public MethodTest5(String n, int k, int e) { //�������� �⺻�� �Է� ����
		//this.���� �� ���������� �ǹ�, �Է¹��� ���������� �ʱ�ȭ
		this.name = n;
		this.kuk = k; 
		this.eng = e;
	}
	
	public void calcTot() {
		tot = kuk + eng;
	}
	public void calcAvg() {
		avg = tot/2.0f;
	}
	
	public void prn() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+kuk);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+tot);
		System.out.println("��� : "+avg);
	}
}
