package chapter19;

import java.util.*;

class Sungjuk{
	String name;
	int kuk, eng;
	int tot, avg;
	
	public Sungjuk() {}
	public Sungjuk(String name, int kuk, int eng) {
		this.name = name;
		this.kuk = kuk;
		this.eng = eng;
		this.tot = kuk+eng;
		this.avg = tot/2;
	}
}

public class VectorTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Sungjuk s = null;
		Sungjuk s1 = new Sungjuk("ø’¥´¿Ã",100,80);
		Sungjuk s2 = new Sungjuk("æ∆∑ŒπÃ",80,100);
		Sungjuk s3 = new Sungjuk("≈ı≈ı",90,80);
		
		Vector v = new Vector();
		
		v.addElement(s1);
		v.addElement(s2);
		v.addElement(s3);
		
		for(i=0; i<v.size(); i++) {
			s = (Sungjuk)v.get(i);
			System.out.print(s.name+"\t");
			System.out.print(s.kuk+"\t");
			System.out.print(s.eng+"\t");
			System.out.print(s.tot+"\t");
			System.out.println(s.avg+"\t");
		}
	}

}
