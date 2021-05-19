package chapter21;

import java.io.*;
import java.net.*;

public class ThreadServer {
	public static void main(String[] args) {
		//�������α׷� - Ŭ���̾�Ʈ���� ���� ����Ǿ����
		System.out.println("Thread�� �̿��� ���� ���� ���� �۵�");

		ServerSocket server = null;
		Socket client = null;
		try {
			server = new ServerSocket(12345); //ServerSocket(��Ʈ��ȣ)
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

				Handler h = new Handler(client);
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
class Handler extends Thread{
	protected Socket socket;

	public Handler(Socket socket) {
		this.socket = socket;
	}
	public void run() {
		try {
			//��°�ü
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			bw.write("���⼭���ʹ� Thread�������� �����Դϴ�");
			bw.newLine();//�ٱ���_������ �Է� �� �ʼ�
			bw.write("1. JAVA");
			bw.newLine();
			bw.write("2. JSP");
			bw.newLine();
			bw.write("3. EJB");
			bw.newLine();
			bw.write("4. OJT");
			bw.newLine();

			bw.flush(); //Ŭ���̾�Ʈ�� ����

		} catch (IOException e) {
			System.out.println("Socket�� �ݴ��� ���� �߻� "+e.toString());
		}finally {
			try {
				socket.close(); //Ŭ���̾�Ʈ ���� ����
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}
