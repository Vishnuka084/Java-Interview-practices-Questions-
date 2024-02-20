package src.java_OOP;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 2/21/2024
 * @project : Interview
 */
public class Encapsulation {

    public static void main(String[] args) {
        Student st = new Student();
        st.setAge(18);
        System.out.println(st.getAge());

        System.out.println("-----------------------");

        st.setName("kasun");
        System.out.println(st.getName());
    }
}


class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age= age;
    }
}