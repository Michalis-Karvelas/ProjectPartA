package models;

import java.util.ArrayList;

public class AssignmentPerCourse {
    private ArrayList<Assignment> assignments;
    private Course course;

    public AssignmentPerCourse(ArrayList<Assignment> assignments, Course course) {
        this.assignments = assignments;
        this.course = course;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        String x="The assignments for course ";
        for(int i=0; i<assignments.size(); i++){
            if(i==0){
                x=x+course.getTitle()+" "+course.getStream()+" "+course.getType()+ " are: "
                +assignments.get(i).getTitle2()+" that has to be submitted at: " +assignments.get(i).getSubDateTime();
            }
            else{
                x=x+", "+assignments.get(i).getTitle2()+" that has to be submitted at: " +assignments.get(i).getSubDateTime();
            }
        }
        return x;
    }
}
