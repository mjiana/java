package chapter18;

public class StringConvert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("»õ Ãµ³â");
		
		System.out.println("s:"+s+"\tHashcode:"+s.hashCode());
		
		s.append("Korea");
		System.out.println("s:"+s+"\tHashcode:"+s.hashCode());
	}

}
