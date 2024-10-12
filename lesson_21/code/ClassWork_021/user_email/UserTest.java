package ClassWork_021.user_email;

import ClassWork_022.user1Password.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest { // Объект пользователя
User user;
final String email = "peter@mail.de";//ideal email
final String password = "123456Az!";//ideal password

    @BeforeEach
        // Создаём новый объект User с корректным email и паролем
    void setUp() {
        user=new User(email,password);// great new "fresh" object-user
    }

    @Test
    void testValidEmail(){
        user.setEmail(email); // Устанавливаем email
        assertEquals("peter@mail.de",user.getEmail());// Проверяем, что email установлен правильно
    }

    @Test
    void setEmailNotAt() {
        String email = "petermail.de";//wrong emailНеправильный email (нет символа '@')
        user.setEmail(email);// Пытаемся установить неправильный email
        assertEquals("peter@mail.de",user.getEmail());//email didn't change Проверяем, что email не изменился
    }
    @Test
    void setEmailNotLettes(){
        String email = "peter@mai.de";//wrong email Неправильный email (неправильный домен)
        user.setEmail(email);// Пытаемся установить неправильный email
        assertEquals("peter@mail.de",user.getEmail());// Проверяем, что email не изменился
    }
    @Test
    void setEmailNotEmail(){
        String email = "peter@mail..de";
        user.setEmail(email);
        assertEquals("peter@mail..de",user.getEmail());
    }

    @Test
    void setPassword() {

    }
}