package be.intecbrussel.collection.set;

import java.util.Collection;
import java.util.HashSet;

public class Exercice2Part2 {
    public static void main(String[] args) {
        Collection<Person> people = new HashSet<>();
        people.add(new Person("Audric", "Onockx", Person.Gender.MALE, 25, 178, 70));
        people.add(new Person("Jimmy", "Onockx", Person.Gender.MALE, 2, 45, 5));
        people.add(new Person("Morgane", "Onockx", Person.Gender.FEMALE, 28, 160, 60));
        people.add(new Person("Fart", "Onockx", Person.Gender.ATTACK_HELICOPTER, 73, 23, 0));
        people.add(new Person("Fart", "Onockx", Person.Gender.ATTACK_HELICOPTER, 73, 23, 0));

        for (Person p : people) {
            System.out.println(p);
        }

//        people.forEach(System.out::println);

    }
}
