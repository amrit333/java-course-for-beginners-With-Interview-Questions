package org.example.TypesOfInheritence;

//hirarchial
public class Bowler extends Cricketer{

    String bowlingType;
    int  wickets;
    int FiveW;
    public int fourW;

    public Bowler(String name, String course, int rollNumber, int jursey, String hand, String role, String bowlingType, int wickets, int fiveW, int fourW) {
        super(name, course, rollNumber, jursey, hand, role);
        this.bowlingType = bowlingType;
        this.wickets = wickets;
        FiveW = fiveW;
        this.fourW = fourW;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("bowling Types \t\t | \t\t" + bowlingType);
        System.out.println("Wickets \t\t | \t\t" + wickets);
        System.out.println("Five Wickets \t\t | \t\t" + FiveW);
        System.out.println("Four Wickets \t\t | \t\t" + fourW);



    }
}
