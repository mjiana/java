package chapter18;

public class StringBufferExam1 {
	public static void main(String[] args) {
		//StringBuffer : 문자열이 자주 변경될 때 메모리를 연장해서 사용한다.
		StringBuffer str1 = new StringBuffer("Hello JAVA");
		StringBuffer str2 = new StringBuffer("안녕하세요 자바");
		
		System.out.println("str1의 내용 : "+str1);
		System.out.println("str1의 길이 : "+str1.length());
		System.out.println("str1의 할당된 용량 : "+str1.capacity());
		
		System.out.println("str2의 내용 : "+str2);
		System.out.println("str2의 길이 : "+str2.length());
		System.out.println("str2의 할당된 용량 : "+str2.capacity());
	}

}
