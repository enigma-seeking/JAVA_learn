/**
 * @author Yuxuan
 * @create 2021-06-22 18:04
 */

/**
 * 面向对象的特征一：封装与隐藏
 * 1.问题的引入：
// * 当我们创建一个类的对象后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值，这样的赋值
 自由度很高。实际问题中，我们往往需要给属性赋值加入额外的限制条件，这个需要通过方法进行限制条件的添加，
 之后将属性声明为private
 *封装性的体现需要权限修饰符来体现。private default protected public
 */
public class EncapsulationTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "花花";
        a.age =  30;
//        a.legs = 4;
        a.SetLeg(8);
        a.show();
    }


}

class Animal{
    String name;
    int age;
    private int legs;
    public void SetLeg(int i) {
        if (i >= 0 && i%2 == 0)
        {
            legs = i;
        }
    }

    public int getLegs(){
        return legs;
    }

    public void SetAge(int i){
        if (i>0 && i < 200)
        {
            age = i;
        }
    }

    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void show(){
        System.out.println("name = "+name+", age = "+age+", legs = "+legs);
    }
}