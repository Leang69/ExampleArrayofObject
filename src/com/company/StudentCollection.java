package com.company;
import java.util.Scanner;

public class StudentCollection {

    private int numOfStudent;
    private  Student[] students;

    StudentCollection(int numStudent){
        numOfStudent = numStudent;
        students = new Student[numOfStudent];
        for(int i = 0; i < numOfStudent; i++){
            students[i] = new Student();
        }
    }

    void addStudent(int index){
        Scanner input = new Scanner(System.in);
        String name;   char sex;   double score;

        if (students[index].getFree() == false)
        {

            System.out.println("Do you want to overwrite ?");
            System.out.println("1 : yes");
            System.out.println("2 : No");
            System.out.print("answer : ");
            switch (input.nextInt())
            {
                case 1:
                    input.nextLine();
                    System.out.print("Student name : ");
                    name = input.nextLine();
                    System.out.print("sex : ");
                    sex = input.next().charAt(0);
                    System.out.print("score : ");
                    score = input.nextDouble();
                    students[index].setName(name);
                    students[index].setScore(score);
                    students[index].setSex(sex);
                    students[index].setFree(false);
                    break;
                case 2:
                    break;
            }

        }
        else
        {

            System.out.print("Student name : ");
            name = input.nextLine();
            System.out.print("sex : ");
            sex = input.next().charAt(0);
            System.out.print("score : ");
            score = input.nextDouble();
            students[index].setName(name);
            students[index].setScore(score);
            students[index].setSex(sex);
            students[index].setFree(false);
        }

    }

    void list()
    {
        for(int i =0;  i < students.length; i++)
        {

            if (students[i].getFree())
            {
                continue;
            }
            else {
                System.out.println("====================");
                System.out.println("Number of student: " + i);
                System.out.println("Name: " + students[i].getName());
                System.out.println("Sex: " + students[i].getSex());
                System.out.println("Score: " + students[i].getScore());
                System.out.println("====================");
            }
        }
    }


}
