package homework1;

import java.util.Scanner;

public class Question15 {

    //Write a program that tells us input value is number or an alphabet or symbol.

    public static void main(String[] args) {

        Question15 q15 = new Question15();
        q15.numSymbolletter();

    }

    public void numSymbolletter(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter number, symbol or letter: ");
        char nsl = scanner.next().charAt(0);

        if (Character.isDigit(nsl)) {
            System.out.println(nsl + " is a number");
        } else if (Character.isLetter(nsl)) {
            System.out.println(nsl + " is an alphabet");
        } else {
            System.out.println(nsl + " is a symbol");
        }

        scanner.close();
    }
}
