package toDoList;

public enum Menu {
    ADD(1, "add task"),
    VAT(2, "view all task"),
    DT(3, "delete a task"),
    EXIT(4, "exit the menu");
    private int number;
    private String action;

    Menu(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Menu{");
        sb.append("number=").append(number);
        sb.append(", action='").append(action).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getAction() {
        return action;
    }

    // method to print
    public static void printMenu() {
        for (Menu menu : Menu.values()) {
            System.out.println(menu.number + " : " + menu.action);
        }
    }
}


