package chapter19;

import java.util.Vector;

public class SizeVector {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"�մ���","�Ʒι�","����"};
		
		Vector v = new Vector();
		
		for(int i=0; i<name.length; i++) {
			v.addElement(name[i]);
		}
		
		System.out.println("�ʱ� ������Ʈ �� : "+v.size());
		System.out.println("�ʱ� ���� ũ�� : "+v.capacity());
		v.trimToSize();
		System.out.println("trimToSize �� ������Ʈ �� : "+v.size());
		System.out.println("trimToSize �� ���� ũ�� : "+v.capacity());
		v.addElement("���ǻ�");
		System.out.println("������Ʈ �� : "+v.size());
		System.out.println("���� ũ�� : "+v.capacity());
	}

}
