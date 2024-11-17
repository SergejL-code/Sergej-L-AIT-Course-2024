package ClassWork_046_todo.ait.todolist.appl;

import ClassWork_046_todo.ait.todolist.dao.ToDoListImpl;
import ClassWork_046_todo.ait.todolist.model.Task;
import ClassWork_046_todo.ait.todolist.view.Menu;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class ToDoListAppl implements Serializable {
    public static final String FILE_NAME = "task_list.dat";

    public static void main(String[] args) {
        // greeting При запуске приложения выводится приветственное сообщение.
        System.out.println("Welcome to To-Do Application!");

        ToDoListImpl toDoList = new ToDoListImpl();//toDoList — объект класса ToDoListImpl, который используется для хранения и управления списком задач.
        LocalDate now = LocalDate.now();//текущая дата, используется при создании новых задач.
        Scanner scanner = new Scanner(System.in);

        // начало цикла
        while (true) {
            Menu.printMenu(); // статический метод вызывается по имени класса
// ask choice
            System.out.print("Input your choice:  ");
// Проверка на корректный ввод числа (потому что сама вляпалась, введя буквы)))
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите целое число для выбора.");
                scanner.next(); // пропустить некорректный ввод

            }
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса.выводящий список доступных команд (меню) для пользователя.



            int choice = scanner.nextInt();
            // execute
            switch (choice) {//выполняет действие в зависимости от выбранного пункта.
                case 1: {//Запрашивает у пользователя описание задачи.
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task t = new Task(task, now);//Создаёт новую задачу с текущей датой (now) и добавляет её в toDoList.
                    toDoList.addTask(t);
                    break;
                }
                case 2: {//Выводит на экран все текущие задачи из списка toDoList с помощью метода viewTasks.
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");

                    int taskNumber = scanner.nextInt();//Запрашивает у пользователя номер задачи для удаления.
                    toDoList.removeTask(taskNumber); //Удаляет выбранную задачу, если номер корректен.
                    break;
                }
                case 4: {
                    System.out.println("Saving... ");
                    // call method
                    toDoList.saveTasks(FILE_NAME);
                    break;

                }
                case 5: {
                    // call method
                    System.out.println("Loading... ");
                    toDoList.loadTasks(FILE_NAME);
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


