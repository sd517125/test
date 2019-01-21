package day17.oop.test;

public class Person {

	private String name;
	private int age;
	private String major;
	private int year;
	private static String mes;
	
	static {
		mes = "姓名\t年龄\t专业\t工作年限\n";
	}
	
	public static String getMes() {
		return mes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >18 && age < 80) {
			this.age = age;
		}else {
			this.age = 21;
		}
		
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 0 && year < 100) {
			this.year = year;
		}else {
			year = 1;
		}
		
	}
	
	public Person(String name, int age, String major, int year) {
		this.name = name;
		if(age >18 && age < 80) {
			this.age = age;
		}else {
			this.age = 21;
		}
		this.major = major;
		if(year > 0 && year < 100) {
			this.year = year;
		}else {
			year = 1;
		}
	}
	public Person() {}
	
	public void add() {
		mes += this.getName()+"\t"+this.getAge()+"\t"+this.getMajor()+"\t"+this.getYear()+"\n";
	}
}
