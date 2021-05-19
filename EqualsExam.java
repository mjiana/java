package chapter18;

public class EqualsExam {
	public static void main(String[] args) {
		//String 클래스는 영역에 상관없이 같은 문자열(상수)을 가지면 해쉬코드가 동일하다.
		// 문자열을 비교할 때 == 대신 순수 문자열을 비교하는 equals() 메서드를 사용
		String a1 = "STUDY JAVA";
		String a2 = "Apple";
		String a3 = "APPLE";
		
		System.out.println("a1 : "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("a3 : "+a3);
		System.out.println("a2.equals(a3) : "+a2.equals(a3));
		//equalsIgnoreCase : 대소문자 무시
		System.out.println("a2.equalsIgnoreCase(a3) : "+a2.equalsIgnoreCase(a3));
	
		if(a2 == "Apple") System.out.println("a2 == Apple");
		
		String obj = new String("왕눈이");
		if(obj == "왕눈이") System.out.println("obj == 왕눈이");
		else System.out.println("obj는 왕눈이가 아닙니다");
		
		String obj2 = new String("왕눈이");
		if(obj2.equals("왕눈이")) System.out.println("obj2.equals(왕눈이)");
	
	}

}
