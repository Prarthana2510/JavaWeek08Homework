package homework2;

public class Question3 {
    //Write an infinite loop.
    //A infinite loop never ends. Condition is always true.

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.infiniteLoop();

    }
    public  void infiniteLoop(){
        for (int i=5; i>0;){
            System.out.println("This is an infinite loop");
        }
    }
}
