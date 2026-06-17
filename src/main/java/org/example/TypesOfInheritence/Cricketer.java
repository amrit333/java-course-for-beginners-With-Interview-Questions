package org.example.TypesOfInheritence;


// we performed single inhertince or basic inheritence becaue single class inherited single class
public class Cricketer extends Student{
            public String role;
            public String  hand;
            public int jursey;
            int totalMatches;

    public Cricketer(String name, String  course, int rollNumber,int jursey, String hand, String role) {
       super(name , course, rollNumber);
        this.jursey = jursey;
        this.hand = hand;
        this.role = role;
    }

    public Cricketer() {
    }

    @Override
    public void printDetails() {

        // it means i am calling my super class function i want that function to run
        // and this will run my super class function first

        super.printDetails();
        System.out.println("Sports \t\t | Cricket");
        System.out.println("Role \t\t | \t\t "+ role);
        System.out.println("hand \t\t | \t\t "+ hand );
        System.out.println("Jursey Number \t\t |  "+ jursey);

    }
}
