package homework2;

import java.util.Scanner;

public class Question4 {

    //Take values of length and breadth of a rectangle
    // from user and check if it is square or not.

    public static void main(String[] args) {
        rectangle();

    }
    public static void rectangle(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter length: ");
        int length = sc.nextInt();

        System.out.println("Please enter width: ");
        int width = sc.nextInt();

        if (length == width) {
            System.out.println("It's a square.");
        } else {
            System.out.println("It's a rectangle.");
        }

        sc.close();
    }
}
