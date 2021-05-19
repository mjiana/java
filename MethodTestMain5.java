package chapter08;

//컴포넌트 클래스와 메인클래스 분리
//메인클래스
public class MethodTestMain5 {

	public static void main(String[] args) {
		//컴포넌트 클래스(=부품)에 다 적혀있고 메인클래스에는 값을 넣고 호출만 하는 기능
		MethodTest5 mt = new MethodTest5("aa",91,84); //처리할 값 입력
		
		mt.calcTot();
		mt.calcAvg();
		mt.prn();
	}

}
