package be.intecbrussel.collection.set;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private double weight;
    private double height;

    public Person(String firstName, String lastName, Gender gender, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.weight, weight) == 0 && Double.compare(person.height,
                height) == 0 && firstName.equals(person.firstName) && lastName.equals(person.lastName) && gender.equals(person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age, weight, height);
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", gender='" + gender + '\'' + ", age=" + age + ", weight=" + weight + ", height=" + height + '}';
    }

    @Override
    public int compareTo(Person o) {
//        Comparator<Person> cmp1 = Comparator.comparingDouble(Person::getHeight);
//        Comparator<Person> cmp2 = Comparator.comparingInt(Person::getAge);
//        Comparator<Person> cmp3 = Comparator.comparingDouble(Person::getWeight);
//        Comparator<Person> cmp4 = Comparator.comparing(Person::getFirstName);
//        Comparator<Person> finalCmp = cmp1.thenComparing(cmp2).thenComparing(cmp3).thenComparing(cmp4);
//
//        return finalCmp.compare(this, o);

        // AUDRIC ---------------------------------------
//        double cmpThis;
//        double cmpObj;
//        for (int i = 0; i < 3; i++) {
//            switch (i) {
//                case 0:
//                    cmpThis = height;
//                    cmpObj = o.getHeight();
//                    break;
//                case 1:
//                    cmpThis = weight;
//                    cmpObj = o.getWeight();
//                    break;
//                case 2:
//                default:
//                    cmpThis = age;
//                    cmpObj = o.getAge();
//                    break;
//            }
//            if (cmpObj > cmpThis) return 1;
//            if (cmpObj < cmpThis) return -1;
//        }
//        return 0;
        // -----------------------------------------------------------
        // MERT ------------------------------------------------------
//        if (this.height == o.getHeight()){
//            if(this.age == o.getAge()){
//                if(this.weight == o.getWeight()){
//                    return 0;
//                }
//                return this.getWeight() - o.getWeight() > 0 ? 1 : -1;
//            }
//            return this.getAge() - o.getAge();
//        }
//        return this.getHeight() - o.getHeight() > 0 ? 1 : -1;
        // -----------------------------------------------------------

        return this.getFirstName().compareTo(o.getFirstName());
    }

    public enum Gender {
        NON_BINARY,
        MALE,
        FEMALE,
        ATTACK_HELICOPTER
    }
}
