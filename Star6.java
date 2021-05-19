package chapter05_Star;

public class Star6 {

	public static void main(String[] args) {
		/*이중반복문, 조건문, ☆가능
		  ★★★★★         1 12345                 
                          ☆★★★★         2          2345
                           ☆☆★★★        3            345
                           ☆☆☆★★        4              45
                           ☆☆☆☆★        5                5
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("★");
				}else {
					System.out.print("☆");
				}
			}
			System.out.println();
		}
	}

}
