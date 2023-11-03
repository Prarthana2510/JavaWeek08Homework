package homework1;

public class Question21Method2 {

    public static void main(String[] args) {

        Question21Method2 q21 = new Question21Method2();
        q21.mySum();


    }

    public void mySum() {

        //Write a Java program to sum values of an array.

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : numbers)
            // Add each element to the sum.
            sum += i;

        // Print the sum of the array elements.
        System.out.println("The sum is " + sum);
    }


}

