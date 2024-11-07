package HomeWork_41.map_home;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapchen {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Mama");
        map.put(2, "putz");
        map.put(3, " das Fenster");

        String string1 = map.get(1);
        String string2 = map.get(2);
        String string3 = map.get(3);
        System.out.println(string3 + " " + string2 + " " + string1);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
        }
        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        System.out.println(first);
        System.out.println("****************************************************************");
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        System.out.println(keys);
        System.out.println("****************************************************************");
        // получить набор всех значений
        Collection<String> values = states.values();
        System.out.println(values);
        System.out.println("****************************************************************");
        //заменить элемент
        states.replace(1, "Poland");
        System.out.println(values);
        System.out.println("****************************************************************");
        // удаление элемента по ключу 2
        states.remove(2);
        System.out.println(values);
        System.out.println("****************************************************************");
        // перебор элементов
        for (Map.Entry<Integer, String> item : states.entrySet()) {

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for (Map.Entry<String, Person> item : people.entrySet()) {

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }

        people.replace("1240i54", new Person("Sergej"));
        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getValue().getName());
        }
    }
}
