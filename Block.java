package chapter10;

public class Block {
	String block = "바람의 전설";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String block = "트로이";
		System.out.println("Movie : "+block);
		
		int i = 0;
		{ //block in
			String block2 = "달콤한 인생";
			System.out.println("Movie : "+block2);
			
			System.out.println("j = ");
			for(int j=0; j<5; j++) {
				System.out.print(j);
			}
			System.out.println("\ni = ");
			for(i=0; i<5; i++) {
				System.out.print(i);
			}
			System.out.println();
		}//block out
		
	}//main
}//class
