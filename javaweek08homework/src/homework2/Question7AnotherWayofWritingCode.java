package homework2;

import java.util.Scanner;

public class Question7AnotherWayofWritingCode {

    //Take input of age of 3 people by user and determine oldest and youngest among
    //them.

    public static void main(String args[]) {
        Question7AnotherWayofWritingCode qa8 = new Question7AnotherWayofWritingCode();
        qa8.age();
    }

    public void age() {

        Scanner scanner = new Scanner(System.in);

        int age1, age2, age3;

        System.out.println("Enter age of person 1: ");
        age1 = scanner.nextInt();

        System.out.println("Enter age of person 2: ");
        age2 = scanner.nextInt();

        System.out.println("Enter age of person 3: ");
        age3 = scanner.nextInt();

        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));

        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);

        scanner.close();
    }


}
