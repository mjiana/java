package chapter11;

class GenClass{
	String name;
	int num;
	
	//String을 인자값으로 사용하는 경우
	public GenClass(String a, int b) {
		name = a;
		num = b;
	}
	
	public void rename(String a) {
		String str = a;
		
		//System.out.println("\nrename ----------------");
		System.out.println("rename(str) : "+ str+"\tstr.hashCode : "+str.hashCode());
		
		str = "★"+str;
		//System.out.println("\n문자열변경 ----------------");
		System.out.println("rename(str) 문자열변경 : "+ str+"\tstr.hashCode : "+str.hashCode());
	}
}
class PrintG { //call by reference
	public static void printg(GenClass g) {
		
		System.out.println("======================");
		System.out.println("name : "+g.name);
		System.out.println("num : "+g.num);
		System.out.println("g.hashCode : "+g.hashCode());
		System.out.println("======================");
		
	}
}
public class NonThread {
	public static void main(String[] args) {
		
		GenClass g = new GenClass("first",1);
		System.out.println("--call by reference----------------------------------------------");
		System.out.println("main g.name : "+g.name+"\tg.hashCode : "+g.hashCode());
		
		PrintG.printg(g); //call by reference //값이 변경되더라도 해쉬코드가 변하지 않음
		g.name = "Second"; 
		
		System.out.println("main g.name : "+g.name+"\tg.hashCode : "+g.hashCode());
		System.out.println("----------------------------------------------------------------");
		
		
		System.out.println("--call by value----------------------------------------------");
		String sc = "Koreaaaaaa";
		System.out.println("main sc : "+sc+"\tsc.hashCode : "+sc.hashCode());
		
		g.rename(sc); //call by value //값이 변경되면 해쉬코드가 변하고 처음 불렀던 변수의 값에는 영향이 없음
		System.out.println("main sc : "+ sc+"\tsc.hashCode : "+sc.hashCode());
		System.out.println("----------------------------------------------------------------");
		
	}

}
