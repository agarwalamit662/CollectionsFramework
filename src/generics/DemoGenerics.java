package generics;

import enums.Book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amitagarwal3 on 8/22/2017.
 */
public class DemoGenerics<T extends List> {

    public static void main(String[] args){

        DemoGenerics a = new DemoGenerics();
       // a.add(new ArrayList<Books>());

        List<String> str = new ArrayList<>();
        str.add("2");

      //  add(str);


    }

    public DemoGenerics(){

    }

    public static <U extends BookmarkGenerics>  void add(List<U> list){

                BookmarkGenerics a = (BookmarkGenerics) list.get(0);
                System.out.println(list);
                System.out.println(a);
    }

    public void subs(List<? extends BookmarkGenerics> list){
        list.get(0);
    }

    public void sub(List<? super BookmarkGenerics> list){
        list.add(new Books());
        list.get(0);
    }



}

class BookmarkGenerics{



}

class Books extends BookmarkGenerics{

}

class Weblink extends BookmarkGenerics{

}