package chapter09;

class MethodTest{
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public MethodTest() { //�⺻������
	}

	public int getTot() { // getter ȣ���� ������ ��������� return�ϴ� ����
		return tot; //getter�� ���� �������� ������ ���� ��ȣ�� �� �ִ�.
	}	

	public float getAvg() {
		return avg;
	}
	
	public void setKuk(int k) { //setter ���ڸ� �޾Ƽ� ��������� �ʱ�ȭ �ϴ� ����
		this.kuk = k; // 1Ŭ���� 1�������̹Ƿ� �����ڿ� �Էµ� ���� �ٲ� �� setter ��� 
	}
	public void setEng(int e) {
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
}
public class MethodTestMain9 {
	public static void main(String[] args) {
		// �⺻������
		//���� ���� �ʾƵ� �⺻�����ڴ� �ν��Ͻ�ȭ�� �Ҷ�  �ڵ����� �����Ǿ� ȣ��ȴ�
		MethodTest mt = new MethodTest(); 
		
		mt.setKuk(95);
		mt.setEng(80);
		
		mt.calcTot();
		mt.calcAvg(); 
		
		System.out.println("���� : "+mt.getTot());
		System.out.println("��� : "+mt.getAvg());
	}

}
