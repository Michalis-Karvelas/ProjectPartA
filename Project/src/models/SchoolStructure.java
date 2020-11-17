package models;

import extramethods.LocalDateCreation;

import java.util.Scanner;
import java.util.ArrayList;

public class SchoolStructure {
    Scanner sc=new Scanner(System.in);

    public  SchoolStructure(){
        System.out.println("                                Welcome to the School's Structure Program");
        System.out.println("===============================================================================================================");
        System.out.println("This is a program that displays a School's structure. You can create your own data or you can see the defaults");
        System.out.println("Beneath are some instructions on how to use this program ");
        System.out.println("After any input you have to press enter.");
        System.out.println("Wherever you are asked to insert a date it should be in dd/MM/yyyy format,for example 25/10/2020");
        System.out.println("If you want to enter the necessary data manually press 1. If you want them to be filled automatically press 2");
        System.out.println("===============================================================================================================");
        String z="";
        String title,stream,type,firstName,lastName,name,lastName2,tuitionFees,title2,description,oralMark,totalMark;
        String start_date,end_date,subDateTime,dateOfBirth;
        int k=0;
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Assignment> assignments= new ArrayList<>();
        ArrayList<Trainer> trainers = new ArrayList<>();
        ArrayList<Trainer> trainersNoDuplicate = new ArrayList<>();
        ArrayList<TrainerPerCourse> trainersPerCourse=new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> studentsNoDuplicate =new ArrayList<>();
        ArrayList<Student> studentsToMoreThanOneCourse=new ArrayList<>();
        ArrayList<StudentPerCourse> studentsPerCourse=new ArrayList<>();
        ArrayList<AssignmentPerStudentCourse> assignmentsPerStudentCourses=new ArrayList<>();
        ArrayList<AssignmentPerCourse> assignmentsPerCourse=new ArrayList<>();


        z= sc.nextLine();
        while ((!(z.equals("1"))&&(!(z.equals("2"))))){
            System.out.println("You didn't input a valid number. Please enter 1 for manual or 2 for automatically");
            z=sc.nextLine();
        }
        if (z.equals("1")) {
            System.out.println("===============================================================================================================");
            System.out.println("You have chosen to input the data manually. This may take a while!");
            System.out.println("You need to provide the information needed for a course.");
            System.out.println("What is the course's title?");
            title=sc.nextLine();
            do {
                if (k!=0) {
                    System.out.println("You need to provide the title for the next course. if you want to stop providing courses insert 0");
                    title=sc.nextLine();
                    if (title.equals("0")) {
                        System.out.println("You decided to stop inserting new courses and data");
                        break;
                    }
                }
                while(title.length()>12||title.length()<3){
                    System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                    title=sc.nextLine();
                }
                System.out.println("What is the stream of the course "+title);
                stream=sc.nextLine();
                while(stream.length()>12||stream.length()<3){
                    System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                    stream=sc.nextLine();
                }
                System.out.println("What is it's type?");
                type=sc.nextLine();
                while(type.length()>12||type.length()<3){
                    System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                    type=sc.nextLine();
                }
                System.out.println("When is it's starting date?");
                start_date=sc.nextLine();
                System.out.println("When is it's ending date?");
                end_date=sc.nextLine();
                Course course=new Course(title,stream,type,LocalDateCreation.stringToDate(start_date),LocalDateCreation.stringToDate(end_date));
                courses.add(course);
                System.out.println("Which assignments are in this course?");
                String k1="";
                ArrayList<Assignment>assignmentsCourse=new ArrayList<Assignment>();
                AssignmentPerCourse assignmentPerCourse=new AssignmentPerCourse(assignmentsCourse,course);
                ArrayList<Trainer>trainersCourse=new ArrayList<>();
                TrainerPerCourse trainerPerCourse=new TrainerPerCourse(trainersCourse,course);
                ArrayList<Student>studentsCourse=new ArrayList<Student>();
                StudentPerCourse studentPerCourse=new StudentPerCourse(studentsCourse,course);
                do{
                    System.out.println("Provide the title of the assignment.");
                    title2=sc.nextLine();
                    while(title2.length()>12||title2.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        title2=sc.nextLine();
                    }
                    System.out.println("What is it about?");
                    description=sc.nextLine();
                    while(description.length()>32||description.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        description=sc.nextLine();
                    }
                    System.out.println("When do the students have to submit it?");
                    subDateTime=sc.nextLine();
                    System.out.println( "If you want to continue inserting assignments press 1. If you want to stop press 0");
                    k1=sc.nextLine();
                    while(!k1.equals("1")&&!k1.equals("0")){
                        System.out.println("Wrong input. Press 1 or 0");
                        k1=sc.nextLine();
                    }
                    Assignment assignment=new Assignment(title2,description,LocalDateCreation.stringToDate(subDateTime));
                    assignments.add(assignment);
                    assignmentsCourse.add(assignment);
                }while(!k1.equals("0"));
                System.out.println("Next you have to input the data of the trainers that teach this course?");
                k1="";
                do{
                    System.out.println("Please insert the name of the trainer");
                    firstName=sc.nextLine();
                    while(firstName.length()>12||firstName.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        firstName=sc.nextLine();
                    }
                    System.out.println("What is " +firstName+"'s lastname?" );
                    lastName=sc.nextLine();
                    while(lastName.length()>12||lastName.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        lastName=sc.nextLine();
                    }
                    Trainer trainer=new Trainer(firstName,lastName);
                    trainers.add(trainer);
                    trainersNoDuplicate.add(trainer);
                    trainersCourse.add(trainer);
                    System.out.println( "If you want to continue inserting trainers press 1. If you want to stop press 0");
                    k1=sc.nextLine();
                    while(!k1.equals("1")&&!k1.equals("0")){
                        System.out.println("Wrong input. Press 1 or 0");
                        k1=sc.nextLine();
                    }
                }while(!k1.equals("0"));

                System.out.println("Next you have to input the data-information of the students that are enrolled in "+title+" "+stream+" "+type);
                k1="";
                do{
                    System.out.println("Please provide the student's name");
                    name=sc.nextLine();
                    while(name.length()>12||name.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        name=sc.nextLine();
                    }
                    System.out.println("What is "+name +"'s lastname?");
                    lastName2=sc.nextLine();
                    while(lastName2.length()>12||lastName2.length()<3){
                        System.out.println("Your input should be between 3-15 characters. Please insert a valid input");
                        lastName2=sc.nextLine();
                    }
                    System.out.println("When did this student was born?");
                    dateOfBirth=sc.nextLine();
                    System.out.println("How many euros are his tuition Fees?");
                    tuitionFees=sc.nextLine();
                    System.out.println( "If you want to continue inserting students press 1. If you want to stop press 0");
                    k1=sc.nextLine();
                    while(!k1.equals("1")&&!k1.equals("0")){
                        System.out.println("Wrong input. Press 1 or 0");
                        k1=sc.nextLine();
                    }
                    Student student=new Student(name, lastName2, tuitionFees, LocalDateCreation.stringToDate(dateOfBirth));
                    students.add(student);
                    studentsNoDuplicate.add(student);
                    studentsCourse.add(student);
                }while(!k1.equals("0"));

                assignmentsPerCourse.add(assignmentPerCourse);
                trainersPerCourse.add(trainerPerCourse);
                studentsPerCourse.add(studentPerCourse);
                k++;

            }while (!(title.equals("0")));
            for (int i = 0; i< studentsNoDuplicate.size()-1; i++){
                for (int p = i+1; p< studentsNoDuplicate.size(); p++){
                    if (studentsNoDuplicate.get(i).getName().equals(studentsNoDuplicate.get(p).getName())
                            && studentsNoDuplicate.get(i).getLastName().equals(studentsNoDuplicate.get(p).getLastName())
                            && studentsNoDuplicate.get(i).getDateOfBirth().equals(studentsNoDuplicate.get(p).getDateOfBirth())
                            && studentsNoDuplicate.get(i).getDateOfBirth().equals(studentsNoDuplicate.get(p).getDateOfBirth())){
                        studentsNoDuplicate.remove(p);
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
                for (int c = i+1; c< trainersNoDuplicate.size(); c++){
                    if (trainersNoDuplicate.get(i).getFirstName().equals(trainersNoDuplicate.get(c).getFirstName())
                            && trainersNoDuplicate.get(i).getLastName2().equals(trainersNoDuplicate.get(c).getLastName2())){
                        trainersNoDuplicate.remove(c);
                    }
                }
            }
            AssignmentPerStudentCourse assignmentsPerStudentCourse=new AssignmentPerStudentCourse(assignmentsPerCourse,studentsPerCourse);
            assignmentsPerStudentCourses.add(assignmentsPerStudentCourse);
            AskPrint ask=new AskPrint();
            AskPrint.askPrint(students,trainers,courses,assignments,assignmentsPerCourse,trainersPerCourse,studentsPerCourse,
                    studentsNoDuplicate,assignmentsPerStudentCourses,trainersNoDuplicate,studentsToMoreThanOneCourse);
        }
        else if (z.equals("2")){
            System.out.println("===============================================================================================================");
            System.out.println("You have chosen to see the default data of the School. Please follow the instructions beneath");
            HardCode hdList=new HardCode();
        }

    }
}
