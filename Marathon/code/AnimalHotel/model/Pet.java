package AnimalHotel.model;

import java.util.Objects;

public abstract class Pet {
    private String RegistrationNumber; //  id
    private String name;
    private String breed;
    private int age;
    private String owner;

    public Pet(String registrationNumber, String name, String breed, int age, String owner) {
        RegistrationNumber = registrationNumber;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return Objects.equals(RegistrationNumber, pet.RegistrationNumber) && Objects.equals(breed, pet.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RegistrationNumber, breed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("RegistrationNnumber='").append(RegistrationNumber).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", age=").append(age);
        sb.append(", owner='").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
