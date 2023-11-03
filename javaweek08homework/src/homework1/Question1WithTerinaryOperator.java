package homework1;

import java.util.Scanner;

public class Question1WithTerinaryOperator {

    //Write a java program that tells us that Input number is odd or even? HINT: use ternary
    //operator (? :)

    public static void main(String[] args) {
        Question1WithTerinaryOperator q1 = new Question1WithTerinaryOperator();
        q1.oddEven();


    }

    public void oddEven() {

        int number, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = sc.nextInt();
        System.out.println(number + " is " + ((number % 2) == 0 ? "Even " : "Odd ") + "Number");


        sc.close();
    }

}
