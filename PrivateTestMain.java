package chapter11;

class PrivateTest{
	public int kuk = 0;
	public int eng = 0;
	public int sum = 0;
	// private�޼���� ������ �߿���Ҷ� ���
	private void sum() {
		sum = kuk+eng;
		if(sum>200) {
			System.out.println("������ 200���� �ʰ��߽��ϴ�.");
			sum = 0;
		}else {
			System.out.println("����ó���Ǿ����ϴ�.");
		}
	}
	// private�޼��带 �θ��� ���
	public void call_sum() {
		sum();
	}
	public int getKuk() {
		return kuk;
	}
	public void setKuk(int kuk) {
		this.kuk = kuk;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}

public class PrivateTestMain {
	public static void main(String[] args) {
		
		PrivateTest p = new PrivateTest();
		
		p.setKuk(90);//p.kuk = 90;
		p.setEng(90);//p.eng = 80;
		p.call_sum();
		System.out.println("sum = "+p.sum);
	}

}
