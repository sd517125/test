package day17.oop.test;

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("java",13);
		book.add();
		new Book("c","zhang","出版社",34).add();
		System.out.println(Book.getMes());
	}
}
