package chapter20;

import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		if(args.length != 2) {
			System.out.println("======error============");
			System.out.println("usage : java Copy File <�������ϸ�><������ϸ�>");
		
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
		
		System.out.println("���� ���� �Ϸ�");
		in.close();
		out.close();
		
	}

}
