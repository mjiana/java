package chapter21;

import java.io.*;
import java.net.*;

public class TestClient {
	public static void main(String[] args) {
		//클라이언트 프로그램
		System.out.println("클라이언트 프로그램 작동 시작");
		
		Socket socket = null; //클라이언트 소켓 생성
		try { //args[0] = localhost(118.32.125.160)
			socket = new Socket(args[0], 2006);//ServerSocket(IP, 포트번호)
			System.out.println("서버 연결");
			//입력객체
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = br.readLine();
			System.out.println(line);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				socket.close(); //클라이언트 소켓 종료
				System.out.println("서버와의 접속 종료");
			} catch (Exception e2) {
				// TODO: handle exception
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
