package chapter17; //���� Ŭ������ ��Ű�� ��ġ

//1. import�Ѵ�(�ٸ� Ŭ���� �����Ҷ� ���, ���� ��Ű���� �ʿ����)
import a.b.c.*; //c��Ű�� �ؿ� �ִ� ��� Ŭ���� ����, ���ÿ� ����Ŭ���� �����Ҷ� * ǥ��
import kr.co.mysite.beans.Star; 
//import a.*; //�߸��� ����
// *�� ���������� ������ ���� Ŭ������ ���ϴ� ���̴�.

public class CallMoonStar {
	public static void main(String[] args) {
		//2. �ν��Ͻ� ����
		Moon m = new Moon();
		Star s = new Star();
		//3. �޼��� ȣ��
		System.out.println(m.shine());
		System.out.println(s.shine());
	}
}
