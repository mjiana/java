package chapter11;

class Data{
	private String name;
	private String season;
	private int year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year >= 20 && year <= 30) {
			this.year = year;
		}else {
			System.out.println("20��-30�� ���̷� �Է����ּ���.");
		}
	}
}

public class DataAccess {
	public static void main(String[] args) {
		// 
		Data d = new Data();
		d.setName("AAA");
		System.out.println(d.getName());
		
		d.setSeason("�ʺ�");
		System.out.println(d.getSeason());
		
		d.setYear(50);
		//System.out.println(d.getYear());
		//year�� ���� ������ ������ ��� 0�� ���� ���������� ���� ���
		if(d.getYear() != 0) System.out.println(d.getYear());
	}

}
