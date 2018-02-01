package StreamTest;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by amitagarwal3 on 9/18/2017.
 */
public class Employee implements Collection {

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(){

    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args){

        INDIVIDUAL_Custom_Collection coll = new INDIVIDUAL_Custom_Collection();
        INDIVIDUAL_Custom_Cargo cargo = new INDIVIDUAL_Custom_Cargo();
        cargo.setRlvn_ind("3");
        cargo.setIndv_seq_num("1");
        cargo.setFst_nam("Amit");

        coll.addCargo(cargo);

        cargo = new INDIVIDUAL_Custom_Cargo();
        cargo.setRlvn_ind("1");
        cargo.setIndv_seq_num("2");
        cargo.setFst_nam("Sumit");

        coll.addCargo(cargo);

        cargo = new INDIVIDUAL_Custom_Cargo();
        cargo.setRlvn_ind("3");
        cargo.setIndv_seq_num("3");
        cargo.setFst_nam("Lala");

        coll.addCargo(cargo);

        cargo = new INDIVIDUAL_Custom_Cargo();
        cargo.setRlvn_ind("3");
        cargo.setIndv_seq_num("3");
        cargo.setFst_nam("Lala");

        coll.addCargo(cargo);

        ArrayList<String> addToNewIndv = (ArrayList<String>) coll.stream().filter(cargos -> Integer.parseInt(((INDIVIDUAL_Custom_Cargo) cargos).getRlvn_ind())==3 ).map(cargos-> ((INDIVIDUAL_Custom_Cargo) cargos).getIndv_seq_num()).distinct().collect(Collectors.toList());

        System.out.println(addToNewIndv);

        /*List<String> strings = Arrays.asList("1","2","1","2","1","3");

        List<Integer> intList = strings.stream().filter(string-> string.equals("1")).map(string -> Integer.parseInt(string)).collect(Collectors.toList());




        List<Integer> list = (List<Integer>) e.stream().filter(f -> ((Employee) f).getId()==1).map(f-> ((Employee) f).getId()).collect(Collectors.toList());

        *//*List<Integer> list2 = (List<Integer>) e.stream().filter(new Predicate() {
            @Override
            public boolean test(Object f) {
                return ((Employee) f).getId() == 1;
            }
        }).map(new Function() {
            @Override
            public Object apply(Object f) {
                return ((Employee) f).getId();
            }
        }).collect(Collectors.toList());*//*

        System.out.println(intList);*/
        ArrayList<String> indvSqNumList = new ArrayList<>();
        indvSqNumList.add("1");
        indvSqNumList.add("2");
        try {
            INDIVIDUAL_Custom_Collection filteredIndvCustomColl = (INDIVIDUAL_Custom_Collection) coll.stream().filter(cargod -> indvSqNumList.contains(
                    ((INDIVIDUAL_Custom_Cargo) cargod).getIndv_seq_num())).collect(Collectors.toCollection(INDIVIDUAL_Custom_Collection::new));

            System.out.println(filteredIndvCustomColl);
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
