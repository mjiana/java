package chapter20;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		if(args.length != 2) {
			System.out.println("======error============");
			System.out.println("usage : java Copy File <원본파일명><대상파일명>");
		
			System.exit(1);
		}
		//a2.java aa.java
		File inf = new File(args[0]);
		File outf = new File(args[1]);
		
		FileReader in = new FileReader(inf);
		FileWriter out = new FileWriter(outf);
		int c;
		
		while((c=in.read()) != -1) {
			out.write(c);
		}
		
		System.out.println("파일 복사 완료");
		in.close();
		out.close();
		
	}

}
