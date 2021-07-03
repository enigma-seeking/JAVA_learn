package org.bjtu.polymorphism;

/**
 * @author Yuxuan
 * @Description:讲多态的
 * @create 2021-06-28 18:06
 * @param:
 * 面向对象三：多态性
 * 理解多态性：可以理解我一个事物的多种形态。
 *多态的使用：虚拟方法的调用。
 * 具体含义是：有了对象的多态性之后，在编译器，我们只能调用父类中声明的方法，run中，实际执行的是子类重写父类中的
 *多态中，父类的方法被称为虚拟方法，动态调用子类的该方法，在编译期无法确定
 * 多态性使用前提：①类的继承关系  ②子类要有方法的重写
 * 多态不同于其他两种特征直观，但是很重要，如果没有多态那么抽象类、接口等都没有意义
 * 对象的多态性只适用于方法不适于属性。
 * **************面试题***********
 * 动态是编译时行为还是运行时行为？
 * 运行时行为
 * 怎么证明 InterviewTest有代码
 *
 * ********重载和多态的区别**********
 细节上：略（形参列表的不同）
 编译和运行时：重载，在调用前，编译器就已经确定了要调用的方法了，成为早绑定或静态绑定
 多态，知道方法被调用的哪一个时刻，编译器才知道调用哪一个。

 ***************************************************************************
 注意：不能调用子类特有的方法，因为编译时编译器认为是父类对象。这么做编译会报错。
 那怎么才能用呢？


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
        //有了对象的多态性之后，内存中实际加载了子类特有的属性和方法，但是由于变量声明为父类类型
        // 导致编译时只能调用父类中的方法

        //如何解决这一问题，强转类型,使用强制类型转换符
        //也称之为向下转型。注意不能平级转换，例如同一个直接父类不能相互转换，为了避免向下转型时出现异常 加了一个关键字
        // instenceof
        // a instenceof A:判断对象a是否是类A的实例，如果是那么返回true。
        Man m = (Man) p2;
        if (p2 instanceof Woman){

            Woman w = (Woman) p2;

        }
        //练习
        //问题一：编译时通过，运行不通过
        Person p3 = new Man();
        Woman w2 = (Woman) p3;

        //问题二：编译不通过
        Person p4 = new Man();
        //p4.earnMoney();

        //问题三：编译运行都通过
        Object obj = new Woman();
        Person p5 = (Person) obj;
    }
}
