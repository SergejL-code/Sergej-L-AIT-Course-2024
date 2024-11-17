package HomeWork_16.Student.model;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int birthday;
    private String specialization;

    public Student(int id, String name, String surname, int birthday, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    // toString method to output information
    public String Display() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", spezialisation='" + specialization + '\'' +
                '}';
    }

  public String Display_1() {
       return String.format("id: %d, Name: %s,Surname: %s, Birthday %d, spezialisation %s",id,name,surname,birthday,specialization);
   }



    // A method that outputs messages


    public void learn (){
        System.out.println(" Student " + name + surname + "learn.");
    }
    public  void  vacation(){
        System.out.println(" Student " + name + surname + " took a vacation ");
    }
    public  void exam (){
        System.out.println(" Student " + name + surname + "passes the exam for " + specialization);
    }
    public void sleep (){
        System.out.println(" Student" + name + surname + " sleep. ");
    }

}//end of class