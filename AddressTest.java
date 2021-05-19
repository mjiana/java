package chapter21;

import java.net.*;

public class AddressTest {
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("���� ��ǻ���� �̸� : "+address.getHostName());
		System.out.println("���� ��ǻ���� IP�ּ� : "+address.getHostAddress());
		
		address = InetAddress.getByName("java.sun.com");
		System.out.println("java.sun.com ������ �̸��� IP�ּ� : "+address);
		
		InetAddress[]sw = InetAddress.getAllByName("naver.com");
		for(int i=0; i<sw.length; i++) {
			System.out.println(sw[i]);
		}
	}

}
