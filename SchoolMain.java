package chapter10;

class School{
	int kuk = 0;
	int eng = 0;
	int mat = 0;
	int tot = 0;
	//�⺻������
	public School() {
	}
	//������ �����ε� �� �ߺ��κ��� new��ü�� �Ҵ�(�ߺ��ڵ� ����, ������ ��Ȱ��)
	//this.���� ���� �Ͱ� ū ���̴� ����.(����� ����)
	public School(int kuk) {
		this.kuk = kuk;
	}
	public School(int kuk, int eng) {
		new School(kuk);
		//this.kuk = kuk;
		this.eng = eng;
	}
	public School(int kuk, int eng, int mat) {
		new School(kuk, eng);
		//this.kuk;
		//this.eng;
		this.mat = mat;
	}
	
	public int hap() {
		tot = kuk+eng+mat;
		return tot;
	}
	
}
public class SchoolMain {
	public static void main(String[] args) {
		//
		School s1 = new School(80);
		System.out.println("hap : "+s1.hap());
		School s2 = new School(80,90);
		System.out.println("hap : "+s2.hap());
		School s3 = new School(80,90,100);
		System.out.println("hap : "+s3.hap());
	}

}
