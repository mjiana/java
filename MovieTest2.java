package chapter13;

class TV2 { //암시적 호출(자동호출) //상속된 관계이기 때문
	public TV2() {
		System.out.println("TV2");
	}
}
class Movie2 extends TV2{
	String part = "한국영화";
	
	public Movie2() {} //기본생성자는 오버로딩 될 경우 자동 생성이 안되므로 주의
	public Movie2(String part) {
		this.part = part;
		System.out.println("Movie2");
	}
	
}
class Action2 extends Movie2{
	String name;
	
	public Action2() {
		System.out.println("Action2");
	}
}
public class MovieTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action2 a = new Action2();
		a.name = "도둑들";
		System.out.println(a.name);
		
	}

}
