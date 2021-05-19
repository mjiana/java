package chapter21;

import java.io.*;
import java.net.*;

public class ThreadServer {
	public static void main(String[] args) {
		//서버프로그램 - 클라이언트보다 먼저 실행되어야함
		System.out.println("Thread를 이용한 다중 접속 서버 작동");

		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(12345); //ServerSocket(포트번호)
			while(true) {

				System.out.println("클라이언트 접속 대기중");
				client = server.accept(); //접속 대기 상태
				
				InetAddress ia = client.getInetAddress();
				System.out.println("클라이언트 : "+ ia.getHostAddress()
						+ " 이름 : "+ia.getHostName()+ " 연결 성공");
				/* //클라이언트 정보 바로 불러오기, 변수 절약
				 System.out.println("클라이언트 : "
						+ client.getInetAddress().getHostAddress()
						+ " 이름 : "+client.getInetAddress().getHostName()
						+ " 연결 성공");*/

				Handler h = new Handler(client);
				h.start();
			} 
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
		System.out.println("Server 프로그램 종료");
	}

}
class Handler extends Thread{
	protected Socket socket;

	public Handler(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			//출력객체
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			bw.write("여기서부터는 Thread다중접속 서버입니다");
			bw.newLine();//줄구별_여러줄 입력 시 필수
			bw.write("1. JAVA");
			bw.newLine();
			bw.write("2. JSP");
			bw.newLine();
			bw.write("3. EJB");
			bw.newLine();
			bw.write("4. OJT");
			bw.newLine();

			bw.flush(); //클라이언트로 전송

		} catch (IOException e) {
			System.out.println("Socket을 닫던중 에러 발생 "+e.toString());
		}finally {
			try {
				socket.close(); //클라이언트 연결 해제
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}
