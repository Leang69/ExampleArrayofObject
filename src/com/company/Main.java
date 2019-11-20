package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String name;   char sex;   double score;   int numberOfstudent , index , menu;



        System.out.println("Student list");
        System.out.print("Please input number of student : ");
        numberOfstudent = input.nextInt();
        StudentCollection studentlist = new StudentCollection(numberOfstudent);

        while (true) {
            System.out.println("Menu");
            System.out.println("1 : Insert");
            System.out.println("2 : Display list");
            System.out.print("Input menu : ");
            menu = input.nextInt();
            switch (menu) {

                case 1:
                    System.out.print("Which index would you want to enroll : ");
                    index = input.nextInt();
                    System.out.print("Student name : ");
                    input.nextLine();
                    name = input.nextLine();
                    System.out.print("sex : ");
                    sex = input.next().charAt(0);
                    System.out.print("score : ");
                    score = input.nextDouble();
                    studentlist.insert(name, sex, score, index);
                    break;
                case 2:
                    studentlist.list();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please input again ");
            }

            if (menu == 0)
            {
                break;
            }

        }



    }
}
