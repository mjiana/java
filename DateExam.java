package chapter19;

import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date cd = new Date();
		System.out.println("현재 시스템 날짜는 "+cd+"입니다.");
		
		Date mb = new Date(81,0,20);
		System.out.println("my bitrhday : "+mb);
		
		System.out.println("오늘 기준 자료");
		System.out.println("날짜"+cd.getDate());
		System.out.println("연도"+cd.getYear());
		System.out.println("월"+cd.getMonth()+1);
		System.out.println("요일"+cd.getDay());
		
		System.out.println("날짜"+cd.toLocaleString());
	}

}
