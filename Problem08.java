package chapter20;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args){
		//두개의 입력값에 대한 사칙연산
		Scanner s = new Scanner(System.in);
		float a,b;
		float result;
		
		System.out.print("첫번째 입력 값 : ");
		a = s.nextFloat();
		System.out.print("두번째 입력 값 : ");
		b = s.nextFloat();
		
		result = a+b;
		System.out.printf("%5.2f + %5.2f = %5.2f \n", a, b, result);
		result = a-b;
		System.out.printf("%5.2f - %5.2f = %5.2f \n", a, b, result);
		result = a*b;
		System.out.printf("%5.2f * %5.2f = %5.2f \n", a, b, result);
		result = a/b;
		System.out.printf("%5.2f / %5.2f = %5.2f \n", a, b, result);
		result = (int) a % (int)b;
		System.out.printf("%d %% %d = %d \n", (int)a, (int)b, (int)result);
	}

}
