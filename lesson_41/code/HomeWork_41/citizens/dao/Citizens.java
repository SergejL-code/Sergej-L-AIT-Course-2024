package HomeWork_41.citizens.dao;

import HomeWork_41.citizens.model.Person;

public interface Citizens  {
    boolean add(Person person);

    boolean remove(int id);

    Person find(int id);

    Iterable<Person> find(int minAge, int maxAge);

    Iterable<Person> find(String lastName);

    Iterable<Person> getAllPersonSortedById();

    Iterable<Person> getAllPersonSortedByLastName();

    Iterable<Person> getAllPersonSortedByAge();

    int size();
}
