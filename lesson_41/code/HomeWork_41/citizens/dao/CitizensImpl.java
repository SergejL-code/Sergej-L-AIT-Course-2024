package HomeWork_41.citizens.dao;

import HomeWork_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens {

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
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // O - ???// 0(logN)
    @Override
    public boolean add(Person person) {
        // что проверяем? - проверяем, что person -(это обьект) не равен null  т.е. существует.
        if (person == null) { //если person равен null, то добавление не произойдёт
            return false;  // возвращаем false
            // переходит к поиску
        }
        // что делает этот код? - в этом коде вызывается метод binarySearch из класса Collections и ищет person в idListе.
        int index = Collections.binarySearch(idList, person); // что делаем? переменной index типа int присваивается вызов метода binarySearch из класса Collections с аргументами idList и person,возвращает index
        if (index >= 0) { // что делаем, если index >= 0? - возвращаем index, что означает обьект на таком то index уже существует
            return false; // возвращаем false, т.к. person не добавлен повторно
        }
        index = -index - 1; // что делаем с index? зачем? - вычисляем index для добавления person в idlist, т.к index<0,;чтобы idlist остался  отсортированный
        idList.add(index, person); // что делаем? добавляем person  в idList на  index ,который  вычислили.
        // что делается в методе далее?  метод binarySearch из класса Collections ищет в agelist person  с помощью компаратора ageComparator сравнивая person по возрасту и id, и добавляется person.
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);
        //метод binarySearch из класса Collections ищет в lastNameList person  с помощью компаратора lastNameComparator сравнивая person по фамилий и id , и добавляется person.
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);
        return true; //возвращает true, что означает person добавлена
    }

    // O - ???//0(N)
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // O - ???//0(logN)
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // O - ???//O(log N)
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    // O - ???//O(log N)
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }

    // O - ???//O(1) возвращает ссылку на коллекцию
    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;
    }

    // O - ???//O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList;
    }

    // O - ???//O(1)
    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;
    }

    // O - ???//O(1)
    @Override
    public int size() {
        return idList.size();
    }
}
