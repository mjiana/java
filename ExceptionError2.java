package chapter15;

public class ExceptionError2 {

	public static void main(String[] args) {
		//args[]매개변수 입력 방법
		//Run버튼 아래 삼각형-Run Confi---Argu---첫번째 탭(띄어쓰기로 값 구분)
		
		try {
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]); //
			int b = Integer.parseInt(args[1]); //args[1]

			System.out.println("a="+a+", b="+b);
			System.out.println("a/b= "+(a/b));
			System.out.println("나눗셈이 원활히 수행되었습니다");
		} catch (Exception e) {
			System.out.println("============================");
			System.out.println("[경고]예외발생 : "+e.toString());
		} finally {
			System.out.println("예외처리가 끝나고 final 블록을 실행합니다");
		}

		System.out.println("정상작동");
	}

}
