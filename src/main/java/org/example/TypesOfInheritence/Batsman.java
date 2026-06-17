package org.example.TypesOfInheritence;

public class Batsman extends Cricketer {
    String battingOrder;
    int strickrate;
    int hunreds;
    int totalIning;
    int totalruns;
    int total50s;

    public Batsman(String name, String course, int rollNumber, int jursey, String hand, String role, String battingOrder, int strickrate, int hunreds, int totalIning, int totalruns, int total50s) {
        super(name, course, rollNumber, jursey, hand, role);
        this.battingOrder = battingOrder;
        this.strickrate = strickrate;
        this.hunreds = hunreds;
        this.totalIning = totalIning;
        this.totalruns = totalruns;
        this.total50s = total50s;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Batting Order \t\t | \t\t" + battingOrder);
        System.out.println("Strike Rate \t\t | \t\t" + strickrate);
        System.out.println("hundreds \t\t | \t\t" + hunreds);
        System.out.println("total inings \t\t | \t\t" + totalIning);
        System.out.println("totalRuns \t\t | \t\t" + totalruns);
        System.out.println("50s  \t\t | \t\t" + total50s);

    }
}
