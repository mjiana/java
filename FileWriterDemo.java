package chapter20;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String source = "JAVA\n"+"JSP\n"+"EJB\n"+"OJT\n";
		String fname = "";
		
		try {
			System.out.print("저장할 파일명을 입력 > ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		} catch (Exception e) {
			System.out.println("[error] "+e.toString());
		}
		
		FileWriter fw = new FileWriter(fname);
		fw.write(source);
		System.out.println("파일 저장 완료");
		
		fw.close();
	}

}
