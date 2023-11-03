package homework1;

import java.util.Scanner;

public class Question19 {

    //Write a java program to get numbers from users and
    // print whether it is positive or negative or zero.

    public static void main(String[] args) {
        Question19 q19 = new Question19();
        q19.positiveNegative();

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
