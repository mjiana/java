package chapter20;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String source = "JAVA\n"+"JSP\n"+"EJB\n"+"OJT\n";
		String fname = "";
		
		try {
			System.out.print("������ ���ϸ��� �Է� > ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
		} catch (Exception e) {
			System.out.println("[error] "+e.toString());
		}
		
		FileWriter fw = new FileWriter(fname);
		fw.write(source);
		System.out.println("���� ���� �Ϸ�");
		
		fw.close();
	}

}
