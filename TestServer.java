package chapter21;

import java.io.*;
import java.net.*;

public class TestServer {
	public static void main(String[] args) {
		//�������α׷� - Ŭ���̾�Ʈ���� ���� ����Ǿ����
		System.out.println("�մ��� ���� ���α׷� �۵�");
		
		ServerSocket server = null;
		try {
			server = new ServerSocket(2006); //ServerSocket(��Ʈ��ȣ)
			while(true) {
				System.out.println("Ŭ���̾�Ʈ ���� �����");
				Socket client = server.accept(); //���� ��� ����
				//Ŭ���̾�Ʈ ���� ����
				InetAddress ia = client.getInetAddress();
				String name = ia.getHostName()+"\n";
				String ip = ia.getHostAddress()+"\n";
				System.out.println("Ŭ���̾�Ʈ ���� : "+name+" / "+ip);
				//��°�ü
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				bw.write("Welcooooooome");
				bw.flush(); //Ŭ���̾�Ʈ�� ����
				
				try {
					client.close(); //Ŭ���̾�Ʈ ���� ����
				} catch (IOException e) {
					System.out.println("Socket�� �ݴ��� ���� �߻� "+e.toString());
				}
			} // while���� break�� ��� ���� ��� ���·� �Ʒ� �ڵ���� ���� ���� ����
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
		InputStream is = System.in;
		try {
			System.out.println("�ƹ�Ű�� ������ ����˴ϴ�.");
			is.read(); // �������� ������
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Server ���α׷� ����");
	}

}
