package chapter08;

public class MethodTest6 {

	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;

	public MethodTest6(int k, int e) {
		this.kuk = k;
		this.eng = e;
	}

	public int getTot() { // getter ȣ���� ������ ��������� return�ϴ� ����
		return tot; //getter�� ���� �������� ������ ���� ��ȣ�� �� �ִ�.
	}	

	public float getAvg() { // getter
		return avg;
	}
	
	public void calcTot() {
		tot = kuk + eng;
	}
	
	public void calcAvg() {
		avg = tot/2.0f;
	}
	
	public void prn() {
		//System.out.println("�̸� : "+name);
		System.out.println("���� : "+kuk);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+tot);
		System.out.println("��� : "+avg);
	}

}
