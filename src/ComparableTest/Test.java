package ComparableTest;



import java.util.*;

/**
 * Created by amitagarwal3 on 8/31/2017.
 */
public class Test {

    public static void main(String[] args){

        List<PFFormInfoDetails> list = new ArrayList<>();

        PFFormInfoDetails pf = new PFFormInfoDetails();

        pf.setParentSeqNum("2");
        pf.setApplicantName("Amit");

        list.add(pf);

        pf = new PFFormInfoDetails();

        pf.setParentSeqNum("1");
        pf.setApplicantName("First");
        list.add(pf);

        pf = new PFFormInfoDetails();

        pf.setParentSeqNum("3");
        pf.setApplicantName("Three");
        list.add(pf);

        pf = new PFFormInfoDetails();

        pf.setParentSeqNum("5");
        pf.setApplicantName("Five");
        list.add(pf);

        pf = new PFFormInfoDetails();

        pf.setParentSeqNum("4");
        pf.setApplicantName("Four");
        list.add(pf);

        Collections.sort(list);

        Iterator<PFFormInfoDetails> iterator = list.iterator();
        while (iterator.hasNext()) {
            PFFormInfoDetails element = iterator.next();
            System.out.println("element: " + element);
        }


    }
}
