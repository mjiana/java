package chapter08;

public class MethodTest3 {
	//��������
	int kuk =0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public MethodTest3(int k, int e) { // ������
		this.kuk = k; //this.���� �� ���������� �ǹ�, �Է¹��� ���������� �ʱ�ȭ
		this.eng = e;
	}
	public void calcTot() {
		tot = kuk + eng;
	}
	public void calcAvg() {
		avg = tot/2.0f;
	}
	
	public static void main(String[] args) {
		// ������ �ν��Ͻ�ȭ
		MethodTest3 mt = new MethodTest3(100, 90); //ó���� �� �Է�
		
		mt.calcTot();
		mt.calcAvg();
		
		System.out.println("���� : "+mt.kuk);
		System.out.println("���� : "+mt.eng);
		System.out.println("���� : "+mt.tot);
		System.out.println("��� : "+mt.avg);
		
	}

}
