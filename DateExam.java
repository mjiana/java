package chapter19;

import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date cd = new Date();
		System.out.println("���� �ý��� ��¥�� "+cd+"�Դϴ�.");
		
		Date mb = new Date(81,0,20);
		System.out.println("my bitrhday : "+mb);
		
		System.out.println("���� ���� �ڷ�");
		System.out.println("��¥"+cd.getDate());
		System.out.println("����"+cd.getYear());
		System.out.println("��"+cd.getMonth()+1);
		System.out.println("����"+cd.getDay());
		
		System.out.println("��¥"+cd.toLocaleString());
	}

}
