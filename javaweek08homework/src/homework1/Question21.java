package homework1;

public class Question21 {

    //Write a Java program to sum values of an array.

    public static void main(String[] args) {

        Question21 q21 = new Question21();
        q21.mySum();


    }

    public void mySum() {

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum is: " + sum);
    }


}

