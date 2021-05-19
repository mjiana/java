package using; //chpater17연습

import june.*;
//import kr.*; //이 두가지 패키지 밑에는 참조할 클래스가 없다.
//import kr.co.*; //하위 패키지는 참조하지 않는다.
import ko.co.java.P_Hart; //ko.co.java에서판 클래스가 존재하므로 

public class PackTest {
	public static void main(String[] args) {
		P_Tree t = new P_Tree();
		P_Hart h = new P_Hart();
		
		System.out.println(t.show());
		System.out.println(h.show());
	}

}
