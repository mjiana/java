package chapter20;

import java.io.*;

public class FileInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		System.out.print("파일 이름 : ");
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine();
		} catch (Exception e) {
			System.out.println("ERROR : "+ e.toString());
		}
		
		File f = new File(name);
		if(f.exists()) {
			System.out.println("파일이름 : "+f.getName());
			System.out.println("상대패스 : "+f.getPath());
			System.out.println("절대패스 : "+f.getAbsolutePath());
			System.out.println("쓰기 가능 : "+f.canWrite());
			System.out.println("읽기 가능 : "+f.canRead());
			System.out.println("파일 길이 : "+f.length());
		}
		
	}

}
