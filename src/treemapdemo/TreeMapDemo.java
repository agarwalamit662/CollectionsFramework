package treemapdemo;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by amitagarwal3 on 9/13/2017.
 */
public class TreeMapDemo {

    public static void main(String[] args){

        TreeSet<A> map = new TreeSet<>();

        map.add(new A(2,"Nivi"));
        map.add(new A(1,"Amit"));
        map.add(new A(5,"Shyam"));
        map.add(new A(3,"Ram"));

        System.out.println(map.size());
        System.out.println(map);

        TreeMap<A,Integer> treeMap = new TreeMap<>();

        treeMap.put(new A(1,"Amit"),1);
        treeMap.put(new A(1,"Amits"),2);
        treeMap.put(new A(2,"Amits"),3);

        System.out.println(treeMap.size());
        System.out.println(treeMap);

    }

}


class A implements Comparable{

    int id;
    String name;

    public A(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        A a = (A)o;
        return this.id < a.id ? -1 : (this.id == a.id ? this.name.compareTo(a.name) : 1);
    }
}