package chapter11;

class PrivateTest{
	public int kuk = 0;
	public int eng = 0;
	public int sum = 0;
	// private메서드는 보안을 중요시할때 사용
	private void sum() {
		sum = kuk+eng;
		if(sum>200) {
			System.out.println("점수가 200점을 초과했습니다.");
			sum = 0;
		}else {
			System.out.println("정상처리되었습니다.");
		}
	}
	// private메서드를 부르는 방법
	public void call_sum() {
		sum();
	}
	public int getKuk() {
		return kuk;
	}
	public void setKuk(int kuk) {
		this.kuk = kuk;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}

public class PrivateTestMain {
	public static void main(String[] args) {
		
		PrivateTest p = new PrivateTest();
		
		p.setKuk(90);//p.kuk = 90;
		p.setEng(90);//p.eng = 80;
		p.call_sum();
		System.out.println("sum = "+p.sum);
	}

}
