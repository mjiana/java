package chapter12;

class OverA{
	void show(String str) {
		System.out.println("상위클래스 메소드 show(str) : "+str);
	}
}
class SubOverA extends OverA{
	void show() { //상위클래스와 인자가 다르기에 오버로딩 취급
		System.out.println("하위클래스 메소드 show()");
	}
}

public class OverrideExam {
	public static void main(String[] args) {
		// 오버로딩
		SubOverA s = new SubOverA();
		s.show("AaAaAa");
		s.show();
	}

}
