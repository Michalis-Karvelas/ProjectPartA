package models;

import java.util.ArrayList;
import java.util.Scanner;

public class AskPrint {


    static void askPrint(ArrayList students, ArrayList trainers, ArrayList courses, ArrayList assignments, ArrayList assignmentsPerCourse,
                         ArrayList trainersPerCourse, ArrayList studentsPerCourse,ArrayList studentsNoDuplicate,
                         ArrayList assignmentsPerStudentCourses,ArrayList trainersNoDuplicate,ArrayList studentsToMoreThanOneCourse) {
        String k;
        int z=1;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("===============================================================================================================");
        System.out.println("To see the list of the students press 1. For trainers press 2, for courses 3, for assignments 4," +
                "\nfor students with multiple courses press 5 ,for trainers per course press 6,\nfor students per course press 7" +
                ", for students with multiple courses press 8,\nfor the students in each course and their assignments press 12");
        System.out.println("If you want to stop displaying press 9");
        k=sc.nextLine();
        if(k.equals("9")){
            System.out.println("The program will now end.Thanks for you cooperation");
        }
        while(!(k.equals("9"))&& (count!=3)) {
            if(k.equals("10")){
                System.out.println("===============================================================================================================");
                System.out.println("To see the list of the students press 1. For trainers press 2, for courses 3, for assignments 4, " +
                        " for students with multiple courses press 5,\nfor trainers per course press 6, for students per course press 7," +
                        " for assignments per course press  8,\nfor the students in each course and their assignments press 12");
                System.out.println("If you want to stop displaying press 9");
                k= sc.nextLine();
            }
            if (z==2){
                k=sc.nextLine();
            }
            if (k.equals("1")) {
                listPrint(studentsNoDuplicate);
            } else if (k.equals("2")) {
                listPrint(trainersNoDuplicate);
            } else if (k.equals("3")) {
                listPrint(courses);
            } else if (k.equals("4")) {
                listPrint(assignments);
            } else if (k.equals("9")) {
                System.out.println("===============================================================================================================");
                System.out.println("You chose to to not to display anything else.The program will end.Thank you for your cooperation");
            }
           else if(k.equals("5")){
               listPrint(studentsToMoreThanOneCourse);
               if(studentsToMoreThanOneCourse.size()==0){
                   System.out.println("There are no same students to more than once course");
               }
          }
            else if(k.equals("6")){
                listPrint(trainersPerCourse);
            }
            else if(k.equals("7")){
                listPrint(studentsPerCourse);
            }
            else if(k.equals("8")){
                listPrint(assignmentsPerCourse);
            }
            else if (k.equals("12")){
                listPrint(assignmentsPerStudentCourses);
            }
            else {
                System.out.println("===============================================================================================================");
                System.out.println("You put an invalid input. Please try again");
                z=2;
                continue;
            }
            System.out.println("===============================================================================================================");
            System.out.println("If you want to chose another list to be displayed press 10, if you want to stop press 11");
            k = sc.nextLine();
            if (k.equals("11")) {
                System.out.println("===============================================================================================================");
                System.out.println("The program will be terminated. Thanks for your cooperation");
                break;
            }
            else if(k.equals("10")){
                System.out.println("===============================================================================================================");
                System.out.println("To see the list of the students press 1. For trainers press 2, for courses 3, for assignments 4, " +
                        "for students with multiple courses press 5,\nfor trainers per course press 6," +
                        " for students per course press 7, for assignments per course press 8,\nfor the students in each course and their assignments press 12");
                System.out.println("If you want to stop displaying press 9");
                k= sc.nextLine();
                z=3;
                if(k.equals("1")||k.equals("2")||k.equals("3")||k.equals("4")||k.equals("9")||k.equals("6")||k.equals("7")||k.equals("8")||k.equals("5")|k.equals("12")){
                    if(k.equals("9")){
                        System.out.println("The program will be terminated. Thanks for your cooperation");
                        break;
                    }
                    continue;
                }

            }

            while (!(k.equals("10")) && (!(k.equals("11")))) {
                System.out.println("You didn't insert the right number, please try again. You need to press 10.");
                if (count==0){
                    System.out.println("After 3 unsuccessful attempts the program will stop");
                    k = sc.nextLine();
                }
                if(count==1) {
                    System.out.println("You have two more tries");
                    k = sc.nextLine();
                }
                else if(count==2){
                    System.out.println("You have one more try");
                    k = sc.nextLine();
                }
                else if(count==3){
                    System.out.println("Sorry,you have no more tries left. The program will be terminated.");
                    break;
                }
                count=count+1;
            }
        }
    }
    static void listPrint(ArrayList x){
        for(int i=0; i<x.size(); i++) {
            System.out.println(x.get(i));
        }
    }
}
