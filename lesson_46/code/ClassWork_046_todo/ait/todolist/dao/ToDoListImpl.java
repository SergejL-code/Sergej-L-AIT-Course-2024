package ClassWork_046_todo.ait.todolist.dao;

import ClassWork_046_todo.ait.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ToDoListImpl implements ToDoList {
    //куда все будет падать, храниться
private List<Task>tasks;//tasks: это список (List<Task>), который хранит объекты задач (Task). Используется ArrayList, так как это наиболее удобная структура данных для динамического хранения задач.
private int quantity;//Хранит текущее количество задач в списке. Обновляется при добавлении или удалении задач.


    public ToDoListImpl() {//убераем аргументы
        this.tasks = new ArrayList<>();//новый пустой список tasks для хранения задач.
        this.quantity = 0;//т.к. список  "резиновый".так как список tasks пустой.
    }

    @Override
    //Этот метод добавляет задачу в список tasks.
    public boolean addTask(Task task) {
       if(task == null || tasks.contains(task)){//Возвращает false, если задача null или уже присутствует в списке (проверяется методом contains).
       return false;}
        tasks.add(task);// метод add из ArrayList.Если задача уникальна и не null, она добавляется, и количество (quantity) обновляется с помощью tasks.size().
        quantity = tasks.size();
        return true;// Возвращает true, если задача была добавлена успешно.
    }

    @Override
    //Этот метод удаляет задачу по её порядковому номеру (taskNumber), который предполагается от 1 до количества задач (quantity).
    public Task removeTask(int taskNumber) {

        if(taskNumber>=1 && taskNumber <=quantity){
            Task victim = tasks.get(taskNumber-1);//Извлекает задачу (используя tasks.get(taskNumber - 1)), которая должна быть удалена.
            tasks.remove(victim);//Удаляет её из списка (tasks.remove(victim)).
            System.out.println("Task: " + victim.getTask() + " is removed.");//Печатает сообщение о том, что задача удалена.
            quantity--;//Уменьшает quantity на единицу и возвращает удалённую задачу (victim).
            return victim;
        }
        System.out.println("Wrong number of task.");//Если taskNumber вне допустимого диапазона, выводится сообщение об ошибке, и метод возвращает null.
        return null;
    }

    @Override
    public void viewTasks() {
      //  Этот метод выводит список всех задач на консоль, пронумеровывая их от 1.
//        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println((i+1)+". " + tasks.get(i));
//        }
//        for (Task t : tasks) {
//            System.out.println(t);
//        }

        IntStream.range(0,tasks.size())//создаёт поток индексов, от 0 до размера списка задач.
                .forEach(i-> System.out.println((i+1)+". "+tasks.get(i))); //выводит каждую задачу с порядковым номером, который на 1 больше, чем индекс.

    }

    @Override
    //Возвращает копию списка всех задач в виде List<Task>. Метод stream().toList() создаёт новый неизменяемый список задач.
    public List<Task> getAllTasks() {
        return tasks.stream().toList();
    }

    @Override
    public int quantity() {
        return quantity;
    }
}
