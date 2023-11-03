package homework1;

public class Question22 {

    //Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        Question22 q22 = new Question22();
        q22.average();
        q22.method2();
    }

    public void average() {
        int[] numbers = {1, 2, 3, 11, 22, 33, -10, -20, -30};

        // Initialize a variable 'sum' to store the sum of array elements.
        double sum = 0;

        // Use a for loop to iterate over the elements of the 'numbers' array.
        for (int i = 0; i < numbers.length; i++) {
            // Add the current element to the sum.
            sum = sum + numbers[i];
        }

        // Calculate the average value by dividing the sum by the number of elements.
        double average = sum / numbers.length;

        // Print the calculated average value to the console.
        System.out.println("Average value of array is : " + average);
    }

    public void method2() {

        int[] numbers = {1, 2, 3, 11, 22, 33, -10, -20, -30};

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;


        System.out.println("Average of elements: " + average);
    }
}
