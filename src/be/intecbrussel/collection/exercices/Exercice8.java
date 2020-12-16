package be.intecbrussel.collection.exercices;

import be.intecbrussel.collection.set.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercice8 {
    public static void main(String[] args) {
        List<Person> perList = new ArrayList<>();
        perList.add(new Person("Audric", "Onockx", Person.Gender.MALE, 25, 178, 70));
        perList.add(new Person("Zimmy", "Onockx", Person.Gender.ATTACK_HELICOPTER, 2, 55, 60));
        perList.add(new Person("Morgane", "Onockx", Person.Gender.FEMALE, 28, 160, 60));
        perList.add(new Person("Johnny", "Onockx", Person.Gender.NON_BINARY, 2, 45, 60));

        perList.sort(Comparator.naturalOrder());
        perList.sort(Comparator.comparingDouble(Person::getWeight).reversed());

        perList.forEach(e -> System.out.println(e + " "));
    }
}
