package chapter20;

import java.io.*;

public class BufferInput {
	public static void main(String[] args) {
		//�ֿܼ� �Էµ� �����͸� ���ڷ� �ٲ㼭 ���ڷ� ����� �Է¹����� ���ڷ� ���
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("BufferedReader in ��ü����");
		System.out.print("�Է� > ");
		
		String s = "";
		try {
			s = in.readLine(); //\n(����)�� ���� ������ �� ���� �о ���
		} catch (Exception e) {
			System.out.println("Error : "+e.toString());
		}
		System.out.println(s);
	}

}
