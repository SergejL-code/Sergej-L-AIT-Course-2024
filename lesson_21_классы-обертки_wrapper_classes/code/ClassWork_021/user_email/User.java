package ClassWork_021.user_email;

public class User {
    private String email;
    private String password;
//constructor


    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

//Getter and Setter
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
    if(isEmailValid(email)){
        this.email=email;
    }else{
        System.out.println("Emial is not valid.");

    }

    }

    private boolean isEmailValid(String email) {
        // Find the index of the '@' symbol in the email
        // Находим индекс символа '@' в строке email

        int indexAt = email.indexOf('@'); // index where @ placed Переменная indexAt хранит индекс первой встречи символа '@' в строке.

        // If '@' is missing or there are multiple '@' symbols, return false
        // Если символ '@' отсутствует или встречается более одного раза, возвращаем false

        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        // Check if there is a '.' after the '@' symbol
        // Проверяем, есть ли точка '.' после символа '@'

        if(email.indexOf('.', indexAt) == -1){
            return false;
        }
        // Ensure the '.' is not placed in the last two positions of the email (e.g., 'abc@domain.c')
        // Убедимся, что точка '.' не находится на последних двух позициях строки (например, 'abc@domain.c')
        if(email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        // Loop through each character of the email
        // Проходим по каждому символу строки email
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            // Check if the character is alphabetic, digit, or one of the allowed special characters ('_', '-', '.', '@')
            // Проверяем, является ли символ буквой, цифрой или одним из допустимых специальных символов ('_', '-', '.', '@')
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\   Invalid characters like ±, /, |, or \ will return false
            }                   // Недопустимые символы, такие как ±, /, |, \ вызовут возврат false
        }
        // If all conditions are satisfied, the email is valid
        // Если все условия выполнены, email считается допустимым
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}//end of class

