package chapter14;

//추상 클래스 : 추상메서드를 포함하는 클래스
//추상메서드 : 선언만 있고 내용이 없는 메서드
abstract class Sum{ //추상 클래스
	//추상클래스와 메서드에는 접근제한자 다음에 abstract키워드를 붙인다.
	public abstract String hello(); //추상메서드
	//추상메서드는 원형이 존재하고 { }이 없다. 크기를 모르니 객체의 영역 할당이 불가능하다.
	//추상클래스는 대부분 기준만 정의하고 구현내용은 하위클래스에서 정의하지만
	//모든 멤버가 추상일 필요는 없다.
	public String sum(int i, int k) {
		int sum = i+k;
		return " "+sum;
	}
}
//콘크리트 클래스는 추상클래스를 상속 받고, 추상메서드를 전부 다 오버라이딩 해서 사용한다
class Sum1 extends Sum{ //콘크리트 클래스
	public String hello() { //추상메서드의 오버라이딩
		return "class Sum1 extends Sum";
	}
}
class Sum2 extends Sum{ //콘크리트 클래스
	public String hello() { //추상메서드의 오버라이딩
		return "class Sum2 extends Sum";
	}
}

public class SumMain {
	public static void main(String[] args) {
		//콘크리트 클래스는 아래의 공식을 주로 사용한다.
		//콘크리트 클래스 콘크리트객체변수 = new 콘크리트생성자();
		Sum1 s1 = new Sum1();
		System.out.println(s1.sum(10, 20));
		System.out.println(s1.hello());
		
		Sum2 s2 = new Sum2();
		System.out.println(s2.sum(20, 30));
		System.out.println(s2.hello());
	}

}
