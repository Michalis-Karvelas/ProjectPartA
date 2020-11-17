package models;

import java.util.ArrayList;

public class StudentPerCourse {
    private ArrayList<Student> students;
    private Course course;

    public StudentPerCourse(ArrayList<Student> students, Course course) {
        this.students = students;
        this.course = course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        String x="In course: ";
        for(int i=0; i<students.size(); i++){
            if(i==0){
                x=x+course.getTitle()+" "+course.getStream()+" "+course.getType()+ " the students that are enrolled are: "
                        +students.get(i).getName()+" " +students.get(i).getLastName()+" born at "+students.get(i).getDateOfBirth();
            }
            else{
                x=x+", "+students.get(i).getName()+" " +students.get(i).getLastName()+" born at "+students.get(i).getDateOfBirth();
            }
        }
        return x;
    }
}
