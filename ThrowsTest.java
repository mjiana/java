package chapter15;

public class ThrowsTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0; //0인 경우 예외 발생
		
		ThrowTest t = new ThrowTest();
		
		try {
			//t.add(a, b);
			//t.sub(a, b);
			t.mul(a, b);
			//t.mul(a, b)의 catch문에서 throw e;가 적혀있지 않으면 
			//throws는 무시되어 메인함수의 catch가 동작하지않는다.
		} catch (Exception e) {
			System.out.println("메인클래스 catch 예외처리");
			System.out.println(e.toString());
		}
	}

}
