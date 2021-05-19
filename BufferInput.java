package chapter20;

import java.io.*;

public class BufferInput {
	public static void main(String[] args) {
		//콘솔에 입력된 데이터를 문자로 바꿔서 문자로 저장된 입력버퍼의 인자로 사용
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("BufferedReader in 객체생성");
		System.out.print("입력 > ");
		
		String s = "";
		try {
			s = in.readLine(); //\n(엔터)을 만날 때까지 한 줄을 읽어서 출력
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
		}
		System.out.println(s);
	}

}
