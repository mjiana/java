package chapter20;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		//���� ���ϱ�
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.print("���� �Է� > ");
		year = s.nextInt();
		
		if( ((year%4==0) && (year%100!=0)) ||(year%400==0) )
			System.out.printf("%d���� �����Դϴ�",year);
		else
			System.out.printf("%d���� ������ �ƴմϴ�",year);
	}

}
