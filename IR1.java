package chapter14;

//인터페이스 : 모든 메서드가 추상메서드로 구성하고, 변수는 상수의 형태로 존재한다.
//구현클래스 : 적용한 모든 메서드를 재정의
interface A{ //인터페이스
	void display(String s);
}
//상속(extends)이 아닌 적용(implements)이라고 표현하고 다중적용이 가능
//class대신 interface를 사용하고, 추상이지만 abstract키워드를 붙이지 않는다
class C1 implements A{ //구현클래스
	public void display(String s) {
		System.out.println("class 객체 C1 이용 "+s);
	}
}
class C2 implements A{ //구현클래스
	public void display(String s) {
		System.out.println("class 객체 C2 이용 "+s);
	}
}
class C3 implements A{ //구현클래스
	public void display(String s) {
		System.out.println("class 객체 C3 이용 "+s);
	}
	public int getInt() { //교안에 적혀있다고 다 사용되는건 아니다
		return 1000;
	}
}

public class IR1 {
	public static void main(String[] args) {
		//인터페이스클래스 인터페이스객체변수 = new 구현클래스생성자();
		A memo; //인터페이스 변수 선언
		memo = new C1();  //구현클래스 인스턴스 생성
		memo.display("북한산");
		
		memo = new C2();  //구현클래스 인스턴스 생성
		memo.display("수락산");
		
		memo = new C3();  //구현클래스 인스턴스 생성
		memo.display("도봉산");
		
	}

}
