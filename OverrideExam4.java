package chapter12;

class OverD{
	void show(int k) {
		System.out.println("OverD show(): "+ k*10 );
	}
	void prn(int i) {
		System.out.println("OverD prn(int): "+i);
	}
}
//하위객체는 상위객체를 상속받아 상위객체를 포함하고 있기 때문에 범위가 더 넓다.
class SubOverD extends OverD{
	void show(int i) { //오버라이딩
		System.out.println("SubOverD show(): "+i*1000);
	}
	void prn(String s) { //하위객체 입장에서는 오버로딩
		System.out.println("SubOverD prn(String): "+s);
	}
	void scr() { //하위클래스의 순수 확장(추가) 메서드
		System.out.println("scr():");
	}
}

public class OverrideExam4 {
	public static void main(String[] args) {
		//
		OverD od = new SubOverD();
		od.show(1); // SubOverD의 show()값 응답 <=== 다형성
		od.prn(1);
		
		//하위객체는 상속받은 상위멤버를 호출할 수 있지만, 상위객체는 하위멤버를 호출할 수 없다.
		//od.prn("111"); //오류 발생
				
		//new로 새로운 객체를 생성해버리므로 전혀 다른 객체가 되어버린다.
		//SubOverD sod = new SubOverD();
		
		//상위객체가 사용할 수 없는 하위의 멤버를 호출하기 위해 객체 형변환을 사용
		SubOverD sod = (SubOverD) od; //객체 형변환
		sod.show(2);
		sod.prn("aaa");
		sod.prn(2);
		sod.scr();
		
	}

}
