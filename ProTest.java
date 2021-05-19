package chapter19;


public class ProTest {
	public static void main(String[] args) {
		//클래스를 참조할 때 java.util.Properties처럼 
		//풀네임을 사용하면 import하지 않아도 되지만 남용하면 코드가 지저분해진다.
		java.util.Properties p = new java.util.Properties();
		
		p.put("step1", "JAVA+SCJP");
		p.put("step2", "JSP+Oracle+SCWCD");
		p.put("step3", "EJB+SCBCD");
		p.put("step4", "OJT+MVC2, Framework+개발");
		
		System.out.println("STEP1 : "+p.getProperty("step1"));
		System.out.println("STEP2 : "+p.getProperty("step2"));
		System.out.println("STEP3 : "+p.getProperty("step3"));
		System.out.println("STEP4 : "+p.getProperty("step4"));
	}

}
