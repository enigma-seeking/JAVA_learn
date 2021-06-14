/**
 * @author Yuxuan
 * @create 2021-06-13 20:35
 */
public class MethodLearn {
    //重点是方法参数的值传递机制
    //方法重载：在同一个类中，允许存在多个重名方法，只要参数不同即可
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(123);
        test.show("hello");
        //如果将show(String s)删除也不会报错，会调用可变参数那个方法
        test.show("hello","world");
    }

}
class MethodArgsTest {
    //可变个数形参方法，JDK5.0新特性
    //格式：数据类型 ... 变量名
    public void show(String s){

    }
    public void show(int i){

    }
    public void show(String ... strs){
        //show(String ... strs)是可以和show(String s)共存构成重载
        //但是这个如果定义为show(String[] strs)就不行了，两个代表一个意思。

    }
    public void show(int i, String ... strs){
        //可变个数形参在方法的形参中，必须声明在末尾
        //可变个数形参在方法的形参中，最多只能声明一个可变形参

    }
    //关于变量的赋值。
    // 1.如果是基本数据类型，赋值的是变量所保存的数据值；
    // 2如果是引用数据类型，此时复制的是变量所保存的数据的地址值。
}

class ValueTransferTest {
    /*
    方法形参的的传递机制：值传递
    1.形参：方法定义时，声明的小括号内的参数
    2.实参：方法调用时。实际传递给形参的数据


     */
}