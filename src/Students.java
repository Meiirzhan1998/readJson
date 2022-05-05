

import java.util.List;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String speciality;


    public Students(String firstName, String lastName, int age, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.speciality = speciality;
    }

    public Students(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    @Override
    public String toString() {
        return "Student:{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", speciality='" + speciality +
                '}';
    }
}


