package chapter15;

interface Green{
	public String greenColor();
}
class Greenmp implements Green{
	public String greenColor() {
		return "Greeeeeeeen";
	}
}
interface Red{
	public String redColor();
}
class Redmp implements Red{
	public String redColor() {
		return "Reeeeeeeeeeed";
	}
}

class Color implements Green, Red{
	public String greenColor() {
		return "green";
	}
	public String redColor() {
		return "red";
	}
}
public class ColorMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Green g = new Greenmp();
		System.out.println(g.greenColor());
		
		Red r = new Redmp();
		System.out.println(r.redColor());
		
		Color c = new Color();
		System.out.println(c.greenColor());
		System.out.println(c.redColor());
	}

}
