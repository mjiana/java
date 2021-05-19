package chapter19;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	
	static String s = "JAVA=JSP;MS=ASP;PHP=PHP Script";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer ss = new StringTokenizer(s,"=;");
		
		while(ss.hasMoreTokens()) {
			String first = ss.nextToken();
			String second = ss.nextToken();
			System.out.println(first+"\t"+second);
		}
		
		
	}

}
