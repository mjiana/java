package chapter13;

class TV3 { //암시적 호출(자동호출) //상속된 관계이기 때문
	public TV3() {
		System.out.println("TV3");
	}
}
class Movie3 extends TV3{
	String part = "";

	public Movie3() {} //기본생성자는 오버로딩 될 경우 자동 생성이 안되므로 주의
	public Movie3(String part) {
		this.part = part;
		System.out.println("Movie3");
	}

}
class Comedy3 extends Movie3{
	String name;
	String time;

	public Comedy3() {} //기본생성자는 오버로딩 될 경우 자동 생성이 안되므로 주의
	public Comedy3(String time, String name, String part) {
		//반드시 super를 우선 호출하고 난 다음 this를 호출하기
		//상위 영역이 있어야 그 영역을 확장시켜 하위 영역을 지정하기 때문
		super(part); // 명시적 호출
		this.time = time;
		this.name = name;
		System.out.println("Comedy3");
	}
}
public class MovieTest3 {
	public static void main(String[] args) {
		
		Comedy3 c = new Comedy3("11:00", "가문의영광", "한국영화");
		System.out.println(c.time);
		System.out.println(c.name);
		System.out.println(c.part);
	}

}
