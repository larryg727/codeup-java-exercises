import java.util.Scanner;

/**
 * Created by larryg on 5/11/17.
 */
public class methods2 {

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        do{
            System.out.println("Enter a number between " + min + " and " + max);
            userInput = scan.nextInt();
        }while(userInput < min || userInput > max);
        System.out.println("good job");
        return userInput;
    }

    public static void main(String[] args) {
        System.out.println(getInteger(1, 10));
    }

}
