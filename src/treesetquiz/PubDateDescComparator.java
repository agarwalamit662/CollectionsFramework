package treesetquiz;

import java.util.Comparator;

/**
 * Created by amitagarwal3 on 8/18/2017.
 */
public class PubDateDescComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Book b1 = (Book)o1;
        Book b2 = (Book)o2;
        int year1 = b1.getYear();
        int year2 = b2.getYear();

        if(year2>year1){
            return 1;
        }
        else if(year2<year1){
            return -1;
        }
        else if(year1 == year2){
            return b1.getTitle().compareTo(b2.getTitle());
        }

        return 0;
    }
}
