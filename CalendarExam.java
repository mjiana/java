package chapter19;

import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] m = {"1��","2��","3��","4��","5��","6��","7��","8��","9��","10��","11��","12��"};
		
		Calendar c = Calendar.getInstance();
		System.out.print("��¥ : ");
		System.out.print(c.get(Calendar.YEAR)+"��");
		System.out.print(c.get(Calendar.MONTH)+"��");
		System.out.println(c.get(Calendar.DATE)+"��");
		
		System.out.print("�ð� : ");
		System.out.print(c.get(Calendar.HOUR)+"��");
		System.out.print(c.get(Calendar.MINUTE)+"��");
		System.out.println(c.get(Calendar.SECOND)+"��");
		
		c.set(Calendar.HOUR, 22);
		c.set(Calendar.MINUTE, 8);
		c.set(Calendar.SECOND, 2);
		
		System.out.print("������ �ð� : ");
		System.out.print(c.get(Calendar.HOUR)+"��");
		System.out.print(c.get(Calendar.MINUTE)+"��");
		System.out.println(c.get(Calendar.SECOND)+"��");
		
	}

}
