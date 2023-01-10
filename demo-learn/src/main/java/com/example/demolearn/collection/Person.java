package com.example.demolearn.collection;

/**
 * @author jasper
 * @email jaspersteelxx@gmail.com
 * @create 2023-01-06 00:30
 **/
public class Person implements Comparable<Person> {
    String firstName;
    String lastName;
    int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!firstName.equals(person.firstName)) return false;
        return lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Person o) {
        return this.firstName.compareTo(o.firstName);
    }
}
