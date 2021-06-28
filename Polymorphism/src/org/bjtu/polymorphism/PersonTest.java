package org.bjtu.polymorphism;

/**
 * @author Yuxuan
 * @Description:讲多态的
 * @create 2021-06-28 18:06
 * @param:
 * 面向对象三：多态性
 * 理解多态性：可以理解我一个事物的多种形态。
 *多态的使用：虚拟方法的调用。有了对象的多态性之后，在编译器，我们只能调用父类中声明的方法，
 * run中，实际执行的是子类重写父类中的
 *
 * 多态性使用前提：①类的继承关系  ②子类要有方法的重写
 * 多态不同于其他两种特征直观，但是很重要，如果没有多态那么抽象类、接口等都没有意义
 * 对象的多态性只适用于方法不适于属性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();


    /**

      * @Description 对象的多态性  //TODO
      * @Date  2021/6/28
      * @Param [args]
      * @return void
     * 父类的引用指向子类的对象
      **/
        System.out.println("//*********************");
        Person p2 = new Man();
    //多态的使用:当调用子类父类同名方法时，实际调用的是子类重写父类的方法 --虚拟方法调用
        p2.eat();
        p2.walk();
//      p2.earnMoney(); 这就会报错，因为编译时用的是父类

    }
}
