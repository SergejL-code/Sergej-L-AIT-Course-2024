package ClassWork_022.user1Password;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest { // Объект пользователя
    User user;
    final String email = "peter@mail.de";//ideal email
    final String password = "123456Az!";//ideal password

    @BeforeEach
        // Создаём новый объект User с корректным email и паролем
    void setUp() {
        user = new User(email, password);// great new "fresh" object-user
    }

    @Test
    void testValidEmail() {
        user.setEmail(email); // Устанавливаем email
        assertEquals("peter@mail.de", user.getEmail());// Проверяем, что email установлен правильно
    }

    //    -----------------------------------PasswordTest----------------------------------------------
    @Test
    void testValidPassword() {
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setEmailNotAt() {
        String email = "petermail.de";//wrong email Неправильный email (нет символа '@')
        user.setEmail(email);// Пытаемся установить неправильный email
        assertEquals("peter@mail.de", user.getEmail());//email didn't change Проверяем, что email не изменился
    }

//    @Test
    //   void setEmailNotLettes() {
    //      String email = "peter@mai.de";//wrong email Неправильный email (неправильный домен)
    //      user.setEmail(email);// Пытаемся установить неправильный email
    //      assertEquals("peter@mail.de", user.getEmail());// Проверяем, что email не изменился
    //  }

    @Test
    void setEmailWithTwoDots() {
        String email = "peter@mailde";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
        System.out.println(user.getEmail());
    }


    @Test
    void setValidPaswordLength() {
        user.setPassword("1234Az!");// 7 symbol
        assertEquals("123456Az!", user.getPassword());
        user.setPassword("123456123456123456123456Az!");   // 27 symbol
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordMinOneDigit() {
        user.setPassword("Agfdsgd!");
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneLetterUpperCase() {

        user.setPassword("123456az!");
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordOneLetterLowerCase() {
        user.setPassword("123456AZ!");
        assertEquals("123456Az!", user.getPassword());
    }

    @Test
    void setValidPasswordSpecialSymbol() {
        user.setPassword("123456Az");
        assertEquals("123456Az!", user.getPassword());
    }

}//end of class