package chapter15;

public class ThrowTest {
	//1. throws만 있는 경우
	//호출한 쪽에 예외처리를 시킨다.
	public void add(int a, int b) throws Exception{
		if(b==0) throw new Exception("throws만 있으니 add() 네가 처리해");
		System.out.println(a+b);
	}
	//2. try-catch만 있는경우
	//스스로 예외를 처리한다
	public void sub(int a, int b) {
		try {
			if(b==0) throw new Exception();
			System.out.println(a-b);
		} catch (Exception e) {
			System.out.println("내가 try-catch니까 예외처리할게");
		}
	}
	//3. throw와 try catch가 같이 있는 경우 
	//try가 우선권을 갖고 throws는 무시된다.
	//둘다 처리하려면 catch 블록에서 throw를 설정하면 호출쪽에서도 예외를 던진다.
	public void mul(int a, int b) throws Exception{
		try {
			if(b==0) throw new Exception("mul() 예외발생");
			System.out.println(a-b);
		} catch (Exception e) {
			System.out.println("try 우선권 "+e.toString());
			//호출에도 예외를 던진다.
			throw e;
		}
	}

}
