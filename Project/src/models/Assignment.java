package models;

import java.time.LocalDate;

public class Assignment {

    private String title2;
    private String description;
    private LocalDate subDateTime;
    //private String oralMark;
    //private String totalMark;

    public Assignment (String title2, String description, LocalDate subDateTime) { //String oralMark, String totalMark)
        this.title2=title2;
        this.description=description;
        this.subDateTime=subDateTime;
        //this.oralMark=oralMark;
        //this.totalMark=totalMark;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }



    @Override
    public String toString() {
        return "The assignment's title is: "+title2+". It's description is: "+description+" and it has to be submitted at "+subDateTime;
    }

}
