package chapter09;

class ScjpPass{
	int t1 = 0;
	int t2 =0;
	int t3 = 0;
	int t4 = 0;
	
	static int BONUS = 100;
	
	public ScjpPass() {
		
	}
	// 생성자 오버로딩 
	//동일 클래스 내에서 같은 이름의 함수를 인자의 개수와 형을 달리하면서 여러번 정의하여 여러 가지 일을 처리할 수 있다.
	public ScjpPass(int t1, int t2, int t3, int t4) {
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
	}
}
public class Scjp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ScjpPass.BONUS : "+ ScjpPass.BONUS);
		ScjpPass sp = new ScjpPass(85, 90, 80, 70);
		System.out.println("sp.t1 : "+ sp.t1);
	}

}
