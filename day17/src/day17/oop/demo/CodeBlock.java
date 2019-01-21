package day17.oop.demo;

/**
 * 类名称: CodeBlock
 * <p>
 * 类描述:
 * <p>
 * 创建人： 优逸客大数据开发团队
 * 创建时间： 2019-01-21 10:10
 **/
public class CodeBlock {

    public static void main(String[] args) {

        CodeClass c = new CodeClass(50 , "静态代码块");
        System.out.println(c.i);
        CodeClass c1 = new CodeClass(80 , "静态代码块");
        System.out.println(c.i);

    }


}

class CodeClass{

    //代码块：
    //静态代码块：static
    //静态变量
    static int i;
    static {
        //业务逻辑：自定义
        i = 100;
        System.out.println("我是静态代码块1   " + i);
        //在代码块中赋值：


        //数据库链接的操作：
        //数据库的驱动类的加载：
    }

    static {
        i = 200;
        System.out.println("我是静态代码块2   " + i);
    }

    //成员变量
    String info;

    //构造方法：
    public CodeClass(){

    }

    public CodeClass(int i , String info){
        this.i = i;    //对象操作类级别的成员
        this.info = info;
    }

/*    public CodeClass(String info){
        this.info = info;
    }*/

    //成员方法：
    public void test(){

    }

    //静态方法：
    public static void staticMethord(){

    }

}
