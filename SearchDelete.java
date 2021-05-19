package chapter19;

import java.util.*;

public class SearchDelete {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"왕눈이","아로미","투투"};
		
		Vector v = new Vector();
		String s = "왕눈이";
		
		for(int i=0; i<name.length; i++) {
			v.addElement(name[i]);
		}
		
		if(v.contains(s)) {
			int i = v.indexOf(s);
			System.out.println(s+"는 "+(i+1)+"번째에 있습니다");
		} else {
			System.out.println("없습니다");
		}
		
		v.removeElementAt(0);
		
		System.out.println("==지우고 난 후==");
		for(int j=0; j<v.size(); j++) {
			s = (String)v.elementAt(j);
			System.out.println(j+"번째 요소는 "+s);
		}
		
	}

}
