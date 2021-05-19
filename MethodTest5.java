package chapter08;

//컴포넌트 클래스와 메인클래스 분리
//컴포넌트 클래스 = 부품 = 처리클래스
public class MethodTest5 {

	//전역변수
	String name = "";
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public MethodTest5(String n, int k, int e) { //여러개의 기본형 입력 가능
		//this.변수 는 전역변수를 의미, 입력받은 지역변수로 초기화
		this.name = n;
		this.kuk = k; 
		this.eng = e;
	}
	
	public void calcTot() {
		tot = kuk + eng;
	}
	public void calcAvg() {
		avg = tot/2.0f;
	}
	
	public void prn() {
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kuk);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
	}
}
