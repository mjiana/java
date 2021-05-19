package chapter18;

//import java.lang.*; //자바의 기본패키지이므로 굳이 작성하지 않아도 호출이 가능하다.

public class Test {
	public static void main(String[] args) {
		//wrapper 클래스 : 기본형에서 객체형으로 형변환하는 클래스
		
		String bin = Integer.toBinaryString(100); //정수100을 2진수로
		System.out.println("100의 2진수는 "+bin);
		
		Integer it = new Integer("100"); //문자열 100을 정수형으로
		it += 10;
		//최근방법으로 jdk버전에 따라 가능여부가 달라진다.
		Integer it2 = 10; //직접대입이 가능 : auto boxing(기본형->객체형)
		
		 //intValue() : 문자열로 저장된 값을 다시 int형으로 변경, 최근에는 안써도 가능
		System.out.println("it : "+it.intValue());
		System.out.println("it2 : "+it2.intValue());
		
		int k = Integer.parseInt("100"); //문자열 100을 정수형으로
		System.out.println("k : "+ k);
	}

}
