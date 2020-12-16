package be.intecbrussel.collection.list;

import be.intecbrussel.collection.set.Person;

import java.util.Set;

public class DemoTestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Audric", "Onockx", Person.Gender.MALE, 25, 178, 70);
        Person p2 = new Person("Jimmy", "Onockx", Person.Gender.MALE, 2, 45, 5);
        Person p3 = new Person("Morgane", "Onockx", Person.Gender.FEMALE, 28, 160, 60);
        Person p4 = new Person("Fart", "Onockx", Person.Gender.ATTACK_HELICOPTER, 73, 23, 0);
        Person p5 = new Person("Fart", "Onockx", Person.Gender.ATTACK_HELICOPTER, 73, 23, 0);

        Set<Person> set = Set.of(p1,p2,p3,p4);
        p1.setFirstName("REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");

        set.forEach(System.out::println);
    }
}
