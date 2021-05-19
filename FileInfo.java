package chapter20;

import java.io.*;

public class FileInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		System.out.print("���� �̸� : ");
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine();
		} catch (Exception e) {
			System.out.println("ERROR : "+ e.toString());
		}
		
		File f = new File(name);
		if(f.exists()) {
			System.out.println("�����̸� : "+f.getName());
			System.out.println("����н� : "+f.getPath());
			System.out.println("�����н� : "+f.getAbsolutePath());
			System.out.println("���� ���� : "+f.canWrite());
			System.out.println("�б� ���� : "+f.canRead());
			System.out.println("���� ���� : "+f.length());
		}
		
	}

}
