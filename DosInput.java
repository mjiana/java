package chapter06;

import java.text.DecimalFormat; //10������ ����

public class DosInput {

	public static void main(String[] args) {
		// args�Է¹��� ������ ����ϱ�
		// run��ư �ϴ� Run Configurations-Arguments��
		// (����)â�� Ŭ���� ���� ���� Ŭ������� �ٸ� �� ����! �ʼ� Ȯ��!
		// program arguments�� �� �Է�(����� ����)
		// apply Ŭ�� �� run�ϸ� �ڵ����� â�� �ݱ�� �ܼ�â ���
		DecimalFormat comma = new DecimalFormat("###,##0"); //#=���ڸ� ��ä�� 0=���ڸ��� 0���� ä��
		String cs1;
		String cs2;
		
		String s1 = args[0];
		int i1 = Integer.parseInt(args[1]);
		cs1 = comma.format(i1);
		int i2 = Integer.parseInt(args[2]);
		cs2 = comma.format(i2);
		
		System.out.println("args.length"+args.length);
		System.out.println("���� : "+ s1);
		System.out.println("�޿� : "+ cs1);
		System.out.println("���� : "+ cs2);
		System.out.println("�� ���ɾ� : "+comma.format(i1-i2));
	}

}
