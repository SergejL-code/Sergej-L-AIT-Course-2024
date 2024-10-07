package HomeWork_18.Tiere.modele;
/*Task 1. The Pet class has the following fields:
id, view, age, nickname. Create child classes Cat and Dog from the Pet class with additional fields:
breed, height, weight. Create a voice method that emits "Meow!" for the Cat class and "Woof-woof!" for the Dog class.
Create a HouseAppl that has a main method.Place 2 dogs and 3 cats in the house. Simulate life in this house during the day.
В классе Pet имеются поля:
id, вид, возраст, кличка.Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
порода, рост, вес. Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.*/

public class Pet {
    private  long id;
    private String view;
    private int age;
    private String nickname;

//Constructror
    public Pet(long id, String view, int age, String nickname) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickname = nickname;
    }
//Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getView() {
        return view;
    }
    public void setView(String view) {
        this.view = view;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public void voiceDogs() {
        System.out.println( view + " Woof-woof ");

    } public void voiceCats() {
        System.out.println( view + " Meow ");
    }
    public void sleep() {
        System.out.println(view+ " sleeping");
    }

    public void make() {
        System.out.println(view + " make sound");
    }

    public void play() {
        System.out.println(view + " play ");
    }

    public void walk() {
        System.out.println(view+ " walk");
    }

}//end of class
