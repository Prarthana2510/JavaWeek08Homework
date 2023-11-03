package homework1;

public class Question14 {

    //Write a java program to print the numbers between 1 to 100
    // which can be divided by 3and
    //5 separately.

    public static void main(String[] args) {
        Question14 q14 = new Question14();
        q14.divider();
    }

    public void divider() {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
