package ClassWork_033.month;

/*Задайте Enum Month, определите месяца, их наименования и количество в них дней.
Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
Пример: AUG + 6 month = FEB
Проверьте работу метода в приложении.
 */
public enum Month {
    JAN("January", 31), FEB("February", 28), MAR("March", 31), APR("April", 30), MAY("May", 31), JUN("June", 30), JUL("July", 31), AUG("August", 31), SEP("Septembr", 30), OKT("Oktober", 31), NOV("November", 30), DEC("Dezember", 31);
    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Month{");
        sb.append("name='").append(name).append('\'');
        sb.append(", days=").append(days);
        sb.append('}');
        return sb.toString();
    }

    public Month plusMonth( int quantity) { //quantity- добавляемое число

        int n = this.ordinal();
        int index = n + quantity;
        Month[] months = values();//перегоняет все значения в массив Month[] month = Month.values()
        int res = index% months.length;
        //int res = index % 12;//13 % 12 = 1;   7 % 12 = 7;

        return months[res];
    }
}//end of class

