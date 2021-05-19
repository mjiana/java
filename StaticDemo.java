package chapter09;
//처리클래스
class Box{
	int cnt = 0; //객체가 생성될때 마다 초기화 된다.
	static long boxID = 0; // static 변수는 초기화 되지 않고 누적된다.

	public Box() {
		cnt++;   // 결과 :  1 1 1 1
		boxID++; // 결과 :  1 2 3 4
		System.out.println("cnt = "+cnt);
		System.out.println("boxID = "+boxID);
	}
}
//이용클래스
public class StaticDemo {
	public static void main(String[] args) {
		//기본생성자 호출
		//메인 함수에서 사용되지 않는 변수는 의미가 없기에 객체만 생성하고 변수 생략 가능
		new Box();
		new Box();
		new Box();
		new Box();
		
		/* 호출되지 않을 거라면 굳이 변수를 만들 필요 없음
		Box mb1 = new Box();
		Box mb2 = new Box();
		Box mb3 = new Box();
		Box mb4 = new Box();
		*/
		
	}
}
