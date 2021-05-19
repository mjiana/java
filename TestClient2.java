package chapter21;

import java.io.*;
import java.net.*;

public class TestClient2 {
	public static void main(String[] args) {
		//클라이언트 프로그램
		System.out.println("클라이언트 프로그램 작동 시작");
		Socket socket = null; //클라이언트 소켓 생성
		String line = null;

		try { //args[0] = localhost(127.0.0.1) IP(118.32.125.160)
			socket = new Socket(args[0], 2006);//ServerSocket(IP, 포트번호)
			System.out.println("서버 접속 성공");
			//입력객체
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) { //서버의 데이터를 한줄씩 입력
				line = br.readLine();
				if(line == null) break; // 다돌면 반복문 종료
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				socket.close(); //클라이언트 소켓 종료
				System.out.println("서버 접속 종료");
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

		InputStream is = System.in;
		try {
			System.out.println("아무키나 누르면 종료됩니다.");
			is.read(); // 종료직전 대기상태
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Client 프로그램 종료");
	}

}
