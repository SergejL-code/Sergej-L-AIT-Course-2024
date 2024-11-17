package ClassWork_046_todo.ait.todolist.test;

import ClassWork_046_todo.ait.todolist.dao.ToDoListImpl;
import ClassWork_046_todo.ait.todolist.model.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListImplTest {
    //Поле toDoList — объект ToDoListImpl, который будет тестироваться.
ToDoListImpl toDoList;
    //поле now — текущая дата, используется для создания задач с фиксированными датами.
LocalDate now = LocalDate.now();

//тестовый набор данных
    @BeforeEach
    void setUp() {
       // В setUp создаётся новый экземпляр ToDoListImpl, и в него добавляются три задачи с разными датами.
        toDoList=new ToDoListImpl();
        toDoList.addTask(new Task("Do homework",now.minusDays(2)));
        toDoList.addTask(new Task("Bay products",now.minusDays(1)));
        toDoList.addTask(new Task("Wolk with pets",now.minusDays(3)));//три дня назад

        //печатаем  todolist
      //  System.out.println(toDoList);
    }

    @Test
        //Попытка добавить null должна возвращать false.
        //Дублирование задачи не допускается (здесь проверяется добавление задачи "Do homework").
        //При добавлении новой уникальной задачи toDoList должен вернуть true.
        // Проверка, что задача добавляется корректно
    void addTask() {
        // Проверка, что нельзя добавить null
        assertFalse(toDoList.addTask(null));

        // Проверка на дубликаты

        assertFalse(toDoList.addTask(new Task("Do homework",now.minusDays(2))));//добавим новый  task
        Task task = new Task("clean",now.minusDays(1));
        assertTrue(toDoList.addTask(task));
        assertEquals(4,toDoList.quantity()); // Ожидаемое количество задач должно быть 4
    }

    @Test
    void removeTask() {
        toDoList.removeTask(1); // Удаляем задачу по её номеру (здесь предполагается, что задачи индексируются от 0).

        assertEquals(2,toDoList.quantity());// Проверяем, что количество задач уменьшилось до 2
        toDoList.viewTasks();// Печать оставшихся задач

    }

    @Test
    //В этом тесте проверяется, что метод viewTasks выполняется без ошибок, выводя список всех задач.
    void viewTasks() {
        toDoList.viewTasks(); // Проверка метода просмотра задач
    }

    @Test
    /*Этот тест проверяет работу метода getAllTasks. Хотя здесь явно не проверяются значения, тест помогает убедиться, что метод getAllTasks выполняется без ошибок и возвращает корректные данные.*/
    void getAllTasks() {
        toDoList.getAllTasks();// Получение списка задач
        toDoList.viewTasks();// Печать всех задач
    }

    @Test
    //Проверяет, что метод quantity возвращает правильное количество задач. Сразу после инициализации список задач должен содержать ровно 3 задачи.
    void quantity() {
        assertEquals(3,toDoList.quantity());// Проверка на количество задач в списке (должно быть 3 после инициализации в `setUp`)
    }
}