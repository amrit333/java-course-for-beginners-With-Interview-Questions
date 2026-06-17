package org.example;

public class Student  {
    String name;
    String  course;
    int rollNumber;
    String fatherName;
    String motherName;

    // This is called default constructor becuase it do not have any perameter
Student(){

}
    Student(String name, String  course, int rollNumber,String fatherName, String motherName){
     this.name = name;
     this.course = course;
     this.rollNumber = rollNumber;
     this.fatherName = fatherName;
     this.motherName = motherName;
    }


    public void printCertificate(){
        System.out.println("*************** Welcome To Punjab School Education Board *********************");
        System.out.println("Name \t\t | \t\t" + name);
        System.out.println("course \t\t | \t\t" + course);
        System.out.println("rollNumber \t\t | \t\t" + rollNumber);

        System.out.println("motherName \t\t | \t\t" + motherName);
        System.out.println("fatherName \t\t | \t\t" + fatherName);


    }
}
