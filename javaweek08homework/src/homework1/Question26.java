package homework1;

public class Question26 {

    //Write a Java program to reverse a word.

    public static void main(String[] args) {

        Question26 q26 = new Question26();
        q26.reverseString();
        q26.m2();

    }

    public void reverseString() {

        String name = "Jack and Jill";
        //int nameLenght = name.length();

        //System.out.println(nameLenght);

        for (int i = name.length()-1; i>=0; i--) {
            System.out.println(name.charAt(i));
        }


    }

    public void m2(){

        String name1 = "Jack and Jill";
        char [] stringCharArray = name1.toCharArray();
        String reversedString = "";

        for(int i = stringCharArray.length-1; i>=0; i--) {
            reversedString = reversedString + stringCharArray[i];
        }

        System.out.print("The reversed string of the '"+name1+"' is: " );
        System.out.println(reversedString);


    }
}
