package ClassWork_046_todo.ait.todolist.dao;

import ClassWork_046_todo.ait.todolist.model.Task;

import java.util.List;

public class ToDoListImpl implements ToDoList {


    @Override
    public boolean addTask(Task task) {
        return false;
    }

    @Override
    public Task removeTask(int taskNumber) {
        return null;
    }

    @Override
    public void viewTasks() {

    }

    @Override
    public List<Task> getAllTasks() {
        return List.of();
    }

    @Override
    public int quantity() {
        return 0;
    }
}
