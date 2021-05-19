package chapter04;

public class IfElse2 {

	public static void main(String[] args) {
		// if-else if-else
		int i = 10;
		
		if(i<0) {
			System.out.println("À½¼ö");
		} else if(i==0) {
			System.out.println("Monday");
		} else if(i==1) {
			System.out.println("Tuesday");
		} else if(i==2) {
			System.out.println("Wednesday");
		} else if(i==3) {
			System.out.println("Thursday");
		} else {
			System.out.println("Friday");
		}
		System.out.println("The End");
	}

}
