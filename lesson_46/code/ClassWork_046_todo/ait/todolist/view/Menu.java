package ClassWork_046_todo.ait.todolist.view;

import java.io.Serializable;

public enum Menu implements Serializable {

    ADD(1, "Add task"), LIST(2, "List of tasks"), REMOVE(3, "Remove task"), SAVE(4, "Save"), LOAD(5, "Load"), EXIT(6, "Exit");

    //fields
    private int menuItem;//  хранит целочисленное значение, представляющее номер пункта меню.
    private String action;// строка, которая описывает действие, соответствующее пункту меню (например, "Add task")

    // constructor
    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){   //это статический метод, который выводит все элементы меню в консоль.
        Menu[] menu = Menu.values(); // put enum items into array,возвращает массив всех элементов перечисления Menu.
        for (int i = 0; i < menu.length; i++) {//метод проходит по каждому элементу массива menu и выводит номер и описание действия.
            System.out.print((menu[i].menuItem) + " - " + menu[i].action + " | ");
        }
        System.out.println(); // new line
    }
}
