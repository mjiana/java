package chapter20;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		// Scanner����
		Scanner s = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("���� �Է� > ");
		//age = s.nextInt(); //���� ����, ��޾��� //�ݺ������� �������� �Է��� �� ����
		age = Integer.parseInt(s.nextLine());//���� ����
		//���� �� ���ڿ��� ����ؼ� ����ϴ� ���� ���ϴ�.
		
		System.out.print("�̸� �Է� > ");
		name = s.nextLine(); //���� ����
		
		System.out.printf("����� ���̴� %d�Դϴ�.%n",age);
		System.out.printf("����� �̸��� %s�Դϴ�. %n", name);
	}
}
