package day17.oop.test;

public class Product {

	private int productId;
	private String productName;
	private int count;
	private double price;
	private Category category;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Product() {
		super();
	}
	public Product(int productId, String productName, int count, double price, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.count = count;
		this.price = price;
		this.category = category;
	}
	
	
}
