package chapter19;

import java.util.*;

public class SearchDelete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"�մ���","�Ʒι�","����"};
		
		Vector v = new Vector();
		String s = "�մ���";
		
		for(int i=0; i<name.length; i++) {
			v.addElement(name[i]);
		}
		
		if(v.contains(s)) {
			int i = v.indexOf(s);
			System.out.println(s+"�� "+(i+1)+"��°�� �ֽ��ϴ�");
		} else {
			System.out.println("�����ϴ�");
		}
		
		v.removeElementAt(0);
		
		System.out.println("==����� �� ��==");
		for(int j=0; j<v.size(); j++) {
			s = (String)v.elementAt(j);
			System.out.println(j+"��° ��Ҵ� "+s);
		}
		
	}

}
