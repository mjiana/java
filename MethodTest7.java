package chapter08;

public class MethodTest7 {

	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;

	public MethodTest7(int k, int e) {
		this.kuk = k;
		this.eng = e;
	}

	public int getTot() { // getter 호출한 곳으로 멤버변수를 return하는 역할
		return tot; //getter로 값을 가져오면 원본의 값을 보호할 수 있다.
	}	

	public float getAvg() { // getter
		return avg;
	}
	
	public void setKuk(int k) { //setter 인자를 받아서 멤버변수를 초기화 하는 역할
		this.kuk = k; // 1클래스 1생성자이므로 생성자에 입력된 값을 바꿀 때 setter 사용 
	}
	public void setEng(int e) { //setter
		this.eng = e;
	}
	
	public void calcTot() {
		tot = kuk + eng;
	}
	
	public void calcAvg() {
		avg = tot/2.0f;
	}
	
	public void prn() {
		//System.out.println("이름 : "+name);
		System.out.println("국어 : "+kuk);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
	}
}
