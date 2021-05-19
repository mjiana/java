package chapter19;

import java.util.Vector;

public class SizeVector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"왕눈이","아로미","투투"};
		
		Vector v = new Vector();
		
		for(int i=0; i<name.length; i++) {
			v.addElement(name[i]);
		}
		
		System.out.println("초기 엘리먼트 수 : "+v.size());
		System.out.println("초기 벡터 크기 : "+v.capacity());
		v.trimToSize();
		System.out.println("trimToSize 후 엘리먼트 수 : "+v.size());
		System.out.println("trimToSize 후 벡터 크기 : "+v.capacity());
		v.addElement("관악산");
		System.out.println("엘리먼트 수 : "+v.size());
		System.out.println("벡터 크기 : "+v.capacity());
	}

}
