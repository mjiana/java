package chapter10;

class School2{
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	
	//�⺻������ ����
	
	public int hap() {
		tot = kuk + eng;
		return tot;
	}
}
public class SchoolMain2 {
	public static void main(String[] args) {
		//�⺻�����ڴ� new ȣ�� �� �ڵ����� ������(�ڵ�����δ� ������ ����)
		School2 s2 = new School2();
		s2.kuk = 90;
		s2.eng = 100;
		System.out.println("hap = "+s2.hap());
	}

}
