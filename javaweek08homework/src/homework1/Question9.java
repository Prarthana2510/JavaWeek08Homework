package homework1;

public class Question9 {
    //Write java program using for loop and print your group name 10 times.

    public static void main(String[] args) {
        Question9 q9 = new Question9();
        q9.groupname();

    }

    public void groupname(){

        String groupName = "Restassured";
        for (int i = 0; i <= 10; i++ ){
            System.out.println(groupName);
        }
    }
}
