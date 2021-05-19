package chapter08;

public class MethodTest {
	//String name;으로 선언하면 null(정의할수없다)이고 String name=""으로 선언하면 empty(값이 없는) 상태
	String name = ""; 
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest mt = new MethodTest();
		
		mt.kuk = 100;
		mt.eng = 70;
		
		mt.tot = mt.kuk + mt.eng;
		mt.avg = mt.tot/2;
		
		System.out.println("국어 : "+mt.kuk);
		System.out.println("영어 : "+mt.eng);
		System.out.println("총점 : "+mt.tot);
		System.out.println("평균 : "+mt.avg);
	}

}
