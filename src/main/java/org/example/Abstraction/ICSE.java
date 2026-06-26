package org.example.Abstraction;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public abstract class ICSE {
    String  name;
    String  fatherName;
    String  motherName;
    String  course;
    int rollNumber;

    public abstract String addmission(String name,String fatherName,String motherName,String course,int rollNumber);
    public void  certificate(){
        System.out.println("*************************** WELCOME TO INDIAN CERTIFICATE OF SECONDRY EDUCATION *********************");

        System.out.println("Name \t\t | \t\t" + name);
        System.out.println("fatherName \t\t | \t\t" + fatherName);
        System.out.println("motherName \t\t | \t\t" + motherName);
        System.out.println("rollNumber \t\t | \t\t" + rollNumber);
        System.out.println("course \t\t | \t\t" + course);


    }
}


//what is abstraction
//    abstraction ka matlab hai jb kisi bhi cheez ki implimation ko hide kiya jaye aur sirf zroorat ki cheeze hi show ki jaye
//jaise ki agarm mein pizza order kru to mujhe sirf pizza show kiya jayega kkya sajiyan hogi ye show kiya jayega
//kya size hoga ye show kiya jayega lekin kaisa bna nahi bataya jayega

//even agar aap pizza banwate ho to aap kya sabjiyan hchiye ye btao ge cheese kitna chahiye ye btaoge,
//base konsa ho ye bataoge aur size kya ho
//lekin process app pizza shope pe chhod dete ho



// in OOPS abstarction means, jab ek class ke funcition ki implimatation dusri class ko pta hi nahi ho
//base class know function name, peramteres and return type,

// best example is school board like ICSE
// no ICSE have many functioalities like, exam, result, questionpaper makeing, syllabus building
// they also have admision fucntion
//ICSE have admision function they have defined the requried documents but they haven't defined how child should be admited,
// for example their are 2 school
//  PPS nabha inherit the same class but they do admissions using enterhance
//YPS Patiala do admission based on merit
// MPS do admision with nothing
// now ICSE just know ke ek function exist krta hai,
// but implimentation is unknoown


