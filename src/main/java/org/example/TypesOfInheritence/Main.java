package org.example.TypesOfInheritence;

public class Main {
    static void main() {
        Cricketer harmanpreeet  = new Batsman("Harmanpreet Kaur","B.tech",23,7,"Right hand","Batsman",
                "Midle order ", 150,50,119,10400,95);
        Bowler jaspreet  = new Bowler("Jaspreet Bhumrah","B.tech",23,7,"Right hand","Batsman",
                "Right Arm Pacer",155,15,30);
        harmanpreeet.printDetails();
        jaspreet.printDetails();
    }

}
