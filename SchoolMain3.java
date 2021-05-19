package chapter10;

class School3{
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	
	public School3() { //기본생성자
		
	}
	public int hap() {
		tot = kuk + eng;
		return tot;
	}
}
public class SchoolMain3 {
	public static void main(String[] args) {
		//
		School3 s3 = new School3();
		s3.kuk = 100;
		s3.eng = 100;
		System.out.println("hap = "+s3.hap());
	}

}
