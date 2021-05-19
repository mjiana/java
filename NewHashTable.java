package chapter19;

import java.util.*;

public class NewHashTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable h;
		h = new Hashtable();
		
		h.put("one", "°³±¸¸®");
		h.put("two", "¿Õ´«ÀÌ");
		h.put("three", "¾Æ·Î¹Ì");
		
		String s = (String)h.get("two");
		
		if(s == null)
			System.out.println("two = "+s);
		else
			System.out.println(s);
	}

}
