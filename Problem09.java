package chapter20;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {
		//���� ��ȯ �ݾ� ���ϱ�
		Scanner s = new Scanner(System.in);
		int money, c500, c100, c50, c10;
		
		System.out.print("��ȯ�ݾ� > ");
		money = s.nextInt();
		
		c500 = money/500;
		money = money%500;
		c100 = money/100;
		money = money%100;
		c50 = money/50;
		money = money%50;
		c10 = money/10;
		money = money%10;
		
		System.out.printf("500��  - %d��",c500);
		System.out.printf("\n100��  - %d��",c100);
		System.out.printf("\n50��  - %d��",c50);
		System.out.printf("\n10��  - %d��",c10);
		System.out.printf("\n�ܿ���  - %d��",money);
		
	}

}
