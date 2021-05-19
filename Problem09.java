package chapter20;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {
		//동전 교환 금액 구하기
		Scanner s = new Scanner(System.in);
		int money, c500, c100, c50, c10;
		
		System.out.print("교환금액 > ");
		money = s.nextInt();
		
		c500 = money/500;
		money = money%500;
		c100 = money/100;
		money = money%100;
		c50 = money/50;
		money = money%50;
		c10 = money/10;
		money = money%10;
		
		System.out.printf("500원  - %d개",c500);
		System.out.printf("\n100원  - %d개",c100);
		System.out.printf("\n50원  - %d개",c50);
		System.out.printf("\n10원  - %d개",c10);
		System.out.printf("\n잔여금  - %d원",money);
		
	}

}
