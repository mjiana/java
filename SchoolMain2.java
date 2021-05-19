package chapter10;

class School2{
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	
	//기본생성자 생략
	
	public int hap() {
		tot = kuk + eng;
		return tot;
	}
}
public class SchoolMain2 {
	public static void main(String[] args) {
		//기본생성자는 new 호출 시 자동으로 생성됨(코드상으로는 보이지 않음)
		School2 s2 = new School2();
		s2.kuk = 90;
		s2.eng = 100;
		System.out.println("hap = "+s2.hap());
	}

}
