package homework1;

import java.util.Scanner;

public class Question8 {

    //Write a java program to get numbers from users and
    // print whether it is positive or negative.

    public static void main(String[] args) {
        Question8 q8 = new Question8();
        q8.positiveNegative();

    }

    public void positiveNegative(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int myNum = sc.nextInt();

        if (myNum > 0){
            System.out.println(myNum + " is positive");

        }else if (myNum < 0){
            System.out.println(myNum + " is negative");
        }else {
            System.out.println("You have entered zero");
        }
        sc.close();


    }
}
