package be.intecbrussel.collection.exercices;

import be.intecbrussel.collection.set.Person;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class Exercice7 {
    public static void main(String[] args) {
//        SortedSet<Person> perSet = new TreeSet<>();
//        SortedSet<Person> perSet = new TreeSet<>(new AgeComparator());

//        SortedSet<Person> perSet = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return Double.compare(o1.getWeight(), o2.getWeight());
//            }
//        });

//        SortedSet<Person> perSet = new TreeSet<>((o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight()));

//        SortedSet<Person> perSet = new TreeSet<>(Comparator.comparingDouble(Person::getHeight));

        SortedSet<Person> perSet = new TreeSet<>(
                Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getFirstName)
                        .thenComparingDouble(Person::getWeight)
        );


        perSet.add(new Person("Audric", "Onockx", Person.Gender.MALE, 25, 178, 70));
        perSet.add(new Person("Zimmy", "Onockx", Person.Gender.ATTACK_HELICOPTER, 2, 55, 60));
        perSet.add(new Person("Morgane", "Onockx", Person.Gender.FEMALE, 28, 160, 60));
        perSet.add(new Person("Johnny", "Onockx", Person.Gender.NON_BINARY, 2, 45, 60));
        perSet.forEach(e -> System.out.println(e + " "));
        System.out.println();
    }
}
