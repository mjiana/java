package chapter06;

public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[10];
		int i;
		
		c[0] = 'S';
		c[1] = 'N';
		c[2] = 'O';
		c[3] = 'W';
		c[4] = '��';
		
		System.out.println("�迭�� ���� : "+ c.length);
		
		for(i=0; i<c.length; i++) {
			if(c[i] != 0) { //�ƽ�Ű�ڵ� null == 0
				System.out.print(".");
				System.out.print(c[i]);
			}
		}
		System.out.println();
		c[4] = '��';
		for(i=0; i<c.length; i++) {
			if(c[i] != 32) { //�ƽ�Ű�ڵ� ���鹮�� == 32
				System.out.print(".");
				System.out.print(c[i]);
			}
		}
				
	}

}
