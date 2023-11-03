package homework2;

import java.util.Scanner;

public class Question10 {

    //Write a program to print the sum of two numbers entered by user by defining your
    //own method.

    public static void main(String[] args) {
        Question10 q10 = new Question10();
        q10.sum();

    }

    public void sum(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber+secondNumber;
        System.out.println("Total of " + firstNumber + " and " + secondNumber + " is: " + sum);
        scanner.close();
    }
}
