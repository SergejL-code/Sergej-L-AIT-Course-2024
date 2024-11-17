package ClassWork_039.ihash_set;

public class MyHashSetAppl {

    public static void main(String[] args) {

        // List<String> names = new ArrayList<>(20);

        ISet<String> mySet = new MyHashSet<>(64, 0.8);
        mySet.addElement("Boston");
        mySet.addElement("Berlin");
        mySet.addElement("Hamburg");
        mySet.addElement("New York");
        mySet.addElement("Washington");
        mySet.addElement("Augsburg");
        mySet.addElement("Atlanta");

        System.out.println(mySet.size());
        printSet(mySet);

        System.out.println(mySet.contains("Augsburg")); // true
        System.out.println(mySet.contains("Amberg")); // false
        System.out.println("----------------------------");
        mySet.remove("New York");
        System.out.println(mySet.size());
        printSet(mySet);

    }
    private static void printSet( ISet<String> set ){
        for (String  s : set) {
            System.out.println(s);
        }
    }
}
