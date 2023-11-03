package homework1;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Question10 q10 = new Question10();
        q10.sales();

    }

    public void sales(){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Seller's Name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Salary Basic: ");
        double salaryBasic = scanner.nextDouble();

        double commission = 0.0;

        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }


        double totalSalary = salaryBasic + commission;


        System.out.println("\nSales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        System.out.println("Sales Commission: " + commission);
        System.out.println("Total Salary: " + totalSalary);

        scanner.close();
    }
}
