package models;

import extramethods.LocalDateCreation;

import java.util.ArrayList;


public class HardCode {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Student> studentsNoDuplicate =new ArrayList<>();
    private ArrayList<Student> studentsToMoreThanOneCourse=new ArrayList<>();
    private ArrayList<Trainer> trainers = new ArrayList<>();
    private ArrayList<Trainer> trainersNoDuplicate = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Assignment> assignments= new ArrayList<>();
    private ArrayList<AssignmentPerCourse> assignmentsPerCourse=new ArrayList<>();
    private ArrayList<TrainerPerCourse> trainersPerCourse=new ArrayList<>();
    private ArrayList<StudentPerCourse> studentsPerCourse=new ArrayList<>();
    private ArrayList<AssignmentPerStudentCourse> assignmentsPerStudentCourses=new ArrayList<AssignmentPerStudentCourse>();

    public HardCode(){

        Course course1=new Course("CB7","Java","Part Time",LocalDateCreation.stringToDate("16/12/2019"),LocalDateCreation.stringToDate("05/06/2020"));
        courses.add(course1);
        Course course2=new Course("CB7","Python","Part Time",LocalDateCreation.stringToDate("16/12/2019"),LocalDateCreation.stringToDate("05/06/2020"));
        courses.add(course2);//,assignments
        Course course3=new Course("CB7","Python","Full Time",LocalDateCreation.stringToDate("12/03/2020"),LocalDateCreation.stringToDate("29/06/2020"));
        courses.add(course3);
        Course course4=new Course("CB7","Java","Full Time",LocalDateCreation.stringToDate("12/03/2020"),LocalDateCreation.stringToDate("29/06/2020"));
        courses.add(course4);
        Course course5=new Course("CB12","Java","Part Time",LocalDateCreation.stringToDate("15/07/2020"),LocalDateCreation.stringToDate("26/01/2021"));
        courses.add(course5);
        Course course6=new Course("CB12","Java","Full Time",LocalDateCreation.stringToDate("19/10/2020"),LocalDateCreation.stringToDate("16/02/2021"));
        courses.add(course6);
        Course course7=new Course("CB12","C#","Part Time",LocalDateCreation.stringToDate("15/07/2020"),LocalDateCreation.stringToDate("26/01/2021"));
        courses.add(course7);
        Course course8=new Course("CB12","C#","Full Time",LocalDateCreation.stringToDate("19/10/2020"),LocalDateCreation.stringToDate("16/02/2021"));
        courses.add(course8);


        Assignment assignment1=new Assignment("Exercise 1","Knowledge test in lessons 1-6" ,LocalDateCreation.stringToDate("21/01/2020" ));
        assignments.add(assignment1);
        Assignment assignment2=new Assignment("Exercise 2","Knowledge test in lessons 6-11" ,LocalDateCreation.stringToDate("06/04/2020" ));
        assignments.add(assignment2);
        Assignment assignment3=new Assignment("Project","Make a school structure program" ,LocalDateCreation.stringToDate("01/06/2020" ));
        assignments.add(assignment3);
        Assignment assignment4=new Assignment("Exercise 1","Knowledge test in lessons 1-6" ,LocalDateCreation.stringToDate("21/01/2020" ));
        assignments.add(assignment4);
        Assignment assignment5=new Assignment("Exercise 2","Knowledge test in lessons 6-11" ,LocalDateCreation.stringToDate("06/04/2020" ));
        assignments.add(assignment5);
        Assignment assignment6=new Assignment("Project","Make a school structure program" ,LocalDateCreation.stringToDate("01/06/2020" ));
        assignments.add(assignment6);
        Assignment assignment7=new Assignment("Exercise 1","Knowledge test in lessons 1-5" ,LocalDateCreation.stringToDate("14/04/2020"));
        assignments.add(assignment7);
        Assignment assignment8=new Assignment("Exercise 2","Knowledge test in lessons 5-10" ,LocalDateCreation.stringToDate("21/05/2020" ));
        assignments.add(assignment8);
        Assignment assignment9=new Assignment("Project","Make a Tic Tack Toe game" ,LocalDateCreation.stringToDate("27/06/2020" ));
        assignments.add(assignment9);
        Assignment assignment10=new Assignment("Exercise 1","Knowledge test in lessons 1-5" ,LocalDateCreation.stringToDate("14/04/2020" ));
        assignments.add(assignment10);
        Assignment assignment11=new Assignment("Exercise 2","Knowledge test in lessons 5-10" ,LocalDateCreation.stringToDate("21/05/2020" ));
        assignments.add(assignment11);
        Assignment assignment12=new Assignment("Project","Make a Tic Tack Toe game" ,LocalDateCreation.stringToDate("27/06/2020" ));
        assignments.add(assignment12);
        Assignment assignment13=new Assignment("Exercise 1","Knowledge test in lessons 1-6" ,LocalDateCreation.stringToDate("29/08/2020" ));
        assignments.add(assignment13);
        Assignment assignment14=new Assignment("Exercise 2","Knowledge test in lessons 6-11" ,LocalDateCreation.stringToDate("21/11/2020" ));
        assignments.add(assignment14);
        Assignment assignment15=new Assignment("Project","Make a school structure program" ,LocalDateCreation.stringToDate("22/01/2021"));
        assignments.add(assignment15);
        Assignment assignment16=new Assignment("Exercise 1","Knowledge test in lessons 1-5" ,LocalDateCreation.stringToDate("20/11/2020" ));
        assignments.add(assignment16);
        Assignment assignment17=new Assignment("Exercise 2","Knowledge test in lessons 5-10" ,LocalDateCreation.stringToDate("27/12/2020" ));
        assignments.add(assignment17);
        Assignment assignment18=new Assignment("Project","Make a Tic Tack Toe game" ,LocalDateCreation.stringToDate("23/01/2021" ));
        assignments.add(assignment18);
        Assignment assignment19=new Assignment("Exercise 1","Knowledge test in lessons 1-6" ,LocalDateCreation.stringToDate("29/08/2020" ));
        assignments.add(assignment19);
        Assignment assignment20=new Assignment("Exercise 2","Knowledge test in lessons 6-11" ,LocalDateCreation.stringToDate("21/11/2020" ));
        assignments.add(assignment20);
        Assignment assignment21=new Assignment("Project","Make a school structure program" ,LocalDateCreation.stringToDate("22/01/2021" ));
        assignments.add(assignment21);
        Assignment assignment22=new Assignment("Exercise 1","Knowledge test in lessons 1-5" ,LocalDateCreation.stringToDate("20/11/2020" ));
        assignments.add(assignment22);
        Assignment assignment23=new Assignment("Exercise 2","Knowledge test in lessons 5-10" ,LocalDateCreation.stringToDate("27/12/2020" ));
        assignments.add(assignment23);
        Assignment assignment24=new Assignment("Project","Make a Tic Tack Toe game" ,LocalDateCreation.stringToDate("23/01/2021" ));
        assignments.add(assignment24);
        ArrayList<Assignment>assignmentsCourse1=new ArrayList<Assignment>();
        assignmentsCourse1.add(assignment1);
        assignmentsCourse1.add(assignment2);
        assignmentsCourse1.add(assignment3);
        ArrayList<Assignment>assignmentsCourse2=new ArrayList<Assignment>();
        assignmentsCourse2.add(assignment4);
        assignmentsCourse2.add(assignment5);
        assignmentsCourse2.add(assignment6);
        ArrayList<Assignment>assignmentsCourse3=new ArrayList<Assignment>();
        assignmentsCourse3.add(assignment7);
        assignmentsCourse3.add(assignment8);
        assignmentsCourse3.add(assignment9);
        ArrayList<Assignment>assignmentsCourse4=new ArrayList<Assignment>();
        assignmentsCourse4.add(assignment10);
        assignmentsCourse4.add(assignment11);
        assignmentsCourse4.add(assignment12);
        ArrayList<Assignment>assignmentsCourse5=new ArrayList<Assignment>();
        assignmentsCourse5.add(assignment13);
        assignmentsCourse5.add(assignment14);
        assignmentsCourse5.add(assignment15);
        ArrayList<Assignment>assignmentsCourse6=new ArrayList<Assignment>();
        assignmentsCourse6.add(assignment16);
        assignmentsCourse6.add(assignment17);
        assignmentsCourse6.add(assignment18);
        ArrayList<Assignment>assignmentsCourse7=new ArrayList<Assignment>();
        assignmentsCourse7.add(assignment19);
        assignmentsCourse7.add(assignment20);
        assignmentsCourse7.add(assignment21);
        ArrayList<Assignment>assignmentsCourse8=new ArrayList<Assignment>();
        assignmentsCourse8.add(assignment22);
        assignmentsCourse8.add(assignment23);
        assignmentsCourse8.add(assignment24);

        AssignmentPerCourse assignmentPerCourse1=new AssignmentPerCourse(assignmentsCourse1,course1);
        assignmentsPerCourse.add(assignmentPerCourse1);
        AssignmentPerCourse assignmentPerCourse2=new AssignmentPerCourse(assignmentsCourse2,course2);
        assignmentsPerCourse.add(assignmentPerCourse2);
        AssignmentPerCourse assignmentPerCourse3=new AssignmentPerCourse(assignmentsCourse3,course3);
        assignmentsPerCourse.add(assignmentPerCourse3);
        AssignmentPerCourse assignmentPerCourse4=new AssignmentPerCourse(assignmentsCourse4,course4);
        assignmentsPerCourse.add(assignmentPerCourse4);
        AssignmentPerCourse assignmentPerCourse5=new AssignmentPerCourse(assignmentsCourse5,course5);
        assignmentsPerCourse.add(assignmentPerCourse5);
        AssignmentPerCourse assignmentPerCourse6=new AssignmentPerCourse(assignmentsCourse6,course6);
        assignmentsPerCourse.add(assignmentPerCourse6);
        AssignmentPerCourse assignmentPerCourse7=new AssignmentPerCourse(assignmentsCourse7,course7);
        assignmentsPerCourse.add(assignmentPerCourse7);
        AssignmentPerCourse assignmentPerCourse8=new AssignmentPerCourse(assignmentsCourse8,course8);
        assignmentsPerCourse.add(assignmentPerCourse8);


        Trainer trainer1=new Trainer("Vladimiros","Fotiadis");
        trainers.add(trainer1);
        trainersNoDuplicate.add(trainer1);
        Trainer trainer2=new Trainer("George","Pasparakis" );
        trainers.add(trainer2);
        trainersNoDuplicate.add(trainer2);
        Trainer trainer3=new Trainer("Dimitris","Nikolidakis");
        trainers.add(trainer3);
        trainersNoDuplicate.add(trainer3);
        Trainer trainer4=new Trainer("Rania","Bousiou");
        trainers.add(trainer4);
        trainersNoDuplicate.add(trainer4);
        Trainer trainer5=new Trainer("Maria","Georgiou");
        trainers.add(trainer5);
        trainersNoDuplicate.add(trainer5);

        ArrayList<Trainer>trainersPerCourse1=new ArrayList<>();
        trainersPerCourse1.add(trainer4);
        ArrayList<Trainer>trainersPerCourse2=new ArrayList<>();
        trainersPerCourse2.add(trainer5);
        ArrayList<Trainer>trainersPerCourse3=new ArrayList<>();
        trainersPerCourse3.add(trainer4);
        ArrayList<Trainer>trainersPerCourse4=new ArrayList<>();
        trainersPerCourse4.add(trainer1);
        ArrayList<Trainer>trainersPerCourse5=new ArrayList<>();
        trainersPerCourse5.add(trainer3);
        ArrayList<Trainer>trainersPerCourse6=new ArrayList<>();
        trainersPerCourse6.add(trainer2);
        trainersPerCourse6.add(trainer3);
        ArrayList<Trainer>trainersPerCourse7=new ArrayList<>();
        trainersPerCourse7.add(trainer2);
        trainersPerCourse7.add(trainer1);
        ArrayList<Trainer>trainersPerCourse8=new ArrayList<>();
        trainersPerCourse8.add(trainer5);

        TrainerPerCourse trainerPerCourse1=new TrainerPerCourse(trainersPerCourse1,course1);
        trainersPerCourse.add(trainerPerCourse1);
        TrainerPerCourse trainerPerCourse2=new TrainerPerCourse(trainersPerCourse2,course2);
        trainersPerCourse.add(trainerPerCourse2);
        TrainerPerCourse trainerPerCourse3=new TrainerPerCourse(trainersPerCourse3,course3);
        trainersPerCourse.add(trainerPerCourse3);
        TrainerPerCourse trainerPerCourse4=new TrainerPerCourse(trainersPerCourse4,course4);
        trainersPerCourse.add(trainerPerCourse4);
        TrainerPerCourse trainerPerCourse5=new TrainerPerCourse(trainersPerCourse5,course5);
        trainersPerCourse.add(trainerPerCourse5);
        TrainerPerCourse trainerPerCourse6=new TrainerPerCourse(trainersPerCourse6,course6);
        trainersPerCourse.add(trainerPerCourse6);
        TrainerPerCourse trainerPerCourse7=new TrainerPerCourse(trainersPerCourse7,course7);
        trainersPerCourse.add(trainerPerCourse7);
        TrainerPerCourse trainerPerCourse8=new TrainerPerCourse(trainersPerCourse8,course8);
        trainersPerCourse.add(trainerPerCourse8);


        Student student1=new Student("Mixalis", "Karvelas", "0", LocalDateCreation.stringToDate("12/04/1992"));
        students.add(student1);
        studentsNoDuplicate.add(student1);
        Student student2=new Student("Lefteris", "Papadogiannis", "0", LocalDateCreation.stringToDate("19/09/1991"));
        students.add(student2);
        studentsNoDuplicate.add(student2);
        Student student3=new Student("Antonis", "Liakonis", "0", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student3);
        studentsNoDuplicate.add(student3);
        Student student4=new Student("Kuriaki", "Maniki", "450", LocalDateCreation.stringToDate("16/07/1992"));
        students.add(student4);
        studentsNoDuplicate.add(student4);
        Student student5=new Student("Sofia", "Kosti", "0", LocalDateCreation.stringToDate("05/01/2000"));
        students.add(student5);
        studentsNoDuplicate.add(student5);
        Student student6=new Student("Vasilis", "Papoutsis", "640", LocalDateCreation.stringToDate("17/08/1992"));
        students.add(student6);
        studentsNoDuplicate.add(student6);
        Student student7=new Student("Panos", "Karagiannelos", "0", LocalDateCreation.stringToDate("21/10/1992"));
        students.add(student7);
        studentsNoDuplicate.add(student7);
        Student student8=new Student("Dimitris", "Tragidis", "1500", LocalDateCreation.stringToDate("26/11/1991"));
        students.add(student8);
        studentsNoDuplicate.add(student8);
        Student student9=new Student("Nikolas", "Karavasilis", "200", LocalDateCreation.stringToDate("25/09/1995"));
        students.add(student9);
        studentsNoDuplicate.add(student9);
        Student student10=new Student("Aggelos", "Papanastasiou", "0", LocalDateCreation.stringToDate("05/10/1999"));
        students.add(student10);
        studentsNoDuplicate.add(student10);
        Student student11=new Student("Xristos", "Vlachos", "1700", LocalDateCreation.stringToDate("26/04/2001"));
        students.add(student11);
        studentsNoDuplicate.add(student11);
        Student student12=new Student("Anastasia", "Kollia", "450", LocalDateCreation.stringToDate("14/06/1994"));
        students.add(student12);
        studentsNoDuplicate.add(student12);
        Student student13=new Student("Tasos", "Pagonis", "700", LocalDateCreation.stringToDate("30/12/1991"));
        students.add(student13);
        studentsNoDuplicate.add(student13);
        Student student14=new Student("Dimitris", "Dimitriadis", "2000", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student14);
        studentsNoDuplicate.add(student14);
        Student student15=new Student("Antonis", "Liakonis", "0", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student15);
        studentsNoDuplicate.add(student15);
        Student student16=new Student("Dimitris", "Dimitriadis", "2000", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student16);
        studentsNoDuplicate.add(student16);
        Student student17=new Student("Marios", "Antoniou", "150", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student17);
        studentsNoDuplicate.add(student17);
        Student student18=new Student("Stavros", "Dimitriou", "80", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student18);
        studentsNoDuplicate.add(student18);
        Student student19=new Student("Tasos", "Pagonis", "700", LocalDateCreation.stringToDate("30/12/1991"));
        students.add(student19);
        studentsNoDuplicate.add(student19);
        Student student20=new Student("Dimitris", "Kralidiotis", "1300", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student20);
        studentsNoDuplicate.add(student20);
        Student student21=new Student("Alexandros", "Mariopoulos", "120",LocalDateCreation.stringToDate( "06/04/2003"));
        students.add(student21);
        studentsNoDuplicate.add(student21);
        Student student22=new Student("Hlias", "Louris", "1650", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student22);
        studentsNoDuplicate.add(student22);
        Student student23=new Student("Nikos", "Zouras", "170", LocalDateCreation.stringToDate("06/04/2003"));
        students.add(student23);
        studentsNoDuplicate.add(student23);

        ArrayList<Student>studentsCourse1=new ArrayList<Student>();
        studentsCourse1.add(student1);
        studentsCourse1.add(student3);
        studentsCourse1.add(student22);
        ArrayList<Student>studentsCourse2=new ArrayList<Student>();
        studentsCourse2.add(student4);
        studentsCourse2.add(student7);
        studentsCourse2.add(student8);
        studentsCourse2.add(student13);
        ArrayList<Student>studentsCourse3=new ArrayList<Student>();
        studentsCourse3.add(student1);
        studentsCourse3.add(student12);
        studentsCourse3.add(student4);
        ArrayList<Student>studentsCourse4=new ArrayList<Student>();
        studentsCourse4.add(student15);
        studentsCourse4.add(student2);
        studentsCourse4.add(student9);
        studentsCourse4.add(student11);
        studentsCourse4.add(student10);
        ArrayList<Student>studentsCourse5=new ArrayList<Student>();
        studentsCourse5.add(student16);
        studentsCourse5.add(student3);
        studentsCourse5.add(student23);
        ArrayList<Student>studentsCourse6=new ArrayList<Student>();
        studentsCourse6.add(student2);
        studentsCourse6.add(student14);
        studentsCourse6.add(student7);
        ArrayList<Student>studentsCourse7=new ArrayList<Student>();
        studentsCourse7.add(student20);
        studentsCourse7.add(student8);
        studentsCourse7.add(student10);
        ArrayList<Student>studentsCourse8=new ArrayList<Student>();
        studentsCourse8.add(student12);
        studentsCourse8.add(student14);
        studentsCourse8.add(student19);


        StudentPerCourse studentPerCourse1=new StudentPerCourse(studentsCourse1,course1);
        studentsPerCourse.add(studentPerCourse1);
        StudentPerCourse studentPerCourse2=new StudentPerCourse(studentsCourse2,course2);
        studentsPerCourse.add(studentPerCourse2);
        StudentPerCourse studentPerCourse3=new StudentPerCourse(studentsCourse3,course3);
        studentsPerCourse.add(studentPerCourse3);
        StudentPerCourse studentPerCourse4=new StudentPerCourse(studentsCourse4,course4);
        studentsPerCourse.add(studentPerCourse4);
        StudentPerCourse studentPerCourse5=new StudentPerCourse(studentsCourse5,course5);
        studentsPerCourse.add(studentPerCourse5);
        StudentPerCourse studentPerCourse6=new StudentPerCourse(studentsCourse6,course6);
        studentsPerCourse.add(studentPerCourse6);
        StudentPerCourse studentPerCourse7=new StudentPerCourse(studentsCourse7,course7);
        studentsPerCourse.add(studentPerCourse7);
        StudentPerCourse studentPerCourse8=new StudentPerCourse(studentsCourse8,course8);
        studentsPerCourse.add(studentPerCourse8);

        for (int i = 0; i< studentsNoDuplicate.size()-1; i++){
            for (int k = i+1; k< studentsNoDuplicate.size(); k++){
                if (studentsNoDuplicate.get(i).getName().equals(studentsNoDuplicate.get(k).getName())
                        && studentsNoDuplicate.get(i).getLastName().equals(studentsNoDuplicate.get(k).getLastName())
                    && studentsNoDuplicate.get(i).getDateOfBirth().equals(studentsNoDuplicate.get(k).getDateOfBirth())
                        && studentsNoDuplicate.get(i).getDateOfBirth().equals(studentsNoDuplicate.get(k).getDateOfBirth())){
                    studentsNoDuplicate.remove(k);
                    studentsToMoreThanOneCourse.add(studentsNoDuplicate.get(i));
                }
            }
        }
        for (int i = 0; i< studentsToMoreThanOneCourse.size()-1; i++){
            for (int p = i+1; p< studentsToMoreThanOneCourse.size(); p++){
                if (studentsToMoreThanOneCourse.get(i).getName().equals(studentsToMoreThanOneCourse.get(p).getName())
                        && studentsToMoreThanOneCourse.get(i).getLastName().equals(studentsToMoreThanOneCourse.get(p).getLastName())
                        && studentsToMoreThanOneCourse.get(i).getDateOfBirth().equals(studentsToMoreThanOneCourse.get(p).getDateOfBirth())
                        && studentsToMoreThanOneCourse.get(i).getDateOfBirth().equals(studentsToMoreThanOneCourse.get(p).getDateOfBirth())){
                    studentsToMoreThanOneCourse.remove(p);
                }
            }
        }

        for (int i = 0; i< trainersNoDuplicate.size()-1; i++){
            for (int k = i+1; k< trainersNoDuplicate.size(); k++){
                if (trainersNoDuplicate.get(i).getFirstName().equals(trainersNoDuplicate.get(k).getFirstName())
                        && trainersNoDuplicate.get(i).getLastName2().equals(trainersNoDuplicate.get(k).getLastName2())){
                    trainersNoDuplicate.remove(k);
                }
            }
        }
        AssignmentPerStudentCourse assignmentsPerStudentCourse1=new AssignmentPerStudentCourse(assignmentsPerCourse,studentsPerCourse);
        assignmentsPerStudentCourses.add(assignmentsPerStudentCourse1);

        AskPrint ask=new AskPrint();
        AskPrint.askPrint(students,trainers,courses,assignments,assignmentsPerCourse,trainersPerCourse,studentsPerCourse,
                studentsNoDuplicate,assignmentsPerStudentCourses,trainersNoDuplicate,studentsToMoreThanOneCourse);

    }
}
