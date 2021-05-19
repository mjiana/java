package chapter18;

public class ComepareTo {
	public static void main(String[] args) {
		String s1 = "가가가";
		String s2 = "가가";
		
		System.out.println(s1.compareTo(s2));
		
		//compareTo는 크기 비교를 할 수 있다.
		if(s1.compareTo(s2) < 0)
			System.out.println("s1이 작고 s2가 큰 문자열");
		if(s1.compareTo(s2) == 0)
			System.out.println("s1과 s2는 같은 문자열");
		if(s1.compareTo(s2) > 0)
			System.out.println("s1이 크고 s2가 작은 문자열");
	}

}
