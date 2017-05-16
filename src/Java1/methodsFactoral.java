package Java1;

import java.util.Scanner;

/**
 * Created by larryg on 5/12/17.
 */
public class methodsFactoral {

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        do{
            System.out.println("Enter a number between " + min + " and " + max);
            userInput = scan.nextInt();
        }while(userInput < min || userInput > max);

        return userInput;
    }

    public static void factorial(int min, int max){
        String again = "y";
        while(again.equalsIgnoreCase("y")) {
          int input =  getInteger(min, max);
            int answer = 1;
            String factorial = input + "! = ";
            for (int i = 1; i <= input; i++) {
                answer = answer * i;
                if (i < input) {
                    factorial += i + " x ";
                } else if (i == input) {
                    factorial += i + " = " + answer;
                }
            }
            System.out.println(factorial);
        System.out.println("Would you like to try another? y/n");
        Scanner scan = new Scanner(System.in);
        again = scan.next();
        }
    }

    public static void main(String[] args) {
        factorial(1,33);
    }

}
