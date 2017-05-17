package Java2;


/**
 * Created by larryg on 5/17/17.
 */
public class InputTest {
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Enter a word or phrase");
        String test = userInput.getString();
        System.out.println(test);

        System.out.println("Enter y or no");
        boolean trueFalse = userInput.yesNo();
        if (trueFalse){
            System.out.println("yes");
        }else{
            System.out.println( "no");
        }

        System.out.println("Number an integer between 1 and 5");
        int number = userInput.getInt(1, 5);
        System.out.println(number);

        System.out.println("Enter any integer");
        int anyNumber = userInput.getInt();
        System.out.println("u picked " + anyNumber);

        System.out.println("Enter a number between 1.2 an 1.85");
        double doubleRange = userInput.getDouble(1.2, 1.85);
        System.out.println("you entered " + doubleRange);

        System.out.println("Enter any number decimals included.");
        double anyDouble = userInput.getDouble();
        System.out.println("you entered " + anyDouble);
    }
}
