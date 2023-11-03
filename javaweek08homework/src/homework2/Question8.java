package homework2;

import java.util.Scanner;

public class Question8 {

    //A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    //Take following input from user
    //Number of classes held
    //Number of classes attended.
    //And print
    //percentage of class attended
    //Is student is allowed to sit in exam or not.

    public static void main(String[] args) {

        Question8 q8 = new Question8();
        q8.attandance();
    }

    public void attandance(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.println("Enter the number of classes attended: ");
        int totalAttended = scanner.nextInt();

        double percentage = (double) totalAttended / totalClasses * 100;

        if (percentage >= 75) {
            System.out.println("Percentage of classes attended: " + percentage + "%");
            System.out.println("The student is allowed to sit in the exam");
        } else {
            System.out.println("Percentage of classes attended: " + percentage + "%");
            System.out.println("The student is not allowed to sit in the exam");
        }

        scanner.close();
    }
}
