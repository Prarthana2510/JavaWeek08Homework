package homework1;

public class Question25 {

    //Declare one method with return type and
    // parameter and print your name in console.

    public static void main(String[] args) {

        String name = "Jack and Jill";
        String printMyName = myName(name);
        System.out.println(printMyName);
    }

    // Method that takes a name as a parameter and returns it
    public static String myName(String name) {
        return "My name is: " + name;
    }
}
