package homework1;

import java.util.Scanner;

public class Question12 {

    ////Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    //    //other alphabet should be invalid entry using Switch statement

    public static void main(String[] args) {

        Question12 q12 = new Question12();
        q12.mySwitch();

    }

    public void mySwitch() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character between A to F : ");
        String city = sc.next();
        String city1 = city.toUpperCase();



        switch (city1) {
            // case 1:
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chennai");
                break;
            case "D":
                System.out.println("Devgadh");
                break;
            case "E":
                System.out.println("Ernakulam");
                break;
            case "F":
                System.out.println("Fukri");
                break;
            /*case "a":
                System.out.println("Ahmedabad");
                break;
            case "b":
                System.out.println("Baroda");
                break;
            case "c":
                System.out.println("Chennai");
                break;
            case "d":
                System.out.println("Devgadh");
                break;
            case "e":
                System.out.println("Ernakulam");
                break;
            case "f":
                System.out.println("Fukri");
                break;*/
            default:
                System.out.println("Please enter between 'A' and 'F': ");

                sc.close();
        }

    }
}
