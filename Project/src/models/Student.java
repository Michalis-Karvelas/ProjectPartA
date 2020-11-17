package models;

import java.time.LocalDate;

public class Student {
    private String name;
    private String lastName;
    private String tuitionFees;
    private LocalDate dateOfBirth;

    public Student(String name, String lastName, String tuitionFees, LocalDate dateOfBirth){
        this.name=name;
        this.lastName=lastName;
        this.tuitionFees=tuitionFees;
        this.dateOfBirth=dateOfBirth;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(String tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

   @Override
    public String toString() {
       return "The name of student is: " + name +" "+ lastName+ " born at: "+dateOfBirth+  " with tuition fees of " +tuitionFees+ " Euro";
  }
}
