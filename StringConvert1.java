package chapter18;

public class StringConvert1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="새 천년";
		String s2 = "대한 민국";
		
		System.out.println("s1:"+s1+"\tHashcode:"+s1.hashCode());
		System.out.println("s2:"+s2+"\tHashcode:"+s2.hashCode());
		
		s1 += s2;
		System.out.println("s1 += s2");
		System.out.println("s1:"+s1+"\tHashcode:"+s1.hashCode());
		System.out.println("s2:"+s2+"\tHashcode:"+s2.hashCode());
	}

}
