package chapter18;

public class SystemExam {
	public static void testMethod(){
		System.out.println("100,000ȸ loop ����");
		for(int i=0; i<100000; i++) {
			String str = new String("������ �մ���");
		}
		System.out.println("100,000ȸ loop ����");
	}
	public static void execTime() {
		long start, end;
		float time;
		
		start = System.currentTimeMillis();
		System.out.println("����ð� : "+start);
		
		SystemExam.testMethod();
		
		end = System.currentTimeMillis();
		System.out.println("�ݺ�����ð� : "+end);
		
		time = (end-start)/1000.0f;
		
		System.out.println("end-start : "+(end-start));
		System.out.println("�ݺ� �ҿ�ð� : "+ time);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemExam.execTime();
	}

}
