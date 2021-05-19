package chapter09;

class HashCodeTest {
	int kuk = 100;
	int eng = 100;
	
	public void prn() {
		System.out.println("kuk = "+ kuk);
	}
}

class HashCodeTest2{
	int kuk = 100;
	int eng = 100;
	
	public void prn() {
		System.out.println("kuk : "+ kuk);
	}
}

public class HashCodeTestMain {	
	public static void main(String[] args) {
		// 객체를 구별하는 요소는 재료가 아니라 영역이다
		// 아래의 인스턴스화를 실행하면 생기는 객체는 3개이다.(new별로 객체 생성)
		HashCodeTest hct1 = new HashCodeTest();
		HashCodeTest hct2 = new HashCodeTest();
		HashCodeTest2 hct3 = new HashCodeTest2();
		
		//hashcode
		System.out.println("hct1.hashcode : "+ hct1.hashCode());
		System.out.println("hct2.hashcode : "+ hct2.hashCode());
		System.out.println("hct3.hashcode : "+ hct3.hashCode());
	}

}
