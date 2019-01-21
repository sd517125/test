package day17.oop.demo;

/**
 * 类名称: Book
 * <p>
 * 类描述:
 * <p>
 * 创建人： 优逸客大数据开发团队
 * 创建时间： 2019-01-21 14:54
 **/
public class Book {
    /**
     * 准则：一般属性的访问权限：private
     */
    private String name;
    private String author;
    private static String press;
    private double price;

    static{
        press = "人民出版社";
    }

    public Book(){

    }

    public Book(String name , String author , double price){
        this(price);
        this.name = name;
        this.author = author;
    }

    public Book(double price){
        this.price = price;
    }

    /**
     * set方法 ： 功能是为属性进行赋值：
     *      1）没有返回值类型；
     *      2）方法名：set+属性名；
     *      3）形参列表：接收外界的传递的属性值；
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * get方法：功能是获取对象的的属性值：
     *  1）需要有返回值类型：和属性的类型一致；
     *  2）方法名：get+属性名；
     *  3）没有形参列表；
     */
    public String getName(){
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static String getPress() {
        return press;
    }

    public static void setPress(String press) {
        Book.press = press;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 介绍：
     * 注意：当在类的模板中，有属性的get set方法时，一般使用方法，不去直接操作属性；
     *      “程序设计的原则”
     */
    private void show(){
        System.out.println(this.getName() +","+this.getAuthor()
        +"," + this.getPrice()+","+Book.press);
    }



    public static void main(String[] args) {

        /**
         * 注意：当学习过get set方法之后，你给对象的属性赋值就有了方式了：
         * 1）通过构造方法来为属性赋值；
         * 2）通过set方法来为属性赋值；
         */
        Book book = new Book("三体", "刘慈欣", 35.0);
        book.show();

        Book book1 = new Book();
        book1.setName("围城");
        book1.setAuthor("钱钟书");
        book1.setPrice(40.3);
        book1.show();
    }
}
