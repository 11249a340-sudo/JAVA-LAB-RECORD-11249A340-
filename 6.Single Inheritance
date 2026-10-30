import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;
    double grossSalary;

    PermanentEmployee(int empId, String name, double basicSalary,
                      double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    void calculateSalary() {
        grossSalary = basicSalary + hra + da;
    }

    void displaySalary() {
        displayDetails();
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        PermanentEmployee emp =
            new PermanentEmployee(id, name, basic, hra, da);

        emp.calculateSalary();

        System.out.println("\n--- Employee Salary Details ---");
        emp.displaySalary();

        sc.close();
    }
}
