package homework2;

public class Question2 {
    //Print multiplication table of 24, 50 and 29 using loop.
    public static void main(String[] args) {
        tables();
        tables2();
    }

    public static void tables() {
        int primary1 = 24;
        int primary2 = 29;
        int primary3 = 50;
        int secondary = 10;

        System.out.println("Table for 24:");
        for (int i = 1; i <= secondary; i++) {
            int result = primary1 * i;
            System.out.println(primary1 + " x " + i + " = " + result);
        }

        System.out.println("Table for 29:");
        for (int i = 1; i <= secondary; i++) {
            int result = primary2 * i;
            System.out.println(primary2 + " x " + i + " = " + result);
        }

        System.out.println("Table for 50:");
        for (int i = 1; i <= secondary; i++) {
            int result = primary3 * i;
            System.out.println(primary3 + " x " + i + " = " + result);
        }
    }
    //OR
    //OR
    //OR

    public static void tables2() {
        int[] primaryNumbers = {24, 29, 50};
        int tableSize = 10;

        for (int number : primaryNumbers) {

            for (int i = 1; i <= tableSize; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }
}
