package chapter05_Star;

public class Star7 {
	public static void main(String[] args) {
		//¡Ù¡Ú
		/*
		 *  ¡Ù¡Ù¡Ù¡Ù¡Ú
		     ¡Ù¡Ù¡Ù¡Ú¡Ú
 		     ¡Ù¡Ù¡Ú¡Ú¡Ú
	 	      ¡Ù¡Ú¡Ú¡Ú¡Ú
		      ¡Ú¡Ú¡Ú¡Ú¡Ú
		*/
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=5; j++) {
				if(i<=j)
					System.out.print("¡Ú");
				else
					System.out.print("¡Ù");
			}
			System.out.println();
		}
	}
}
