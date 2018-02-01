package NestedClasses;

/**
 * Created by amitagarwal3 on 8/27/2017.
 */
public class StaticNestedClasses extends B {

    public static void main(String[] args){

        new B.Inner();

        StaticNestedClasses a = new StaticNestedClasses();
        //Inner inner = new NestedClasses.StaticNestedClasses().Inner();
        StaticNestedClasses.Hello hello = new StaticNestedClasses.Hello();
        int bs = hello.a;
        HelloChutiya b = a.new HelloChutiya();

        NestedInner ni = a.new NestedInner();
        int c = ni.a;

    }

    static class Hello{
        final int a = 10;
    }

    class HelloChutiya{
        int a = 10;
    }

}

class B{

    static class Inner
    {
        int a = 10;

    }

    class NestedInner
    {
        public int a = 10;

    }

}
