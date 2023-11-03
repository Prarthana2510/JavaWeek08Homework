package homework1;

import java.util.Scanner;

public class Question16 {

    /*Write a Java program which input any number between 1 to 7 and it print The Daysname
    MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
    number is out of selection Print message “Week contains 1 to 7 days”*/

    public static void main(String[] args) {

        Question16 q16 = new Question16();
        q16.mySwitch();

    }

    public void mySwitch() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number between 1 and 7: ");
        int weekDays = sc.nextInt();

        switch (weekDays) {
            // case 1:
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

                sc.close();
        }

    }
}
