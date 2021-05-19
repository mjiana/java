package chapter18;

public class StringBufferExam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("aa자바");
		
		System.out.println("버퍼 내용 : "+str);
		System.out.println("문자열 끼워넣기 : "+str.insert(2, "GOOD"));
		System.out.println("버퍼의 5번째 문자 : "+str.charAt(4));
		
		str.setCharAt(0, 'A');
		System.out.println("0번째 값을 'A'로 변경 : "+str);
		
		str.setLength(6);
		System.out.println("str.setLength(6) 지정 후");
		
		System.out.println("버퍼의 새로운 내용 : "+str);
		System.out.println("문자열길이 역순 출력 : "+str.reverse());
		System.out.println("내용의 길이 : "+str.length());
		System.out.println("할당된 용량 : "+str.capacity());
		
		/*length 길이
capacity 할당된 용량
insert(번지, “문자열”) 
charAt(숫자) 자리수 출력
setCharAt(번지, ‘바꿀내용’)
setLength() 길이 수에 맞게 자르기
reverse() */
		
	}

}
