package models;

public class Trainer {

    private String firstName;
    private String lastName2;
    //private String subject;

    public Trainer(String firstName, String lastName2){
        this.firstName=firstName;
        this.lastName2=lastName2;
        //this.subject=subject;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    @Override
    public String toString() {
        return "Trainer: " + firstName+" " +lastName2;
    }
}
