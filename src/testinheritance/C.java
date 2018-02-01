package testinheritance;

/**
 * Created by amitagarwal3 on 9/13/2017.
 */
public class C{

    public static void main(String[] args){
        A a = new A();
        a.display(2);

        A b = new B();
        b.display(2);

        B c = new B();
        c.display(2);
        c.display();

    }

}


class B extends A{

    void display(int a){
        System.out.println("DISPLAY B");
    }

    void display(){
        System.out.println("EMPTY");
    }


}

class A{
    public A(int a){
        System.out.println("A");
    }

    public A(){
        System.out.println("A");
    }

    void display(int a){
        System.out.println("DISPLAY SUPER");
    }

}