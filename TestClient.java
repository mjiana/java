package chapter21;

import java.io.*;
import java.net.*;

public class TestClient {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ ���α׷�
		System.out.println("Ŭ���̾�Ʈ ���α׷� �۵� ����");
		
		Socket socket = null; //Ŭ���̾�Ʈ ���� ����
		try { //args[0] = localhost(118.32.125.160)
			socket = new Socket(args[0], 2006);//ServerSocket(IP, ��Ʈ��ȣ)
			System.out.println("���� ����");
			//�Է°�ü
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = br.readLine();
			System.out.println(line);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				socket.close(); //Ŭ���̾�Ʈ ���� ����
				System.out.println("�������� ���� ����");
			} catch (Exception e2) {
				// TODO: handle exception
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
