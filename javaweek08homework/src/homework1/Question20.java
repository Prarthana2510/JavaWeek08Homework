package homework1;

import java.util.Arrays;

public class Question20 {

    //Write a Java program to sort a numeric array and a string array.

    public static void main(String[] args) {
        Question20 q20 = new Question20();
        q20.numArray();
        q20.stringArray();


    }

    public void numArray() {

        int[] numberArray = {1, 12, 18, 5, 7, 8, 10};

        // Sorting the numeric array in ascending order
        Arrays.sort(numberArray);

        // Printing the sorted numeric array
        System.out.println("Numeric Array Ascending Order:");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }

        // Sorting the numeric array in descending order (custom sorting)
        for (int i = 0; i < numberArray.length / 2; i++) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - 1 - i];
            numberArray[numberArray.length - 1 - i] = temp;
        }

        // Printing the sorted numeric array in descending order
        System.out.println("Numeric Array Descending Order:");
        for (int num : numberArray) {
            System.out.print(num + " ");
        }
    }

    public void stringArray() {

        String[] stringArray = {"Bravo", "Zulu", "Alfa", "Charlie", "Jack"};

        // Sorting the string array in ascending order
        Arrays.sort(stringArray);

        // Printing the sorted string array
        System.out.println("String Array Ascending Order:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }

        // Sorting the string array in descending order (custom sorting)
        Arrays.sort(stringArray, (a, b) -> b.compareTo(a));

        // Printing the sorted string array in descending order
        System.out.println("String Array Descending Order:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }

    }


}
