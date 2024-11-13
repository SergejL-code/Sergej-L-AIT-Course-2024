package ClassWork_044_stream.programmer_and_technologies.model;

import java.util.List;
import java.util.Objects;

public class Programmer {
    private String nickname;
    private List<String> technology; //Set is also passible

    public Programmer(String nickname, List<String> technology) {
        this.nickname = nickname;
        this.technology = technology;
    }

    public String getNickname() {
        return nickname;
    }

    public List<String> getTechnology() {
        return technology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmer that)) return false;
        return Objects.equals(nickname, that.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nickname);
    }

    @Override
    public String toString() {
       return "Programmer: " + nickname +" , technology: " + technology.toString();
    }
}//end of class
