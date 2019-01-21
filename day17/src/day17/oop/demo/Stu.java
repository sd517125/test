package day17.oop.demo;

/**
 * 类名称: Stu
 * <p>
 * 类描述:
 * <p>
 * 创建人： 优逸客大数据开发团队
 * 创建时间： 2019-01-21 11:09
 **/
public class Stu {

    /**
     * 介绍自己：
     * 学校，专门，班级
     * staitc变量
     * static代码块赋值
     */
    static String school; //
    static String major;
    static String clazz;
    String name;
    int age;

    //static块：
    static{
       school = "财专";
       major = "计算机";
       clazz = "机课3班";
        System.out.println(school+","+major+","+clazz);
    }

    public Stu(){

    }

    public Stu(String name , int age){
        this.name = name;
        if (age > 100){
            System.out.println("错误");
            this.age = 20;
        }else{
            this.age = age;
        }
        System.out.println(school+","+major+","+clazz+","+name +","+age);
    }


    public static void test1(){
        school = "财大";
        major = "计算科学与技术";
        clazz = "机科1班";
        System.out.println(school+","+major+","+clazz);
    }

    public void test2(){
        test1();
        this.name = "张三";
        this.age = 23;
    }


    public static void main(String[] args) {

        Stu s1 = new Stu("李四" , 23);
        s1.test2();
        Stu s2 = new Stu("李四" , 23);
        s2.test2();
    }
}
