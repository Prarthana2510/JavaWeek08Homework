package homework1;

import java.util.Scanner;

public class Question1WithoutTerinaryOperator {

    //Write a java program that tells us that Input number is odd or even? HINT: use ternary
    //operator (? :)

    public static void main(String[] args) {
        Question1WithoutTerinaryOperator q1 = new Question1WithoutTerinaryOperator();
        q1.oddEven();


    }

    public void oddEven() {

        int number, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = sc.nextInt();
        remainder = number % 2;

        if (remainder == 0) {
            System.out.println("You have entered an even number");
        } else {
            System.out.println("You have entered an odd number");
        }
        sc.close();
    }

}
