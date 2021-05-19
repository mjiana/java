package chapter03;

public class Proportion {

	public static void main(String[] args) {
		// 연산 후 대입연산자
		int i =12;
		int j = 27;
		
		System.out.println("i = "+i + ", j = "+j);
		
		i += j;
		System.out.println("i+=j = "+ i);
		i -= j;
		System.out.println("i-=j = "+ i);
		i *= j;
		System.out.println("i*=j = "+ i);
		i /= j;
		System.out.println("i/=j = "+ i);
		i %= j;
		System.out.println("i%=j = "+ i);
	}

}
