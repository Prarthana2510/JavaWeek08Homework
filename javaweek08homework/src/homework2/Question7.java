package homework2;

import java.util.Scanner;

public class Question7 {

    //Take input of age of 3 people by user and determine oldest and youngest among
    //them.

    public static void main(String args[]) {

        Question7 q7 = new Question7();
        q7.age();
    }

    public void age() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Age of Jay :");
        int age1 = scanner.nextInt();
        System.out.println("Enter the Age of Veeru  :");
        int age2 = scanner.nextInt();
        System.out.println("Enter the Age of Basanti  :");
        int age3 = scanner.nextInt();
        if (age1 < age2 && age1 < age3) {
            System.out.println("The Youngest Age is Jay");
        } else if (age2 < age1 && age2 < age3) {
            System.out.print("The Youngest Age is Veeru");
        } else if (age3 < age1 && age3 < age2) {
            System.out.println("The Youngest Age is Basanti");

        } else {
            System.out.println("All are same age");
        }

        if (age1 > age2 && age1 > age3) {
            System.out.println("and The Oldest Age is Jay");
        } else if (age2 > age1 && age2 > age3) {
            System.out.println("and The Oldest Age is Veeru");
        } else if (age3 > age1 && age3 > age2) {
            System.out.println(" and The Oldest Age is Basanti");

        } else {
            System.out.println("All are same age");
            scanner.close();
        }
    }


}
