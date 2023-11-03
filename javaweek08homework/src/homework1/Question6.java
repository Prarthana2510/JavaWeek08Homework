package homework1;

import java.util.Scanner;

public class Question6 {

    /*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/


    public static void main(String[] args) {
        salary();

    }

    public static void salary() {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();

            // Clear the newline character from the previous input
            scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            // Calculate allowances and deductions
            double hra = basicSalary * 0.10;
            double ta = basicSalary * 0.09;
            double da = basicSalary * 0.08;
            double pf = basicSalary * 0.20;

            // Calculate Gross Salary
            double grossSalary = basicSalary + hra + ta + da - pf;

            // Display the salary components and gross salary
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Basic Salary: " + basicSalary);
            System.out.println("HRA: " + hra);
            System.out.println("TA: " + ta);
            System.out.println("DA: " + da);
            System.out.println("PF: " + pf);
            System.out.println("Gross Salary: " + grossSalary);

            scanner.close();

    }
}