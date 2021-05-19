package chapter04;

public class If4 {

	public static void main(String[] args) {
		// if if-else else
		int i = 2;
		
		if(i>0) { // 1이상일 때  
			if(i>3) {
				System.out.println("i > 0 & i > 3");
			}else {
				System.out.println("i > 0 & i <= 3");
			}
		}else {
			System.out.println("i <= 0");
		}
		System.out.println("The End");
	}

}
