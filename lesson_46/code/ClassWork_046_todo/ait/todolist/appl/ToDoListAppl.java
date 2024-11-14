package ClassWork_046_todo.ait.todolist.appl;

import ClassWork_046_todo.ait.todolist.dao.ToDoListImpl;
import ClassWork_046_todo.ait.todolist.model.Task;
import ClassWork_046_todo.ait.todolist.view.Menu;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ToDoListAppl implements Serializable {
    public static void main(String[] args) {
        // greeting При запуске приложения выводится приветственное сообщение.
        System.out.println("Welcome to To-Do Application!");

        ToDoListImpl toDoList = new ToDoListImpl();//toDoList — объект класса ToDoListImpl, который используется для хранения и управления списком задач.
        LocalDate now = LocalDate.now();//текущая дата, используется при создании новых задач.
        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызывается по имени класса.выводящий список доступных команд (меню) для пользователя.
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
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
                    List<Task>taskList = toDoList.getAllTasks();//Получает все задачи из toDoList и записывает их в файл (task_list.dat) с помощью ObjectOutputStream.
                   // Этот блок обёрнут в try-with-resources для автоматического закрытия потока после записи.
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lesson_46/code/ClassWork_046_todo/ait/todolist/file/task_list.dat"))) {
                        oos.writeObject(taskList);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                }
                case 5: {
                    System.out.println("Loading... ");
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lesson_46/code/ClassWork_046_todo/ait/todolist/file/task_list.dat"))) {

                        List<Task>readTask=(List<Task>) ois.readObject();
                        System.out.println(readTask);
                        System.out.println("List of task");
                        int taskNumber =0;
                        for (Task task : readTask) {
                            System.out.println((taskNumber++ +1) + ". " + task.getTask()+ ", data: "+ task.getDate());
                           // taskNumber++;
                        }

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
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


