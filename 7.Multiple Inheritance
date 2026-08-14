import java.util.Scanner;

interface Student {
    void displayStudent();
}

interface Sports {
    void displaySports();
}

class Result implements Student, Sports {

    int rollNo;
    String name;
    int marks;
    int sportsMarks;

    Result(int rollNo, String name, int marks, int sportsMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.sportsMarks = sportsMarks;
    }

    public void displayStudent() {
        System.out.println("Roll No       : " + rollNo);
        System.out.println("Name          : " + name);
        System.out.println("Academic Marks: " + marks);
    }

    public void displaySports() {
        System.out.println("Sports Marks  : " + sportsMarks);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Academic Marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter Sports Marks: ");
        int sportsMarks = sc.nextInt();

        Result r = new Result(rollNo, name, marks, sportsMarks);

        System.out.println("\n--- Student Result ---");
        r.displayStudent();
        r.displaySports();

        sc.close();
    }
}
