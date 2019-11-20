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

    void insert(String name, char sex, double score, int index){

        Scanner input = new Scanner(System.in);

        if (students[index].getFree() == false)
        {
            System.out.println("Do you want to overwrite ?");
            System.out.println("1 : yes");
            System.out.println("2 : No");
            System.out.print("answer : ");
            switch (input.nextInt())
            {
                case 1:
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
            students[index].setName(name);
            students[index].setScore(score);
            students[index].setSex(sex);
            students[index].setFree(false);
        }


    }

    void list(){
        for(int i =0;  i < students.length; i++){

            if (students[i].getFree())
            {
                continue;
            }
            else {
                System.out.println("Number of student: " + i);
                System.out.println("Name: " + students[i].getName());
                System.out.println("Sex: " + students[i].getSex());
                System.out.println("Score: " + students[i].getScore());
                System.out.println("====================");
            }
        }


    }


}
