package chapter15;

public class ExceptionError1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Run버튼 아래 삼각형-Run Confi---Argu---첫번째 탭(띄어쓰기로 값 구분)
			System.out.println("매개변수로 받은 두 개의 값");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a="+a+", b="+b);
			System.out.println("a/b= "+(a/b));
			System.out.println("나눗셈이 원활히 수행되었습니다");
		}catch (ArithmeticException e) {
			System.out.println("============================");
			System.out.println("ArithmeticException 예외발생");
			System.out.println(e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("============================");
			System.out.println("ArrayIndexOutOfBoundsException 예외발생");
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println("============================");
			System.out.println("NumberFormatException 예외발생");
			System.out.println(e);
		}catch (Exception e) {
			System.out.println("============================");
			System.out.println("Exception 예외발생");
			System.out.println("알 수 없는 문제가 발생되었습니다.");
		} finally {
			System.out.println("============================");
			System.out.println("예외처리가 끝나고 final 블록을 실행합니다");
		}
		System.out.println("정상작동");

	}

}
