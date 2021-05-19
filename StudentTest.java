package chapter14;

//인터페이스 : 모든 메서드가 추상메서드로 구성하고, 변수는 상수의 형태로 존재한다.
//구현클래스 : 적용한 모든 메서드를 재정의
interface Student{ //인터페이스
	public void setName(String n);
	public String getName();
	public void setRank(int r);
	public int getRank();
}

//상속(extends)이 아닌 적용(implements)이라고 표현하고 다중적용이 가능
//class대신 interface를 사용하고, 추상이지만 abstract키워드를 붙이지 않는다
class StudentCon implements Student{ //구현클래스
	String name;
	int rank;
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return name;
	}
	public void setRank(int r) {
		this.rank = r;
	}
	public int getRank() {
		return rank;
	}
	public String prnName() { //교안에 적혀있다고 다 사용되는건 아니다
		String s;
		s="☆☆☆";
		s+=name;
		s="☆☆☆";
		return s;
	}
}
public class StudentTest {
	public static void main(String[] args) {
		//인터페이스클래스 인터페이스객체변수 = new 구현클래스생성자();
		Student s = new StudentCon();
		s.setName("아무개");
		System.out.println("name : "+s.getName());
		s.setRank(10);
		System.out.println("rank : "+s.getRank());
		
		//prnName은 구현클래스에만 있는 순수 확장메서드이므로 새로 객체생성을 해야 한다
		StudentCon sc = new StudentCon();
		System.out.println("name : "+sc.prnName());
	}

}
