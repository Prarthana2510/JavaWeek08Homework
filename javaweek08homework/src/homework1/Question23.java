package homework1;

public class Question23 {
//Write java program using for loop and print your name 10 times.
    public static void main(String[] args) {
        Question23 q23 = new Question23();
        q23.name();
    }

    public void name(){

        String myName = "Jack and Jill";
        for (int i = 1; i<=10; i++){
            System.out.println("My name is: " + myName);
        }


    }
}
