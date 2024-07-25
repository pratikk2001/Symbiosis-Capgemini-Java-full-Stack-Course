import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String address;

    public void getDetails(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    public void displayStudent() {
        System.out.println("Student Rollno: " + rollNo);
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
    }
}

class Marks extends Student {
    int m1;
    int m2;
    int m3;

    public void getMarksDetails(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void displayMarks() {
        System.out.println("Student Sub 1: " + m1);
        System.out.println("Student Sub 2: " + m2);
        System.out.println("Student Sub 3: " + m3);
    }
}

interface Skills {
    String GAME = "Snookers";

    void displaySkills();
}

public class Printable extends Marks implements Skills {
    @Override
    public void displaySkills() {
        System.out.println("Skill: " + GAME);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Printable p = new Printable();
        
        // Getting student details
        System.out.println("Enter Rollno, Name, Address:");
        int rollNo = sc.nextInt();
        sc.nextLine(); // consume newline left-over
        String name = sc.nextLine();
        String address = sc.nextLine();
        p.getDetails(rollNo, name, address);

        // Getting marks details
        System.out.println("Enter marks for three subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        p.getMarksDetails(m1, m2, m3);

        // Displaying details
        p.displayStudent();
        p.displayMarks();
        p.displaySkills();

        sc.close();
    }
}
