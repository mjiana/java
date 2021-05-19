package chapter09;

class MethodTest{
	int kuk = 0;
	int eng = 0;
	int tot = 0;
	float avg = 0.0f;
	
	public MethodTest() { //기본생성자
	}

	public int getTot() { // getter 호출한 곳으로 멤버변수를 return하는 역할
		return tot; //getter로 값을 가져오면 원본의 값을 보호할 수 있다.
	}	

	public float getAvg() {
		return avg;
	}
	
	public void setKuk(int k) { //setter 인자를 받아서 멤버변수를 초기화 하는 역할
		this.kuk = k; // 1클래스 1생성자이므로 생성자에 입력된 값을 바꿀 때 setter 사용 
	}
	public void setEng(int e) {
		this.eng = e;
	}
	
	public void calcTot() {
		tot = kuk + eng;
	}
	
	public void calcAvg() {
		avg = tot/2.0f;
	}
	
	public void prn() {
		System.out.println("국어 : "+kuk);
		System.out.println("영어 : "+eng);
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
	}
}
public class MethodTestMain9 {
	public static void main(String[] args) {
		// 기본생성자
		//따로 적지 않아도 기본생성자는 인스턴스화를 할때  자동으로 생성되어 호출된다
		MethodTest mt = new MethodTest(); 
		
		mt.setKuk(95);
		mt.setEng(80);
		
		mt.calcTot();
		mt.calcAvg(); 
		
		System.out.println("총점 : "+mt.getTot());
		System.out.println("평균 : "+mt.getAvg());
	}

}
