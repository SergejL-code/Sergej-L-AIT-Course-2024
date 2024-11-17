package HomeWork_33.weekDay;

public enum WeekDay {
   MON("Monday",1) ,
    TUE("Tuesday",2),
     WED  ("Wednesday",3),
    THU ("Thursday",4),
    FRI("Friday",5),
     SAT("Saturday",6),
     SUN ("Sunday",7);
//fields
    private String name;
    private int day;
//constructor
    WeekDay(String name, int day) {
        this.name = name;
        this.day= day;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("name='").append(name).append('\'');
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }
    //Method
    public WeekDay findDay(int quantity) {
        int n = this.ordinal(); // return index
        int index = n + quantity; // add the number of days
        WeekDay[] days = values(); // array of all elements of the WeekDay
        int res = index % days.length;
        return days[res];
    }
}// end of enum
