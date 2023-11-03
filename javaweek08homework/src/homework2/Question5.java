package homework2;

import java.util.Scanner;

public class Question5 {

    //Take two int values from user and print greatest among them.

    public static void main(String[] args) {

        Question5 q5 = new Question5();
        q5.greaterNumber();
    }
    public void greaterNumber(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
