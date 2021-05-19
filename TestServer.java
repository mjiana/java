package chapter21;

import java.io.*;
import java.net.*;

public class TestServer {
	public static void main(String[] args) {
		//서버프로그램 - 클라이언트보다 먼저 실행되어야함
		System.out.println("왕눈이 서버 프로그램 작동");
		
		ServerSocket server = null;
		try {
			server = new ServerSocket(2006); //ServerSocket(포트번호)
			while(true) {
				System.out.println("클라이언트 접속 대기중");
				Socket client = server.accept(); //접속 대기 상태
				//클라이언트 정보 저장
				InetAddress ia = client.getInetAddress();
				String name = ia.getHostName()+"\n";
				String ip = ia.getHostAddress()+"\n";
				System.out.println("클라이언트 접속 : "+name+" / "+ip);
				//출력객체
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				bw.write("Welcooooooome");
				bw.flush(); //클라이언트로 전송
				
				try {
					client.close(); //클라이언트 연결 해제
				} catch (IOException e) {
					System.out.println("Socket을 닫던중 에러 발생 "+e.toString());
				}
			} // while문에 break가 없어서 무한 대기 상태로 아래 코드들은 실행 되지 않음
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				server.close();
				System.out.println("서버 작동 종료");
			} catch (IOException e2) {
				System.out.println("서버를 닫던 중 에러발생 "+e2.toString());
			}
		}
		InputStream is = System.in;
		try {
			System.out.println("아무키나 누르면 종료됩니다.");
			is.read(); // 종료직전 대기상태
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Server 프로그램 종료");
	}

}
