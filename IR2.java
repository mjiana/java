package chapter14;

//인터페이스 : 모든 메서드가 추상메서드로 구성하고, 변수는 상수의 형태로 존재한다.
//구현클래스 : 적용한 모든 메서드를 재정의
interface B{ //인터페이스
	void display(String s);
}
//상속(extends)이 아닌 적용(implements)이라고 표현하고 다중적용이 가능
//class대신 interface를 사용하고, 추상이지만 abstract키워드를 붙이지 않는다
class D1 implements B{
	String str;
	public void display(String s) {
		str = s;
		System.out.println("class D1 : "+s);
	}
}
class D2 implements B{
	String str;
	public void display(String s) {
		str = s;
		System.out.println("class D2 : "+s);
	}
}

public class IR2 {
	public static void main(String[] args) {
		//인터페이스클래스 인터페이스객체변수 = new 구현클래스생성자();
		B memo; //인터페이스 변수 선언
		memo = new D1();  //구현클래스 인스턴스 생성
		memo.display("석모도");
		
		D1 d1 = (D1)memo;
		System.out.println(d1.str);
		
		memo = new D2();  //구현클래스 인스턴스 생성
		memo.display("강화도");
		
		D2 d2 = (D2)memo;
		System.out.println(d2.str);
	}

}
