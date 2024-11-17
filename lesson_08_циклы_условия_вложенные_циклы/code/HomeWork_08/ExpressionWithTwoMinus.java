package HomeWork_08;
//Чему равно значение выражения x-- + --x при x = 5? Проверьте свое предположение с помощью кода.
//What is the value of the expression x-- + --x at x = 5? Test your guess with code.

public class ExpressionWithTwoMinus {
    public static void main(String[] args) {
        int x = 5;
        int x_1 = x--;
        int x_2 = --x;
        int res = x_1 + x_2;
        System.out.println("the value of the expressionres is " + res);

    }
}
