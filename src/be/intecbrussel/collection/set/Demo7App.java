package be.intecbrussel.collection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo7App {
    public static void main(String[] args) {
        SortedSet<String> strSet = new TreeSet<>(Comparator.reverseOrder());
        strSet.add("Hello");
        strSet.add("Apple");
        strSet.forEach(e -> System.out.println(e + " "));
        System.out.println();

        SortedSet<Boolean> booSet = new TreeSet<>();
        booSet.add(true);
        booSet.add(true);
        booSet.add(false);
        booSet.forEach(e -> System.out.println(e + " "));
        System.out.println();

//        SortedSet<Person> perSet = new TreeSet<>(Comparator.comparingDouble(Person::getHeight).thenComparingInt(Person::getAge));
//
//        SortedSet<Person> perSet = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        // Person needs to implement Comparable<Person>
        SortedSet<Person> perSet = new TreeSet<>(Comparator.comparing(Person::getGender));
        perSet.add(new Person("Audric", "Onockx", Person.Gender.MALE, 25, 178, 70));
        perSet.add(new Person("Zimmy", "Onockx", Person.Gender.ATTACK_HELICOPTER, 2, 55, 60));
        perSet.add(new Person("Morgane", "Onockx", Person.Gender.FEMALE, 28, 160, 60));
        perSet.add(new Person("Johnny", "Onockx", Person.Gender.NON_BINARY, 2, 45, 60));
        perSet.forEach(e -> System.out.println(e + " "));
        System.out.println();
    }
}
