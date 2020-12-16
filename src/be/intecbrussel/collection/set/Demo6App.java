package be.intecbrussel.collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo6App {
    public static void main(String[] args) {
        SortedSet<Integer> intSet = new TreeSet<>();
        intSet.add(15);
        intSet.add(45);
        intSet.add(44);
        intSet.add(8);
        intSet.add(15);

//        System.out.println(intSet.first());
//        System.out.println(intSet.last());

        NavigableSet<Integer> intSet2 = new TreeSet<>();
        intSet2.add(15);
        intSet2.add(45);
        intSet2.add(44);
        intSet2.add(8);
        intSet2.add(15);

        System.out.println(intSet2.first());
        System.out.println(intSet2.last());
        System.out.println();
        System.out.println(intSet2.ceiling(15));
        System.out.println(intSet2.higher(15));
        System.out.println();
        System.out.println(intSet2.floor(44));
        System.out.println(intSet2.lower(44));
    }
}
