package chapter10;

class School4{
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	
	public School4() { //�⺻������
		
	}
	public School4(int kuk, int eng) {
		this.kuk = kuk;
		this.eng = eng;
	}
	public int hap() {
		tot = kuk + eng;
		return tot;
	}
}
public class SchoolMain4 {
	public static void main(String[] args) {
		//�⺻�����ڸ� �ۼ����� ���� ��� �Ʒ��� �ڵ忡 ������ �߻��Ѵ�.
		School4 s4 = new School4();
		s4.kuk = 80;
		s4.eng = 80;
		System.out.println("hap = "+s4.hap());
		
		School4 s5 = new School4(95,95);
		System.out.println("hap = "+s5.hap());
	}

}
