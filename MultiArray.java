package chapter06;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[8]; //������ �������� ���� ���� ������ ���� ����
		int [][] arr2 = new int[2][4];
		
		System.out.println("arr1�迭�� ���� �� : "+arr1.length);
		System.out.println("arr�迭�� ���� �� : "+arr2.length);
		System.out.println("arr�迭�� 1���� ���� �� : "+arr2[0].length);
		System.out.println("arr�迭�� 2���� ���� �� : "+arr2[1].length+"\n");
		System.out.println("----�࿭ ǥ��------");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				if( j == 0) System.out.print("arr2");
				System.out.print("["+i+"]["+j+"] ");
			}
			System.out.println();
		}
		System.out.println("----�࿭ �ٲٱ�------");
		for(int i=0; i<arr2[0].length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if( j == 0) System.out.print("arr2");
				System.out.print("["+i+"]["+j+"] ");
			}
			System.out.println();
		}
	}

}
