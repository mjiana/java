package chapter12;

class OverB{
	void show() {  //오버라이딩 = 상위클래스 메소드 재정의
		System.out.println("상위클래스 메소드 show()");
	}
}
class SubOverB extends OverB{
	void show() { // 상위클래스의 원형(반환형, 함수명, 인자) 유지, 내용만 변경
		System.out.println("하위클래스 메소드 show()");
	}
}

public class OverrideExam2 {
	public static void main(String[] args) {
		//오버라이딩
		OverB b = new OverB();
		b.show();
		
		SubOverB sb = new SubOverB();
		sb.show();

	}

}
