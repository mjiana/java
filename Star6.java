package chapter05_Star;

public class Star6 {

	public static void main(String[] args) {
		/*���߹ݺ���, ���ǹ�, �ٰ���
		  �ڡڡڡڡ�         1 12345                 
                          �١ڡڡڡ�         2          2345
                           �١١ڡڡ�        3            345
                           �١١١ڡ�        4              45
                           �١١١١�        5                5
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("��");
				}else {
					System.out.print("��");
				}
			}
			System.out.println();
		}
	}

}
