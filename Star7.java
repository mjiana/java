package chapter05_Star;

public class Star7 {
	public static void main(String[] args) {
		//�١�
		/*
		 *  �١١١١�
		     �١١١ڡ�
 		     �١١ڡڡ�
	 	      �١ڡڡڡ�
		      �ڡڡڡڡ�
		*/
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5; j++) {
				if(i<=j)
					System.out.print("��");
				else
					System.out.print("��");
			}
			System.out.println();
		}
	}
}
