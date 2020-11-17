package models;

import java.util.ArrayList;

public class TrainerPerCourse {
    private ArrayList<Trainer> trainers;
    private Course course;

    public TrainerPerCourse(ArrayList<Trainer> trainers, Course course) {
        this.trainers = trainers;
        this.course = course;
    }

    public ArrayList<Trainer> getTrainer() {
        return trainers;
    }

    public void setTrainer(ArrayList<Trainer> trainer) {
        this.trainers = trainer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String toString() {
        String x="In course: ";
        for(int i=0; i<trainers.size(); i++){
            if(i==0){
                x=x+course.getTitle()+" "+course.getStream()+" "+course.getType()+ " the trainers that teach it are: "
                        +trainers.get(i).getFirstName()+" " +trainers.get(i).getLastName2();
            }
            else{
                x=x+", "+trainers.get(i).getFirstName()+" " +trainers.get(i).getLastName2();
            }
        }
        return x;
    }
}
