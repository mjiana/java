package chapter20;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		// Scanner사용법
		Scanner s = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("나이 입력 > ");
		//age = s.nextInt(); //엔터 무시, 취급안함 //반복적으로 정수값만 입력할 때 유용
		age = Integer.parseInt(s.nextLine());//엔터 읽음
		//전부 다 문자열로 취급해서 사용하는 것이 편리하다.
		
		System.out.print("이름 입력 > ");
		name = s.nextLine(); //엔터 읽음
		
		System.out.printf("당신의 나이는 %d입니다.%n",age);
		System.out.printf("당신의 이름은 %s입니다. %n", name);
	}
}
