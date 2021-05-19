package chapter13;

class TV4 { //연결된 객체들이 없기에 단독 클래스
	public TV4() {
		System.out.println("TV4");
	}
}
class Movie4{  //TV4와 상속관계 아님
	String part = "";

	public Movie4() {} //기본생성자는 오버로딩 될 경우 자동 생성이 안되므로 주의
	public Movie4(String part) {
		this.part = part;
		System.out.println("Movie4");
	}

}
class Comedy4 extends Movie4{
	String name ="";
	String time = "상영예정없음";

	public Comedy4() {} //기본생성자는 오버로딩 될 경우 자동 생성이 안되므로 주의
	public Comedy4(String time, String name, String part) {
		//반드시 super를 우선 호출하고 난 다음 this를 호출하기
		//상위 영역이 있어야 그 영역을 확장시켜 하위 영역을 지정하기 때문
		super(part); // 명시적 호출
		this.time = time;
		this.name = name;
		System.out.println("Comedy4");
	}
}
public class MovieTest4 {
	public static void main(String[] args) {
		
		Comedy4 c = new Comedy4("11:00", "가문의영광", "한국영화");
		System.out.println("====================================");
		System.out.println(c.time);
		System.out.println(c.name);
		System.out.println(c.part);
		System.out.println("====================================");
		Comedy4 c3 = new Comedy4();
		//c3.name = "가문의영광2";
		System.out.println(c3.time);
		System.out.println(c3.name);
		System.out.println(c3.part);
		
	}

}
