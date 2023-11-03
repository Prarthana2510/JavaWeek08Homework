package homework2;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
        Question11 q11 = new Question11();
        q11.nameString();


    }

    public void nameString(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        System.out.println("Your name is: " + name);
        scanner.close();
    }
}
