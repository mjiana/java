package chapter21;

import java.io.*;
import java.net.*;
import java.text.DecimalFormat;

public class ThreadServer2 {
	public static void main(String[] args) {
		//�������α׷� - Ŭ���̾�Ʈ���� ���� ����Ǿ����
		System.out.println("Thread�� �̿��� ���� ���� ���� �۵�");

		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(12346); //ServerSocket(��Ʈ��ȣ)
			while(true) {
				System.out.println("Ŭ���̾�Ʈ ���� �����");
				client = server.accept(); //���� ��� ����

				InetAddress ia = client.getInetAddress();
				System.out.println("Ŭ���̾�Ʈ : "+ ia.getHostAddress()
				+ " �̸� : "+ia.getHostName()+ " ���� ����");
				/* //Ŭ���̾�Ʈ ���� �ٷ� �ҷ�����, ���� ����
				 System.out.println("Ŭ���̾�Ʈ : "
						+ client.getInetAddress().getHostAddress()
						+ " �̸� : "+client.getInetAddress().getHostName()
						+ " ���� ����");*/

				SkHandler h = new SkHandler(client);
				h.start();
			} 
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				server.close();
				System.out.println("���� �۵� ����");
			} catch (IOException e2) {
				System.out.println("������ �ݴ� �� �����߻� "+e2.toString());
			}
		}
		System.out.println("Server ���α׷� ����");
	}
}
class SkHandler extends Thread{
	protected Socket socket;

	public SkHandler(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			//��°�ü
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			double d;
			int min = 1000;
			int max = 1000000;
			int rnd =0;
			int count =0;
			DecimalFormat comma = new DecimalFormat("###,##0");

			bw.write("����� �մ��� Thread�������� �����Դϴ�");
			bw.newLine();//�ٱ���_������ �Է� �� �ʼ�

			while(true) {
				count++;
				d = Math.random();
				rnd = ((int)(d*(max-min)+1)+min);
				String s = comma.format(rnd);
				bw.write("���� : "+count+"\t"+"�ְ� : " +s);
				bw.newLine();

				bw.flush(); //Ŭ���̾�Ʈ�� ����
				sleep(1000);// 1�ʰ� �޽�
				if(count == 50) break;
			}

		} catch (InterruptedException e){
			System.out.println("InterruptedException : "+e.toString());
		} catch (IOException e) {
			System.out.println("IOException : "+e.toString());
		} finally {
			try {
				socket.close(); //Ŭ���̾�Ʈ ���� ����
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}
