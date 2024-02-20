package src.java_OOP;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 2/21/2024
 * @project : Interview
 */
public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.say();
        System.out.println("age " +b.age);
    }
}


class A{
    String name = "Jhons";
    int age = 18;

    void say(){
        System.out.println("hi  " +name);
    }
}

class B extends  A{

}