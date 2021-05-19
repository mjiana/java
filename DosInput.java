package chapter06;

import java.text.DecimalFormat; //10진수의 포맷

public class DosInput {

	public static void main(String[] args) {
		// args입력받은 값으로 출력하기
		// run버튼 하단 Run Configurations-Arguments탭
		// (주의)창의 클래스 명이 현재 클래스명과 다를 수 있음! 필수 확인!
		// program arguments에 값 입력(띄어쓰기로 구분)
		// apply 클릭 후 run하면 자동으로 창이 닫기고 콘솔창 출력
		DecimalFormat comma = new DecimalFormat("###,##0"); //#=빈자리 안채움 0=빈자리를 0으로 채움
		String cs1;
		String cs2;
		
		String s1 = args[0];
		int i1 = Integer.parseInt(args[1]);
		cs1 = comma.format(i1);
		int i2 = Integer.parseInt(args[2]);
		cs2 = comma.format(i2);
		
		System.out.println("args.length"+args.length);
		System.out.println("성명 : "+ s1);
		System.out.println("급여 : "+ cs1);
		System.out.println("세금 : "+ cs2);
		System.out.println("실 수령액 : "+comma.format(i1-i2));
	}

}
