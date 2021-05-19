package chapter05;

public class WhileTest {

	public static void main(String[] args) {
		// 처음부터 거짓조건일 경우 실행되지 않는다.
		int j = -5;
		
		while(j<0) { // 0보다 작을동안
			System.out.println("j= "+j);
			j++;
			if(j==-3) break;
			
		}
		System.out.println("END");
		System.out.println("final j = "+ j);
	}

}
