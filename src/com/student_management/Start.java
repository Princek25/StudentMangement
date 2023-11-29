package com.student_management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to student management app");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit app");
            int c = Integer.parseInt(br.readLine());

            if (c == 1) {
                // add student
                System.out.println("Enter username: ");
                String name = br.readLine();

                System.out.println("Enter phone: ");
                String phone = br.readLine();

                System.out.println("Enter city: ");
                String city = br.readLine();

                // create student object to store student
                Student st = new Student(name, phone, city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if (answer) {
                    System.out.println("Student is added successfully");
                } else System.out.println("Something went wrong try again");
                System.out.println(st);

            } else if (c == 2) {
                // delete student
            } else if (c == 3) {
                // display student
            } else if (c == 4) {
                // exit
                break;
            } else {
            }
        }
        System.out.println("Thank you for using my application");
    }
}
