package homework2;

import java.util.Scanner;

public class Question1 {

    //Question 1: Take 10 integers from keyboard using loop and print their average value on the
    //screen.

    public static void main (String[] args){
        averageNumber();

    }

    public static void averageNumber(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number: " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        int average = sum / 10;
        System.out.println("Average value: " + average);

        scanner.close();
    }

    }

