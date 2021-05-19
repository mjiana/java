package chapter11;

class Jumsu{
	public int kuk = 100;
	public int eng = 90;
	private int mat = 100;
	
	public Jumsu() {
	}
	
	public int getKuk() {
		return kuk;
	}

	public void setKuk(int kuk) {
		this.kuk = kuk;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
}

public class Mod {
	public static void main(String[] args) {
		
		Jumsu s = new Jumsu();
		s.setKuk(100); //唱慧规过 s.kuk = 100;
		s.setMat(200); //亮篮规过
		
		System.out.println("kuk: "+s.kuk+" mat: "+s.getMat());

	}

}
