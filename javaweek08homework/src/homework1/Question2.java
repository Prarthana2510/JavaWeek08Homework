package homework1;

public class Question2 {

    //Declare array and store any 5 countries and print them in console.

    public static void main(String[] args) {
        arrayCountries();
    }

    public static void arrayCountries(){

        String[] countriesArray = {"India", "USA", "UK", "Japan", "Germany"};
        for (int i = 0; i<countriesArray.length; i++){
            System.out.println(countriesArray[i]);
        }
    }
}
