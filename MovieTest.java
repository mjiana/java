package chapter13;

class TV { //암시적 호출(자동호출) //상속된 관계이기 때문
	public TV() {
		System.out.println("TV");
	}
}
class Movie extends TV{
	String part = "";
	
	public Movie() {} //기본생성자는 오버로딩 될 경우 자동 생성이 안되므로 주의
	public Movie(String part) {
		this.part = part; 
		System.out.println("Movie");
	}
	
}
class Comedy extends Movie{
	String time;
	String name;
	
	public Comedy() {} //기본생성자는 오버로딩 될 경우 자동 생성이 안되므로 주의
	public Comedy(String time, String name, String part) {
		//반드시 super를 우선 호출하고 난 다음 this를 호출하기
		//상위 영역이 있어야 그 영역을 확장시켜 하위 영역을 지정하기 때문
		super(part); // 명시적 호출
		this.time = time;
		this.name = name;
		System.out.println("Comedy");
	}
}
public class MovieTest {
	public static void main(String[] args) {
		
		Comedy c = new Comedy("21:00","가문의영광2","한국영화");
		System.out.println(c.time);
		System.out.println(c.name);
		System.out.println(c.part);
		
		Comedy c2 = new Comedy();
		c2.time = "17:00";
		c2.name = "가문의영광";
		c2.part = "한국영화";
		System.out.println(c2.time);
		System.out.println(c2.name);
		System.out.println(c2.part);
	}

}
