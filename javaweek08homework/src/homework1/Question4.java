package homework1;

import java.util.Scanner;

public class Question4 {

    //Write if else condition and print your group name in console else others group name.

    public static void main(String[] args) {
        Question4 q4 = new Question4();
        q4.groupName();
    }

    public void groupName() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you in your group? (Y/N): ");
        char groupYesNo = scanner.next().charAt(0);


        String myGroupName = "Restassured";
        String otherGroupName = "Java";
        if (groupYesNo == 'Y' || groupYesNo == 'y') {
            System.out.println("My group name is: " + myGroupName);
        } else {
            System.out.println("Other group name is: " + otherGroupName);
        }

        scanner.close();


    }
}
