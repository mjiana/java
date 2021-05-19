package chapter05;

public class EvenSumTest {

	public static void main(String[] args) {
		// 누적을 위한 변수는 반복문 밖에 선언해야한다.
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) sum += i;
		}
		System.out.println("1부터 100까지의 짝수 합: " + sum);
		
		int sum2 = 0;
		for(int j=1; j<=100; j++) {
			if(j%2==1) sum2 += j; 
		}
		System.out.println("1부터 100까지의 홀수 합"+ sum2);
	}

}
