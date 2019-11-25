package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int numberOfstudent , menu , index;



        System.out.println("Student list");
        System.out.print("Please input number of student : ");
        numberOfstudent = input.nextInt();
        StudentCollection studentlist = new StudentCollection(numberOfstudent);

        while (true) {
            System.out.println("Menu");
            System.out.println("1 : Add Student");
            System.out.println("2 : Display list");
            System.out.print("Input menu : ");
            menu = input.nextInt();
            switch (menu) {

                case 1:
                    System.out.print("Which index would you want to enroll : ");
                    index = input.nextInt();
                    studentlist.addStudent(index);
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
