package chapter19;

import java.util.StringTokenizer;

public class ShowParse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("������,�մ���,�Ʒι�,����",",");
		
		System.out.println("�Ļ��� ���ڿ��� ���� �� "+st.countTokens()+"�� �Դϴ�.");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
