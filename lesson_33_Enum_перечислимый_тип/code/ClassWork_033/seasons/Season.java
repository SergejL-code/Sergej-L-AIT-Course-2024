package ClassWork_033.seasons;

public enum Season {
    WINTER("Winter",90,1),SPRING("Spring",92,2),SOMMER("Summer",92,3),AUTUMN("Autumn",91,4); // 1,2,3,4--номер сезона
    //fields
    private String name;
    private int duration; // продолжительность
    private int number;

    Season(String name, int duration, int number) {
        this.name = name;
        this.duration = duration;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Season{");
        sb.append("name='").append(name).append('\'');
        sb.append(", duration=").append(duration);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
