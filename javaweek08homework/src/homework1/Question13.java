package homework1;

import java.util.Scanner;

public class Question13 {

    //Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    //find addition, Subtraction, multiplication and division according to theirsymbol(using if else)

    public static void main(String[] args) {

        calculator();
    }

    public static void calculator() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Please enter a symbol '+', '-', '/' or '*': ");
        char symbol = sc.next().charAt(0);
        if (symbol == '+') {
            System.out.println(firstNumber + secondNumber);
        } else if (symbol == '-') {
            System.out.println(firstNumber - secondNumber);
        } else if (symbol == '/') {
            System.out.println(firstNumber / secondNumber);
        } else if (symbol == '*') {
            System.out.println(firstNumber * secondNumber);
        } else {
            System.out.println("Please enter a valid symbol");
        }
        sc.close();


    }

}
