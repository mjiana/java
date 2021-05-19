package chapter05;

public class DoWhileTest {

	public static void main(String[] args) {
		// 조건이 거짓이여도 최초 1회는 실행된다
		int j = 1; // 초기값부터 조건에 위배되지만 1회는 실행
		
		do {
			System.out.println("num: "+j);
			j++;
			if(j==5) break;
		} while(j<0);
		
		System.out.println("END");
		System.out.println("j = "+ j);
	}

}
