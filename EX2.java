package chapter15;

public class EX2 {
	public static void main(String[] args) {
		//args[]매개변수 입력 방법
		//Run버튼 아래 삼각형-Run Confi---Argu---첫번째 탭(띄어쓰기로 값 구분)
		System.out.println("매개변수로 받은 두 개의 값");
		int a = Integer.parseInt("10"); //args[0]
		int b = Integer.parseInt("2"); //args[1]
		
		System.out.println("a="+a+", b="+b);
		
		try {
			System.out.println("a/b= "+(a/b));
		} catch (Exception e) {
			System.out.println("[경고]예외발생 : "+e.toString());
		} finally {
			System.out.println("나눗셈연산이 종료되었습니다");
		}
		
		System.out.println("남은 루틴을 실행합니다");
	}

}
