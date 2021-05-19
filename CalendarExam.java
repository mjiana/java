package chapter19;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] m = {"1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"};
		
		Calendar c = Calendar.getInstance();
		System.out.print("날짜 : ");
		System.out.print(c.get(Calendar.YEAR)+"년");
		System.out.print(c.get(Calendar.MONTH)+"월");
		System.out.println(c.get(Calendar.DATE)+"일");
		
		System.out.print("시간 : ");
		System.out.print(c.get(Calendar.HOUR)+"시");
		System.out.print(c.get(Calendar.MINUTE)+"분");
		System.out.println(c.get(Calendar.SECOND)+"초");
		
		c.set(Calendar.HOUR, 22);
		c.set(Calendar.MINUTE, 8);
		c.set(Calendar.SECOND, 2);
		
		System.out.print("수정된 시간 : ");
		System.out.print(c.get(Calendar.HOUR)+"시");
		System.out.print(c.get(Calendar.MINUTE)+"분");
		System.out.println(c.get(Calendar.SECOND)+"초");
		
	}

}
