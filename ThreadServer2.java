package chapter21;

import java.io.*;
import java.net.*;
import java.text.DecimalFormat;

public class ThreadServer2 {
	public static void main(String[] args) {
		//서버프로그램 - 클라이언트보다 먼저 실행되어야함
		System.out.println("Thread를 이용한 다중 접속 서버 작동");

		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(12346); //ServerSocket(포트번호)
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

				SkHandler h = new SkHandler(client);
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
class SkHandler extends Thread{
	protected Socket socket;

	public SkHandler(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			//출력객체
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			double d;
			int min = 1000;
			int max = 1000000;
			int rnd =0;
			int count =0;
			DecimalFormat comma = new DecimalFormat("###,##0");

			bw.write("여기는 왕눈이 Thread다중접속 서버입니다");
			bw.newLine();//줄구별_여러줄 입력 시 필수

			while(true) {
				count++;
				d = Math.random();
				rnd = ((int)(d*(max-min)+1)+min);
				String s = comma.format(rnd);
				bw.write("종목 : "+count+"\t"+"주가 : " +s);
				bw.newLine();

				bw.flush(); //클라이언트로 전송
				sleep(1000);// 1초간 휴식
				if(count == 50) break;
			}

		} catch (InterruptedException e){
			System.out.println("InterruptedException : "+e.toString());
		} catch (IOException e) {
			System.out.println("IOException : "+e.toString());
		} finally {
			try {
				socket.close(); //클라이언트 연결 해제
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}
