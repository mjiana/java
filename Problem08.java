package chapter20;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args){
		//�ΰ��� �Է°��� ���� ��Ģ����
		Scanner s = new Scanner(System.in);
		float a,b;
		float result;
		
		System.out.print("ù��° �Է� �� : ");
		a = s.nextFloat();
		System.out.print("�ι�° �Է� �� : ");
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
