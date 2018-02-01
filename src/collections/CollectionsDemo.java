package collections;

import java.util.*;

/**
 * Created by amitagarwal3 on 8/19/2017.
 */
public class CollectionsDemo {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("Raj");
        list.add("John");
        list.add("John");

        String[] arr = {"Anita"};

        Collections.addAll(list,arr);

        System.out.println("List"+list);

        // list.addAll(Arrays.asList(Array)
        Collections.sort(list);

        System.out.println("List1"+list);

        System.out.println("Is John There? "+Collections.binarySearch(
                list,"John"
        ));

        Collections.reverse(list);

        System.out.println("List1"+list);

        Collections.swap(list,0,3);

        System.out.println("List1"+list);

        Collections.shuffle(list);

        System.out.println("List1"+list);

        System.out.println(Collections.frequency(list,"John"));

        System.out.println("Max:" +Collections.max(list));
        System.out.println("Max:" +Collections.min(list));

        list.removeAll(Collections.singleton("John"));

        System.out.println("List1"+list);

        Collection<String> unmodifiable = Collections.unmodifiableCollection(list);

        System.out.println("Collection"+unmodifiable);

        System.out.println(unmodifiable.contains("Anita"));

        //unmodifiable.add("Lodu");

        list.add("JKN");

        System.out.println("Collection2"+unmodifiable);


    }
}
