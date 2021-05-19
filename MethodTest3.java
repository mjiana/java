package chapter08;

public class MethodTest3 {
	//전역변수
	int kuk =0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public MethodTest3(int k, int e) { // 생성자
		this.kuk = k; //this.변수 는 전역변수를 의미, 입력받은 지역변수로 초기화
		this.eng = e;
	}
	public void calcTot() {
		tot = kuk + eng;
	}
	public void calcAvg() {
		avg = tot/2.0f;
	}
	
	public static void main(String[] args) {
		// 생성자 인스턴스화
		MethodTest3 mt = new MethodTest3(100, 90); //처리할 값 입력
		
		mt.calcTot();
		mt.calcAvg();
		
		System.out.println("국어 : "+mt.kuk);
		System.out.println("영어 : "+mt.eng);
		System.out.println("총점 : "+mt.tot);
		System.out.println("평균 : "+mt.avg);
		
	}

}
