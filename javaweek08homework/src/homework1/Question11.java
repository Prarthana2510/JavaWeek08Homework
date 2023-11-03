package homework1;

import java.util.Scanner;

public class Question11 {

    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    //other alphabet should be invalid entry.

    public static void main(String[] args) {
        Question11 q11 = new Question11();
        q11.city();

    }

    public void city() {

        String a = "Ahmedabad";
        String b = "Baroda";
        String c = "Chennai";
        String d = "Devgadh";
        String e = "Ernakulam";
        String f = "Fukri";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an alphabet between 'A' and 'F': ");


        char cityName = scanner.next().charAt(0);
        if (cityName == 'a' || cityName == 'A') {
            System.out.println(a);
        } else if (cityName == 'b' || cityName == 'B') {
            System.out.println(b);
        } else if (cityName == 'c' || cityName == 'C') {
            System.out.println(c);
        } else if (cityName == 'd' || cityName == 'D') {
            System.out.println(d);
        } else if (cityName == 'e' || cityName == 'E') {
            System.out.println(e);
        } else if (cityName == 'f' || cityName == 'F') {
            System.out.println(f);
        } else {
            System.out.println("Invalid input: Please enter between 'A' and 'F'");
        }
        scanner.close();

    }
}
