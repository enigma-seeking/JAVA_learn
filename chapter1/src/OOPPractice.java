/**
 * Created by YuxuanXu on 2021/6/10
 */
public class OOPPractice {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;
        p1.showAge();
        p1.addAge(2);
        p1.showAge();

        Circle c1 = new Circle();
        c1.radius = 10;
//        c1.calculate();
        System.out.println(c1.calculateArea());

        OOPPractice test = new OOPPractice();
        //创建对象，这个对象是主类的
        System.out.println(test.method(3,4));

        //声明对象类型数组例如
        student[] stus = new student[20];
        for (int i = 0;i<stus.length;i++)
        {
            stus[i] = new student();
            stus[i].number = i+1;
            stus[i].state = (int) (Math.random()*6+1);
            stus[i].score = (int) (Math.random()*101);
            System.out.println(stus[i].state);
        }

    }


    public int method(int a,int b){  //这个方法是定义在主类里的
        for (int i=0;i < a;i++){
           for (int j=0;j<b;j++){
               System.out.print("*");
           }
            System.out.println();
        }
        return a*b;
    }
}
class Person1{
    String name;
    int age;
    int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        this.age += i;
        return this.age;
    }
}
class Circle{
    double radius;
    public double calculateArea(){
        return Math.PI*this.radius*this.radius;
    }
}

class student{
    int number;
    int state ;
    int score ;
}

