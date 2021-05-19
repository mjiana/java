package chapter06;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열변수
		String[] str = new String[5];
		
		str[0] = "aaa";
		str[1] = "bbb";
		str[2] = "ccc";
		str[3] = "ddd";
		str[4] = "eee";
		
		for(int i=0; i<str.length; i++) {
			System.out.println("str["+i+"] = "+str[i]);
		}
	}

}
