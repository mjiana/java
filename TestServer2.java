package chapter21;

import java.io.*;
import java.net.*;

public class TestServer2 {
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

				bw.write("��� �մ��� ������ ó������?");
				bw.newLine();//�ٱ���_������ �Է� �� �ʼ�
				bw.write("[��ȣ�ϴ� ����]");
				bw.newLine();
				bw.write("1. ����, �췰 �� Ȱ��ȸ��");
				bw.newLine();
				bw.write("2. ������, ������ �� ����");
				bw.newLine();
				bw.write("3. ����, ���� �� ����");
				bw.newLine();
				bw.write("4. ����, ���, �, ���� ��");
				bw.newLine();
				bw.write("[��ܸ��ô� ��]");
				bw.newLine();
				bw.write("1. ����, ����, ������");
				bw.newLine();

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
