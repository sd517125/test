package day17.oop.demo;

/**
 * 类名称: CarTest
 * <p>
 * 类描述:
 * <p>
 * 创建人： 优逸客大数据开发团队
 * 创建时间： 2019-01-21 10:11
 **/
public class CarTest {

    public static void main(String[] args) {

        Car baoMa = new Car("宝马", 60.3, 5.3);
    }
}


class Car{
    //静态属性：成员变量
    //在程序的设计中，如果所有的对象的属性值相同时，可以考虑使用static修饰；
    //面向对象的本质：以类来组织代码，对象来封装数据（对象与对象之间封装的数据是不同的）
    String brand;
    double price;
    double length;
    static String made; //产品， 中国

    public Car(){
        this.info2();
    }

    public Car(String brand , double price){
        //this.brand : 当前对象的属性-->成员变量
        //brand : 形参--->局部变量
        this.brand = brand;
        this.price = price;
    }

    public Car(String brand , double price , double length){
        //通过this调用其他重载的构造方法，来为属性赋值：
        this(brand , price);
        this.length = length;
    }

    public void info1(){
        //因为在不重名的情况下（继承时，变量重名，方法重名），this可以省略
        System.out.println("品牌：" + brand +"价格："+this.price +
                ",长度：" + this.length);
        //通过this调用其他成员方法：
        this.info2();
    }

    //成员方法中可以直接使用类成员
    public void info2(){
        System.out.println("所有汽车的产地是：" + made);
        move();
    }

    public static void move(){
        System.out.println("汽车在移动1");
    }


}







































