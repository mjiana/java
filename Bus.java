package chapter15;

class Bus {
	int company;
	
	public static final int HYUNDAI = 1;
	public static final int DAEWOO = 2;
	public static final int KIA = 3;
	public static final int SSANGY = 4;
	public static final int SAMSUNG = 5;
	
	public Bus() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus myBus, yourBus;
		
		myBus = new Bus();
		myBus.company = Bus.KIA;
		
		yourBus = new Bus();
		yourBus.company = Bus.HYUNDAI;
		
		if(myBus.company == 1)
			System.out.println("������ ���뿡�� ����������ϴ�.");
		else if (myBus.company == 2)
			System.out.println("������ ��쿡�� ����������ϴ�.");
		else if(myBus.company == 3)
			System.out.println("������ ��ƿ��� ����������ϴ�.");
		else if(myBus.company == 4)
			System.out.println("�� ���� �ֿ뿡�� ����������ϴ�.");
		else if(myBus.company == 5)
			System.out.println("�� ���� �Ｚ���� ����������ϴ�.");
		
		System.out.println("myBus.company : "+myBus.company);
	}

}
