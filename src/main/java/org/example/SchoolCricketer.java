package org.example;


//inherit another class which is already created and have the same powers we need
//how to do inheritence
public class SchoolCricketer  extends Student{

    String handSide;
    String role;
    int jurseyNumber;

   void printDetail(){
        printCertificate();
        System.out.println( name + " is " + handSide  + " hand " + role + " with jursey number " + jurseyNumber);

    }
    SchoolCricketer(){

    }

    SchoolCricketer(String name, String  course, int rollNumber,String fatherName, String motherName,String handSide, String role,int jurseyNumber){

       super(name,course, rollNumber,fatherName,motherName);
       this.role = role;
       this.jurseyNumber= jurseyNumber;
       this.handSide= handSide;
    }
}
