package chapter20;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fname = "";
		try {
			System.out.println("읽어올 파일명.확장자 입력 > ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		} catch (Exception e) {
			System.out.println("[error] "+e.toString());
		}
		
		FileReader fr = new FileReader(fname);
		
		int i;
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
