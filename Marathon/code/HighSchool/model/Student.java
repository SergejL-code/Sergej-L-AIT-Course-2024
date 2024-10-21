package HighSchool.model;

import java.util.Objects;

public class Student {
    private String StudentIDCard; // id
    private String name;
    private double grade;

    public Student(String studentIDCard, String name, double grade) {
        StudentIDCard = studentIDCard;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentIDCard() {
        return StudentIDCard;
    }

    public void setStudentIDCard(String studentIDCard) {
        StudentIDCard = studentIDCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Double.compare(grade, student.grade) == 0 && Objects.equals(StudentIDCard, student.StudentIDCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentIDCard, grade);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("StudentIDCard='").append(StudentIDCard).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", grade=").append(grade);
        sb.append('}');
        return sb.toString();
    }
}
