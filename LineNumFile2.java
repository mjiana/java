package chapter20;

import java.io.*;

public class LineNumFile2 {
	public static void addLineNum(File f) {
		String buf;
		BufferedReader fisOrg = null;
		PrintWriter fosDst = null;
		BufferedReader in = null;
		int nlines;
		String fname = f.toString();
		
		try {
			//int i = fname.lastIndexOf('/');
			//fname = fname.substring(i+1);
			System.out.println(fname);
			fisOrg = new BufferedReader(new FileReader(fname));
			fosDst = new PrintWriter(new FileWriter(fname+".txt"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Err : "+ e.toString());
			System.exit(1);
		}
		int num = 1;
		while(true) {
			try {
				buf = fisOrg.readLine();
				if(buf == null) break;
			} catch (IOException e) {
				System.out.println(e);
				break;
			}
			if(num<10)
				buf = "  "+num+": "+buf;
			else if(num>=10 && num <= 99)
				buf = " "+num+": "+buf;
			else if(num>=100 && num <= 999)
				buf = num+": "+buf;
			fosDst.println(buf);
			num++;
		}
		try {
			fisOrg.close();
			fosDst.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("파일저장완료");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir = "C:\\java_bigdata\\mywork_java\\chapter\\src\\chapter20";
		File d = new File(dir);
		
		if(d.isDirectory()) {
			String[] s = d.list();
			for(int i=0; i<s.length; i++) {
				File f = new File(dir+"\\"+s[i]);
				System.out.println(f);
				if(f.isFile() && f.toString().endsWith(".java"))
					LineNumFile2.addLineNum(f);
			}
		}else
			System.out.println("지정한 "+dir+"은 디렉토리가 아님");
	
	}

}
