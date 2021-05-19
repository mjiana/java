package chapter06;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[8]; //밑으로 내려오는 행이 없기 때문에 열만 존재
		int [][] arr2 = new int[2][4];
		
		System.out.println("arr1배열의 열의 수 : "+arr1.length);
		System.out.println("arr배열의 행의 수 : "+arr2.length);
		System.out.println("arr배열의 1행의 열의 수 : "+arr2[0].length);
		System.out.println("arr배열의 2행의 열의 수 : "+arr2[1].length+"\n");
		System.out.println("----행열 표시------");
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				if( j == 0) System.out.print("arr2");
				System.out.print("["+i+"]["+j+"] ");
			}
			System.out.println();
		}
		System.out.println("----행열 바꾸기------");
		for(int i=0; i<arr2[0].length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if( j == 0) System.out.print("arr2");
				System.out.print("["+i+"]["+j+"] ");
			}
			System.out.println();
		}
	}

}
