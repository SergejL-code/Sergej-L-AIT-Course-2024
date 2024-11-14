package ClassWork_046_todo.ait.todolist.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
//*Comparable<Task>: позволяет сравнивать объекты Task между собой, что удобно для сортировки.
//Serializable: позволяет сохранять объекты Task в потоках байтов, что нужно для записи и чтения данных, например, в файл или базу данных.*/
public class Task implements Comparable<Task>, Serializable { // нужен для использования байтового потока IO
    private String task; // содержание задачи
    private LocalDate date; // дата создания задачи

    // constructor-Конструктор принимает task и date как параметры и инициализирует соответствующие поля.
    public Task(String task, LocalDate date) {
        this.task = task;
        this.date = date;
    }

    // геттеры и сеттеры
    // Геттеры (getTask, getDate) возвращают текущие значения полей task и date.
    // Сеттеры (setTask, setDate) позволяют изменять значения этих полей.

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task1)) return false;
        return Objects.equals(task, task1.task) && Objects.equals(date, task1.date);
    }
//Метод equals определяет условия, при которых два объекта Task считаются равными: они равны, если совпадают значения полей task и date.
//hashCode возвращает числовое значение, уникальное для каждого объекта Task, основанное на task и date. Это полезно для использования объектов Task в коллекциях, таких как HashMap и HashSet.

    @Override
    public int hashCode() {
        return Objects.hash(task, date);
    }

    // метод toString-возвращает строковое представление объекта Task, которое содержит описание задачи и дату.
    @Override
    public String toString() {
        return task + ", data: " + date;
    }

    @Override
    //Метод compareTo реализует интерфейс Comparable и позволяет сортировать объекты Task по дате создания. Этот метод сравнивает текущую задачу с другой задачей, возвращая отрицательное значение, ноль или положительное значение в зависимости от того, раньше, совпадает или позже текущая дата по сравнению с датой задачи o.
    public int compareTo(Task o) {
        return this.date.compareTo(o.date); // сортируем задачи по дате создания
    }
}
