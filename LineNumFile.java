package chapter20;

import java.io.*;

public class LineNumFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buf = null;
		BufferedReader fisOrg = null;
		PrintWriter fosDst = null;
		BufferedReader in = null;
		BufferedReader out = null;
		String fname = "";

		try {
			System.out.print("라인번호를 붙일 파일명 입력 > ");
			in = new BufferedReader(new InputStreamReader(System.in));
			fname = in.readLine();
			fisOrg = new BufferedReader(new FileReader(fname));

			System.out.print("저장할 파일명 입력 > ");
			out = new BufferedReader(new InputStreamReader(System.in));
			fname = out.readLine();
			fosDst = new PrintWriter(new FileWriter(fname));

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error : "+ e.toString());
			System.exit(1);
		}

		int num = 1;

		while(true) {
			try {
				buf = fisOrg.readLine();
				if(buf == null) break;
			} catch (IOException e) {
				System.out.println("[while] "+e);
				break;
			}

			buf = num+": "+buf;
			fosDst.println(buf);
			num++;
		}
		try {
			in.close();
			out.close();
			fisOrg.close();
			fosDst.close();
		} catch (IOException e) {
			System.out.println("[close] "+e);
		}

		System.out.println("파일 저장 완료");
	}
}
