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
			System.out.println("20세-30세 사이로 입력해주세요.");
		}
	}
}

public class DataAccess {
	public static void main(String[] args) {
		// 
		Data d = new Data();
		d.setName("AAA");
		System.out.println(d.getName());
		
		d.setSeason("늦봄");
		System.out.println(d.getSeason());
		
		d.setYear(50);
		//System.out.println(d.getYear());
		//year의 값이 정해진 범위를 벗어나 0의 값을 가지지않을 때만 출력
		if(d.getYear() != 0) System.out.println(d.getYear());
	}

}
