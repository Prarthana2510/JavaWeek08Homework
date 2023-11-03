package homework2;

import java.util.Scanner;

public class Question9 {

    //Modify the above question to allow student to sit if he/she has medical cause. Ask
    //user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

    public static void main(String[] args) {
        classes();
    }

    public static void   classes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.println("Enter the number of classes attended: ");
        int totalAttended = scanner.nextInt();

        double percentage = (double) totalAttended / totalClasses * 100;

        System.out.println("Percentage of classes attended: " + percentage + "%");

        System.out.println("Do you have a medical cause? ");
        char medicalCause = scanner.next().charAt(0);

        if (percentage >= 75 || medicalCause == 'Y' || medicalCause == 'y') {
            System.out.println("The student is allowed to sit in the exam");
        } else {
            System.out.println("The student is not allowed to sit in the exam");
        }

        scanner.close();
    }
}



