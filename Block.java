package chapter10;

public class Block {
	String block = "�ٶ��� ����";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String block = "Ʈ����";
		System.out.println("Movie : "+block);
		
		int i = 0;
		{ //block in
			String block2 = "������ �λ�";
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
