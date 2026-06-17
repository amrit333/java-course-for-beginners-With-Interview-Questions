package org.example.TypesOfInheritence;

public class Student {
    String  name;
    String course;
    int rollNumber;

    public Student() {
    }

    public Student(String name, String course, int rollNumber) {
        this.name = name;
        this.course = course;
        this.rollNumber = rollNumber;
    }

    public void printDetails(){
        System.out.println("****************** WELCOME TO PUNJAB SCHOOL EDUCATION BOARD **********************");
        System.out.println("Name \t\t | \t \t " + name);
        System.out.println("Course \t\t | \t \t " + course);
        System.out.println("Roll number \t\t | \t \t " + rollNumber);



    }
}
