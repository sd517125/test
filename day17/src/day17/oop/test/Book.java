package day17.oop.test;

public class Book {

	private String name;		//书名
	private String author;		//作者
	private String press;		//出版社
	private double price;		//价格
	private static String mes;
	
	static {
		mes = "书名\t作者\t出版社\t价格\n";
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book() {}
	
	public Book(String name, String author, String press, double price) {
		this(name,price);
		this.author = author;
		this.press = press;
	}
	
	public Book(String name,double price) {
		this.name = name;
		this.price = price;
		this.author = "张飞凡";
		this.press = "人民出版社";
	}
	
	public void add() {
		mes += this.getName()+"\t"+this.getAuthor()+"\t"+this.getPress()+"\t"+this.getPrice()+"\n";
	}
}
