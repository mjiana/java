package chapter20;

import java.io.*;

public class DirCreate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dname = new File("DirCreate");
		boolean b = false;
		b = dname.mkdir();
		if(b)
			System.out.println("���� ����");
		else
			System.out.println("���� ���� ����");
	}

}
