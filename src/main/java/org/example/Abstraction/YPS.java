package org.example.Abstraction;

public class YPS extends ICSE{

    @Override
    public String addmission(String name, String fatherName, String motherName, String course, int rollNumber) {
       this.name = name;
       this.fatherName = fatherName;
       this.motherName = motherName;
       this.course = course;
       this. rollNumber = rollNumber;
       return "Admission successful";
    }
}
