package chapter12;

class OverC{
	int show(int a) { //오버라이딩 시 원형(반환형, 함수명, 인자)을 변경할 수 없다.
		return a;
	}
}
class SubOverC extends OverC{
	//오버라이딩 시 원형의 반환형을 변경할 수 없다.
	int show(int a) { // 오버라이딩
		return a*10; //내용만 변경된다
	}
}

public class OverrideExam3 {
	public static void main(String[] args) {
		
		OverC c = new OverC();
		int i = c.show(10);
		
		SubOverC sc = new SubOverC();
		float j = sc.show(10); //오토캐스팅 int값을 float에 넣는 것이기에 가능
		
		System.out.println("i="+i);
		System.out.println("j="+j);
	}

}
