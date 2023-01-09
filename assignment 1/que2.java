import java.util.Scanner;
class Human implements Cloneable{
    String name;
    int age;

    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Human(Human someone){
        this.name=someone.name;
        this.age=someone.age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class que2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc=new Scanner(System.in);
        Human human1=new Human("Joseph",34);
        Human twinBrother = (Human)human1.clone();
        System.out.println(human1.name+" "+human1.age);
        System.out.println(twinBrother.name+" "+twinBrother.age);
        sc.close();
    }
}
