package chapter21;

import java.io.*;
import java.net.*;

public class TestClient2 {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ ���α׷�
		System.out.println("Ŭ���̾�Ʈ ���α׷� �۵� ����");
		Socket socket = null; //Ŭ���̾�Ʈ ���� ����
		String line = null;

		try { //args[0] = localhost(127.0.0.1) IP(118.32.125.160)
			socket = new Socket(args[0], 2006);//ServerSocket(IP, ��Ʈ��ȣ)
			System.out.println("���� ���� ����");
			//�Է°�ü
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while(true) { //������ �����͸� ���پ� �Է�
				line = br.readLine();
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

		InputStream is = System.in;
		try {
			System.out.println("�ƹ�Ű�� ������ ����˴ϴ�.");
			is.read(); // �������� ������
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Client ���α׷� ����");
	}

}
