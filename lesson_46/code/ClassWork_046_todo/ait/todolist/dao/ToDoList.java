package ClassWork_046_todo.ait.todolist.dao;

import ClassWork_046_todo.ait.todolist.model.Task;

import java.util.List;

public interface ToDoList {

    /* add Task Метод добавляет новую задачу (Task) в список задач.
    Параметры: Принимает объект типа Task.
    Возвращает: boolean, который указывает, была ли задача успешно добавлена (true — добавлена успешно false — не добавлена).*/
    boolean addTask(Task task);

    /* remove Tas Метод удаляет задачу по её порядковому номеру (taskNumber) из списка.
    Параметры: Принимает целое число taskNumber, представляющее индекс или номер задачи в списке.
    Возвращает: Объект Task, который был удалён, или null, если задача с указанным номером не найдена.*/
    Task removeTask(int taskNumber);

    /* print list of Tasks
     Метод выводит список всех задач в консоль (или, возможно, в пользовательский интерфейс). Этот метод не возвращает никаких значений, так как его основное предназначение — вывод информации.
    Параметры: Не имеет параметров.
    Возвращает: void (ничего).*/
    void viewTasks();

    /* взять весь список
    Метод возвращает список всех задач в виде списка (List<Task>).
    Параметры: Нет параметров.
    Возвращает: List<Task>, содержащий все задачи, что позволяет получить полный доступ к списку.*/
    List<Task> getAllTasks();

    /* quantity of tasks
    Описание: Метод возвращает количество задач в списке.
    Параметры: Нет параметров.
    Возвращает: int, представляющий количество задач.*/
    int quantity();

}
