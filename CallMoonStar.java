package chapter17; //현재 클래스의 패키지 위치

//1. import한다(다른 클래스 참조할때 사용, 같은 패키지는 필요없다)
import a.b.c.*; //c패키지 밑에 있는 모든 클래스 참조, 동시에 여러클래스 참조할때 * 표시
import kr.co.mysite.beans.Star; 
//import a.*; //잘못된 참조
// *은 하위폴더를 제외한 하위 클래스를 말하는 것이다.

public class CallMoonStar {
	public static void main(String[] args) {
		//2. 인스턴스 생성
		Moon m = new Moon();
		Star s = new Star();
		//3. 메서드 호출
		System.out.println(m.shine());
		System.out.println(s.shine());
	}
}
