package chapter08;

public class MethodTest4 {
	//��������
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public MethodTest4(int k ,int e) { //������
		this.kuk = k; //this.���� �� ���������� �ǹ�, �Է¹��� ���������� �ʱ�ȭ
		this.eng = e;
	}
	public void calcTot() {
		tot = kuk + eng;
	}
	public void calcAvg() {
		avg = tot/2.0f;
	}
	public void prn() {
		System.out.println("���� : "+kuk);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+tot);
		System.out.println("��� : "+avg);
	}
	public static void main(String[] args) {
		// ������ �ν��Ͻ�ȭ
		MethodTest4 mt = new MethodTest4(80, 90); //ó���� �� �Է�
		
		mt.calcTot();
		mt.calcAvg();
		mt.prn();
	}

}
