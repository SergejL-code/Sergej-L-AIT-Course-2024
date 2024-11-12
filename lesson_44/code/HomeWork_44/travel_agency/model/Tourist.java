package HomeWork_44.travel_agency.model;

import java.util.List;
import java.util.Objects;

public class Tourist implements Comparable<Tourist>{
    private String name;
    private List<String> country;

    public Tourist(String name, List<String> country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public List<String> getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tourist tourist)) return false;
        return Objects.equals(name, tourist.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        // Создаем StringBuilder для сборки строки
        StringBuilder sb = new StringBuilder();
        // Соединяем страны в столбик
        String countriesInColumn = String.join("\n", country);

        // Формируем строку с именем и списком стран
        sb.append(String.format("%s посетил такие страны, как:\n%s \n", name, countriesInColumn ));
        return sb.toString();
    }

    @Override
    public int compareTo(Tourist o) {
        // Сравнение туристов по имени в алфавитном порядке
        return this.name.compareTo(o.name);
    }

}