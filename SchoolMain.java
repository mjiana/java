package chapter10;

class School{
	int kuk = 0;
	int eng = 0;
	int mat = 0;
	int tot = 0;
	//기본생성자
	public School() {
	}
	//생성자 오버로딩 시 중복부분을 new객체로 할당(중복코드 제거, 생성자 재활용)
	//this.으로 적는 것과 큰 차이는 없다.(결과값 동일)
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
