package homework1;

public class Person {

    //long question to write here

    private String firstName;
    private String lastName;
    private int age;

    // Method to get the first name
    public String getFirstName() {
        return this.firstName;
    }

    // Method to get the last name
    public String getLastName() {
        return this.lastName;
    }

    // Method to get the age
    public int getAge() {
        return this.age;
    }

    // Method to set the first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Method to set the last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Method to set the age
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Method to check if the person is a teen
    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    // Method to get the full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to an empty string
        person.setLastName(""); // lastName is set to an empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to "John"
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to "Smith"
        System.out.println("fullName= " + person.getFullName());
    }
}
