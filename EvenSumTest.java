package chapter05;

public class EvenSumTest {

	public static void main(String[] args) {
		// ������ ���� ������ �ݺ��� �ۿ� �����ؾ��Ѵ�.
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) sum += i;
		}
		System.out.println("1���� 100������ ¦�� ��: " + sum);
		
		int sum2 = 0;
		for(int j=1; j<=100; j++) {
			if(j%2==1) sum2 += j; 
		}
		System.out.println("1���� 100������ Ȧ�� ��"+ sum2);
	}

}
