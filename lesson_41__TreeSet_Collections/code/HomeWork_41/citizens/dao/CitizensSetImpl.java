package HomeWork_41.citizens.dao;

import HomeWork_41.citizens.model.Person;

import java.util.Comparator;
import java.util.TreeSet;

public class CitizensSetImpl implements Citizens {

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private TreeSet<Person> idSet;
    private TreeSet<Person> lastNameSet;
    private TreeSet<Person> ageSet;

    public CitizensSetImpl(TreeSet<Person> idSet, TreeSet<Person> lastNameSet, TreeSet<Person> ageSet) {
        this.idSet = new TreeSet<>();
        this.lastNameSet =new TreeSet<>();
        this.ageSet = new TreeSet<>();
    }
    public CitizensSetImpl(Iterable<Person> citizens) {

        citizens.forEach(this::add);
    }


    @Override
    public boolean add(Person person) {
        return false;
    }

    @Override
    public boolean remove(int id) {   Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idSet.remove(victim);
        ageSet.remove(victim);
        lastNameSet.remove(victim);
        return true;


    }

    @Override
    public Person find(int id) {
        return null;
    }

    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        return null;
    }

    @Override
    public Iterable<Person> find(String lastName) {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return null;
    }

    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
