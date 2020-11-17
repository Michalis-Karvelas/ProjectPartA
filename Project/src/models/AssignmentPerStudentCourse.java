package models;

import java.util.ArrayList;

    public class AssignmentPerStudentCourse {

        private ArrayList<AssignmentPerCourse> assignmentsPerCourse;
        private ArrayList<StudentPerCourse> studentsPerCourse;

        public AssignmentPerStudentCourse(ArrayList<AssignmentPerCourse> assignmentsPerCourse, ArrayList<StudentPerCourse> studentsPerCourse) {
            this.assignmentsPerCourse = assignmentsPerCourse;
            this.studentsPerCourse = studentsPerCourse;
        }

        public ArrayList<AssignmentPerCourse> getAssignmentsPerCourse() {
            return assignmentsPerCourse;
        }

        public void setAssignmentsPerCourse(ArrayList<AssignmentPerCourse> assignmentsPerCourse) {
            this.assignmentsPerCourse = assignmentsPerCourse;
        }

        public ArrayList<StudentPerCourse> getStudentsPerCourse() {
            return studentsPerCourse;
        }

        public void setStudentsPerCourse(ArrayList<StudentPerCourse> studentsPerCourse) {
            this.studentsPerCourse = studentsPerCourse;
        }

        @Override
        public String toString() {
            String x ="";
            for (int i = 0; i < assignmentsPerCourse.size(); i++) {
                    x = x + "The students for course: " + studentsPerCourse.get(i).getCourse().getTitle() +" " +
                            ""+ studentsPerCourse.get(i).getCourse().getStream() +" "+ studentsPerCourse.get(i).getCourse().getType() + "" +
                            " with their personal details are: " + studentsPerCourse.get(i).getStudents() + " and they have to submit the assignments with details: " +
                            " " + assignmentsPerCourse.get(i).getAssignments()+ "\n";
            }return x;
        }

}

