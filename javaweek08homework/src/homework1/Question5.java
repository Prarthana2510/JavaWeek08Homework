package homework1;

import java.util.Scanner;

public class Question5 {

    /*Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/

    public static void main(String[] args) {
        Question5 q5 = new Question5();
        q5.markSheet();

    }

    public void markSheet(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Input. Marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input. Marks should be between 0 and 100.");
            return;
        }

        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input. Marks should be between 0 and 100.");
            return;
        }

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine the result and grade
        String result;
        String grade;

        if (percentage >= 35) {
            result = "Pass";

            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";
        }

        // Print the mark sheet
        System.out.println("----- Mark Sheet -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Science Marks: " + scienceMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
