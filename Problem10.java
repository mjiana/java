package chapter20;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		//윤년 구하기
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.print("연도 입력 > ");
		year = s.nextInt();
		
		if( ((year%4==0) && (year%100!=0)) ||(year%400==0) )
			System.out.printf("%d년은 윤년입니다",year);
		else
			System.out.printf("%d년은 윤년이 아닙니다",year);
	}

}
