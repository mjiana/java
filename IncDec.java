package chapter03;

public class IncDec {

	public static void main(String[] args) {
		// 증가연산자, 감소연산자
		int x = 1;
		int y = x++; //후위연산자
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		x = 1;
		int z = ++x; //전위연산자
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
		x = 1;
		x++;
		z = x;
		System.out.println("x = " + x);
		System.out.println("z = " + z);
		
	}

}
