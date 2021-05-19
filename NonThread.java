package chapter11;

class GenClass{
	String name;
	int num;
	
	//String�� ���ڰ����� ����ϴ� ���
	public GenClass(String a, int b) {
		name = a;
		num = b;
	}
	
	public void rename(String a) {
		String str = a;
		
		//System.out.println("\nrename ----------------");
		System.out.println("rename(str) : "+ str+"\tstr.hashCode : "+str.hashCode());
		
		str = "��"+str;
		//System.out.println("\n���ڿ����� ----------------");
		System.out.println("rename(str) ���ڿ����� : "+ str+"\tstr.hashCode : "+str.hashCode());
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
		
		PrintG.printg(g); //call by reference //���� ����Ǵ��� �ؽ��ڵ尡 ������ ����
		g.name = "Second"; 
		
		System.out.println("main g.name : "+g.name+"\tg.hashCode : "+g.hashCode());
		System.out.println("----------------------------------------------------------------");
		
		
		System.out.println("--call by value----------------------------------------------");
		String sc = "Koreaaaaaa";
		System.out.println("main sc : "+sc+"\tsc.hashCode : "+sc.hashCode());
		
		g.rename(sc); //call by value //���� ����Ǹ� �ؽ��ڵ尡 ���ϰ� ó�� �ҷ��� ������ ������ ������ ����
		System.out.println("main sc : "+ sc+"\tsc.hashCode : "+sc.hashCode());
		System.out.println("----------------------------------------------------------------");
		
	}

}
