import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks : " + marks);

        if (marks >= 90)
            System.out.println("Grade : A");
        else if (marks >= 80)
            System.out.println("Grade : B");
        else if (marks >= 70)
            System.out.println("Grade : C");
        else if (marks >= 60)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter Details of Student 1");
        s1.getData();

        System.out.println("\nEnter Details of Student 2");
        s2.getData();

        s1.display();
        s2.display();
    }
}
