package chapter18;

public class EqualsExam {
	public static void main(String[] args) {
		//String Ŭ������ ������ ������� ���� ���ڿ�(���)�� ������ �ؽ��ڵ尡 �����ϴ�.
		// ���ڿ��� ���� �� == ��� ���� ���ڿ��� ���ϴ� equals() �޼��带 ���
		String a1 = "STUDY JAVA";
		String a2 = "Apple";
		String a3 = "APPLE";
		
		System.out.println("a1 : "+a1);
		System.out.println("a2 : "+a2);
		System.out.println("a3 : "+a3);
		System.out.println("a2.equals(a3) : "+a2.equals(a3));
		//equalsIgnoreCase : ��ҹ��� ����
		System.out.println("a2.equalsIgnoreCase(a3) : "+a2.equalsIgnoreCase(a3));
	
		if(a2 == "Apple") System.out.println("a2 == Apple");
		
		String obj = new String("�մ���");
		if(obj == "�մ���") System.out.println("obj == �մ���");
		else System.out.println("obj�� �մ��̰� �ƴմϴ�");
		
		String obj2 = new String("�մ���");
		if(obj2.equals("�մ���")) System.out.println("obj2.equals(�մ���)");
	
	}

}
