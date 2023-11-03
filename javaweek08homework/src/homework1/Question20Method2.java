package homework1;

import java.util.Arrays;
import java.util.Collections;

public class Question20Method2 {
    //Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        Question20Method2 q20 = new Question20Method2();
        q20.numStringArray();

    }

    public void numStringArray() {


        Integer[] numArray = {5, 4, 1, 3, 9, 7, 8, 2, 6};
        String[] stringArray = {"Bravo", "Zulu", "Alfa", "Charlie", "Jack"};
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
        Arrays.sort(numArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(numArray));


        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(stringArray));


    }
}
