package day17.oop.demo;

/**
 * 类名称: TestThis
 * <p>
 * 类描述:
 * <p>
 * 创建人： 优逸客大数据开发团队
 * 创建时间： 2019-01-21 9:22
 **/
public class TestThis {

    public static void main(String[] args) {

        Person P1 = new Person("张三" , 20);
        Person P2 = new Person("张三" , 20);

    }
}


class Person{
    String name;
    int age;

    public Person(){
        name = "田雨";
        age = 20;
    }


    public Person(String name , int age){
         this(); //调用无参构造方法
    }

    //通过构造方法来为当前对象的属性进行初始化操作：
/*    public Person(String name,int age){
        //因为在编程过程，变量的执行遵循就近原则；
        //this的第一大功能：专门用来区分成员变量和局部变量：
        //this.变量名 ： 当前对象的成员变量
        this.name = name;
        this.age = age;

        //在构造方法中，调用当前对象的成员方法：
        this.info1();
    }*/


/*    public Person(String name , int age){
        //通过this调用其他构造方法：注意语法：
        this(name); //在调用的过程中，会根据参数来觉得this代表哪个构造方法；
        this.age = age;
    }*/


    public Person(String name){
        this.name = name;
    }


    //在每一个成员方法中，都有两个隐式参数：this ,super：
    public void info1(){
        //在成员方法中，通过this关键字来调用其他成员方法（this可以省略）；
        this.info2();
    }


    public static void info2(){
        //
        /*this.name = "张三";

        this.info1();*/
    }


    /**
     * 需求：构建一个汽车类，然后构建该类的两个对象，“宝马” ， “奔驰”
     * 技术点：
     *  this 构造方法，
     *  this.成员方法，
     *  this.成员变量
     *  static 成员；
     */
}






























