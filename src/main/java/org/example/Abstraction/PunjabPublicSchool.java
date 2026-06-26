package org.example.Abstraction;

import java.util.Scanner;

public class PunjabPublicSchool extends ICSE{
    @Override
    public String addmission(String name, String fatherName, String motherName, String course, int rollNumber) {
        System.out.println("What is your rank in enterhance");
        int rank = new Scanner(System.in).nextInt();
        if(rank<40){

            this.name = name;
            this.course = course;
            this.fatherName = fatherName;
            this.motherName = motherName ;
            this.rollNumber = rollNumber;
            return  "Admission done";
        }else{
            return "You did not got the proper rank";

        }
    }
}
