package classwork_46.todolist;

import ClassWork_046_todo.ait.todolist.dao.ToDoListImpl;

import ClassWork_046_todo.ait.todolist.view.Menu;

import java.io.*;
import java.util.Scanner;

public class ToDoListAppl implements Serializable{
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");

         ToDoListImpl toDoList = new ToDoListImpl();

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");

                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");

                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");

                    break;
                }
                case 4: {
                    System.out.println("Saving... ");

                    break;
                }
                case 5:{
                    System.out.println("Loading... ");
                    break;
                }
                case 6:
                    return;
                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}


