package chapter06;

public class ArrayHap {

	public static void main(String[] args) {
		// 배열변수 합구하기
		int[] su = {1,2,3,4,5,6,7,8,9,10}; //변수 선언+메모리 할당+값 초기화 동시 실행
		int i, hap = 0;
		
		//System.out.println(i);
		for(i=0; i<10; i++) {
			hap += su[i];
		}
		System.out.println("1부터 10까지의 합 = "+hap);
		System.out.println(i);
	}

}
