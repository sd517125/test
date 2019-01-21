package day17.oop.test;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("张飞凡", 120, "大数据开发", 34);
		Person p2 = new Person("潘璐鹏", 22, "全栈开发", 200);
		p1.add();
		p2.add();
		System.out.println(Person.getMes());
	}
}
