package chapter05;

public class WhileTest {

	public static void main(String[] args) {
		// ó������ ���������� ��� ������� �ʴ´�.
		int j = -5;
		
		while(j<0) { // 0���� ��������
			System.out.println("j= "+j);
			j++;
			if(j==-3) break;
			
		}
		System.out.println("END");
		System.out.println("final j = "+ j);
	}

}
