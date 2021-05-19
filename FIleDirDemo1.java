package chapter20;

import java.io.File;

public class FIleDirDemo1 {
	public static void main(String[] args) {
		//
		String directory = "C:\\java_bigdata\\mywork_java\\chapter\\src\\chapter20";
		File f1 = new File(directory);

		if(f1.isDirectory()) {
			System.out.println("==============================");

			String[] s = f1.list();
			for(int i=0; i<s.length; i++) {
				File f = new File(directory+"\\"+s[i]);

				if(f.isDirectory())
					System.out.println(s[i]+" : 디렉토리");
				else
					System.out.println(s[i]+" : 파일");

			}
		} else {
			System.out.println("지정한 "+directory+"는 디렉토리가 아닙니다.");
		}
	}

}
