package chapter21;

import java.io.*;
import java.net.*;

public class ThreadClient2 {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ ���α׷�
		System.out.println("Ŭ���̾�Ʈ ���α׷� �۵� ����");
		Socket socket = null; //Ŭ���̾�Ʈ ���� ����
		String line = null;

		try { //args[0] = localhost(127.0.0.1) IP(118.32.125.160)
			socket = new Socket("localhost", 12346);//ServerSocket(IP, ��Ʈ��ȣ)
			System.out.println("���� ���� ����");
			//�Է°�ü
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) { 
				line = br.readLine(); //������ �����͸� ���پ� �Է�
				if(line == null) break; // �ٵ��� �ݺ��� ����
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				socket.close(); //Ŭ���̾�Ʈ ���� ����
				System.out.println("���� ���� ����");
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		System.out.println("Client ���α׷� ����");
	}

}
