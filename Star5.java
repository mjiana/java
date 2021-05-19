package chapter05_Star;

public class Star5 {

	public static void main(String[] args) {
		/* 이중반복문, 안쪽범위 가변
		  ★★★★★
		  ★★★★
		  ★★★
		  ★★
		  ★
		 */
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
