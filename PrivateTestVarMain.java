package chapter11;

class PrivateTestVar{
	private int kuk = 0;

	public int getKuk() {
		return kuk;
	}

	public void setKuk(int kuk) {
		if(kuk > 100) {
			System.out.println("kuk값을 다시 입력해주세요.");
		}else {
			this.kuk = kuk;
		}
	}
	
}

public class PrivateTestVarMain {
	public static void main(String[] args) {
		//
		PrivateTestVar pv = new PrivateTestVar();
		pv.setKuk(100);
		//int kuk = pv.getKuk();
		if(pv.getKuk() != 0) 
			System.out.println(pv.getKuk());

	}

}
