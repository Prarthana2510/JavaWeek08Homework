package homework1;

public class Question3 {

    //Declare multidimensional array and store 5 countries and their capital and print them in
    //console.

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.countryAndCapital();

    }

    public void countryAndCapital() {

        String[][] countrycapital = {{"India", "New Delhi"}, {"USA", "Washington DC"},
                {"UK", "London"}, {"Japan", "Tokyo"}, {"Germany", "Berlin"}};

        for (int i = 0; i < countrycapital.length; i++) {
            String country = countrycapital[i][0];
            String capital = countrycapital[i][1];
            System.out.println("Country: " + country + ", Capital: " + capital);

        }
    }
}


