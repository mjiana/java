package chapter05;

public class BreakTest {

	public static void main(String[] args) {
		// break는 하나의 블럭만 빠져나온다.
		for(int i =0 ; i<=2; i++) {
			for(int j = 2; j>=0; j--) {
				if(i==j) break;
				System.out.println("i=="+i + ", j==" + j);
			}
		}

	}

}
