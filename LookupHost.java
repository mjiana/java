package chapter21;

import java.net.*;

public class LookupHost {
	public static void main(String[] args) {
		// 내 컴퓨터 이름 DESKTOP-IV95RFG IP주소 118.32.125.160
		String arg_ip = "DESKTOP-IV95RFG";
		
		try {
			InetAddress ia = InetAddress.getByName(arg_ip);
			String name = ia.getHostName()+"\n";
			String ip = ia.getHostAddress()+"\n";
			System.out.println("Host Name : "+name);
			System.out.println("IP Address : "+ip);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
